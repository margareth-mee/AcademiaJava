package com.superdevs;

import com.superdevs.dao.ContaCorrenteDao;
import com.superdevs.model.ContaCorrente;

/**
 * Hello world!
 *
 */
public class AppConta {
    public static void main(String[] args) {
        System.out.println("=========== ATP61 - Conta Corrente ============");
        ContaCorrenteDao dao = new ContaCorrenteDao();
        ContaCorrente model = new ContaCorrente();
        model.setNumero(12345);
        dao.create(model);

        /* READ */
        for (ContaCorrente categoria : dao.read()) {
            System.out.printf("Id %d | Número da Conta: %d\n", categoria.getId(), categoria.getNumero());
        }

        /* UPDATE */
        model.setId(model.getId());// setando para testar o update
        model.setNumero(11111);
        dao.update(model);

         /* READ */
         for (ContaCorrente categoria : dao.read()) {
            System.out.printf("Id %d | Número da Conta: %d\n", categoria.getId(), categoria.getNumero());
        }

        /* DELETE */
        dao.delete(model.getId());

        /* READ */
        for (ContaCorrente categoria : dao.read()) {
            System.out.printf("Id %d | Número da Conta: %d\n", categoria.getId(), categoria.getNumero());
        }
    }
}
