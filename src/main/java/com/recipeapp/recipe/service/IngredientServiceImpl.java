package com.recipeapp.recipe.service;

import com.recipeapp.recipe.domain.Ingredient;
import com.recipeapp.recipe.repository.IngredientRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class IngredientServiceImpl implements IngredientService{

    private final IngredientRepository ingredientRepository;

    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Set<Ingredient> getIngredients() {
        return new HashSet<>(ingredientRepository.findAll());
    }
}
