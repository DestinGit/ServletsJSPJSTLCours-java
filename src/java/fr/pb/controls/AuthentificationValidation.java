/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.controls;

import connexion.Connexion;
import fr.pb.daos.UtilisateursDAO;
import fr.pb.entities.Utilisateurs;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author formation
 */
@WebServlet(name = "AuthentificationValidation", urlPatterns = {"/AuthentificationValidation"})
public class AuthentificationValidation extends HttpServlet {

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
//        out.println(request.getParameter("pseudo"));
//        out.println("<br>");
//        out.println(request.getParameter("mdp"));
        
        Connection lcn = Connexion.getConnectionMySQL("localhost", "cours", "3306", "root", "");
        UtilisateursDAO dao = new UtilisateursDAO(lcn);

        Utilisateurs ut;
        ut = dao.selectOne(request.getParameter("pseudo"), request.getParameter("mdp"));

        String lsMessage = "";
        
        if (ut == null) {
            lsMessage = "KO";
        } else {
            lsMessage = "KO";
//            out.println("Ok");
        }

        request.setAttribute("message", lsMessage); 
 
        ServletContext sc = getServletContext(); 
        RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/jsp/Authentification.jsp"); 
        rd.forward(request, response);         
    }

}