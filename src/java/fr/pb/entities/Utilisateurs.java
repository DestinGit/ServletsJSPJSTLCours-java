/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.entities;

import java.io.Serializable;

/**
 *
 * @author formation
 */
public class Utilisateurs implements Serializable {


    private String pseudo;
    private String mdp;
    private String email;
    private String qualite;

    public Utilisateurs() {
    }

    public Utilisateurs(String pseudo, String mdp, String email, String qualite) {
        this.pseudo = pseudo;
        this.mdp = mdp;
        this.email = email;
        this.qualite = qualite;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQualite() {
        return qualite;
    }

    public void setQualite(String qualite) {
        this.qualite = qualite;
    }

    @Override
    public String toString() {
        return "Utilisateurs{" + "pseudo=" + pseudo + ", mdp=" + mdp + ", email=" + email + ", qualite=" + qualite + '}';
    }
    
}
