package Aula33.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View3 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "123456");
            
            Statement statement = conn.createStatement();
            String sql = "insert into produto(nome, descricao, preco, categoria_id)values('celular', 'iphone', 2000, 2)";
            statement.execute(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet ids = statement.getGeneratedKeys();
            
            //Imprimir resultado
            while(ids.next()){
                int id = ids.getInt(1);
                System.out.println(id);
            }
            
            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
