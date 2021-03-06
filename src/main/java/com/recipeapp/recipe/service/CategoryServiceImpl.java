package com.recipeapp.recipe.service;

import com.recipeapp.recipe.domain.Category;
import com.recipeapp.recipe.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Set<Category> getCategories() {
        return new HashSet<>(categoryRepository.findAll());
    }
}
