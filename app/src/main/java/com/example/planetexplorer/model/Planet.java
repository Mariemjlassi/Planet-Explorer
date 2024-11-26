package com.example.planetexplorer.model;

public class Planet {
    public String nom;
    public int distance;
    public int image;
    private double masse;
    private double periodeRevolution;
    private int nombreDeSatellites;

    //constructeur, getters et setters

    public Planet(String nom, int distance, int image, double masse, double periodeRevolution, int nombreDeSatellites) {
        this.nom = nom;
        this.distance = distance;
        this.image = image;
        this.masse = masse;
        this.periodeRevolution = periodeRevolution;
        this.nombreDeSatellites = nombreDeSatellites;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public double getMasse() {
        return masse;
    }

    public void setMasse(double masse) {
        this.masse = masse;
    }

    public double getPeriodeRevolution() {
        return periodeRevolution;
    }

    public void setPeriodeRevolution(double periodeRevolution) {
        this.periodeRevolution = periodeRevolution;
    }

    public int getNombreDeSatellites() {
        return nombreDeSatellites;
    }

    public void setNombreDeSatellites(int nombreDeSatellites) {
        this.nombreDeSatellites = nombreDeSatellites;
    }
}
