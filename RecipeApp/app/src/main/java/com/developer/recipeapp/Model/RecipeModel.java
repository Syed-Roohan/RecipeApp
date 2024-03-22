package com.developer.recipeapp.Model;
public class RecipeModel {
    private String title;
    private String time;
    private int imageResource;

    public RecipeModel(String title, String time, int imageResource) {
        this.title = title;
        this.time = time;
        this.imageResource = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getTime() {
        return time;
    }

    public int getImageResource() {
        return imageResource;
    }
}

