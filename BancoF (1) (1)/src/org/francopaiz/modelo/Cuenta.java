/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.francopaiz.modelo;

/**
 * This class is the model of the account (GETTERS AND SETTERS)
 *
 * @author informatica
 */
public class Cuenta {

    //VARIABLES
    private int id_cuenta;
    private int numero_cuenta;
    private int id_cliente;
    private int id_banco;

    /**
     * This method is to get the costumer's id
     *
     * @return returns the id
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * This method is to assign the costumer's id
     *
     * @param id_cliente returns an int
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * This method is to get the bank's id
     *
     * @return returns the id of the bank
     */
    public int getId_banco() {
        return id_banco;
    }

    /**
     * This method is to set the bank's id
     *
     * @param id_banco needs an int
     */
    public void setId_banco(int id_banco) {
        this.id_banco = id_banco;
    }
    //VARIABLES
    private int id_tipo_cuenta;
    private int id_tipo_moneda;
    private float saldo;

    /**
     * This method is to get the account's id
     *
     * @return returns the id of the account
     */
    public int getId_cuenta() {
        return id_cuenta;
    }

    /**
     * This method is to assign the account's id
     *
     * @param id_cuenta receives an int
     */
    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    /**
     * This method is to get the account's number
     *
     * @return returns the number
     */
    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    /**
     * This method is to set the account's number
     *
     * @param numero_cuenta needs an int
     */
    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    /**
     * This method is to get the id of the type of account
     *
     * @return returns the id.
     */
    public int getId_tipo_cuenta() {
        return id_tipo_cuenta;
    }

    /**
     * This method is to assign the id of the type of account
     *
     * @param id_tipo_cuenta receives an int
     */
    public void setId_tipo_cuenta(int id_tipo_cuenta) {
        this.id_tipo_cuenta = id_tipo_cuenta;
    }

    /**
     * This method is to get the id of the coin
     *
     * @return returns the id of the coin
     */
    public int getId_tipo_moneda() {
        return id_tipo_moneda;
    }

    /**
     * This method is to assign the id of the coin
     *
     * @param id_tipo_moneda needs an int
     */
    public void setId_tipo_moneda(int id_tipo_moneda) {
        this.id_tipo_moneda = id_tipo_moneda;
    }

    /**
     * This method is to get the amount of money.
     *
     * @return returns the amount
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * This method is to assign the amount of money
     *
     * @param saldo needs a float character.
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}
