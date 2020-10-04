package com.models;

public class Statut {

    private int id_S;
    private String libelle;

    public Statut() {
    }

    public Statut(int id_S, String libelle) {
        this.id_S = id_S;
        this.libelle = libelle;
    }

    public int getId_S() {
        return id_S;
    }

    public void setId_S(int id_S) {
        this.id_S = id_S;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
