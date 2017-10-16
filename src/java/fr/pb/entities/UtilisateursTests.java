/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.entities;

/**
 *
 * @author formation
 */
public class UtilisateursTests {
    public static void main(String[] args) {

        Utilisateurs ut = new Utilisateurs("Tintin", "mdp123", "tintint@gmail.com", "BO");

        System.out.println(ut.getPseudo());
        System.out.println(ut.getMdp());
        System.out.println(ut.getEmail());
        System.out.println(ut.getQualite());
    } /// main
    
}
