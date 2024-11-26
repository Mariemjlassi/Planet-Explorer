package com.example.planetexplorer.vue;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.planetexplorer.R;
import com.example.planetexplorer.model.Planet;

import java.util.List;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetViewHolder> {

    Context context;
    List<Planet> liste;

    public PlanetAdapter(Context context, List<Planet> liste) {
        this.context = context;
        this.liste = liste;
    }

    @NonNull
    @Override
    public PlanetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PlanetViewHolder(LayoutInflater.from(context).inflate(R.layout.planet,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetViewHolder holder, int position) {
        Planet planet = liste.get(position);

        holder.nameView.setText(liste.get(position).getNom());
        holder.distanceView.setText(String.format("%d millions de km", liste.get(position).getDistance()));
        holder.imageView.setImageResource(liste.get(position).getImage());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, PlanetDetailActivity.class);
            intent.putExtra("nom", planet.getNom());
            intent.putExtra("distance", planet.getDistance());
            intent.putExtra("image", planet.getImage());
            intent.putExtra("masse", planet.getMasse());
            intent.putExtra("periodeRevolution", planet.getPeriodeRevolution());
            intent.putExtra("nombreDeSatellites", planet.getNombreDeSatellites());
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return liste.size();
    }
}
