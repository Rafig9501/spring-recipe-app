package com.recipeapp.recipe.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Integer preparationTime;
    private Integer cookTime;
    private Integer serving;
    private String source;
    private String url;
    private String direction;
    // TODO add
    // private Difficulty difficulty;
    @Lob
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL)
    private Note note;

    @OneToMany(cascade = CascadeType.ALL,
               mappedBy = "recipe")
    private Set<Ingredient> ingredients;
}
