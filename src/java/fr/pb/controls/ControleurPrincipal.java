/*
 * ControleurPrincipal.java
 */
package fr.pb.controls;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pascal
 */
@WebServlet(name = "ControleurPrincipal", urlPatterns = {"/ControleurPrincipal"})
public class ControleurPrincipal extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String lsURL = "Accueil.jsp";
        getServletContext().getRequestDispatcher("/jsp/" + lsURL).forward(request, response);
    } /// doGet

} /// class