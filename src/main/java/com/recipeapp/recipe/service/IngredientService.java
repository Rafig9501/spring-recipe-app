package com.recipeapp.recipe.service;

import com.recipeapp.recipe.domain.Ingredient;

import java.util.Set;

public interface IngredientService {

    Set<Ingredient> getIngredients();
}
