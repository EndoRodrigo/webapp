package org.endorodrigo.headers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cabecera")
public class CabeceraHttpsRequestSerlvet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String motodoTHHP = req.getMethod();
        String requestUri = req.getRequestURI();
        String requestUrl = String.valueOf(req.getRequestURL());
        String contextPath = req.getContextPath();
        String servletPath = req.getServletPath();
        String ip = req.getLocalAddr();
        String puerto = String.valueOf(req.getLocalPort());
        String schema = req.getScheme();
        String host = req.getHeader("host");

        try(PrintWriter out = resp.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"en\">");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Cabecera HTTP Request</title>");
            out.println("</head>");
            out.println(" <body>");
            out.println("<h1>Cabecera HTTP request!</h1>");
            out.println("<ul>");
            out.println("<li> Metodo HTTP: "+motodoTHHP+" </li>");
            out.println("<li> Request Uri: "+requestUri+" </li>");
            out.println("<li> Request url: "+requestUrl+" </li>");
            out.println("<li> Context Path: "+contextPath+" </li>");
            out.println("<li> Servlet Path: "+servletPath+" </li>");
            out.println("<li> IP Local: "+ip+" </li>");
            out.println("<li> Puerto Local: "+puerto+" </li>");
            out.println("<li> Schema: "+schema+" </li>");
            out.println("<li> Host: "+host+" </li>");
            out.println("</ul>");
            out.println(" </body>");
            out.println(" </html>");

        }
    }
}
