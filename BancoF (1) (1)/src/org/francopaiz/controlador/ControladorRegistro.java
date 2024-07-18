/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.francopaiz.controlador;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import org.francopaiz.modelo.Registro;


import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This is the controller class for the register. Here we use different methods
 * to make the CRUD.
 *
 * @author fpaiz.
 */
public class ControladorRegistro {

    /**
     * This method is to list the departments. We use the SELECT*FROM in db
     *
     * @return a list of departments.
     */
    public ArrayList listarDepartamentos() {
        ArrayList<Registro> listaDeDepartamentos = new ArrayList();
        String sql = "SELECT * FROM tbl_departamento";

        try {
           // con = conexion.getConexion();
           // ps = con.prepareStatement(sql);
           // rs = ps.executeQuery();
           rs = Conexion.getInstancia().getConexion().prepareStatement(sql).executeQuery();
            while (rs.next()) {
                Registro reg = new Registro();
                reg.setId_Departamento(rs.getString("id_departamento"));
                reg.setDepartamento(rs.getString("departamento"));

                listaDeDepartamentos.add(reg);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listaDeDepartamentos;

    }

    /**
     * This method is to list the municipalities. We use the SELECT*FROM in db
     *
     * @return a list of municipalities.
     */
    public ArrayList listarMunicipios() {
        ArrayList<Registro> listaDeMunicipios = new ArrayList();
        String sql = "SELECT * FROM tbl_municipio";

        try {
            //con = conexion.getConexion();
           // ps = con.prepareStatement(sql);
            //rs = ps.executeQuery();
            rs = Conexion.getInstancia().getConexion().prepareStatement(sql).executeQuery();
            while (rs.next()) {
                Registro reg = new Registro();
                reg.setId_Municipio(rs.getString("id_municipio"));
                reg.setMunicipio(rs.getString("municipio"));

                listaDeMunicipios.add(reg);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listaDeMunicipios;

    }

    /**
     * This method is to list the users. We use a special select in database.
     * This method needs a String to search the user.
     *
     * @param user receives a String.
     * @return returns a list.
     */
    public ArrayList listarUsuarios(String user) {
        ArrayList<Registro> listaDeUsuarios = new ArrayList();
        Registro registro = new Registro();

        String sql = "SELECT id_usuario, usuario, contraseña FROM tbl_usuario WHERE usuario= ? ";

        try {
           con = conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            rs = ps.executeQuery();
            
           

            while (rs.next()) {
                Registro reg = new Registro();
                reg.setId_usuario(rs.getInt("id_usuario"));
                reg.setUsuario(rs.getString("usuario"));
                reg.setContraseña(rs.getString("contraseña"));

                listaDeUsuarios.add(reg);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listaDeUsuarios;

    }

    /**
     * This method is to search the user that you need. Once you have the user
     * you are going to get the id automatically.
     *
     * @param user needs a String
     * @return returns the user in a textfield.
     */
    public Registro buscarUsuariosID(String user) {
        Registro registro = new Registro();
        String sql = "SELECT id_usuario FROM tbl_usuario WHERE usuario = ?";
        try {
            con = conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            rs = ps.executeQuery();
            if (rs.next()) {
                registro.setId_usuario(rs.getInt("id_usuario"));

            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return registro;

    }

    /*  public void listarUsuarios(){
           Registro registro = new Registro();
           String user = registro.getUsuario();
           String password = registro.getContraseña();
           try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ver_usuarios(?,?)");
            sentencia.setString(1,user);
            sentencia.setString(2,password);
            sentencia.execute();
           // JOptionPane.showMessageDialog(null, "Tu usuario ha sido registrado.");
        } catch (Exception error) {
            error.printStackTrace();
        } 
       }*/
 /*public void listarUsuariosID(Registro registro){
           try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ver_usuarios_id(?,?)");
            sentencia.setString(1, registro.getUsuario());
            sentencia.setString(2, registro.getContraseña());
            sentencia.execute();
           // JOptionPane.showMessageDialog(null, "Tu usuario ha sido registrado.");
        } catch (Exception error) {
            error.printStackTrace();
        } 
    }*/
    private static ControladorServicios instancia;

    Connection con;
    Conexion conexion = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    /**
     * We use this method to add a register. It has the procedure to insert.
     *
     * @param registro needs a register.
     */
    public void agregarRegistro(Registro registro) {
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_insertar_usuario(?,?)");
            sentencia.setString(1, registro.getUsuario());
            sentencia.setString(2, registro.getContraseña());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Tu usuario ha sido registrado.");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

}
