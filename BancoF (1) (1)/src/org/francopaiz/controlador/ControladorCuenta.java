/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.francopaiz.controlador;

/**
 *
 * @author fpaiz
 */
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.francopaiz.modelo.Cuenta;

/**
 * This is the controller of the account. We use the methods to make the CRUD.
 *
 * @author fpaiz
 */
public class ControladorCuenta {

    private static ControladorCuenta instancia;

    Connection con;
    Conexion conexion = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    /**
     * This method is to list the accounts in a table. It uses the consult
     * SELECT*FROM
     *
     * @return return a list.
     */
    public ArrayList listarCuenta() {
        ArrayList<Cuenta> listaDeCuentas = new ArrayList();
        String sql = "SELECT * FROM tbl_cuenta";

        try {
            //con = conexion.getConexion();
            //ps = con.prepareStatement(sql);
            //rs = ps.executeQuery();
            rs = Conexion.getInstancia().getConexion().prepareStatement(sql).executeQuery();

            while (rs.next()) {
                Cuenta tipo = new Cuenta();
                tipo.setId_cuenta(rs.getInt("id_cuenta"));
                tipo.setNumero_cuenta(rs.getInt("numero_cuenta"));
                tipo.setId_cliente(rs.getInt("id_cliente"));
                tipo.setId_banco(rs.getInt("id_banco"));
                tipo.setId_tipo_cuenta(rs.getInt("id_tipo_cuenta"));
                tipo.setId_tipo_moneda(rs.getInt("id_moneda"));
                tipo.setSaldo(rs.getFloat("saldo"));

                listaDeCuentas.add(tipo);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listaDeCuentas;

    }

    /**
     * This method has the function to add an account. It uses the procedure of
     * sp_insertar_cuenta.
     *
     * @param tipo needs information from the account.
     */
    public void agregarCuenta(Cuenta tipo) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_insertar_cuenta(?,?,?,?,?,?)");

            sentencia.setInt(1, tipo.getNumero_cuenta());
            sentencia.setInt(2, tipo.getId_cliente());
            sentencia.setInt(3, tipo.getId_banco());
            sentencia.setInt(4, tipo.getId_tipo_cuenta());
            sentencia.setInt(5, tipo.getId_tipo_moneda());
            sentencia.setFloat(6, tipo.getSaldo());

            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha enviado un dato a la DB");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    public void actualizarCuenta(Cuenta tipo) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizar_cuenta(?,?,?,?,?,?,?)");
            sentencia.setInt(1, tipo.getId_cuenta());
            sentencia.setInt(2, tipo.getNumero_cuenta());
            sentencia.setInt(3, tipo.getId_cliente());
            sentencia.setInt(4, tipo.getId_banco());
            sentencia.setInt(5, tipo.getId_tipo_cuenta());
            sentencia.setInt(6, tipo.getId_tipo_moneda());
            sentencia.setFloat(7, tipo.getSaldo());

            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha actualizado un dato en la BD");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

}
