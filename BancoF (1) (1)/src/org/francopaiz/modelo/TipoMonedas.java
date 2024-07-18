/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.francopaiz.modelo;

/**
 * This is the model class of the coins. (GETTERS AND SETTERS)
 *
 * @author fpaiz
 */
public class TipoMonedas {

    private int id_tipo_moneda;
    private String moneda;

    /**
     * This method is to get the coin's id.
     *
     * @return returns the id.
     */
    public int getId_tipo_moneda() {
        return id_tipo_moneda;
    }

    /**
     * This is the method to assign the coin's id.
     *
     * @param id_tipo_moneda receives the int.
     */
    public void setId_tipo_moneda(int id_tipo_moneda) {
        this.id_tipo_moneda = id_tipo_moneda;
    }

    /**
     * This is the mthod to get the coin.
     *
     * @return returns the coin.
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * This is the method to assign the coin.
     *
     * @param moneda needs a String.
     */
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

}
