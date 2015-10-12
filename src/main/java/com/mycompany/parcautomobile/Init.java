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
    private static Init uniqueInit;
    
    private Init() {}
    public static Init getInit() {
        if (uniqueInit == null){
            uniqueInit = new Init();
        }
        return uniqueInit;
    }
    
}