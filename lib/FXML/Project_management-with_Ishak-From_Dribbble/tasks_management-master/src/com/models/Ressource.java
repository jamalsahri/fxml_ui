package com.models;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.List;

public class Ressource {

    private int id_Res;
    private String nom;
    private String prenom;
    private String password;
    private String username;
    private int role_id;
    private List<Module> modulesList;

    public Ressource(int id_Res, String nom, String prenom, String password, String username, int role_id) {
        this.id_Res = id_Res;
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
        this.username = username;
        this.role_id = role_id;
    }

    public int getId_Res() {
        return id_Res;
    }

    public void setId_Res(int id_Res) {
        this.id_Res = id_Res;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = DigestUtils.sha1Hex(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "Ressource{" +
                "id_Res=" + id_Res +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", role_id=" + role_id +
                '}';
    }
}
