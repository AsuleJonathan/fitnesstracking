package com.asule.database;
 
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcSQLServerConnection implements Serializable {

    private static final String URL = "jdbc:mysql://localhost:3306/fitnesstracking";

    private static final String USER = "root";

    private static final String PASSWORD ="";

    private static  JdbcSQLServerConnection database;

    private Connection connection;

    private  JdbcSQLServerConnection() throws SQLException {
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static  JdbcSQLServerConnection getInstance() throws SQLException{
        if (database == null)
            database = new  JdbcSQLServerConnection();

        return database;

    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
