/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.francopaiz.modelo;

/**
 * This is the model class of the register.(GETTERS AND SETTERS)
 *
 * @author fpaiz
 */
public class Registro {

    private int id_usuario;

    /**
     * This is the method to get the user's id
     *
     * @return returns the id
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * This method is to assign the user's id
     *
     * @param id_usuario receives an int
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    private String usuario;
    private String contraseña;
    private String id_Departamento;
    private String departamento;
    private String id_Municipio;
    private String municipio;

    /**
     * This method gets the department's id.
     *
     * @return returns the id
     */
    public String getId_Departamento() {
        return id_Departamento;
    }

    /**
     * This method is to assign the department's id.
     *
     * @param id_Departamento needs a String
     */
    public void setId_Departamento(String id_Departamento) {
        this.id_Departamento = id_Departamento;
    }

    /**
     * This method gets the department.
     *
     * @return returns the department.
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * This method is to assign the department.
     *
     * @param departamento needs a String.
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * This method gets the municipality's id.
     *
     * @return returns the id.
     */
    public String getId_Municipio() {
        return id_Municipio;
    }

    /**
     * This method assigns the municipality's id
     *
     * @param id_Municipio needs a String
     */
    public void setId_Municipio(String id_Municipio) {
        this.id_Municipio = id_Municipio;
    }

    /**
     * This method is to get the municipality.
     *
     * @return returns the name of the municipality.
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * Tis method assigns the municipality.
     *
     * @param municipio needs a String.
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * This method is to get the name of the user.
     *
     * @return returns the user.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * This method is to set the name of the user.
     *
     * @param usuario needs a String.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * This method is to get the password.
     *
     * @return returns the password.
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * This method is to set the password.
     *
     * @param contraseña needs a String.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
