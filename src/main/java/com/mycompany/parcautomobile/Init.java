/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

/**
 *
 * @author CHATILLON
 */
public class Init {

    private static Init uniqueInstance;

    private Init() {

        Visiteur guigui = new Visiteur(1, "GuiGui", "Rocco");
        Visiteur marlon = new Visiteur(2, "Chatillon", "Marlon");
        Visiteur scarlett = new Visiteur(3, "Johansson", "Scarlett");

        Vehicule vehicule1 = new Vehicule(1, "Renault", "Clio", 10000);
        Vehicule vehicule2 = new Vehicule(2, "Audi", "A8", 12500);
        Vehicule vehicule3 = new Vehicule(3, "Toyota", "Yaris", 15005);
        Vehicule vehicule4 = new Vehicule(4, "Renault", "titine", 1);

        marlon.addVehicule(vehicule4.getId());
        guigui.addVehicule(vehicule1.getId());

    }

    public static Init getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Init();
        }
        return uniqueInstance;

    }

}