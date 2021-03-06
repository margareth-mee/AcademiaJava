import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class Produto extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String nome = req.getParameter("nome");
        String parametroValor = req.getParameter("valor");
        String idString = req.getParameter("id_categoria");

        if (parametroValor != null && idString != null) {
            float valor = Float.parseFloat(parametroValor);
            int id = Integer.parseInt(idString);
            out.printf("Modulo Produtos - Prod = %s | ID = %s | Preco: %f", nome, id, valor);

        } else if(idString != null){
            int id = Integer.parseInt(idString);
            out.printf("Modulo Produtos - Prod = %s | ID: %d", nome, id);

        } else {
            out.printf("Modulo Produtos - Prod = %s", nome);
        }
    }
}
