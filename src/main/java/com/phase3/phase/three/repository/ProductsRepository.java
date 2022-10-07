package com.phase3.phase.three.repository;

import com.phase3.phase.three.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {
//all crud database methods

}

