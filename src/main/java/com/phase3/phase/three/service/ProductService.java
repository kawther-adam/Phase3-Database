package com.phase3.phase.three.service;

import com.phase3.phase.three.model.Products;
import com.phase3.phase.three.repository.ProductsRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Collection;

@AllArgsConstructor
@Service

public class ProductService {

    private final ProductsRepository productRepo;
    public Collection<Products> getAllProducts(int limit) {
        return productRepo.findAll(PageRequest.of(0, limit)).toList();
    }

    public void saveProducts(Products products) {
        productRepo.save(products);
    }

    public void deleteProduct(Long id){
        productRepo.deleteById(id);
    }
}