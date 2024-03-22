package com.developer.recipeapp.Model;

public class CategoryModel {
    private int imageResource;
    private String name;

    public CategoryModel(int imageResource, String name) {
        this.imageResource = imageResource;
        this.name = name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getName() {
        return name;
    }
}
