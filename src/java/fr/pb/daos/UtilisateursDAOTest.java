/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.daos;

import connexion.Connexion;
import fr.pb.entities.Utilisateurs;
import java.sql.Connection;

/**
 *
 * @author formation
 */
public class UtilisateursDAOTest {

    public static void main(String[] args) {
        Connection lcn = Connexion.getConnectionMySQL("localhost", "cours", "3306", "root", "");
        UtilisateursDAO dao = new UtilisateursDAO(lcn);

        Utilisateurs ut;
        ut = dao.selectOne("p", "b");

        if (ut == null) {
            System.out.println("KO");
        } else {
            System.out.println("Ok");
        }
    } /// Main
} /// Class
