/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.francopaiz.modelo;

/**
 * This is the model class of the types of accounts.(GETTERS AND SETTERS)
 *
 * @author fpaiz
 */
public class TipoCuentas {

    private int id_tipo_cuenta;
    private String tipo_cuenta;

    /**
     * This is the method to get the id of the types of accounts.
     *
     * @return returns the id.
     */
    public int getId_tipo_cuenta() {
        return id_tipo_cuenta;
    }

    /**
     * This is the method to assign the id of the types of accounts.
     *
     * @param id_tipo_cuenta needs an int.
     */
    public void setId_tipo_cuenta(int id_tipo_cuenta) {
        this.id_tipo_cuenta = id_tipo_cuenta;
    }

    /**
     * This is the method to get the type of account.
     *
     * @return returns the type.
     */
    public String getTipo_cuenta() {
        return tipo_cuenta;
    }

    /**
     * This is the method to set the type of account.
     *
     * @param tipo_cuenta receives a String.
     */
    public void setTipo_cuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

}
