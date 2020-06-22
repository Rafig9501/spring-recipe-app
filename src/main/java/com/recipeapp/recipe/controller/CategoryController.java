package com.recipeapp.recipe.controller;

import com.recipeapp.recipe.domain.Category;
import com.recipeapp.recipe.domain.Ingredient;
import com.recipeapp.recipe.service.CategoryServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class CategoryController {

    private final CategoryServiceImpl categoryService;

    public CategoryController(CategoryServiceImpl categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping({"/categories"})
    public Set<Category> getCategories() {
        return categoryService.getCategories();
    }
}
