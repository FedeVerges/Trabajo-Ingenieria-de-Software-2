/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Base_de_Datos.ConnectionMethods;
import InterfacesGraficas.Principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 *
 * @author fede_
 */
public class ManagerAnalisis {

    public void setFilasTablaAnalisis() {
        try {
            ConnectionMethods.getConection();
            String SELECT_SQL = "SELECT * FROM ANALISIS";
            PreparedStatement ps = ConnectionMethods.connection.prepareStatement(SELECT_SQL);
            ResultSet res = ps.executeQuery();
            ResultSetMetaData resultSetMetaData = res.getMetaData();

            int numberOfColumns = resultSetMetaData.getColumnCount();
           //  res.get
     
            

        } catch (Exception e) {

        }
    }
}
