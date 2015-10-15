/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package com.mycompany.parcautomobile;


import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

        
        
/**
 *
 * @author Guillaume
 */
/*public class init {
 
    
    public static void main(final String argv[]) {
        final Personne personne = new Personne("Dupond", "Jean", 175, "1234", new Date());
        XMLEncoder encoder = null;
        
       try {
           encoder = new XMLEncoder(new BufferedOutputStream(
           new FileOutputStream("personne.xml")));
           encoder.writeObject(personne);
           encoder.flush();
       }catch (final java.io.IOException e){
           e.printStackTrace();
       } finally {
           if (encoder != null){
              
               encoder.close();
               
           }
       }
    }
}


public class DeserialiserPersonneXML{

    public static void main(final String argv[]){
        XMLDecoder decoder=null;
        
        try {
        decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("personne.xml")));
        final Personne personne = (Personne) decoder.readObject();
        System.out.println(personne);
        } catch (final Exception e) {
          e.printStackTrace();
        
        } finally {
            if (decoder !=null){
                decoder.close();
                
            }
        }  
    }
}*/