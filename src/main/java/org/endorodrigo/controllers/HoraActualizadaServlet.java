package org.endorodrigo.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@WebServlet("/hora")
public class HoraActualizadaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        resp.setHeader("refresh","1");
        LocalTime hora = LocalTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss");
        try(PrintWriter out = resp.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"en\">");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>La hora actualizada</title>");
            out.println("</head>");
            out.println(" <body>");
            out.println("<h1>En este momento son las ....!</h1>");
            out.println("<ul>");
            out.println("<li>ID: "+hora.format(df)+"</li>");
            out.println("</ul>");
            out.println(" </body>");
            out.println(" </html>");

        }
    }
}
