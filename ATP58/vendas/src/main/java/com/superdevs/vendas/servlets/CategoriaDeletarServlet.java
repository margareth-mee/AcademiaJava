package com.superdevs.vendas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.superdevs.vendas.dao.CategoriaDao;
import com.superdevs.vendas.models.Categoria;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/deletar")
public class CategoriaDeletarServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao = new CategoriaDao();
        Categoria model = new Categoria();

        int id = Integer.parseInt(req.getParameter("id"));
        model.setId(id);
        dao.delete(model);

        //PrintWriter pw = resp.getWriter();
        //pw.printf("catetegoria id = %d deletado", id);

        RequestDispatcher rd = req.getRequestDispatcher("/deletar-sucesso.jsp");
        req.setAttribute("id", model.getId());
        rd.forward(req, resp);
    }
}
