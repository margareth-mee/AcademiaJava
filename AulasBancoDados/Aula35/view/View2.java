package Aula35.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Aula35.utils.ConnectionFactory;

public class View2 {
    public static void main(String[] args) {
        try {
            String nome = "UpdatePrepStatment";
            int id = 25;
            Connection conn = new ConnectionFactory().getConnection();
            
            String sql = "UPDATE Categoria SET nome = ? where id = ? ";
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setString(1, nome);
            prepStatement.setInt(2, id);

            prepStatement.execute();
            
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);
            
            conn.close();

        } catch (SQLException e) {
            System.out.println("Não foi possível conectar.");
        }
    }
}