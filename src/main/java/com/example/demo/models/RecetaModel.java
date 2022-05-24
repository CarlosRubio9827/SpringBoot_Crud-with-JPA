package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name="receta")
public class RecetaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nameRecipe;
    private String complexity;
    private String numbersPeople;
    private String ingredients;
    private String elaborate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public void setNameRecipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    public String getNumbersPeople() {
        return numbersPeople;
    }

    public void setNumbersPeople(String numbersPeople) {
        this.numbersPeople = numbersPeople;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getElaborate() {
        return elaborate;
    }

    public void setElaborate(String elaborate) {
        this.elaborate = elaborate;
    }
}
