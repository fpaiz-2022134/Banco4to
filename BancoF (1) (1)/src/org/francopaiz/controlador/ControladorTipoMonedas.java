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

import org.francopaiz.modelo.TipoMonedas;
import org.francopaiz.controlador.Conexion;

/**
 * This is the controller class for the coins. It uses methods to make the CRUD.
 *
 * @author fpaiz
 */
public class ControladorTipoMonedas {

    private static ControladorTipoMonedas instancia;

    Connection con;
    Conexion conexion = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    /**
     * This method is to list all the coins in the table.
     *
     * @return returns the list of coins.
     */
    public ArrayList listarTipoMoneda() {
        ArrayList<TipoMonedas> listaDeTiposMoneda = new ArrayList();
        String sql = "SELECT * FROM tbl_moneda";

        try {
           // con = conexion.getConexion();
           // ps = con.prepareStatement(sql);
           // rs = ps.executeQuery();
           rs = Conexion.getInstancia().getConexion().prepareStatement(sql).executeQuery();
            while (rs.next()) {
                TipoMonedas tipo = new TipoMonedas();
                tipo.setId_tipo_moneda(rs.getInt("id_moneda"));
                tipo.setMoneda(rs.getString("moneda"));

                listaDeTiposMoneda.add(tipo);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listaDeTiposMoneda;

    }

    /**
     * This method is to add a new type of coin.
     *
     * @param tipo needs information of the coin.
     */
    public void agregarTipoMoneda(TipoMonedas tipo) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_insertar_moneda(?,?)");
            sentencia.setInt(1, tipo.getId_tipo_moneda());
            sentencia.setString(2, tipo.getMoneda());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha enviado un dato a la DB");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    /**
     * This method is to delete a coin.
     *
     * @param tipo needs information and id of the coin.
     */
    public void eliminarTipoMoneda(TipoMonedas tipo) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminar_moneda(?)");
            sentencia.setInt(1, tipo.getId_tipo_moneda());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado un dato de la DB");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    /**
     * This method is to update the coin.
     *
     * @param tipo needs information and id of the coin.
     */
    public void actualizarTipoMoneda(TipoMonedas tipo) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizar_moneda(?,?)");
            sentencia.setInt(1, tipo.getId_tipo_moneda());
            sentencia.setString(2, tipo.getMoneda());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha actualizado un dato en la BD");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
