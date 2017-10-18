/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.controls;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.pb.daos.PaysDAO;
import fr.pb.entities.Pays;
import java.sql.*;
import java.util.*;
import javax.servlet.ServletException;
/**
 *
 * @author formation
 */
@WebServlet(name = "PaysCTRL", urlPatterns = {"/PaysCTRL"})
public class PaysCTRL extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String lsMessage = "";

        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection lcn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cours", "root", "");

            List<Pays> listePays = PaysDAO.selectAll(lcn);
            request.setAttribute("listePays", listePays);
            lsMessage = "OK";
        } catch (Exception e) {
            lsMessage = e.getMessage();
        }
        request.setAttribute("message", lsMessage);
        getServletContext().getRequestDispatcher("/jsp/Pays.jsp").forward(request, response);

    } /// doGet
}
