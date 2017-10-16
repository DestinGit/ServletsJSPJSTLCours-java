/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.controls;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "Authentification", urlPatterns = {"/Authentification"})
public class Authentification extends HttpServlet {

@Override 
protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException { 

    response.setContentType("text/html;charset=UTF-8");

    String lsURL = "Authentification.jsp";
    ServletContext sc = getServletContext(); 
    RequestDispatcher rd = sc.getRequestDispatcher("/jsp/" + lsURL); 
    rd.forward(request, response); 

} /// doGet
}
