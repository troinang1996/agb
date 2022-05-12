package com.laptrinh.repository;

import com.laptrinh.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositoryJPA extends JpaRepository<ProductModel, Integer> {
}
