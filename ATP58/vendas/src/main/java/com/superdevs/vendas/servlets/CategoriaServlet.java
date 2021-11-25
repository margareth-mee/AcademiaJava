package com.superdevs.vendas.servlets;
import java.io.IOException;

import com.superdevs.vendas.dao.CategoriaDao;
import com.superdevs.vendas.models.Categoria;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Categoria cat = new Categoria();
        CategoriaDao dao = new CategoriaDao();
        
        cat.setNome(req.getParameter("nome"));
        cat.setDescricao(req.getParameter("descricao"));

        cat.setId(dao.insert(cat));
        
        //PrintWriter out = resp.getWriter();
        //out.printf("Modulo Categoria - Nome = %s | Descricao %s", cat.getNome(), cat.getDescricao()); 
        //out.printf("Categoria gerada com sucesso TESTE - Id gerado %d", cat.getId()); 
        
        req.setAttribute("id", cat.getId());
        RequestDispatcher rd = req.getRequestDispatcher("categoria-sucesso.jsp");
        rd.forward(req, resp);
    }
}
