package com.developer.recipeapp.Fragments;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.developer.recipeapp.Adapter.CategoriesAdapter;
import com.developer.recipeapp.Adapter.RecipeAdapter;
import com.developer.recipeapp.Model.CategoryModel;
import com.developer.recipeapp.Model.RecipeModel;
import com.developer.recipeapp.R;

import java.util.ArrayList;
public class HomeFragment extends Fragment {
    public HomeFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.rv_categories);
        ArrayList<CategoryModel> categories = new ArrayList<>(); // Populate this list with your data
        CategoriesAdapter adapter = new CategoriesAdapter(getContext(), categories);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        categories.add(new CategoryModel(R.drawable.logo, "Vegetables"));
        categories.add(new CategoryModel(R.drawable.logo, "Fruits"));
        categories.add(new CategoryModel(R.drawable.logo, "Spicy Food"));
        categories.add(new CategoryModel(R.drawable.logo, "Salty Food"));
        categories.add(new CategoryModel(R.drawable.logo, "Sea Food"));
        categories.add(new CategoryModel(R.drawable.logo, "Fishes"));
        categories.add(new CategoryModel(R.drawable.logo, "Mega Deals"));
//        ___________________________________________________
        RecyclerView rv_recipe = view.findViewById(R.id.rv_recipe);
        ArrayList<RecipeModel> recipeModels = new ArrayList<>(); // Populate this list with your data
        RecipeAdapter recipeAdapter = new RecipeAdapter(getContext(), recipeModels);
        rv_recipe.setAdapter(recipeAdapter);
        LinearLayoutManager lm = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        rv_recipe.setLayoutManager(lm);
        recipeModels.add(new RecipeModel("Easy Egg Meal", "9 mins", R.drawable.logo));
        recipeModels.add(new RecipeModel("Easy Egg Meal", "9 mins", R.drawable.logo));
        recipeModels.add(new RecipeModel("Easy Egg Meal", "9 mins", R.drawable.logo));
        recipeModels.add(new RecipeModel("Easy Egg Meal", "9 mins", R.drawable.logo));
        recipeModels.add(new RecipeModel("Easy Egg Meal", "9 mins", R.drawable.logo));
        recipeModels.add(new RecipeModel("Easy Egg Meal", "9 mins", R.drawable.logo));
        recipeModels.add(new RecipeModel("Easy Egg Meal", "9 mins", R.drawable.logo));
        recipeModels.add(new RecipeModel("Easy Egg Meal", "9 mins", R.drawable.logo));
        recipeModels.add(new RecipeModel("Easy Egg Meal", "9 mins", R.drawable.logo));
        return view;
    }
}