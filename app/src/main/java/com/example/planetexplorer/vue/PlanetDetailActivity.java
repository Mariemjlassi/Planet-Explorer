package com.example.planetexplorer.vue;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.planetexplorer.R;

public class PlanetDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_planet_detail);




        ImageView imageView = findViewById(R.id.imageview_detail);
        TextView nameView = findViewById(R.id.name_detail);
        TextView distanceView = findViewById(R.id.distance_detail);
        TextView massView = findViewById(R.id.mass_detail);
        TextView revolutionPeriodView = findViewById(R.id.revolution_period_detail);
        TextView moonsView = findViewById(R.id.moons_detail);

        //récup des donneés
        Intent intent = getIntent();
        String nom = intent.getStringExtra("nom");
        int distance = intent.getIntExtra("distance", 0);
        int image = intent.getIntExtra("image", R.drawable.default_image);
        double masse = intent.getDoubleExtra("masse", 0.0);
        double periodeRevolution = intent.getDoubleExtra("periodeRevolution", 0.0);
        int nombreDeSatellites = intent.getIntExtra("nombreDeSatellites", 0);

        //maj des vues avec les donneés
        imageView.setImageResource(image);
        nameView.setText("Nom : " + nom);
        distanceView.setText("Distance au Soleil : " + distance + " millions de km");
        massView.setText("Masse : " + masse + " x10^24 kg");
        revolutionPeriodView.setText("Période de révolution : " + periodeRevolution + " jours");
        moonsView.setText("Nombre de satellites orbitants : " + nombreDeSatellites);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}