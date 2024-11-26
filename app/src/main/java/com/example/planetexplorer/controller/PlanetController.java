package com.example.planetexplorer.controller;

import com.example.planetexplorer.R;
import com.example.planetexplorer.model.Planet;

import java.util.ArrayList;
import java.util.List;

public class PlanetController {

    private List<Planet> planets;

    public PlanetController() {
        this.planets = new ArrayList<>();
        initializePlanets();
    }
    private void initializePlanets() {
        planets.add(new Planet("Mercure", 57, R.drawable.a, 0.33, 88, 0));
        planets.add(new Planet("Vénus", 108, R.drawable.b, 4.87, 225, 0));
        planets.add(new Planet("Terre", 149, R.drawable.c, 5.97, 365, 1));
        planets.add(new Planet("Mars", 227, R.drawable.d, 0.64, 687, 2));
        planets.add(new Planet("Jupiter", 778, R.drawable.e, 1898, 4333, 79));
        planets.add(new Planet("Saturne", 114, R.drawable.f, 568, 10759, 83));
        planets.add(new Planet("Neptune", 402, R.drawable.g, 102, 60190, 14));
        planets.add(new Planet("Mercure", 57, R.drawable.a, 0.33, 88, 0));
        planets.add(new Planet("Vénus", 108, R.drawable.b, 4.87, 225, 0));
        planets.add(new Planet("Terre", 149, R.drawable.c, 5.97, 365, 1));
        planets.add(new Planet("Mars", 227, R.drawable.d, 0.64, 687, 2));
        planets.add(new Planet("Jupiter", 778, R.drawable.e, 1898, 4333, 79));
        planets.add(new Planet("Saturne", 114, R.drawable.f, 568, 10759, 83));
        planets.add(new Planet("Neptune", 402, R.drawable.g, 102, 60190, 14));
    }

    public List<Planet> getPlanets(){
        return  planets;
    }
}
