/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.testpack;

import java.io.*;
import java.sql.*;

/**
 *
 * @author formation
 */
public class CommunesCsv2DB {
    public static void main(String[] args) {
        // --- déclaration
        String serverName;
        String port;
        String database;
        String user;
        String password;
        String query;
        // --- Pour une connexion MySQL native
        serverName = "localhost";
        port = "3306";
        database = "cours";
        user = "root";
        password = "";
        String dsn = "jdbc:mysql://" + serverName + ":" + port + "/" + database;
        query = "INSERT INTO communes(nom_commune, cp_commune,departement_commune,insee_commune) VALUES(?,?,?,?)";
        String nomDuFichier = "communes.csv";

        try {
            // --- Ouverture du fichier
            // --- Bufferisation             
            BufferedReader bReader = new BufferedReader(new FileReader(nomDuFichier));
            // --- Lecture des lignes-enregistrements
            String ligne;

            // --- Connexion
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection connexion = DriverManager.getConnection(dsn, user, password);
            connexion.setAutoCommit(false);

            java.util.Date dd = new java.util.Date();
            long llDD = dd.getTime();

            PreparedStatement ps = connexion.prepareStatement(query);

            ligne = bReader.readLine();
            while ((ligne = bReader.readLine()) != null) {
                if (!ligne.isEmpty()) {
                    String[] array = ligne.split(";");
                    if (array.length == 4) {
                        ps.setString(1, array[0]);
                        ps.setString(2, array[1]);
                        ps.setString(3, array[2]);
                        ps.setString(4, array[3]);
                        ps.executeUpdate();
                    }
                }
            }

            ps.close();
            connexion.commit();
            connexion.close();
            bReader.close();

            java.util.Date df = new java.util.Date();
            long llDF = df.getTime();

            System.out.println("Durée : " + (llDF - llDD));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
}
