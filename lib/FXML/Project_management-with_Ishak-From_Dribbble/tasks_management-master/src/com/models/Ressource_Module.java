package com.models;

import java.util.Date;

public class Ressource_Module {

    private int id_ressource;
    private int id_module;
    private Date date_affectation;

    public Ressource_Module() {
    }

    public Ressource_Module(int id_ressource, int id_module, Date date_affectation) {
        this.id_ressource = id_ressource;
        this.id_module = id_module;
        this.date_affectation = date_affectation;
    }

    public int getId_ressource() {
        return id_ressource;
    }

    public void setId_ressource(int id_ressource) {
        this.id_ressource = id_ressource;
    }

    public int getId_module() {
        return id_module;
    }

    public void setId_module(int id_module) {
        this.id_module = id_module;
    }

    public Date getDate_affectation() {
        return date_affectation;
    }

    public void setDate_affectation(Date date_affectation) {
        this.date_affectation = date_affectation;
    }
}
