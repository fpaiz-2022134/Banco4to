/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.francopaiz.modelo;

/**
 * This class is the model of the bank.(GETTERS AND SETTERS)
 *
 * @author fpaiz
 */
public class Banco {

    private int id_banco;
    private String nombreBanco;
    private int telefonoBanco;
    private String direccionBanco;
    private String paginaBanco;
    private String gmailBanco;

    /**
     * This method is to get the id bank
     *
     * @return the id
     */
    public int getId_banco() {
        return id_banco;
    }

    /**
     * This method is to asign the id bank
     *
     * @param id_banco receive an int
     */
    public void setId_banco(int id_banco) {
        this.id_banco = id_banco;
    }

    /**
     * This method is to get the name of the bank
     *
     * @return the name of the bank
     */
    public String getNombreBanco() {
        return nombreBanco;
    }

    /**
     * This method is to assign the name of the bank
     *
     * @param nombreBanco need to receive an String
     */
    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    /**
     * This method is to get the bank phone
     *
     * @return returns a number
     */
    public int getTelefonoBanco() {
        return telefonoBanco;
    }

    /**
     * This method is to assign the bank phone
     *
     * @param telefonoBanco receives an int
     */
    public void setTelefonoBanco(int telefonoBanco) {
        this.telefonoBanco = telefonoBanco;
    }

    /**
     * This method is to get the address
     *
     * @return returns an address
     */
    public String getDireccionBanco() {
        return direccionBanco;
    }

    /**
     * This method is to set the addres of the bank
     *
     * @param direccionBanco needs an string
     */
    public void setDireccionBanco(String direccionBanco) {
        this.direccionBanco = direccionBanco;
    }

    /**
     * This method is to get te bank's website
     *
     * @return return a website
     */
    public String getPaginaBanco() {
        return paginaBanco;
    }

    /**
     * This method is to assign the bank's website
     *
     * @param paginaBanco receives an String
     */
    public void setPaginaBanco(String paginaBanco) {
        this.paginaBanco = paginaBanco;
    }

    /**
     * This method is to get the email of the bank
     *
     * @return returns an e-mail
     */
    public String getGmailBanco() {
        return gmailBanco;
    }

    /**
     * This method is to set the e-mail of the bank
     *
     * @param gmailBanco receives an String
     */
    public void setGmailBanco(String gmailBanco) {
        this.gmailBanco = gmailBanco;
    }

}
