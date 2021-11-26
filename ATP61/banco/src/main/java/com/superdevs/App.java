package com.superdevs;

import com.superdevs.dao.CategoriaDao;
import com.superdevs.model.Categoria;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("================= ATP60 =================");
        CategoriaDao dao = new CategoriaDao(); 
        Categoria model = new Categoria();
        Categoria model2 = new Categoria();
         
        /*CREATE*/
        model.setNome("ATP60 - Teste com CategoriaDao");
        dao.create(model);

        /*UPDATE*/
        model2.setId(53);//setando para testar o update
        model2.setNome("ATP60 - Testando update");
        dao.update(model2);

        /*DELETE*/
        dao.delete(53); 

        /*READ*/ 
        for (Categoria categoria : dao.read()) {
            System.out.printf("%d - %s\n",categoria.getId(),categoria.getNome());
        }   
    }
}
