package org.endorodrigo.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
    final static String USERNAME = "ADMIN";
    final static String PASS = "12345";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (USERNAME.equals(username) && PASS.equals(password)) {
            try(PrintWriter out = resp.getWriter()){
                out.println("<!DOCTYPE html>");
                out.println("<html lang=\"en\">");
                out.println("<head>");
                out.println("<meta charset=\"UTF-8\">");
                out.println("<title>Inicio de sesion</title>");
                out.println("</head>");
                out.println(" <body>");
                out.println("<h1>Login!</h1>");
                out.println("<h1>Bienvenido señor "+username+"</h1>");
                out.println(" </body>");
                out.println(" </html>");

            }
        }else {
            resp.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Los datos ingresados no son correctos...");
        }
    }
}
