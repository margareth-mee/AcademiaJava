package com.superdevs;

import com.superdevs.dao.CategoriaDao;
import com.superdevs.model.Categoria;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("=========== ATP61 - Categoria ============");
        CategoriaDao dao = new CategoriaDao();
        Categoria model = new Categoria();
  
        /* CREATE */
        model.setNome("ATP61 - Teste com CategoriaDao");
        dao.create(model);

        /* READ */
        for (Categoria categoria : dao.read()) {
            System.out.printf("%d - %s\n", categoria.getId(), categoria.getNome());
        }

        /* UPDATE */
        model.setId(model.getId());// setando para testar o update
        model.setNome("ATP61 - Testando update");
        dao.update(model);

        /* READ */
        for (Categoria categoria : dao.read()) {
            System.out.printf("%d - %s\n", categoria.getId(), categoria.getNome());
        }

        /* DELETE */
        dao.delete(model.getId());

        /* READ */
        for (Categoria categoria : dao.read()) {
            System.out.printf("%d - %s\n", categoria.getId(), categoria.getNome());
        }
    }
}
