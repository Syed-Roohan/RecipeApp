package com.developer.recipeapp.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.developer.recipeapp.Model.CategoryModel;
import com.developer.recipeapp.Model.RecipeModel;
import com.developer.recipeapp.R;

import java.util.ArrayList;
import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.ViewHolder> {

    private List<CategoryModel> categories;
    private Context context;

    public CategoriesAdapter(Context context, List<CategoryModel> categories) {
        this.context = context;
        this.categories = categories;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_categories_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CategoryModel category = categories.get(position);
        holder.categoriesImg.setImageResource(category.getImageResource());
        holder.categoriesText.setText(category.getName());
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView categoriesImg;
        TextView categoriesText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoriesImg = itemView.findViewById(R.id.categories_img);
            categoriesText = itemView.findViewById(R.id.categories_text);
        }
    }
}
