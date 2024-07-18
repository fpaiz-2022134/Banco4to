/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.francopaiz.controlador;


import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.francopaiz.modelo.Servicios;

/**
 * This is the controller class for the service. It uses differents methods to
 * make the CRUD.
 *
 * @author fpaiz
 */
public class ControladorServicios {

    private static ControladorServicios instancia;

    Connection con;
    Conexion conexion = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    /**
     * This is an ArrayList method It is to list the services in the table.
     *
     * @return returns the list of services.
     */
    public ArrayList listarServicios() {
        ArrayList<Servicios> listaDeServicios = new ArrayList();
        String sql = "SELECT * FROM tbl_servicio";

        try {
           // con = conexion.getConexion();
            //ps = con.prepareStatement(sql);
            //rs = ps.executeQuery();
            rs = Conexion.getInstancia().getConexion().prepareStatement(sql).executeQuery();
            while (rs.next()) {
                Servicios tipo = new Servicios();
                tipo.setIdServicio(rs.getInt("id_servicio"));
                tipo.setServicio(rs.getString("servicio"));

                listaDeServicios.add(tipo);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listaDeServicios;

    }

    /**
     * This method has the function to add a new service in the db.
     *
     * @param service needs information of the service.
     */
    public void agregarServicio(Servicios service) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_insertar_servicio(?,?)");
            sentencia.setInt(1, service.getIdServicio());
            sentencia.setString(2, service.getServicio());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha enviado un dato a la DB");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    /**
     * This method has the function to delete the service that you want.
     *
     * @param service needs information of the service.
     */
    public void eliminarServicio(Servicios service) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminar_servicio(?)");
            sentencia.setInt(1, service.getIdServicio());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado un dato de la DB");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    /**
     * This method updates the information of the service.
     *
     * @param service needs a service to update.
     */
    public void actualizarServicio(Servicios service) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizar_servicio(?,?)");
            sentencia.setInt(1, service.getIdServicio());
            sentencia.setString(2, service.getServicio());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha actualizado un dato en la BD");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

}
