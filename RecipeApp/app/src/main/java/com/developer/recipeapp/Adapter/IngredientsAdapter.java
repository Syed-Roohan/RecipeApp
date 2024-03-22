package com.developer.recipeapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.developer.recipeapp.R;

import java.util.List;

public class IngredientsAdapter extends RecyclerView.Adapter<IngredientsAdapter.IngredientsVH> {

    private Context context;
    private List<String> recipeTitles;

    public IngredientsAdapter(Context context, List<String> recipeTitles) {
        this.context = context;
        this.recipeTitles = recipeTitles;
    }

    @NonNull
    @Override
    public IngredientsVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_ingredients_layout, parent, false);
        return new IngredientsVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IngredientsVH holder, int position) {
        String title = recipeTitles.get(position);
        holder.recipeTitle.setText(title);
    }


    @Override
    public int getItemCount() {
        return recipeTitles.size();
    }

    public static class IngredientsVH extends RecyclerView.ViewHolder {
        TextView recipeTitle;

        public IngredientsVH(@NonNull View itemView) {
            super(itemView);
            recipeTitle = itemView.findViewById(R.id.recipe_title);
        }
    }
}

