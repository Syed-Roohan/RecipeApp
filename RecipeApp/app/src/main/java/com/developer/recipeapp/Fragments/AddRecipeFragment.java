package com.developer.recipeapp.Fragments;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.developer.recipeapp.Adapter.IngredientsAdapter;
import com.developer.recipeapp.Adapter.RecipeAdapter;
import com.developer.recipeapp.R;

import java.util.ArrayList;

public class AddRecipeFragment extends Fragment {
    public AddRecipeFragment() {
        // Required empty public constructor
    }
    private RecyclerView recyclerView;
    private IngredientsAdapter adapter;
    private ArrayList<String> recipeTitles;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_recipe, container, false);
        recyclerView = view.findViewById(R.id.rv_ingredients);
        EditText recipe_title = view.findViewById(R.id.recipe_title);
        EditText ingredients = view.findViewById(R.id.ingredients);
        Button btn_addIngredients = view.findViewById(R.id.btn_addIngredients);
        recipeTitles = new ArrayList<>();

        btn_addIngredients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!recipe_title.getText().toString().isEmpty() | !ingredients.getText().toString().isEmpty()) {
                    recipeTitles.add(ingredients.getText().toString());
                    recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter.notifyDataSetChanged();
                    ingredients.setText("");
                }
                else{
                    recipe_title.setError("Required*");
                    ingredients.setError("Required*");
                }
            }
        });

        adapter = new IngredientsAdapter(getContext(), recipeTitles);
        recyclerView.setAdapter(adapter);
        return view;

    }
}