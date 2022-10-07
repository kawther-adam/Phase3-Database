package com.phase3.phase.three.view;

import com.phase3.phase.three.model.Products;
import com.phase3.phase.three.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductView {


    private final ProductService productService;

    //    trying to display list of products
    @GetMapping("")
    public String viewHomePage(ModelMap model) {
        model.addAttribute("listProducts", productService.getAllProducts(10));
        return "products";
    }

//    @GetMapping("/AdminUpdate")
//    //    create model attribute to form data
//    public String AdminUpdate(Model model) {
//        Products products = new Products();
//        model.addAttribute("products", products);
//        return "admin";
//    }

    @PostMapping("/saveNewProduct")
    public String saveProducts(@RequestParam String brand,
                               @RequestParam double size,
                               @RequestParam double price,
                               @RequestParam int stock,
                               @RequestParam int quantity) {

        Products product = new Products(null, brand, size, price, stock, quantity);
        productService.saveProducts(product);
        //save products to database;
        return "redirect:/product";
    }

    @GetMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "redirect:/product";
    }
}


