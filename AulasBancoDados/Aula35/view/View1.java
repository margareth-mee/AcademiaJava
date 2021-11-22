package Aula35.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Aula35.utils.ConnectionFactory;

public class View1 {
    public static void main(String[] args) {
        // Try with resources - desta forma, não é necessário o fechamento com o 'cnn.close();'
        try(Connection conn = new ConnectionFactory().getConnection()) 
        {
            int idDeletado = 26;
            String sql = "DELETE FROM Categoria WHERE nome = ? ";
            
            try(PreparedStatement prepStatement = conn.prepareStatement(sql)){ 
                prepStatement.setInt(1, idDeletado);
                prepStatement.execute();
                int linhasAfetadas = prepStatement.getUpdateCount(); 
                System.out.println(linhasAfetadas);
            } catch (Exception e ){
                e.printStackTrace();
            }

        } catch (SQLException e) {
            System.out.println("Não foi possível conectar.");
        }
    } 
}
