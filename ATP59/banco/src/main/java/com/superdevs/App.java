package com.superdevs;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.superdevs.model.Categoria;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Sistema de banco");
        Categoria model = new Categoria();
        model.setNome("JPA é só sucesso");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco"); //esse nome é o que se encontra no arquivo persistence.xml
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();
        em.persist(model);
        em.getTransaction().commit();

        //deve-se utilizar o nome da classe (Categoria) e não da tabela do BD
        //em c.nome, nome se refere ao atributo nome da classe Categoria (no banco de dados poderia ser outro nome ex:nome_cat)
        List<Categoria> lista = em.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList(); 
        for (Categoria categoria : lista) {
            System.out.println(categoria.getNome());
        }        
    }
}
