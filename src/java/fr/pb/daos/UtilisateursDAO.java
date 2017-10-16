/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.daos;

import java.sql.*;
import fr.pb.entities.Utilisateurs;
/**
 *
 * @author formation
 */
public class UtilisateursDAO {

    private Connection icn;

    /**
     * 
     * @param icn 
     */
    public UtilisateursDAO(Connection icn) {
        this.icn = icn;
    }
    
    /**
     * 
     * @param pseudo
     * @param mdp
     * @return 
     */
    public Utilisateurs selectOne(String pseudo, String mdp) {
        Utilisateurs ut = null;
        try {
            PreparedStatement lpst = icn.prepareStatement("SELECT * FROM utilisateurs WHERE pseudo = ? AND mdp = ?");
            lpst.setString(1, pseudo);
            lpst.setString(2, mdp);
            ResultSet lrs = lpst.executeQuery();
            if (lrs.next()) {
                ut = new Utilisateurs();
                ut.setPseudo(lrs.getString(1));
                ut.setMdp(lrs.getString(2));
                ut.setEmail(lrs.getString(3));
                ut.setQualite(lrs.getString(4));
            }
        } catch (SQLException e) {
            System.out.println("SELECT ONE erreur : " + e.getMessage());
        }
        return ut;
    } /// selectOne
    
}
