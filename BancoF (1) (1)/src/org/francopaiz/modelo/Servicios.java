/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.francopaiz.modelo;

/**
 * The model class of the service.(GETTERS AND SETTERS).
 *
 * @author fpaiz
 */
public class Servicios {

    private int idServicio;
    private String servicio;

    /**
     * This method is to get the service's id.
     *
     * @return returns the id.
     */
    public int getIdServicio() {
        return idServicio;
    }

    /**
     * This method is to assign the service's id.
     *
     * @param idServicio needs an int.
     */
    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    /**
     * This method is to get the service.
     *
     * @return returns the name of the service.
     */
    public String getServicio() {
        return servicio;
    }

    /**
     * This method is to assign the service.
     *
     * @param servicio needs a String.
     */
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

}
