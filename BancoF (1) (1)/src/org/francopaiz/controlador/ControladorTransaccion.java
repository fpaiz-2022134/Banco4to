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
import java.util.Date;

import org.francopaiz.modelo.Transaccion;

/**
 * This is the controller class of the transaction
 *
 * @author fpaiz
 */
public class ControladorTransaccion {

    private static ControladorTransaccion instancia;

    Connection con;
    Conexion conexion = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    /**
     * This method has the function to list the transactions.
     *
     * @param fecha It receives the date of the transaction.
     * @return returns the list.
     */
    public ArrayList listarTransaccion(String fecha) {
        ArrayList<Transaccion> listaDeTransacciones = new ArrayList();
        String sql = "SELECT * FROM tbl_transaccion";

        try {
            //con = conexion.getConexion();
           // ps = con.prepareStatement(sql);
           // rs = ps.executeQuery();
           rs = Conexion.getInstancia().getConexion().prepareStatement(sql).executeQuery();
            while (rs.next()) {
                Transaccion tipo = new Transaccion();
                tipo.setId_transaccion(rs.getInt("id_transaccion"));
                tipo.setId_proveedor(rs.getInt("id_proveedor"));
                tipo.setId_servicio(rs.getInt("id_servicio"));
                tipo.setCantidadTransferencia(rs.getFloat("cantidad"));
                tipo.setCliente(rs.getString("cliente"));
                tipo.setFecha(rs.getString("fecha"));
                listaDeTransacciones.add(tipo);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listaDeTransacciones;

    }

    /**
     * This method put a new transaction in the db.
     *
     * @param tipo needs information of the transaction.
     */
    public void agregarTransaccion(Transaccion tipo) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_insertar_transaccion(?,?,?,?,?)");
            sentencia.setInt(1, tipo.getId_proveedor());
            sentencia.setInt(2, tipo.getId_servicio());
            sentencia.setFloat(3, tipo.getCantidadTransferencia());
            sentencia.setString(4, tipo.getCliente());
            sentencia.setString(5, tipo.getFecha());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha enviado un dato a la DB");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    /**
     * This method is going to delete the transaction that you want.
     *
     * @param tipo needs information of the transaction and id.
     */
    public void eliminarTransaccion(Transaccion tipo) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminar_transaccion(?)");
            sentencia.setInt(1, tipo.getId_transaccion());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado un dato de la DB");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    /**
     * This method is to update the information in your transaction.
     *
     * @param tipo needs an id and new information.
     */
    public void actualizarTransaccion(Transaccion tipo) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizar_transaccion(?,?,?,?)");
            sentencia.setInt(1, tipo.getId_transaccion());
            sentencia.setInt(2, tipo.getId_proveedor());
            sentencia.setInt(3, tipo.getId_servicio());
            sentencia.setFloat(4, tipo.getCantidadTransferencia());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha actualizado un dato en la BD");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    /**
     * This method is to look for that transaction that you want. It shows only
     * the transactions of the day that you set.
     *
     * @param fechaTransaccion needs the date.
     * @return returns the transactions of that specific date.
     */
    public ArrayList buscarTransaccion(String fechaTransaccion) {
        ArrayList<Transaccion> listaTransaccionDate = new ArrayList();
        Transaccion transaccion = new Transaccion();

        String sql = "SELECT * FROM tbl_transaccion where fecha = ?";

        try {
            con = conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, fechaTransaccion);
            rs = ps.executeQuery();

            while (rs.next()) {
                Transaccion tipo = new Transaccion();
                tipo.setId_transaccion(rs.getInt("id_transaccion"));
                tipo.setId_proveedor(rs.getInt("id_proveedor"));
                tipo.setId_servicio(rs.getInt("id_servicio"));
                tipo.setCantidadTransferencia(rs.getFloat("cantidad"));
                tipo.setCliente(rs.getString("cliente"));
                tipo.setFecha(fechaTransaccion);
                listaTransaccionDate.add(tipo);

            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listaTransaccionDate;

    }
}
