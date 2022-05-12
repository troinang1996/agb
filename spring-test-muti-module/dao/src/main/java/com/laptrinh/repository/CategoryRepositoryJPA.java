package com.laptrinh.repository;

import com.laptrinh.model.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositoryJPA extends JpaRepository<CategoryModel, Integer> {
}
