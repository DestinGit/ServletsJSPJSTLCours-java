/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.controls;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author formation
 */
@WebServlet(name = "MonCompte", urlPatterns = {"/MonCompte"})
public class MonCompte extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        String lsUrl;
        HttpSession session = request.getSession();
        if (session.getAttribute("pseudo") != null && !session.getAttribute("pseudo").toString().equals("")) {
            lsUrl = "MonCompte.jsp";
        } else {
            request.setAttribute("message", "Vous devez être authentifié !!!");
            lsUrl = "Authentification.jsp";
        }
        getServletContext().getRequestDispatcher("/jsp/" + lsUrl).forward(request, response);
    }
}
