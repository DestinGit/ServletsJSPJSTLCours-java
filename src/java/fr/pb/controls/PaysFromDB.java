/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.controls;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author formation
 */
@WebServlet(name = "PaysFromDB", urlPatterns = {"/PaysFromDB"})
public class PaysFromDB extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
        
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String lsMessage = null;
        StringBuilder sb = new StringBuilder();
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cours", "root", "");
                        
            String lsSQL = "SELECT * FROM pays";
            PreparedStatement ps = con.prepareStatement(lsSQL);
            ResultSet rs = ps.executeQuery();
                                  
            while (rs.next()) {
            sb.append(rs.getString(1));
            sb.append(" - ");
            sb.append(rs.getString(2));
//            sb.append(" - ");
//            sb.append(rs.getString(3));
//            sb.append(" - ");
//            sb.append(rs.getString(4));
//            sb.append(" - ");
//            sb.append(rs.getString(5));
            sb.append("\n");
            }
            
            lsMessage = sb.toString();
            
            //fermeture des connexions
            rs.close();
            ps.close();
            con.close();
            
        } catch (ClassNotFoundException e) {
            lsMessage = e.getMessage();
        } catch (SQLException ex) {
            Logger.getLogger(CommuneFromDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        out.print(lsMessage);
    }///doGet

}
