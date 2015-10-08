package com.mycompany.parcautomobile;

import com.vaadin.data.util.BeanItemContainer;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHATILLON
 */
public class Visiteur {

    private int id;
    private String nom;
    private String prenom;
    private static BeanItemContainer<Visiteur> visiteur = new BeanItemContainer<> (Visiteur.class);
 
    public Visiteur(int id, String nom, String prenom, int idVehicule) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.visiteur.addBean(this);
    }
    public int getId() {
    return id;
    }
    public String getNom() {
    return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    
    public void setId(int id) {
    this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public static BeanItemContainer<Visiteur> getVisiteur() {
    return visiteur;
    }
}
