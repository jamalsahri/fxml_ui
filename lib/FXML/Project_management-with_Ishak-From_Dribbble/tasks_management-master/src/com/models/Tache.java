package com.models;

import java.util.List;

public class Tache {
    private int id_T;
    private String resume;
    private int statut_id;
    // mapping module , ManyToOne
    private Module id_module;
    // mapping ressource , ManyToOne;
    private Ressource id_ressource;
    //mapping commentaires , OneToMany
    private List<Commentaire> commentairesList;

    public Tache(int id_T, String resume, int statut_id, Module id_module, Ressource id_ressource, List<Commentaire> commentairesList) {
        this.id_T = id_T;
        this.resume = resume;
        this.statut_id = statut_id;
        this.id_module = id_module;
        this.id_ressource = id_ressource;
        this.commentairesList = commentairesList;
    }

    public int getId_T() {
        return id_T;
    }

    public void setId_T(int id_T) {
        this.id_T = id_T;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public int getStatut_id() {
        return statut_id;
    }

    public void setStatut_id(int statut_id) {
        this.statut_id = statut_id;
    }

    public Module getId_module() {
        return id_module;
    }

    public void setId_module(Module id_module) {
        this.id_module = id_module;
    }

    public Ressource getId_ressource() {
        return id_ressource;
    }

    public void setId_ressource(Ressource id_ressource) {
        this.id_ressource = id_ressource;
    }

    public List<Commentaire> getCommentairesList() {
        return commentairesList;
    }

    public void setCommentairesList(List<Commentaire> commentairesList) {
        this.commentairesList = commentairesList;
    }

    @Override
    public String toString() {
        return "Tache{" +
                "id_T=" + id_T +
                ", resume='" + resume + '\'' +
                ", statut_id=" + statut_id +
                ", id_module=" + id_module +
                ", id_ressource=" + id_ressource +
                ", commentairesList=" + commentairesList +
                '}';
    }
}
