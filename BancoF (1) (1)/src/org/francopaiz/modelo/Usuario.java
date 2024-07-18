/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.francopaiz.modelo;

/**
 *
 * @author Dell
 */
public class Usuario {

    public Usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    public Usuario(){
        
    }
    private int id_usuario;
    private String usuario;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    
}
