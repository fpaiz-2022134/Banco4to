/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.francopaiz.vista;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.francopaiz.controlador.ControladorBanco;
import org.francopaiz.modelo.Banco;
import org.francopaiz.controlador.ControladorCliente;
import org.francopaiz.controlador.ControladorCuenta;
import org.francopaiz.controlador.ControladorTipoCuenta;
import org.francopaiz.modelo.TipoCuentas;
import org.francopaiz.modelo.TipoMonedas;
import org.francopaiz.controlador.ControladorTipoMonedas;
import org.francopaiz.modelo.Cliente;
import org.francopaiz.modelo.Cuenta;
import org.francopaiz.controlador.ControladorProveedores;
import org.francopaiz.controlador.ControladorServicios;
import org.francopaiz.modelo.Proveedores;
import org.francopaiz.modelo.Servicios;
import org.francopaiz.controlador.ControladorServicios;
import org.francopaiz.modelo.Transaccion;
import java.util.Date;
import org.francopaiz.controlador.ControladorTransaccion;

/**
 * This is the window for the client.
 * Here the costumer can change the information and make transactions.
 * @author fpaiz
 */
public class VentanaCliente extends javax.swing.JFrame {

    /**
     * Creates new form VentanaCliente - Constructor
     */
    public VentanaCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    
    
    DefaultTableModel modeloCliente = new DefaultTableModel();
    ControladorCliente controladorCliente = new ControladorCliente();
    
    
     ControladorBanco controladorB = new ControladorBanco();
    DefaultTableModel modeloBanco = new DefaultTableModel();
    
    
    ControladorTipoCuenta controlador = new ControladorTipoCuenta();
    DefaultTableModel modelo = new DefaultTableModel();
    
    ControladorCuenta controladorCuenta = new ControladorCuenta();
    DefaultTableModel modeloCuenta = new DefaultTableModel();
    
        ControladorTipoMonedas controladorM = new ControladorTipoMonedas();
    DefaultTableModel modeloMoneda = new DefaultTableModel();
    
    ControladorProveedores controladorProveedores = new ControladorProveedores();
    DefaultTableModel modeloProveedor = new DefaultTableModel();
    
    ControladorServicios controladorS = new ControladorServicios();
    DefaultTableModel modeloServicio = new DefaultTableModel();
    
    ControladorTransaccion controladorTransaccion = new ControladorTransaccion();
    DefaultTableModel modeloTransaccion = new DefaultTableModel();
    
    DefaultTableModel limpiar = new DefaultTableModel();
    // LIMPIAR Y LISTAR
    
    /**
     * This method is to clean the textfields of the client.
     */
    public void limpiarClienteDatos(){
        txtNombreCliente.setText("");
        txtApellidoCliente.setText("");
        txtSexoCliente.setText("");
        txtNacionalidadCliente.setText("");
        txtTelefonoCliente.setText("");
        txtCompañiaCliente.setText("");
        txtIdentificador.setText("");
        txtNumIdentificador.setText("");
        txtClienteActualizar.setText("");
        txtIdUsuario.setText("");
    }
    
    /**
     * This method is to clean the textfields of the account.
     */
    public void limpiarDatosCuenta(){
        txtNumeroCuenta.setText("");
        txtIdCliente.setText("");
        txtIdBanco.setText("");
        txtIdTipoCuenta.setText("");
        txtIdMoneda.setText("");
        txtSaldoInicial.setText("");
        txtIdCuentaActualizar.setText("");
        
    }
    /**
     * This method is to clean the table of the service.
     */
     public void limpiarServicios() {
        limpiar = (DefaultTableModel) tableServicios.getModel();
        int fila = tableServicios.getRowCount();
        for (int i = 0; i < fila; i++) {
            limpiar.removeRow(0);
        }
    }
     /**
      * This method is to clean the table of the transaction.
      */
      public void limpiarTransaccion() {
        limpiar = (DefaultTableModel) tableTransacciones.getModel();
        int fila = tableTransacciones.getRowCount();
        for (int i = 0; i < fila; i++) {
            limpiar.removeRow(0);
        }
    }
     /**
      * This method is to clean the table of the provider.
      */
      public void limpiarProveedores(){
        limpiar = (DefaultTableModel) tableProveedores.getModel();
        int fila = tableProveedores.getRowCount();
        for (int i = 0; i < fila; i++) {
            limpiar.removeRow(0);
        }
    }
      
      /**
       * This method is to clean the table of the accounts.
       */
          public void limpiarCuentas(){
        limpiar = (DefaultTableModel) tableCuentas.getModel();
        int fila = tableCuentas.getRowCount();
        for (int i = 0; i < fila; i++) {
            limpiar.removeRow(0);
        }
    }
          
          /**
           * This method is to clean the table of the client.
           */
              public void limpiarCliente(){
        limpiar = (DefaultTableModel) tableCliente.getModel();
        int fila = tableCliente.getRowCount();
        for (int i = 0; i < fila; i++) {
            limpiar.removeRow(0);
        }
    }
              
           /**
            * This method is to clean the table of the client.
            */
              public void limpiarCliente2(){
        limpiar = (DefaultTableModel) tableCliente2.getModel();
        int fila = tableCliente2.getRowCount();
        for (int i = 0; i < fila; i++) {
            limpiar.removeRow(0);
        }
    }
       
              /**
               * This method is to clean the table of the bank.
               */
      public void limpiarBanco(){
        limpiar = (DefaultTableModel) tableBanco.getModel();
        int fila = tableBanco.getRowCount();
        for (int i = 0; i < fila; i++) {
            limpiar.removeRow(0);
        }
    }
    
      /**
       * This method is to clean the table of the types of accounts.
       */
    public void limpiarTipoCuentas(){
        limpiar = (DefaultTableModel) tableTipoCuentas.getModel();
        int fila = tableTipoCuentas.getRowCount();
        for (int i = 0; i < fila; i++) {
            limpiar.removeRow(0);
        }
    }
    
    /**
     * This method is to clean the table of the coins.
     */
    public void limpiarTipoMonedas(){
        limpiar = (DefaultTableModel) tableTipoMoneda.getModel();
        int fila = tableTipoMoneda.getRowCount();
        for (int i = 0; i < fila; i++) {
            limpiar.removeRow(0);
        }
    }
    
    
       //LISTAR   
    
    /**
     * This method is to list the provider in the table.
     */
     public void listarProveedores(){
        ArrayList<Proveedores> ListarP = controladorProveedores.listarProveedores();
        modeloProveedor = (DefaultTableModel) tableProveedores.getModel();
          Object[] ob = new Object[2];
        for (int i = 0; i < ListarP.size(); i++) {
            ob[0] = ListarP.get(i).getIdProveedor();
            ob[1] = ListarP.get(i).getProveedor();
            modeloProveedor.addRow(ob);
        }
        
        tableProveedores.setModel(modeloProveedor);
    }
     
     /**
      * This method is to list the service in the table.
      */
     public void listarServicios(){
        ArrayList<Servicios> ListarS = controladorS.listarServicios();
        modeloServicio = (DefaultTableModel) tableServicios.getModel();
          Object[] ob = new Object[2];
        for (int i = 0; i < ListarS.size(); i++) {
            ob[0] = ListarS.get(i).getIdServicio();
            ob[1] = ListarS.get(i).getServicio();
            modeloServicio.addRow(ob);
        }
        
        tableServicios.setModel(modeloServicio);
    }
     
     /**
      * This method is to list the transaction in the table
      * @param fecha needs a date to add.
      */
      public void listarTransaccion(String fecha){
        ArrayList<Transaccion> ListarTransaccion = controladorTransaccion.listarTransaccion(fecha);
        modeloTransaccion = (DefaultTableModel) tableTransacciones.getModel();
          Object[] ob = new Object[5];
        for (int i = 0; i < ListarTransaccion.size(); i++) {
            ob[0] = ListarTransaccion.get(i).getId_transaccion();
            ob[1] = ListarTransaccion.get(i).getId_proveedor();
            ob[2] = ListarTransaccion.get(i).getId_servicio();
            ob[3] = ListarTransaccion.get(i).getCantidadTransferencia();
            ob[4] = ListarTransaccion.get(i).getCliente();
            modeloTransaccion.addRow(ob);
        }
        
        tableTransacciones.setModel(modeloTransaccion);
    }
      
      /**
       * This method is going to list the transactions that you want.
       * @param fechaTransaccion use a specific date to search.
       */
         public void buscarTransaccion(String fechaTransaccion){
        ArrayList<Transaccion> ListarTransaccion = controladorTransaccion.buscarTransaccion(fechaTransaccion);
        modeloTransaccion = (DefaultTableModel) tableVerTransacciones.getModel();
          Object[] ob = new Object[5];
        for (int i = 0; i < ListarTransaccion.size(); i++) {
            ob[0] = ListarTransaccion.get(i).getId_transaccion();
            ob[1] = ListarTransaccion.get(i).getId_proveedor();
            ob[2] = ListarTransaccion.get(i).getId_servicio();
            ob[3] = ListarTransaccion.get(i).getCantidadTransferencia();
            ob[4] = ListarTransaccion.get(i).getCliente();
            modeloTransaccion.addRow(ob);
        }
        
        tableVerTransacciones.setModel(modeloTransaccion);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnGuardarCuenta = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnActualizarCuenta = new javax.swing.JButton();
        txtNumeroCuenta = new javax.swing.JTextField();
        txtIdCuentaActualizar = new javax.swing.JTextField();
        txtIdTipoCuenta = new javax.swing.JTextField();
        txtIdMoneda = new javax.swing.JTextField();
        txtSaldoInicial = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        txtIdBanco = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableCuentas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCliente = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBanco = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableTipoMoneda = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableTipoCuentas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtApellidoCliente = new javax.swing.JTextField();
        lblUsuarioRegistro2 = new javax.swing.JLabel();
        lblUsuarioRegistro1 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        lblContraseñaRegistro1 = new javax.swing.JLabel();
        txtSexoCliente = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblContraseñaRegistro2 = new javax.swing.JLabel();
        txtNacionalidadCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtCompañiaCliente = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtIdentificador = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtNumIdentificador = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtClienteActualizar = new javax.swing.JTextField();
        btnActualizarCliente = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        tableCliente2 = new javax.swing.JTable();
        comboDepartamentos = new javax.swing.JComboBox<>();
        comboMunicipio = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableServicios = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableProveedores = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableTransacciones = new javax.swing.JTable();
        txtIdServicio = new javax.swing.JTextField();
        txtCantidadDinero = new javax.swing.JTextField();
        txtIdProveedor = new javax.swing.JTextField();
        btnRealizarTransaccion = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        btnVerTransacciones = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        tableVerTransacciones = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnCuenta = new javax.swing.JButton();
        btnDatos = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnServicio = new javax.swing.JButton();
        btnTransaccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(207, 242, 242));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 1070, 70));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("CUENTAS");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Numero de Cuenta:");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Id Cliente:");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("Id Banco:");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("Id Tipo de Cuenta:");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("Saldo Inicial:");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("Id Moneda:");

        btnGuardarCuenta.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnGuardarCuenta.setText("GUARDAR");
        btnGuardarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCuentaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText("Id de la cuenta a Actualizar:");

        btnActualizarCuenta.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnActualizarCuenta.setText("ACTUALIZAR");
        btnActualizarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCuentaActionPerformed(evt);
            }
        });

        txtIdBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdBancoActionPerformed(evt);
            }
        });

        tableCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Cuenta", "No. Cuenta", "Id Cliente", "Id Banco", "Tipo Cuenta", "Moneda", "Saldo"
            }
        ));
        jScrollPane5.setViewportView(tableCuentas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnGuardarCuenta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizarCuenta)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addComponent(txtIdCuentaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(jLabel5)))
                .addContainerGap(570, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIdMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIdTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(43, 43, 43)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIdBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtIdBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtIdTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtIdMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnGuardarCuenta)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtIdCuentaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnActualizarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(199, 199, 199)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cuenta", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Cliente", "Nombres", "Apellidos", "Sexo ", "Nacionalidad"
            }
        ));
        jScrollPane1.setViewportView(tableCliente);

        tableBanco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Telefono", "Direccion", "Pagina ", "Gmail"
            }
        ));
        jScrollPane2.setViewportView(tableBanco);

        tableTipoMoneda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Moneda"
            }
        ));
        jScrollPane3.setViewportView(tableTipoMoneda);

        tableTipoCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo Cuenta"
            }
        ));
        jScrollPane4.setViewportView(tableTipoCuentas);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("DATOS CLIENTES");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("TIPO DE CUENTA");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("DATOS BANCO");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("TIPO DE MONEDA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 402, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(244, 244, 244))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jLabel1)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("Datos", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtApellidoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoClienteActionPerformed(evt);
            }
        });

        lblUsuarioRegistro2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblUsuarioRegistro2.setText("Apellidos:");

        lblUsuarioRegistro1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblUsuarioRegistro1.setText("Nombres:");

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });

        lblContraseñaRegistro1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblContraseñaRegistro1.setText("Sexo:");

        jLabel20.setText("Masculino (M)");

        jLabel21.setText("Femenino (F)");

        lblContraseñaRegistro2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblContraseñaRegistro2.setText("Nacionalidad:");

        txtTelefonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoClienteActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel22.setText("Telefono:");

        jLabel23.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel23.setText("Compañia del Telefono:");

        txtCompañiaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompañiaClienteActionPerformed(evt);
            }
        });

        jLabel24.setText("( DPI, CUI, PASAPORTE )");

        jLabel25.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel25.setText("Tipo de Identificador");

        jLabel26.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel26.setText("Identificador:");

        jLabel27.setText("Ingresa el numero del identificador");

        jLabel28.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel28.setText("ID Departamento:");

        jLabel29.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel29.setText("ID Municipio:");

        jLabel30.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel30.setText("ID Usuario:");

        txtIdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdUsuarioActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel31.setText("Ingresa el ID de datos a actualizar: ");

        btnActualizarCliente.setBackground(new java.awt.Color(0, 0, 204));
        btnActualizarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarCliente.setText("ACTUALIZAR");
        btnActualizarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarClienteActionPerformed(evt);
            }
        });

        tableCliente2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Nombres", "Apellidos", "Sexo ", "Nacionalidad", "Identificador", "No Identifier", "Mun", "Dep", "User", "Telefono"
            }
        ));
        jScrollPane9.setViewportView(tableCliente2);

        comboDepartamentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir...", "Alta Verapaz", "Baja Verapaz", "Chimaltenango", "Chiquimula", "El Progreso", "Escuintla", "Guatemala", "Huehuetenango", "Izabal", "Jalapa", "Jutiapa", "Peten", "Quetzaltenango", "Quiche", "Retalhuleu", "Sacatepequez", "San Marcos", "Santa Rosa", "Solola,", "Suchitepequez", "Totonicapan", "Zacapa" }));
        comboDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDepartamentosActionPerformed(evt);
            }
        });

        comboMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir...", "Coban", "Santa Cruz Verapaz", "San Cristobal Verapaz", "Tactic", "Tamahu", "Tucuru", "Panzos", "Senahu", "San Pedro Carcha", "San Juan Chamelco", "Lanquin", "Cahabon", "Chisec", "Chahal", "Fray Bartolome De Las Casas", "Santa Catalina La Tinta", "Raxruha", "Salama", "San Miguel Chicaj", "Rabinal ", "Cubulco", "Granados", "El Chol", "San Jeronimo ", "Purulha", "Chimaltenango", "San Jose Poaquil", "San Martin Jilotepeque", "Comalapa", "Santa Apolonia", "Tecpan Guatemala", "Patzun", "Pochuta", "Patzicia", "Santa Cruz Balanya", "Acatenango", "Yepocapa", "San Andres Itzapa", "Parramos", "Zaragoza", "El Tejar", "Chiquimula", "San Jose La Arada", "San Juan Ermita", "Jocotan", "Camotan", "Olopa", "Esquipulas", "Concepcion Las Minas", "Quezaltepeque", "San Jacinto", "Ipala", "Guastatoya", "Morazan", "San Agustin Acasaguastlan", "San Cristobal Acasaguastlan", "El Jicaro", "Sansare", "Sanarate", "San Antonio La Paz", "Escuintla", "Santa Lucia Cotzumalguapa", "La Democracia", "Siquinala", "Masagua", "Tiquisate", "La Gomera", "Guanagazapa", "San Jose", "Iztapa", "Palin", "San Vicente Pacaya", "Nueva Concepcion", "Guatemala", "Santa Catarina Pinula", "San Jose Pinula", "San Jose Del Golfo", "Palencia", "Chinautla", "San Pedro Ayampuc", "Mixco", "San Pedro Sacatepequez", "San Juan Sacatepequez", "San Raymundo", "Chuarrancho", "Fraijanes", "Amatitlan", "Villa Nueva", "Villa Canales", "San Miguel Petapa", "Huehuetenango", "Chiantla", "Malacatancito", "Cuilco", "Nenton", "San Pedro Necta", "Jacaltenango", "Soloma", "San Idelfonso Ixtahuacan", "Santa Barbara", "La Libertad", "La Democracia", "San Miguel Acatan", "San Rafael La Independencia", "Todos Santos Cuchumatan", "San Juan Atitan", "Santa Eulalia", "San Mateo Ixtatan", "Colotenango", "San Sebastian Huehuetenango", "Tectitan", "Concepcion Huista", "San Juan Ixcoy", "San Antonio Huista", "San Sebastian Coatan", "Barillas", "Aguacatan", "San Rafael Petzal", "San Gaspar Ixchil", "Santiago Chimaltenango", "Santa Ana Huista", "Union Cantinil", "Puerto Barrios", "Livingston", "El Estor", "Morales", "Los Amates", "Jalapa", "San Pedro Pinula", "San Luis Jilotepeque", "San Manuel Chaparron", "San Carlos Alzatate", "Monjas", "Mataquescuintla", "Jutiapa", "El Progreso", "Santa Catarina Mita", "Agua Blanca", "Asuncion Mita", "Yupiltepeque", "Atescatempa", "Jerez", "El Adelanto", "Zapotitlan", "Comapa", "Jalpatagua", "Conguaco", "Moyuta", "Pasaco", "San Jose Acatempa", "Quesada", "Flores ", "San Jose", "San Benito", "San Andres", "La Libertad", "San Francisco", "Santa Ana", "Dolores", "San Luis", "Sayaxche", "Melchor De Mencos ", "Poptun", "Las Cruces", "Quetzaltenango", "Salcaja", "Olintepeque", "San Carlos Sija", "Sibilia", "Cabrican", "Cajola", "San Miguel Siguila", "San Juan Ostuncalco", "San Mateo", "Concepcion Chiquirichapa", "San Martin Sacatepequez", "Alomolonga", "Cantel", "Huitan ", "Zunil", "Colomba", "San Francisco La Union", "El Palmar", "Coatepeque", "Genova", "Flores Costa Cuca", "La Esperanza", "Palestina De Los Altos", "Santa Cruz Del Quiche", "Chiche", "Chinique", "Zacualpa", "Chajul", "Chichicastenango", "Patzite", "San Antonio Ilotenango", "San Pedro Jocopilas", "Cunen", "San Juan Cotzal", "Joyabaj", "Nebaj", "San Andres Sajcabaja", "Uspantan", "Sacapulas", "San Bartolome Jocotenango", "Canilla", "Chicaman", "Playa Grande Ixcan", "Pachalum", "Retalhuleu", "San Sebastian", "Santa Cruz Mulua", "San Martin Zapotitlan", "San Felipe Retalhuleu", "San Andres Villa Seca", "Champerico", "Nuevo San Carlos", "El Asintal", "Antigua Guatemala", "Jocotenango", "Pastores", "Sumpango", "Santo Domingo Xenacoj", "Santiago Sacatepequez", "San Bartolome Milpas Altas", "San Lucas Sacatepequez", "Santa Lucia Milpas Altas", "Magdalena Milpas Altas", "Santa Maria De Jesus", "Ciudad Vieja", "San Miguel Dueñas", "Alotenango", "San Antonio Aguas Calientes", "Santa Catarina Barahona", "San Marcos", "San Pedro Sacatepequez", "San Antonio Sacatepequez", "Comitancillo", "San Miguel Ixtahuacan", "Concepcion Tutuapa", "Tacana", "Sibinal", "Tajumulco", "Tejutla", "San Rafael Pie De La Cuesta", "Nuevo Progreso", "El Tumbador", "El Rodeo", "Malacatan", "Catarina", "Ayutla", "Ocos", "San Pablo", "El Quetzal", "La Reforma", "Pajapita", "Ixchiguan", "San Jose Ojetenam", "San Cristobal Cucho", "Sipacapa", "Esquipulas Palo Gordo", "Rio Blanco", "San Lorenzo", "Cuilapa", "Barberena", "Santa Rosa De Lima", "Casillas", "San Rafael Las Flores", "Oratorio", "San Juan Tecuaco", "Chiquimulilla", "Taxisco", "Santa Maria Ixhuatan", "Guazacapan", "Santa Cruz Naranjo", "Pueblo Nuevo Viñas", "Nueva Santa Rosa", "Solola", "San Jose Chacaya", "Santa Maria Visitacion", "Santa Lucia Utatlan", "Nahuala", "Santa Catarina Ixtahuacan", "Santa Clara La Laguna", "Concepcion", "San Andres Semetabaj", "Panajachel", "Santa Catarina Palopo", "San Antonio Palopo", "San Lucas Toliman", "Santa Cruz La Laguna", "San Pablo La Laguna", "San Marcos La Laguna", "San Juan La Laguna", "San Pedro La Laguna", "Santiago Atitlan", "Mazatenango", "Cuyotenango", "San Francisco Zapotitlan", "San Bernardino", "San Jose El Idolo", "Santo Domingo Suchitepequez", "San Lorenzo", "Samayac", "San Pablo Jocopilas", "San Antonio Suchitepequez", "San Miguel Panan", "San Gabriel", "Chicacao", "Patulul", "Santa Barbara", "San Juan Bautista", "Santo Tomas La Union", "Zunilito", "Pueblo Nuevo", "Rio Bravo", "Totonicapan", "San Cristobal Totonicapan", "San Francisco El Alto", "San Andres Xecul", "Momostenango", "Santa Maria Chiquimula", "Santa Lucia La Reforma", "San Bartolo Aguas Calientes", "Zacapa", "Estanzuela", "Rio Hondo", "Gualan", "Teculutan", "Usumatlan", "Cabañas", "San Diego", "La Union", "Huite", " " }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblUsuarioRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblContraseñaRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtSexoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 60, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lblContraseñaRegistro2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel23)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCompañiaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtNumIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUsuarioRegistro2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNacionalidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(143, 143, 143))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 411, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtClienteActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btnActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuarioRegistro2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuarioRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContraseñaRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSexoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblContraseñaRegistro2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNacionalidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCompañiaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClienteActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("Tu Información", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tableServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Servicio"
            }
        ));
        jScrollPane6.setViewportView(tableServicios);

        tableProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Proveedor"
            }
        ));
        jScrollPane7.setViewportView(tableProveedores);

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 0));
        jLabel13.setText("PROVEEDORES");

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 204, 0));
        jLabel15.setText("SERVICIOS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(271, 271, 271))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Proveedores y Servicios", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setText("TRANSACCIONES");

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel17.setText("ID PROVEEDOR:");

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel18.setText("ID SERVICIO:");

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel19.setText("CANTIDAD DE DINERO:");

        tableTransacciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Transaccion", "Id Proveedor", "Id Servicio", "Cantidad", "Cliente"
            }
        ));
        jScrollPane8.setViewportView(tableTransacciones);

        btnRealizarTransaccion.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRealizarTransaccion.setText("REALIZAR TRANSACCION");
        btnRealizarTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarTransaccionActionPerformed(evt);
            }
        });

        btnVerTransacciones.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnVerTransacciones.setText("VER TRANSACCIONES");
        btnVerTransacciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTransaccionesActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel32.setText("NOMBRE:");

        tableVerTransacciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Transaccion", "Id Proveedor", "Id Servicio", "Cantidad", "Cliente"
            }
        ));
        jScrollPane10.setViewportView(tableVerTransacciones);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCantidadDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtIdProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                                .addComponent(txtIdServicio))
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(btnRealizarTransaccion))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(btnVerTransacciones)))
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addGap(71, 71, 71))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtIdServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtCantidadDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addGap(23, 23, 23)
                        .addComponent(btnRealizarTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerTransacciones, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Transaccion", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 35, 1050, 680));

        jPanel6.setBackground(new java.awt.Color(207, 242, 242));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/francopaiz/recursos/Logo_G&T (2).png"))); // NOI18N

        btnCuenta.setBackground(new java.awt.Color(204, 255, 255));
        btnCuenta.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnCuenta.setText("CUENTA");
        btnCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentaActionPerformed(evt);
            }
        });

        btnDatos.setBackground(new java.awt.Color(204, 255, 153));
        btnDatos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnDatos.setText("DATOS");
        btnDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosActionPerformed(evt);
            }
        });

        btnInfo.setBackground(new java.awt.Color(204, 255, 255));
        btnInfo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnInfo.setText("INFORMACION");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        btnProveedor.setBackground(new java.awt.Color(204, 255, 153));
        btnProveedor.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnProveedor.setText("PROVEEDORES");
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });

        btnServicio.setBackground(new java.awt.Color(204, 255, 255));
        btnServicio.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnServicio.setText("SERVICIOS");
        btnServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicioActionPerformed(evt);
            }
        });

        btnTransaccion.setBackground(new java.awt.Color(204, 255, 153));
        btnTransaccion.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnTransaccion.setText("TRANSACCION");
        btnTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnProveedor)
                    .addComponent(btnTransaccion))
                .addGap(23, 23, 23))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInfo))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCuenta)
                    .addComponent(btnDatos)))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnServicio))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, -1, -1, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdBancoActionPerformed

    /**
     * Method of button account.
     * List the accounts and clean them.
     * @param evt 
     */
    private void btnCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaActionPerformed
        // TODO add your handling code here:
        limpiarCuentas();
        jTabbedPane1.setSelectedIndex(0);
        listarCuentas();
    }//GEN-LAST:event_btnCuentaActionPerformed

    //VentanaRegistroGeneral ventana = new VentanaRegistroGeneral();
    /**
     * Method of data button.
     * Clean the tables and list the important information.
     * @param evt 
     */
    private void btnDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosActionPerformed
        // TODO add your handling code here:
        
        limpiarCliente();
        limpiarBanco();
        limpiarTipoCuentas();
        limpiarTipoMonedas();
        jTabbedPane1.setSelectedIndex(1);
       //int id = ventana.getId_clienteEnviar();
        listarClientes();
        listarBanco();
        listarTipoCuentas();
        listarTipoMonedas();
    }//GEN-LAST:event_btnDatosActionPerformed
    
    
    
    private void btnGuardarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCuentaActionPerformed
        // TODO add your handling code here:
        
        limpiarCuentas();
         Cuenta tipo = new Cuenta();
        tipo.setNumero_cuenta(Integer.parseInt(txtNumeroCuenta.getText()));
        tipo.setId_cliente(Integer.parseInt(txtIdCliente.getText()));
        tipo.setId_banco(Integer.parseInt(txtIdBanco.getText()));
        tipo.setId_tipo_cuenta(Integer.parseInt(txtIdTipoCuenta.getText()));
        tipo.setId_tipo_moneda(Integer.parseInt(txtIdMoneda.getText()));
        tipo.setSaldo(Float.valueOf(txtSaldoInicial.getText()));
        ControladorCuenta controlador = new ControladorCuenta();
        controlador.agregarCuenta(tipo);
         listarCuentas();
         limpiarDatosCuenta();
    }//GEN-LAST:event_btnGuardarCuentaActionPerformed
   
    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
        limpiarServicios();
        limpiarProveedores();
        listarProveedores();
        listarServicios();
        
    }//GEN-LAST:event_btnProveedorActionPerformed

    
    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here
        limpiarCliente2();
        jTabbedPane1.setSelectedIndex(2);
        
        listarClientes2();
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicioActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
         limpiarServicios();
        limpiarProveedores();
        listarProveedores();
        listarServicios();
    }//GEN-LAST:event_btnServicioActionPerformed

    private void btnTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaccionActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
        limpiarTransaccion();
        listarTransaccion(fechaActual);
    }//GEN-LAST:event_btnTransaccionActionPerformed
    
    Date fecha = new Date();
    SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY-MM-dd");
    String fechaActual = formatoFecha.format(fecha);
    private void btnRealizarTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarTransaccionActionPerformed
        // TODO add your handling code here:
        limpiarTransaccion();
        Transaccion tipo = new Transaccion();
        tipo.setId_proveedor(Integer.parseInt(txtIdProveedor.getText()));
        tipo.setId_servicio(Integer.parseInt(txtIdServicio.getText()));
        tipo.setCantidadTransferencia(Float.valueOf(txtCantidadDinero.getText()));
        tipo.setCliente(txtNombre.getText());
        tipo.setFecha(fechaActual);
        ControladorTransaccion controlador = new ControladorTransaccion();
        controlador.agregarTransaccion(tipo);
         listarTipoCuentas();
         
         
         listarTransaccion(fechaActual);
    }//GEN-LAST:event_btnRealizarTransaccionActionPerformed

   
    /* limpiarTransaccion();
        Transaccion tipo = new Transaccion();
        tipo.setId_transaccion(Integer.parseInt(txtIdEliminarTransaccion.getText()));
        ControladorTransaccion controlador = new ControladorTransaccion();
        controlador.eliminarTransaccion(tipo);
         listarTipoCuentas();
         listarTransaccion();*/
    private void btnActualizarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCuentaActionPerformed
        // TODO add your handling code here:
        
        
        limpiarCuentas();
         Cuenta tipo = new Cuenta();
         tipo.setId_cuenta(Integer.parseInt(txtIdCuentaActualizar.getText()));
        tipo.setNumero_cuenta(Integer.parseInt(txtNumeroCuenta.getText()));
        tipo.setId_cliente(Integer.parseInt(txtIdCliente.getText()));
        tipo.setId_banco(Integer.parseInt(txtIdBanco.getText()));
        tipo.setId_tipo_cuenta(Integer.parseInt(txtIdTipoCuenta.getText()));
        tipo.setId_tipo_moneda(Integer.parseInt(txtIdMoneda.getText()));
        tipo.setSaldo(Float.valueOf(txtSaldoInicial.getText()));
        ControladorCuenta controlador = new ControladorCuenta();
        controlador.actualizarCuenta(tipo);
 
        listarCuentas();
        limpiarDatosCuenta();
    }//GEN-LAST:event_btnActualizarCuentaActionPerformed

    private void txtApellidoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoClienteActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void txtTelefonoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoClienteActionPerformed

    private void txtCompañiaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompañiaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompañiaClienteActionPerformed

    private void btnActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarClienteActionPerformed
        // TODO add your handling code here:
        
        int municipio = comboMunicipio.getSelectedIndex();
        int departamento = comboDepartamentos.getSelectedIndex();
        
        Cliente client = new Cliente();
        client.setId_cliente(Integer.parseInt(txtClienteActualizar.getText()));
        client.setNombres_cliente(txtNombreCliente.getText());
        client.setApellidos_cliente(txtApellidoCliente.getText());
        client.setSexo(txtSexoCliente.getText());
        client.setNacionalidad(txtNacionalidadCliente.getText());
        client.setIdentificador(txtIdentificador.getText());
        client.setNumero_identificador(txtNumIdentificador.getText());
        client.setId_municipio(municipio);
        client.setId_departamento(departamento);
        client.setId_usuario(Integer.parseInt(txtIdUsuario.getText()));
        client.setTelefono_cliente(txtTelefonoCliente.getText());
        client.setCompañia_cliente(txtCompañiaCliente.getText());
        ControladorCliente controlador = new ControladorCliente();
        controlador.actualizarCliente(client);
       
        limpiarClienteDatos();

    }//GEN-LAST:event_btnActualizarClienteActionPerformed

    private void comboDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDepartamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDepartamentosActionPerformed

    private void txtIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdUsuarioActionPerformed

    private void btnVerTransaccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTransaccionesActionPerformed
        // TODO add your handling code here:
        String fechaTransaccion = new SimpleDateFormat("YYYY-MM-dd").format(jCalendar1.getDate());
        buscarTransaccion(fechaTransaccion);
        
    }//GEN-LAST:event_btnVerTransaccionesActionPerformed
    
    /**
     * This method is to list the accounts.
     */
    public void listarCuentas(){
        ArrayList<Cuenta> ListarCuentas = controladorCuenta.listarCuenta();
        modeloCuenta = (DefaultTableModel) tableCuentas.getModel();
        Object[] ob = new Object[7];
        for (int i = 0; i < ListarCuentas.size(); i++) {
            ob[0] = ListarCuentas.get(i).getId_cuenta();
            ob[1] = ListarCuentas.get(i).getNumero_cuenta();
            ob[2] = ListarCuentas.get(i).getId_cliente();
            ob[3] = ListarCuentas.get(i).getId_banco();
            ob[4] = ListarCuentas.get(i).getId_tipo_cuenta();
            ob[5] = ListarCuentas.get(i).getId_tipo_moneda();
            ob[6] = ListarCuentas.get(i).getSaldo();
          
            modeloCuenta.addRow(ob);
        }
        
        tableCuentas.setModel(modeloCuenta);
    }
     /**
      * This method is to list the clients.
      */
     public void listarClientes(){
        ArrayList<Cliente> ListarC = controladorCliente.listarClientes2();
        modeloCliente = (DefaultTableModel) tableCliente.getModel();
        Object[] ob = new Object[5];
        for (int i = 0; i < ListarC.size(); i++) {
            ob[0] = ListarC.get(i).getId_cliente();
            ob[1] = ListarC.get(i).getNombres_cliente();
            ob[2] = ListarC.get(i).getApellidos_cliente();
            ob[3] = ListarC.get(i).getSexo();
            ob[4] = ListarC.get(i).getNacionalidad();
            modeloCliente.addRow(ob);
        }
        
        tableCliente.setModel(modeloCliente);
    }
     
     /**
      * This method is to list clients in the second table.
      */
      public void listarClientes2(){
        ArrayList<Cliente> ListarC = controladorCliente.listarClientes();
        modeloCliente = (DefaultTableModel) tableCliente2.getModel();
        Object[] ob = new Object[12];
        for (int i = 0; i < ListarC.size(); i++) {
            ob[0] = ListarC.get(i).getId_cliente();
            ob[1] = ListarC.get(i).getNombres_cliente();
            ob[2] = ListarC.get(i).getApellidos_cliente();
            ob[3] = ListarC.get(i).getSexo();
            ob[4] = ListarC.get(i).getNacionalidad();
            ob[5] = ListarC.get(i).getIdentificador();
            ob[6] = ListarC.get(i).getNumero_identificador();
            ob[7] = ListarC.get(i).getId_municipio();
            ob[8] = ListarC.get(i).getId_departamento();
            ob[9] = ListarC.get(i).getId_usuario();
            ob[10] = ListarC.get(i).getTelefono_cliente();
            ob[11] = ListarC.get(i).getCompañia_cliente();
            modeloCliente.addRow(ob);
        }
        
        tableCliente2.setModel(modeloCliente);
    }
     
      /**
       * This method is to list the banks that we have.
       */
      public void listarBanco(){
               ArrayList<Banco> ListarB = controladorB.listarBanco();
        modeloBanco = (DefaultTableModel) tableBanco.getModel();
          Object[] ob = new Object[6];
        for (int i = 0; i < ListarB.size(); i++) {
            ob[0] = ListarB.get(i).getId_banco();
            ob[1] = ListarB.get(i).getNombreBanco();
            ob[2] = ListarB.get(i).getTelefonoBanco();
            ob[3] = ListarB.get(i).getDireccionBanco();
            ob[4] = ListarB.get(i).getPaginaBanco();
            ob[5] = ListarB.get(i).getGmailBanco();
            modeloBanco.addRow(ob);
        }
        
        tableBanco.setModel(modeloBanco);  
     }
      /**
       * This method is to list the tyoes of accounts
       */
     public void listarTipoCuentas(){
        ArrayList<TipoCuentas> ListarTP = controlador.listarTipoCuenta();
        modelo = (DefaultTableModel) tableTipoCuentas.getModel();
        Object[] ob = new Object[2];
        for (int i = 0; i < ListarTP.size(); i++) {
            ob[0] = ListarTP.get(i).getId_tipo_cuenta();
            ob[1] = ListarTP.get(i).getTipo_cuenta();
            modelo.addRow(ob);
        }
        
        tableTipoCuentas.setModel(modelo);
    }
    
     /**
      * This method is to list the coins in the table.
      */
      public void listarTipoMonedas(){
        ArrayList<TipoMonedas> ListarTM = controladorM.listarTipoMoneda();
        modeloMoneda = (DefaultTableModel) tableTipoMoneda.getModel();
        Object[] ob = new Object[2];
        for (int i = 0; i < ListarTM.size(); i++) {
            ob[0] = ListarTM.get(i).getId_tipo_moneda();
            ob[1] = ListarTM.get(i).getMoneda();
            modeloMoneda.addRow(ob);
        }
        
        tableTipoMoneda.setModel(modeloMoneda);
    }
      
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCliente;
    private javax.swing.JButton btnActualizarCuenta;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnDatos;
    private javax.swing.JButton btnGuardarCuenta;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnRealizarTransaccion;
    private javax.swing.JButton btnServicio;
    private javax.swing.JButton btnTransaccion;
    private javax.swing.JButton btnVerTransacciones;
    private javax.swing.JComboBox<String> comboDepartamentos;
    private javax.swing.JComboBox<String> comboMunicipio;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblContraseñaRegistro1;
    private javax.swing.JLabel lblContraseñaRegistro2;
    private javax.swing.JLabel lblUsuarioRegistro1;
    private javax.swing.JLabel lblUsuarioRegistro2;
    private javax.swing.JTable tableBanco;
    private javax.swing.JTable tableCliente;
    private javax.swing.JTable tableCliente2;
    private javax.swing.JTable tableCuentas;
    private javax.swing.JTable tableProveedores;
    private javax.swing.JTable tableServicios;
    private javax.swing.JTable tableTipoCuentas;
    private javax.swing.JTable tableTipoMoneda;
    private javax.swing.JTable tableTransacciones;
    private javax.swing.JTable tableVerTransacciones;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txtCantidadDinero;
    private javax.swing.JTextField txtClienteActualizar;
    private javax.swing.JTextField txtCompañiaCliente;
    private javax.swing.JTextField txtIdBanco;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdCuentaActualizar;
    private javax.swing.JTextField txtIdMoneda;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtIdServicio;
    private javax.swing.JTextField txtIdTipoCuenta;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtIdentificador;
    private javax.swing.JTextField txtNacionalidadCliente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNumIdentificador;
    private javax.swing.JTextField txtNumeroCuenta;
    private javax.swing.JTextField txtSaldoInicial;
    private javax.swing.JTextField txtSexoCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
