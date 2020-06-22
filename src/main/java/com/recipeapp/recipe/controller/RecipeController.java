package com.recipeapp.recipe.controller;

import com.recipeapp.recipe.domain.Recipe;
import com.recipeapp.recipe.service.RecipeServiceImpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.Set;

@RestController
public class RecipeController {

    private final RecipeServiceImpl recipeService;

    public RecipeController(RecipeServiceImpl recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/recipes"})
    public Set<Recipe> getAll(){
        return recipeService.getRecipes();
    }

    @RequestMapping({"/id={id}"})
    public Optional<Recipe> getById(@PathVariable Long id){
        return recipeService.getById(id);
    }
}