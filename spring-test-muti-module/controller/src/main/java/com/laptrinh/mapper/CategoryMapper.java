package com.laptrinh.mapper;

import com.laptrinh.dto.CategoryDTO;
import com.laptrinh.entities.Category;

public class CategoryMapper {
    public static CategoryDTO toDTO(Category category) {
        if (category == null) {
            return null;
        }
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        categoryDTO.setNameVN(category.getNameVN());
        return categoryDTO;
    }
}
