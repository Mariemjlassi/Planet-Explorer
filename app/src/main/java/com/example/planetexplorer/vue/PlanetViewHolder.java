package com.example.planetexplorer.vue;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.planetexplorer.R;

public class PlanetViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameView,distanceView;

    public PlanetViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        nameView = itemView.findViewById(R.id.name);
        distanceView = itemView.findViewById(R.id.distance);
    }
}
