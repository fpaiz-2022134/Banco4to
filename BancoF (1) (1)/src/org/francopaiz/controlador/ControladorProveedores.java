/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.francopaiz.controlador;


import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.francopaiz.modelo.Proveedores;

/**
 * This is the controller of the provider. We use methods to make the CRUD.
 *
 * @author fpaiz
 */
public class ControladorProveedores {

    private static ControladorProveedores instancia;

    Connection con;
    Conexion conexion = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    /**
     * This method has the function to list in the table. It uses the
     * SELECT*FROM in data base.
     *
     * @return
     */
    public ArrayList listarProveedores() {
        ArrayList<Proveedores> listaDeProveedores = new ArrayList();
        String sql = "SELECT * FROM tbl_proveedor";

        try {
            //con = conexion.getConexion();
           // ps = con.prepareStatement(sql);
            //rs = ps.executeQuery();
            rs = Conexion.getInstancia().getConexion().prepareStatement(sql).executeQuery();

            while (rs.next()) {
                Proveedores tipo = new Proveedores();
                tipo.setIdProveedor(rs.getInt("id_proveedor"));
                tipo.setProveedor(rs.getString("proveedor"));

                listaDeProveedores.add(tipo);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listaDeProveedores;

    }

    /**
     * This method is to add a provider in the db. It uses stored procedures.
     *
     * @param tipo
     */
    public void agregarProveedor(Proveedores tipo) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_insertar_proveedor(?,?)");
            sentencia.setInt(1, tipo.getIdProveedor());
            sentencia.setString(2, tipo.getProveedor());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha enviado un dato a la DB");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    /**
     * This method has the function to delete a provider in db. It uses stored
     * procedures.
     *
     * @param tipo
     */
    public void eliminarProveedor(Proveedores tipo) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminar_proveedor(?)");
            sentencia.setInt(1, tipo.getIdProveedor());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado un dato de la DB");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    /**
     * This method has the function to update a provider in db. It uses stored
     * procedures.
     *
     * @param tipo
     */
    public void actualizarProveedor(Proveedores tipo) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizar_proveedor(?,?)");
            sentencia.setInt(1, tipo.getIdProveedor());
            sentencia.setString(2, tipo.getProveedor());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha actualizado un dato en la BD");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
