/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.francopaiz.controlador;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.francopaiz.controlador.Conexion;
import org.francopaiz.modelo.TipoCuentas;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This is the controller class for the types of accounts.
 *
 * @author fpaiz
 */
public class ControladorTipoCuenta {

    private static ControladorTipoCuenta instancia;
    Connection con;
    Conexion conexion = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    /**
     * This method lists the type of accounts in the table.
     *
     * @return returns the list.
     */
    public ArrayList listarTipoCuenta() {
        ArrayList<TipoCuentas> listaDeTiposCuenta = new ArrayList();
        String sql = "SELECT * FROM tbl_tipo_cuenta";

        try {
           // con = conexion.getConexion();
          //  ps = con.prepareStatement(sql);
           // rs = ps.executeQuery();
           rs = Conexion.getInstancia().getConexion().prepareStatement(sql).executeQuery();

            while (rs.next()) {
                TipoCuentas tipo = new TipoCuentas();
                tipo.setId_tipo_cuenta(rs.getInt("id_tipo_cuenta"));
                tipo.setTipo_cuenta(rs.getString("tipo_cuenta"));

                listaDeTiposCuenta.add(tipo);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listaDeTiposCuenta;

    }

    /**
     * This is the method to add a new type of account. It uses stored
     * procedures.
     *
     * @param tipo needs to receive a type of account.
     */
    public void agregarTipoCuenta(TipoCuentas tipo) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_insertar_tipo_cuenta(?,?)");
            sentencia.setInt(1, tipo.getId_tipo_cuenta());
            sentencia.setString(2, tipo.getTipo_cuenta());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha enviado un dato a la DB");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    /**
     * This is the method to delete a type of account.
     *
     * @param tipo needs to receive a type of account.
     */
    public void eliminarTipoCuenta(TipoCuentas tipo) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminar_tipo_cuenta(?)");
            sentencia.setInt(1, tipo.getId_tipo_cuenta());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado un dato de la DB");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    /**
     * This is the method to update a new type of account.
     *
     * @param tipo needs to receive a type of account.
     */
    public void actualizarTipoCuenta(TipoCuentas tipo) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizar_tipo_cuenta(?,?)");
            sentencia.setInt(1, tipo.getId_tipo_cuenta());
            sentencia.setString(2, tipo.getTipo_cuenta());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha actualizado un dato en la BD");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

}
