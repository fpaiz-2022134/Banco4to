/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.francopaiz.modelo;

/**
 * This is the model class of the transaction.(GETTERS AND SETTERS)
 *
 * @author fpaiz
 */
public class Transaccion {

    private int id_transaccion;
    private int id_proveedor;
    private int id_servicio;
    private float cantidadTransferencia;
    private String cliente;
    private String fecha;

    /**
     * This method is to get the costumer.
     *
     * @return returns the costumer.
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * This method is to assign the costumer.
     *
     * @param cliente receives a String.
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * This method is to get the date.
     *
     * @return return the date.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * This method is to assign the date.
     *
     * @param fecha receives a String.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * This is the method to get the transaction's id.
     *
     * @return returns the id
     */
    public int getId_transaccion() {
        return id_transaccion;
    }

    /**
     * This is the method to assign the transaction's id.
     *
     * @param id_transaccion receives an int
     */
    public void setId_transaccion(int id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    /**
     * This is the method to get the provider's id.
     *
     * @return returns the id
     */
    public int getId_proveedor() {
        return id_proveedor;
    }

    /**
     * This is the method to assign the provider's id
     *
     * @param id_proveedor receives an int.
     */
    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    /**
     * This is the method to get the service's id.
     *
     * @return returns the id.
     */
    public int getId_servicio() {
        return id_servicio;
    }

    /**
     * This is the method to assign the service's id.
     *
     * @param id_servicio needs an int.
     */
    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    /**
     * This is the method to get the amount of money of the transaction.
     *
     * @return returns the money.
     */
    public float getCantidadTransferencia() {
        return cantidadTransferencia;
    }

    /**
     * This is the method to assign the amount of money of the transaction.
     *
     * @param cantidadTransferencia receives a float.
     */
    public void setCantidadTransferencia(float cantidadTransferencia) {
        this.cantidadTransferencia = cantidadTransferencia;
    }
}
