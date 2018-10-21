/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Base_de_Datos.ConnectionMethods;
import Clases.Analisis;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author fede_
 */
public class ManagerAnalisis {

    public ArrayList<Analisis> recuperarFilas() {
        Statement statement = null;
        String query = "SELECT * FROM 'ANALISIS'";
        ArrayList<Analisis> datosAnalisis = new ArrayList<Analisis>();
        Analisis a;
        try {
            statement = ConnectionMethods.getConection().createStatement();
            
            ResultSet resultSet = statement.executeQuery(query);            
            while (resultSet.next()) {
                a = new Analisis((resultSet.getInt("A_codigo")), (resultSet.getString("A_NOMBRE")), (resultSet.getString("A_INDICACIONES")), (resultSet.getInt("A_CANT.UNIDADES_B")), (resultSet.getBoolean("A_CONSENTIMIENTO")), (resultSet.getInt("A_COSTODESCARTABLES")),(resultSet.getString("A_VALORES_REFERENCIA")));
                datosAnalisis.add(a);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            ConnectionMethods.close(statement);
        }
        return datosAnalisis;
    }

    public void cargarAnalisis(Analisis a) throws SQLException {
        PreparedStatement ps = null;
        String insertSql = "INSERT INTO 'ANALISIS VALUES (?,?,?,?,?,?,?)";
        try{
            ps = ConnectionMethods.getConection().prepareStatement(insertSql);
            ps.setInt(0,a.getCodigo());
            ps.setString(1,a.getNombre());
            ps.setString(2,a.getIndicacionesPrevias());
            ps.setInt(3,a.getCantidadUnidadesB());
            ps.setBoolean(4, a.getConsentimiento());
            ps.setInt(5, a.getCostoDescartables());
            ps.setString(6, a.getValoresReferencia());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            ConnectionMethods.close(ps);
        }

    }
    public String[] recuperarColumnas(){
        String columnas[];
        
        Statement statement = null;
        String query = "SELECT * FROM 'ANALISIS'";
        
       
        try {
            statement = ConnectionMethods.getConection().createStatement();
            
            ResultSet resultSet = statement.executeQuery(query);
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            columnas= new String[]{resultSetMetaData.getColumnName(1),resultSetMetaData.getColumnName(2),resultSetMetaData.getColumnName(3),resultSetMetaData.getColumnName(4),resultSetMetaData.getColumnName(5),resultSetMetaData.getColumnName(6)};
            System.out.println(columnas.toString());
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            ConnectionMethods.close(statement);
        }
        return columnas;
        
    }
}
