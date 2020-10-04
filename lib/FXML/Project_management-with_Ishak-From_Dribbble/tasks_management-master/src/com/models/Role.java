package com.models;

public class Role {

    private int id_R;
    private String libelle;

    public Role(){

    }

    public Role(int id_R, String libelle) {
        this.id_R = id_R;
        this.libelle = libelle;
    }

    public int getId_R() {
        return id_R;
    }

    public void setId_R(int id_R) {
        this.id_R = id_R;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
