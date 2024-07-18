/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.francopaiz.modelo;

/**
 * This class is the Client of the bank.(GETTERS AND SETTERS)
 *
 * @author fpaiz
 */
public class Cliente {

    private int id_cliente;
    private String nombres_cliente;
    private String apellidos_cliente;
    private String sexo;
    private String nacionalidad;
    private String identificador;
    private String numero_identificador;
    private String telefono_cliente;
    private String compañia_cliente;

    /**
     * This method is to get the phone of the client.
     *
     * @return returns the phone
     */
    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    /**
     * This method is to assign the customer's phone.
     *
     * @param telefono_cliente receives an String
     */
    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    /**
     * This method is to get the company of the phone.
     *
     * @return returns the company
     */
    public String getCompañia_cliente() {
        return compañia_cliente;
    }

    /**
     * This method is to set the company of the phone.
     *
     * @param compañia_cliente receives an String
     */
    public void setCompañia_cliente(String compañia_cliente) {
        this.compañia_cliente = compañia_cliente;
    }

    /**
     * This method is to get the id of the client
     *
     * @return returns the id like an int.
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * This method is to assign the id of the client
     *
     * @param id_cliente needs an int.
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * This method is to get the costumer's name.
     *
     * @return returns the name.
     */
    public String getNombres_cliente() {
        return nombres_cliente;
    }

    /**
     * This method is to assign the costumer's name.
     *
     * @param nombres_cliente receives an String.
     */
    public void setNombres_cliente(String nombres_cliente) {
        this.nombres_cliente = nombres_cliente;
    }

    /**
     * This method is to get the last name of the client.
     *
     * @return returns the last name
     */
    public String getApellidos_cliente() {
        return apellidos_cliente;
    }

    /**
     * This method is to set the last name of the client.
     *
     * @param apellidos_cliente receives an String.
     */
    public void setApellidos_cliente(String apellidos_cliente) {
        this.apellidos_cliente = apellidos_cliente;
    }

    /**
     * This method is to get the gender of the client.
     *
     * @return returns the gender.
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * This method is to set the gender of the client.
     *
     * @param sexo receives an String
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * This method is to get nationality.
     *
     * @return returns the nationality.
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * This method is to assign the nationality of the client.
     *
     * @param nacionalidad needs a String
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * This method is to get the identifier of the client.
     *
     * @return returns the identifier
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * This method is to assign the the identifier.
     *
     * @param identificador needs a String
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * This method is to get the identifier's number
     *
     * @return returns a number
     */
    public String getNumero_identificador() {
        return numero_identificador;
    }

    /**
     * This method is to set the identifier's number
     *
     * @param numero_identificador needs a String
     */
    public void setNumero_identificador(String numero_identificador) {
        this.numero_identificador = numero_identificador;
    }

    /**
     * This method is to get the municipality's id
     *
     * @return returns the id
     */
    public int getId_municipio() {
        return id_municipio;
    }

    /**
     * This method is to assign the municipality's id
     *
     * @param id_municipio receives an int
     */
    public void setId_municipio(int id_municipio) {
        this.id_municipio = id_municipio;
    }

    /**
     * This method is to get the department's id
     *
     * @return returns the id
     */
    public int getId_departamento() {
        return id_departamento;
    }

    /**
     * This method is to set the department's id
     *
     * @param id_departamento needs an int
     */
    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    /**
     * This method is to get the user's id
     *
     * @return returns the id
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     *This method is to assign the user's id
     * @param id_usuario needs an int
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    private int id_municipio;
    private int id_departamento;
    private int id_usuario;
}
