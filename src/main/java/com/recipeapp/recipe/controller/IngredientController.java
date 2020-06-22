package com.recipeapp.recipe.controller;

import com.recipeapp.recipe.domain.Ingredient;
import com.recipeapp.recipe.service.IngredientServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class IngredientController {

    private final IngredientServiceImpl ingredientService;

    public IngredientController(IngredientServiceImpl ingredientService) {
        this.ingredientService = ingredientService;
    }

    @RequestMapping({"/ingredients"})
    public Set<Ingredient> getIngredients() {
        return ingredientService.getIngredients();
    }


}
