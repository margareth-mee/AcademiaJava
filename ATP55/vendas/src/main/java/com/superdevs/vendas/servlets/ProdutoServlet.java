package com.superdevs.vendas.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import com.superdevs.vendas.models.Produto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class ProdutoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Produto prod = new Produto();

        prod.setNome(req.getParameter("nome")); 
        String valor = req.getParameter("valor");
        String idString = req.getParameter("id_categoria");

        if (valor != null && idString != null) {
            prod.setValor(Float.parseFloat(valor));
            prod.setId_categoria(Integer.parseInt(idString)); 
            out.printf("Modulo Produtos - Prod = %s | ID = %s | Preco: %f", prod.getNome(), prod.getId_categoria(), prod.getValor());

        } else if(idString != null){
            prod.setId_categoria(Integer.parseInt(idString));
            out.printf("Modulo Produtos - Prod = %s | ID: %d", prod.getNome(), prod.getId_categoria());

        } else {
            out.printf("Modulo Produtos - Prod = %s", prod.getNome());
        }
    }
}
