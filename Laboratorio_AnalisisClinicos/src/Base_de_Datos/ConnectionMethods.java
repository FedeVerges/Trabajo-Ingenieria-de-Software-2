/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author fede_
 */
public class ConnectionMethods {
        public static Connection connection;

    private static void connectToSQLite() {
        try {
            // Create connection to the database.
            connection = DriverManager.getConnection("jdbc:sqlite:base_de_datos/database.db");
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static Connection getConection(){
        if(connection == null){
            connectToSQLite();
        }
        return connection;
    }

    public static void close(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    
}
