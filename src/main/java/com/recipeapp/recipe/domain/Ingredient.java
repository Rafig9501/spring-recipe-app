package com.recipeapp.recipe.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String description;

    @NonNull
    private BigDecimal amount;

    @OneToOne(fetch = FetchType.EAGER)
    @NonNull
    private UnitOfMeasure uom;

    @ManyToOne
    @JsonBackReference
    private Recipe recipe;
}