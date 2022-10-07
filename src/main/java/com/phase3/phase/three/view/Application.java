package com.phase3.phase.three.view;

import com.phase3.phase.three.model.Products;
import com.phase3.phase.three.repository.ProductsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);}

	@Bean
	CommandLineRunner main (ProductsRepository productsRepository) {
		return args -> {
			Products Nike_TN = new Products(
					null,
					"Nike TN",
					6,
					100.00,
					25,
					1
			);
			Products Adidas = new Products(
					null,
					"Adidas Ozweego",
					5,
					49.00,
					10,
					1
			);
			Products Nike_Jordons = new Products(
					null,
					"Nike Jordons",
					8,
					165.00,
					20,
					1
			);
			productsRepository.saveAll(List.of(Nike_TN, Adidas, Nike_Jordons));
		};
	}
}
