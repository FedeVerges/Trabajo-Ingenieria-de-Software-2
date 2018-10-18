/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_Datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author fede_
 */
public class test {
    public static void main(String[] args) {
        ConnectionMethods.getConection();
        //insert();
        //print();
        
    }

    private static void insert() {
        PreparedStatement ps = null;
        String INSERT_SQL = "INSERT INTO items VALUES(?,?)";
        try {
            ps = ConnectionMethods.connection.prepareStatement(INSERT_SQL);
            ps.setInt(1, 5);
            ps.setString(2, "Pepito");
            ps.executeUpdate();
            System.out.println("Correct insert!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionMethods.close(ps);
        }
    }
    
    private static void print() {
        Statement statement = null;
        try {
            statement = ConnectionMethods.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ITEMS");
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            System.out.println();
            int numberOfColumns = resultSetMetaData.getColumnCount();
            for (int i = 1; i <= numberOfColumns; i++) {
                if (i > 1) System.out.print(",  ");
                String columnName = resultSetMetaData.getColumnName(i);
                System.out.print(columnName);
            }
            System.out.println();
            while (resultSet.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    if (i > 1) System.out.print(",  ");
                    String columnValue = resultSet.getString(i);
                    System.out.print(columnValue);
                }
                System.out.println();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionMethods.close(statement);
        }
    }
    
}
