package Aula33.view;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class View5 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "123456");
            
            Statement statement = conn.createStatement();
            String sql = "delete from produto where id>10";
            statement.execute(sql, Statement.RETURN_GENERATED_KEYS);
          
            int linhasAfetadas = statement.getUpdateCount();
            System.out.println(linhasAfetadas);
            
            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
