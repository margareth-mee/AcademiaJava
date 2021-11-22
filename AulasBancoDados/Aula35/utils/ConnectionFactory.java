package Aula35.utils;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
    private String url;
    private String user;
    private String password;
    private DataSource dataSource;

    public ConnectionFactory(){
        this.url = "jdbc:postgresql://localhost:5433/postgres";
        this.user = "postgres";
        this.password = "123456";

        ComboPooledDataSource pool = new ComboPooledDataSource();
        pool.setJdbcUrl(this.url);
        pool.setUser(this.user);
        pool.setPassword(this.password);
        pool.setMaxPoolSize(1000);
        this.dataSource  = pool;
    }

    public Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }

}
