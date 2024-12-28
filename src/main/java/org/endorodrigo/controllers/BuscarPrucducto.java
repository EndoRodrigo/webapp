package org.endorodrigo.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.endorodrigo.model.Producto;
import org.endorodrigo.service.ProductoService;
import org.endorodrigo.service.ProductoServiceImp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

@WebServlet("/buscar")
public class BuscarPrucducto extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductoService productoService = new ProductoServiceImp();
        String name = req.getParameter("producto");
        Optional<Producto> encontrado = productoService.listar().stream().filter(producto -> producto.getName().contains(name)).findFirst();
        if (encontrado.isPresent()) {

            try(PrintWriter out = resp.getWriter()){
                out.println("<!DOCTYPE html>");
                out.println("<html lang=\"en\">");
                out.println("<head>");
                out.println("<meta charset=\"UTF-8\">");
                out.println("<title>Buscar productos</title>");
                out.println("</head>");
                out.println(" <body>");
                out.println("<h1>Buscar productos!</h1>");
                out.println("<h3>Producto encontrado "+encontrado.get().getName()+"</h3>");
                out.println("<h1>Precio: "+encontrado.get().getPrice()+"</h1>");
                out.println(" </body>");
                out.println(" </html>");

            }

        }else {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND, "El articulo buscado no existe");
        }
    }
}
