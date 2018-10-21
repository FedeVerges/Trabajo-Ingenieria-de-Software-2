/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Base_de_Datos.ConnectionMethods;
import Clases.Obra_Social;
import Clases.Paciente;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author fede_
 */
public class ManagerPacientes {

    public ArrayList<Paciente> recuperarFilas() {
        Statement statement = null;
        String query = "SELECT * FROM 'PACIENTES'";
        ArrayList<Paciente> datosPaciente = new ArrayList<Paciente>();
        Paciente p;
        try {
            statement = ConnectionMethods.getConection().createStatement();

            ResultSet resultSet = statement.executeQuery(query);
            ResultSet resultSet2 = statement.executeQuery("Select * FROM 'OBRA SOCIAL' WHERE O_Nombre =" + resultSet.getString("O_NOMBRE"));
            Obra_Social o = new Obra_Social((resultSet2.getString("O_NOMBERE")), (resultSet2.getInt("O_TELEFONO")), (resultSet2.getFloat("O_PUB")));

            while (resultSet.next()) {
                p = new Paciente((resultSet.getString("P_NOMBRE")), (resultSet.getString("P_APELLIDO")), (resultSet.getInt("P_DNI")), (resultSet.getLong("P_TELEFONO")), (resultSet.getString("P_FECHA_NACIMIENTO")), (resultSet.getInt("P_EDAD")), (resultSet.getString("P_SEXO")), (o));
                datosPaciente.add(p);

            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            ConnectionMethods.close(statement);
        }
        return datosPaciente;
    }

    public void cargarPaciente(Paciente p) throws SQLException {
        PreparedStatement ps = null;
        String insertSql = "INSERT INTO 'PACIENTES' VALUES (?,?,?,?,?,?,?,?)";
        try {
            ps = ConnectionMethods.getConection().prepareStatement(insertSql);
            ps.setString(0, p.getNombre());
            ps.setString(1, p.getApellido());
            ps.setInt(2, p.getDni());
            ps.setLong(3, p.getTelefono());
            ps.setDate(4, (Date) p.getFechaNacimiento());
            ps.setInt(5, p.getEdad());
            ps.setString(6, p.getSexo());
            ps.setString(7, p.getObraSocial().getNombre());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionMethods.close(ps);
        }

    }

    public String[] recuperarColumnas() {
        String columnas[];

        Statement statement = null;
        String query = "SELECT * FROM 'PACIENTE'";

        try {
            statement = ConnectionMethods.getConection().createStatement();

            ResultSet resultSet = statement.executeQuery(query);
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            columnas = new String[]{resultSetMetaData.getColumnName(1), resultSetMetaData.getColumnName(2), resultSetMetaData.getColumnName(3), resultSetMetaData.getColumnName(4), resultSetMetaData.getColumnName(5), resultSetMetaData.getColumnName(6), resultSetMetaData.getColumnName(7), resultSetMetaData.getColumnName(8)};
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
