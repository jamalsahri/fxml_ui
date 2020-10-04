package com.models;

public class Commentaire {

    private int id_C;
    private String libelle;
    private Tache id_tache;
    private Ressource id_ressource;

    public Commentaire() {
    }

    public Commentaire(int id_C, String libelle, Tache id_tache, Ressource id_ressource) {
        this.id_C = id_C;
        this.libelle = libelle;
        this.id_tache = id_tache;
        this.id_ressource = id_ressource;
    }

    public int getId_C() {
        return id_C;
    }

    public void setId_C(int id_C) {
        this.id_C = id_C;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Tache getId_tache() {
        return id_tache;
    }

    public void setId_tache(Tache id_tache) {
        this.id_tache = id_tache;
    }

    public Ressource getId_ressource() {
        return id_ressource;
    }

    public void setId_ressource(Ressource id_ressource) {
        this.id_ressource = id_ressource;
    }
}
