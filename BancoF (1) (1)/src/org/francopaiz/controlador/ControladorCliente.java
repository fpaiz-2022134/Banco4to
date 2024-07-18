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
import org.francopaiz.controlador.Conexion;
import org.francopaiz.vista.VentanaRegistroGeneral;

import org.francopaiz.modelo.Cliente;

/**
 * This is the controller of the client. Here we use some functions defined by
 * methods. It has the CRUD.
 *
 * @author Dell
 */
public class ControladorCliente {

    private static ControladorCliente instancia;

    Connection con;
    Conexion conexion = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

   /* public ArrayList listarClienteEnviado(int usuario){
      ArrayList<Cliente> listaDeClientes = new ArrayList();
      
      
          
    String sql ="SELECT id_cliente, nombres_cliente, apellidos_cliente, sexo, nacionalidad FROM tbl_cliente WHERE id_usuario = ?";
    
        try {
            con = conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, usuario);
            rs = ps.executeQuery();
            
            while(rs.next()){
              Cliente client = new Cliente();
              client.setId_cliente(rs.getInt("id_cliente"));
              client.setNombres_cliente(rs.getString("nombres_cliente"));
              client.setApellidos_cliente(rs.getString("apellidos_cliente"));
              client.setSexo(rs.getString("sexo"));
              client.setNacionalidad(rs.getString("nacionalidad"));
              
              listaDeClientes.add(client);
            }
            
        } catch (SQLException e) {
            System.out.println(e.toString());            
        }
        return listaDeClientes;
    
    }*/
    /**
     * This method has the function to list the clients in the table. 
     * We use the consult in db. (SELECT*FROM)
     *
     * @return list of clients.
     */
    public ArrayList listarClientes() {
        ArrayList<Cliente> listaDeClientes = new ArrayList();
        String sql = "SELECT * FROM tbl_cliente";

        try {
         
            rs = Conexion.getInstancia().getConexion().prepareStatement(sql).executeQuery();
                    //ps.executeQuery();

            while (rs.next()) {
                Cliente client = new Cliente();
                client.setId_cliente(rs.getInt("id_cliente"));
                client.setNombres_cliente(rs.getString("nombres_cliente"));
                client.setApellidos_cliente(rs.getString("apellidos_cliente"));
                client.setSexo(rs.getString("sexo"));
                client.setNacionalidad(rs.getString("nacionalidad"));
                client.setIdentificador(rs.getString("identificador"));
                client.setNumero_identificador(rs.getString("numero_identificador"));
                client.setId_departamento(rs.getInt("id_departamento"));
                client.setId_municipio(rs.getInt("id_municipio"));
                client.setId_usuario(rs.getInt("id_usuario"));
                client.setTelefono_cliente(rs.getString("telefono_cliente"));
                client.setCompañia_cliente(rs.getString("compañia_cliente"));
                listaDeClientes.add(client);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listaDeClientes;

    }

    /**
     * This method has the function to list the clients in the table. It shows
     * the half of information.
     *
     * @return returns a list.
     */
    public ArrayList listarClientes2() {
        ArrayList<Cliente> listaDeClientes2 = new ArrayList();
        String sql = "SELECT id_cliente, nombres_cliente, apellidos_cliente, sexo, nacionalidad FROM tbl_cliente";

        try {
            //con = conexion.getConexion();
            //ps = con.prepareStatement(sql);
            //rs = ps.executeQuery();
            
            rs = Conexion.getInstancia().getConexion().prepareStatement(sql).executeQuery();

            while (rs.next()) {
                Cliente client = new Cliente();
                client.setId_cliente(rs.getInt("id_cliente"));
                client.setNombres_cliente(rs.getString("nombres_cliente"));
                client.setApellidos_cliente(rs.getString("apellidos_cliente"));
                client.setSexo(rs.getString("sexo"));
                client.setNacionalidad(rs.getString("nacionalidad"));
                listaDeClientes2.add(client);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listaDeClientes2;

    }

    /**
     * This method is to add a new client. It use the procedure to instert in
     * the database.
     *
     * @param client receives a client.
     */
    public void agregarCliente(Cliente client) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_insertar_cliente(?,?,?,?,?,?,?,?,?,?,?)");
            sentencia.setString(1, client.getNombres_cliente());
            sentencia.setString(2, client.getApellidos_cliente());
            sentencia.setString(3, client.getSexo());
            sentencia.setString(4, client.getNacionalidad());
            sentencia.setString(5, client.getIdentificador());
            sentencia.setString(6, client.getNumero_identificador());
            sentencia.setInt(7, client.getId_municipio());
            sentencia.setInt(8, client.getId_departamento());
            sentencia.setInt(9, client.getId_usuario());
            sentencia.setString(10, client.getTelefono_cliente());
            sentencia.setString(11, client.getCompañia_cliente());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "DATOS REGISTRADOS");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    /*public void eliminarServicio(Servicios service){
       try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminar_servicio(?)");
            sentencia.setInt(1,service.getIdServicio());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado un dato de la DB");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }*/
    /**
     * This method has the function to update the client. We use the following
     * procedure in the database: call sp_actualizar_cliente
     *
     * @param client
     */
    public void actualizarCliente(Cliente client) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizar_cliente(?,?,?,?,?,?,?,?,?,?,?,?)");
            sentencia.setInt(1, client.getId_cliente());
            sentencia.setString(2, client.getNombres_cliente());
            sentencia.setString(3, client.getApellidos_cliente());
            sentencia.setString(4, client.getSexo());
            sentencia.setString(5, client.getNacionalidad());
            sentencia.setString(6, client.getIdentificador());
            sentencia.setString(7, client.getNumero_identificador());
            sentencia.setInt(8, client.getId_municipio());
            sentencia.setInt(9, client.getId_departamento());
            sentencia.setInt(10, client.getId_usuario());
            sentencia.setString(11, client.getTelefono_cliente());
            sentencia.setString(12, client.getCompañia_cliente());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha actualizado un dato en la BD");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

}
