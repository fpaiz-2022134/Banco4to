/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.francopaiz.controlador;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * This is the class that make the connection between Java Netbeans and MySQL.
 *
 * @author fpaiz
 */
public class Conexion {

    private Connection conexion;
    private static Conexion instancia;

    // Class.forName("com.mysql.cj.jdbc.Driver");
    /**
     * This is the constructor of the class.
     *
     * Here we include the connection by a jdbc connector that is in the
     * libraries.
     */
    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_proyecto_banco_online2?useSSL=false", "root", "francosql134");
        } catch (Exception error) {
            error.printStackTrace();
        }

    }

    /**
     * We can get the instance of the connection using singleton.
     *
     * @return returns the instance.
     */
    public synchronized static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    /**
     * This is the method to get the connection.
     *
     * @return returns the conection.
     */
    public Connection getConexion() {
        return conexion;
    }

    /**
     * This is the method that assign the connection.
     *
     * @param conexion receives a connection type.
     */
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

}
