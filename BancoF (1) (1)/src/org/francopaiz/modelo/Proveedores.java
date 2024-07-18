/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.francopaiz.modelo;

/**
 * This method is the model of the provider.(GETTERS AND SETTERS)
 *
 * @author fpaiz
 */
public class Proveedores {

    private int idProveedor;
    private String proveedor;

    /**
     * This method is to get the provider's id
     *
     * @return returns the id
     */
    public int getIdProveedor() {
        return idProveedor;
    }

    /**
     * This method is to assign the provider's id
     *
     * @param idProveedor needs an int
     */
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    /**
     * This method is to get the provider
     *
     * @return returns the name of the provider
     */
    public String getProveedor() {
        return proveedor;
    }

    /**
     * This method is to assign the provider
     *
     * @param proveedor receives an String
     */
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

}
