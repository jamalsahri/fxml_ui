package com.models;

import java.util.List;

public class Module {

    private int id_M;
    private int statut;
    private String libelle;
    private List<Tache> tachesList;
    private List<Ressource> ressourcesList;

    public Module() {
    }

    public Module(int id_M, int statut, String libelle, List<Tache> tachesList, List<Ressource> ressourcesList) {
        this.id_M = id_M;
        this.statut = statut;
        this.libelle = libelle;
        this.tachesList = tachesList;
        this.ressourcesList = ressourcesList;
    }

    public int getId_M() {
        return id_M;
    }

    public void setId_M(int id_M) {
        this.id_M = id_M;
    }

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<Tache> getTachesList() {
        return tachesList;
    }

    public void setTachesList(List<Tache> tachesList) {
        this.tachesList = tachesList;
    }

    public List<Ressource> getRessourcesList() {
        return ressourcesList;
    }

    public void setRessourcesList(List<Ressource> ressourcesList) {
        this.ressourcesList = ressourcesList;
    }
}
