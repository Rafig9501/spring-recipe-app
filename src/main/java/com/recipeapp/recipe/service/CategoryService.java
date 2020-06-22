package com.recipeapp.recipe.service;

import com.recipeapp.recipe.domain.Category;

import java.util.Set;

public interface CategoryService {

    Set<Category> getCategories();
}
