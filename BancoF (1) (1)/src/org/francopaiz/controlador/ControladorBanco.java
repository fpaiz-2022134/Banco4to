/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.francopaiz.controlador;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.francopaiz.modelo.Banco;

/**
 * This is the controller of the bank.
 * Here we define some functions by methods.
 * @author fpaiz
 */
public class ControladorBanco {
    
    private static ControladorBanco instancia;
    
    Connection con;
    Conexion conexion = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    /**
     * This method is to list the banks that we have
     * inside the data base and we can see in the table.
     * @return returns a list or ArrayList.
     */
     public ArrayList listarBanco(){
      ArrayList<Banco> listaDeBanco= new ArrayList();
    String sql ="SELECT * FROM tbl_banco";
    
        try {
            //con = conexion.getConexion();
           // ps = con.prepareStatement(sql);
           // rs = ps.executeQuery();
           
           rs = Conexion.getInstancia().getConexion().prepareStatement(sql).executeQuery();
            
            while(rs.next()){
              Banco tipo = new Banco();
              tipo.setId_banco(rs.getInt("id_banco"));
              tipo.setNombreBanco(rs.getString("nombre_banco"));
              tipo.setTelefonoBanco(rs.getInt("telefono_banco"));
              tipo.setDireccionBanco(rs.getString("direccion_banco"));
              tipo.setPaginaBanco(rs.getString("pagina_web"));
              tipo.setGmailBanco(rs.getString("gmail_banco"));
              
              listaDeBanco.add(tipo);
            }
            
        } catch (SQLException e) {
            System.out.println(e.toString());            
        }
        return listaDeBanco;
    
    }
    
    /**
     * We can add a new bank in the database with this method.
     * This method uses the consult to call the procedure.
     * @param bank receives a bank.
     */
    public void agregarBanco(Banco bank){
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_insertar_banco(?,?,?,?,?,?)");
            sentencia.setInt(1, bank.getId_banco());
            sentencia.setString(2, bank.getNombreBanco());
            sentencia.setInt(3, bank.getTelefonoBanco());
            sentencia.setString(4, bank.getDireccionBanco());
            sentencia.setString(5, bank.getPaginaBanco());
            sentencia.setString(6, bank.getGmailBanco());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha enviado un dato a la DB");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
    
    /**
     * We can delete a bank in the database with this method.
     * This method uses the consult to call the correct procedure.
     * @param bank receives a bank.
     */     
       public void eliminarBanco(Banco bank){
       try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminar_banco(?)");
            sentencia.setInt(1, bank.getId_banco());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado un dato de la DB");
        } catch (Exception error) {
            error.printStackTrace();
        }
       }
       
       /**
        * We can update a provider with this method.
        * This method uses the consult to call the correct procedure.
        * @param bank receives a bank
        */
        public void actualizarProveedor(Banco bank){
         try {
           PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizar_banco(?,?,?,?,?,?)");
            sentencia.setInt(1, bank.getId_banco());
            sentencia.setString(2, bank.getNombreBanco());
            sentencia.setInt(3, bank.getTelefonoBanco());
            sentencia.setString(4, bank.getDireccionBanco());
            sentencia.setString(5, bank.getPaginaBanco());
            sentencia.setString(6, bank.getGmailBanco());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha actualizado un dato en la BD");
        } catch (Exception error) {
            error.printStackTrace();
        }
     }
}
