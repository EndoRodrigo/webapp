package org.endorodrigo.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.endorodrigo.model.Producto;
import org.endorodrigo.service.ProductoService;
import org.endorodrigo.service.ProductoServiceImp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@WebServlet("/json")
public class ProductosJsonServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletInputStream jsonStream = req.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        Producto producto = mapper.readValue(jsonStream, Producto.class);
        resp.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = resp.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"en\">");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Detalle producto desde Json</title>");
            out.println("</head>");
            out.println(" <body>");
            out.println("<h1>Detalle producto desde Json!</h1>");
            out.println("<ul>");
            out.println("<li>ID: "+producto.getId()+"</li>");
            out.println("<li>NAME: "+producto.getName()+"</li>");
            out.println("<li>PRECIO: "+producto.getPrice()+"</li>");
            out.println("<li>TIPO: "+producto.getTypeP()+"</li>");
            out.println("</ul>");
            out.println(" </body>");
            out.println(" </html>");

        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductoService productoService = new ProductoServiceImp();
        List<Producto> productos = productoService.listar();

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(productos);
        resp.setContentType("application/json");
        resp.getWriter().write(json);

    }
}
