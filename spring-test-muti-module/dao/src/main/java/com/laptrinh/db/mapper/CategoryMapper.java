package com.laptrinh.db.mapper;

import com.laptrinh.entities.Category;
import com.laptrinh.model.CategoryModel;


public class CategoryMapper {
    public static Category toEntity(CategoryModel categoryModel){
        if(categoryModel == null){
            return null;
        }
        Category category = new Category();
        category.setId(categoryModel.getId());
        category.setName(categoryModel.getName());
        category.setNameVN(categoryModel.getNameVN());
        return category;


    }
}
