/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.francopaiz.vista;

/**
 * This is the window class for the register. Here you can insert your main
 * details of you and your user.
 *
 * @author fpaiz
 */
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.francopaiz.controlador.ControladorCliente;
import org.francopaiz.modelo.Registro;
import org.francopaiz.controlador.ControladorRegistro;
import org.francopaiz.modelo.Cliente;
import org.francopaiz.modelo.Usuario;
import org.francopaiz.vista.VentanaLogin;

public class VentanaRegistroGeneral extends javax.swing.JFrame {

    /**
     * Creates new form VentanaRegistroGeneral
     */
    public VentanaRegistroGeneral() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    

    DefaultTableModel modeloDep;
    ControladorRegistro controlador = new ControladorRegistro();

    DefaultTableModel modeloMun;
    DefaultTableModel modeloUser;
    DefaultTableModel limpiarDepa;
    DefaultTableModel limpiarMuni;
    DefaultTableModel limpiarUser;

    Registro registro = new Registro();

    /**
     * This method is to clean the table of departments.
     */
    public void limpiarTablaDep() {
        limpiarDepa = (DefaultTableModel) tableDepartamento.getModel();
        int fila = tableDepartamento.getRowCount();
        for (int i = 0; i < fila; i++) {
            limpiarDepa.removeRow(0);
        }
    }

    /**
     * * This method is to clean the table of municipalities.
     */
    public void limpiarTablaMun() {
        limpiarMuni = (DefaultTableModel) tableMunicipio.getModel();
        int fila = tableMunicipio.getRowCount();
        for (int i = 0; i < fila; i++) {
            limpiarMuni.removeRow(0);
        }
    }

    /**
     * This method is to clean the table of users.
     */
    public void limpiarTablaUser() {
        limpiarUser = (DefaultTableModel) tableUsuario.getModel();
        int fila = tableUsuario.getRowCount();
        for (int i = 0; i < fila; i++) {
            limpiarUser.removeRow(0);
        }
    }

    /**
     * This method is to clean the txtfields of the register.
     */
    public void limpiarRegistroUsuario() {
        txtUsuarioRegistro.setText("");
        txtContraseñaRegistro.setText("");
    }

    /**
     * This method is to clean the txtfields of the client.
     */
    public void limpiarClienteDatos() {
        txtNombreCliente.setText("");
        txtApellidoCliente.setText("");
        txtSexoCliente.setText("");
        txtNacionalidadCliente.setText("");
        txtTelefonoCliente.setText("");
        txtCompañiaCliente.setText("");
        txtIdentificador.setText("");
        txtIdentificador.setText("");
        txtIdUsuario.setText("");

    }

    /**
     * This method is to list the table of departments.
     */
    public void listarDepartamentos() {
        ArrayList<Registro> ListarTD = controlador.listarDepartamentos();
        modeloDep = (DefaultTableModel) tableDepartamento.getModel();
        Object[] ob = new Object[2];
        for (int i = 0; i < ListarTD.size(); i++) {
            ob[0] = ListarTD.get(i).getId_Departamento();
            ob[1] = ListarTD.get(i).getDepartamento();
            modeloDep.addRow(ob);
        }

        tableDepartamento.setModel(modeloDep);
    }

    /**
     * This method is to list the table of municipalities.
     */
    public void listarMunicipios() {
        ArrayList<Registro> ListarTM = controlador.listarMunicipios();
        modeloMun = (DefaultTableModel) tableMunicipio.getModel();
        Object[] ob = new Object[2];
        for (int i = 0; i < ListarTM.size(); i++) {
            ob[0] = ListarTM.get(i).getId_Municipio();
            ob[1] = ListarTM.get(i).getMunicipio();
            modeloMun.addRow(ob);
        }

        tableMunicipio.setModel(modeloMun);
    }

    /* public void listarUsuarios(){
        ArrayList<Registro> ListarTU = controlador.listarUsuarios();
        modeloUser = (DefaultTableModel) tableUsuario.getModel();
        Object[] ob = new Object[2];
        for (int i = 0; i < ListarTU.size(); i++) {
            ob[0] = ListarTU.get(i).getId_usuario();
            ob[1] = ListarTU.get(i).getUsuario();
            modeloUser.addRow(ob);
        }
        
        tableUsuario.setModel(modeloUser);
    }*/
    /**
     * This method is to list the table of departments.
     *
     * @param user needs the information of the user
     */
    public void listarUsuarios(String user) {
        ArrayList<Registro> ListarTU = controlador.listarUsuarios(user);
        modeloUser = (DefaultTableModel) tableUsuario.getModel();
        Object[] ob = new Object[3];
        for (int i = 0; i < ListarTU.size(); i++) {
            ob[0] = ListarTU.get(i).getId_usuario();
            ob[1] = ListarTU.get(i).getUsuario();
            ob[2] = ListarTU.get(i).getContraseña();
            modeloUser.addRow(ob);
        }

        tableUsuario.setModel(modeloUser);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblUsuarioRegistro = new javax.swing.JLabel();
        txtUsuarioRegistro = new javax.swing.JTextField();
        lblContraseñaRegistro = new javax.swing.JLabel();
        txtContraseñaRegistro = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnGuardarRegistro = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDepartamento = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMunicipio = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableUsuario = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUsuarioBuscar = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblUsuarioRegistro1 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        lblUsuarioRegistro2 = new javax.swing.JLabel();
        txtApellidoCliente = new javax.swing.JTextField();
        lblContraseñaRegistro1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblContraseñaRegistro2 = new javax.swing.JLabel();
        txtNacionalidadCliente = new javax.swing.JTextField();
        txtIdentificador = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNumIdentificador = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        txtSexoCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCompañiaCliente = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        comboDepartamentos = new javax.swing.JComboBox<>();
        comboMunicipio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setText("Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton2.setText("Ver Datos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton3.setText("Cliente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(575, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 80));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/francopaiz/recursos/Logo_G&T (2).png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO");

        lblUsuarioRegistro.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblUsuarioRegistro.setText("Usuario");

        txtUsuarioRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioRegistroActionPerformed(evt);
            }
        });

        lblContraseñaRegistro.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblContraseñaRegistro.setText("Contraseña");

        txtContraseñaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaRegistroActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/francopaiz/recursos/BANCOREGISTRO 1.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        btnGuardarRegistro.setBackground(new java.awt.Color(0, 0, 204));
        btnGuardarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarRegistro.setText("GUARDAR");
        btnGuardarRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRegistroActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Si ya tienes cuenta, puedes iniciar sesión desde aquí:");

        btnIniciarSesion.setBackground(new java.awt.Color(0, 0, 204));
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("INICIAR SESIÓN");
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel18)
                                .addGap(30, 30, 30)
                                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(49, 49, 49)
                                    .addComponent(lblContraseñaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtContraseñaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel3)
                                    .addGap(45, 45, 45)
                                    .addComponent(jLabel1))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addComponent(lblUsuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtUsuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContraseñaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContraseñaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addComponent(btnGuardarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(61, 61, 61))
        );

        jTabbedPane2.addTab("Usuario", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tableDepartamento.setBackground(new java.awt.Color(204, 255, 255));
        tableDepartamento.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tableDepartamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Departamento", "Departamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableDepartamento);

        tableMunicipio.setBackground(new java.awt.Color(204, 204, 255));
        tableMunicipio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Municipio", "Municipio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableMunicipio);

        tableUsuario.setBackground(new java.awt.Color(204, 255, 204));
        tableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuario", "Contraseña"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableUsuario);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Departamento");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Usuario");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Municipio");

        txtUsuarioBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioBuscarActionPerformed(evt);
            }
        });
        txtUsuarioBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioBuscarKeyPressed(evt);
            }
        });

        jLabel21.setText("Ingresa tu usuario:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel4)
                        .addGap(185, 185, 185)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addComponent(txtUsuarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ver Datos", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/francopaiz/recursos/Logo_G&T (2).png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("DATOS CLIENTE");

        lblUsuarioRegistro1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblUsuarioRegistro1.setText("Nombres:");

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });

        lblUsuarioRegistro2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblUsuarioRegistro2.setText("Apellidos:");

        txtApellidoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoClienteActionPerformed(evt);
            }
        });

        lblContraseñaRegistro1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblContraseñaRegistro1.setText("Sexo:");

        jLabel11.setText("( DPI, CUI, PASAPORTE )");

        jLabel12.setText("Femenino (F)");

        lblContraseñaRegistro2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblContraseñaRegistro2.setText("Nacionalidad:");

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setText("Tipo de Identificador");

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setText("Identificador:");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Telefono:");

        btnRegistrar.setBackground(new java.awt.Color(0, 0, 204));
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRARSE");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("ID Departamento:");

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setText("ID Municipio:");

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel17.setText("ID Usuario:");

        txtIdUsuario.setEditable(false);
        txtIdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdUsuarioActionPerformed(evt);
            }
        });

        txtTelefonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoClienteActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setText("Compañia del Telefono:");

        txtCompañiaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompañiaClienteActionPerformed(evt);
            }
        });

        jLabel19.setText("Masculino (M)");

        jLabel20.setText("Ingresa el numero del identificador");

        comboDepartamentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir...", "Alta Verapaz", "Baja Verapaz", "Chimaltenango", "Chiquimula", "El Progreso", "Escuintla", "Guatemala", "Huehuetenango", "Izabal", "Jalapa", "Jutiapa", "Peten", "Quetzaltenango", "Quiche", "Retalhuleu", "Sacatepequez", "San Marcos", "Santa Rosa", "Solola,", "Suchitepequez", "Totonicapan", "Zacapa" }));
        comboDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDepartamentosActionPerformed(evt);
            }
        });

        comboMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir...", "Coban", "Santa Cruz Verapaz", "San Cristobal Verapaz", "Tactic", "Tamahu", "Tucuru", "Panzos", "Senahu", "San Pedro Carcha", "San Juan Chamelco", "Lanquin", "Cahabon", "Chisec", "Chahal", "Fray Bartolome De Las Casas", "Santa Catalina La Tinta", "Raxruha", "Salama", "San Miguel Chicaj", "Rabinal ", "Cubulco", "Granados", "El Chol", "San Jeronimo ", "Purulha", "Chimaltenango", "San Jose Poaquil", "San Martin Jilotepeque", "Comalapa", "Santa Apolonia", "Tecpan Guatemala", "Patzun", "Pochuta", "Patzicia", "Santa Cruz Balanya", "Acatenango", "Yepocapa", "San Andres Itzapa", "Parramos", "Zaragoza", "El Tejar", "Chiquimula", "San Jose La Arada", "San Juan Ermita", "Jocotan", "Camotan", "Olopa", "Esquipulas", "Concepcion Las Minas", "Quezaltepeque", "San Jacinto", "Ipala", "Guastatoya", "Morazan", "San Agustin Acasaguastlan", "San Cristobal Acasaguastlan", "El Jicaro", "Sansare", "Sanarate", "San Antonio La Paz", "Escuintla", "Santa Lucia Cotzumalguapa", "La Democracia", "Siquinala", "Masagua", "Tiquisate", "La Gomera", "Guanagazapa", "San Jose", "Iztapa", "Palin", "San Vicente Pacaya", "Nueva Concepcion", "Guatemala", "Santa Catarina Pinula", "San Jose Pinula", "San Jose Del Golfo", "Palencia", "Chinautla", "San Pedro Ayampuc", "Mixco", "San Pedro Sacatepequez", "San Juan Sacatepequez", "San Raymundo", "Chuarrancho", "Fraijanes", "Amatitlan", "Villa Nueva", "Villa Canales", "San Miguel Petapa", "Huehuetenango", "Chiantla", "Malacatancito", "Cuilco", "Nenton", "San Pedro Necta", "Jacaltenango", "Soloma", "San Idelfonso Ixtahuacan", "Santa Barbara", "La Libertad", "La Democracia", "San Miguel Acatan", "San Rafael La Independencia", "Todos Santos Cuchumatan", "San Juan Atitan", "Santa Eulalia", "San Mateo Ixtatan", "Colotenango", "San Sebastian Huehuetenango", "Tectitan", "Concepcion Huista", "San Juan Ixcoy", "San Antonio Huista", "San Sebastian Coatan", "Barillas", "Aguacatan", "San Rafael Petzal", "San Gaspar Ixchil", "Santiago Chimaltenango", "Santa Ana Huista", "Union Cantinil", "Puerto Barrios", "Livingston", "El Estor", "Morales", "Los Amates", "Jalapa", "San Pedro Pinula", "San Luis Jilotepeque", "San Manuel Chaparron", "San Carlos Alzatate", "Monjas", "Mataquescuintla", "Jutiapa", "El Progreso", "Santa Catarina Mita", "Agua Blanca", "Asuncion Mita", "Yupiltepeque", "Atescatempa", "Jerez", "El Adelanto", "Zapotitlan", "Comapa", "Jalpatagua", "Conguaco", "Moyuta", "Pasaco", "San Jose Acatempa", "Quesada", "Flores ", "San Jose", "San Benito", "San Andres", "La Libertad", "San Francisco", "Santa Ana", "Dolores", "San Luis", "Sayaxche", "Melchor De Mencos ", "Poptun", "Las Cruces", "Quetzaltenango", "Salcaja", "Olintepeque", "San Carlos Sija", "Sibilia", "Cabrican", "Cajola", "San Miguel Siguila", "San Juan Ostuncalco", "San Mateo", "Concepcion Chiquirichapa", "San Martin Sacatepequez", "Alomolonga", "Cantel", "Huitan ", "Zunil", "Colomba", "San Francisco La Union", "El Palmar", "Coatepeque", "Genova", "Flores Costa Cuca", "La Esperanza", "Palestina De Los Altos", "Santa Cruz Del Quiche", "Chiche", "Chinique", "Zacualpa", "Chajul", "Chichicastenango", "Patzite", "San Antonio Ilotenango", "San Pedro Jocopilas", "Cunen", "San Juan Cotzal", "Joyabaj", "Nebaj", "San Andres Sajcabaja", "Uspantan", "Sacapulas", "San Bartolome Jocotenango", "Canilla", "Chicaman", "Playa Grande Ixcan", "Pachalum", "Retalhuleu", "San Sebastian", "Santa Cruz Mulua", "San Martin Zapotitlan", "San Felipe Retalhuleu", "San Andres Villa Seca", "Champerico", "Nuevo San Carlos", "El Asintal", "Antigua Guatemala", "Jocotenango", "Pastores", "Sumpango", "Santo Domingo Xenacoj", "Santiago Sacatepequez", "San Bartolome Milpas Altas", "San Lucas Sacatepequez", "Santa Lucia Milpas Altas", "Magdalena Milpas Altas", "Santa Maria De Jesus", "Ciudad Vieja", "San Miguel Dueñas", "Alotenango", "San Antonio Aguas Calientes", "Santa Catarina Barahona", "San Marcos", "San Pedro Sacatepequez", "San Antonio Sacatepequez", "Comitancillo", "San Miguel Ixtahuacan", "Concepcion Tutuapa", "Tacana", "Sibinal", "Tajumulco", "Tejutla", "San Rafael Pie De La Cuesta", "Nuevo Progreso", "El Tumbador", "El Rodeo", "Malacatan", "Catarina", "Ayutla", "Ocos", "San Pablo", "El Quetzal", "La Reforma", "Pajapita", "Ixchiguan", "San Jose Ojetenam", "San Cristobal Cucho", "Sipacapa", "Esquipulas Palo Gordo", "Rio Blanco", "San Lorenzo", "Cuilapa", "Barberena", "Santa Rosa De Lima", "Casillas", "San Rafael Las Flores", "Oratorio", "San Juan Tecuaco", "Chiquimulilla", "Taxisco", "Santa Maria Ixhuatan", "Guazacapan", "Santa Cruz Naranjo", "Pueblo Nuevo Viñas", "Nueva Santa Rosa", "Solola", "San Jose Chacaya", "Santa Maria Visitacion", "Santa Lucia Utatlan", "Nahuala", "Santa Catarina Ixtahuacan", "Santa Clara La Laguna", "Concepcion", "San Andres Semetabaj", "Panajachel", "Santa Catarina Palopo", "San Antonio Palopo", "San Lucas Toliman", "Santa Cruz La Laguna", "San Pablo La Laguna", "San Marcos La Laguna", "San Juan La Laguna", "San Pedro La Laguna", "Santiago Atitlan", "Mazatenango", "Cuyotenango", "San Francisco Zapotitlan", "San Bernardino", "San Jose El Idolo", "Santo Domingo Suchitepequez", "San Lorenzo", "Samayac", "San Pablo Jocopilas", "San Antonio Suchitepequez", "San Miguel Panan", "San Gabriel", "Chicacao", "Patulul", "Santa Barbara", "San Juan Bautista", "Santo Tomas La Union", "Zunilito", "Pueblo Nuevo", "Rio Bravo", "Totonicapan", "San Cristobal Totonicapan", "San Francisco El Alto", "San Andres Xecul", "Momostenango", "Santa Maria Chiquimula", "Santa Lucia La Reforma", "San Bartolo Aguas Calientes", "Zacapa", "Estanzuela", "Rio Hondo", "Gualan", "Teculutan", "Usumatlan", "Cabañas", "San Diego", "La Union", "Huite", " " }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap(28, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(lblUsuarioRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(lblContraseñaRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtSexoCliente)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel19)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(52, 52, 52)))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(lblUsuarioRegistro2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(lblContraseñaRegistro2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNacionalidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(txtCompañiaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(242, 242, 242)
                                        .addComponent(jLabel20))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtNumIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)
                                .addGap(130, 130, 130)
                                .addComponent(jLabel10))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(378, 378, 378)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel10)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuarioRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsuarioRegistro2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContraseñaRegistro2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNacionalidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSexoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblContraseñaRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCompañiaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addGap(12, 12, 12)
                                .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jTabbedPane2.addTab("Cliente", jPanel6);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, -1, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioRegistroActionPerformed

    private void txtContraseñaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaRegistroActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void txtApellidoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoClienteActionPerformed

    private void btnGuardarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegistroActionPerformed
        // TODO add your handling code here:
        Registro registro = new Registro();
        registro.setUsuario(txtUsuarioRegistro.getText());
        registro.setContraseña(String.valueOf(txtContraseñaRegistro.getPassword()));
        String user = txtUsuarioRegistro.getText();
        listarUsuarios(user);
        ControladorRegistro controlador = new ControladorRegistro();
        controlador.agregarRegistro(registro);

        //limpiarRegistroUsuario();

    }//GEN-LAST:event_btnGuardarRegistroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        limpiarTablaDep();
        limpiarTablaMun();
        //limpiarTablaUser();
        jTabbedPane2.setSelectedIndex(1);
        listarDepartamentos();
        listarMunicipios();
        String user = txtUsuarioRegistro.getText();
        listarUsuarios(user);
        //ControladorRegistro controlador = new ControladorRegistro();
        //controlador.listarUsuarios();
        /*Registro registro = new Registro();
        registro.setUsuario(txtUsuarioRegistro.getText());
        registro.setContraseña(String.valueOf(txtContraseñaRegistro.getPassword()));
        ControladorRegistro controlador = new ControladorRegistro();
        controlador.listarUsuarios(registro);*/

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(2);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        int municipio = comboMunicipio.getSelectedIndex();
        int departamento = comboDepartamentos.getSelectedIndex();

        Cliente client = new Cliente();
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
        controlador.agregarCliente(client);
        limpiarClienteDatos();

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtTelefonoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoClienteActionPerformed

    private void txtCompañiaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompañiaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompañiaClienteActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        // TODO add your handling code here:
        VentanaLogin log = new VentanaLogin();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void comboDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDepartamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDepartamentosActionPerformed

    private void txtIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdUsuarioActionPerformed
    //MODELO
   /* VentanaRegistroGeneral ventana = new VentanaRegistroGeneral();
    private String  userEnviar;
    private int id_clienteEnviar;
    public String getUserEnviar() {
        return userEnviar;
    }

    public int getId_clienteEnviar() {
        return id_clienteEnviar;
    }

    public void setId_clienteEnviar(int id_clienteEnviar) {
        this.id_clienteEnviar = id_clienteEnviar;
    }

  

    public void setUserEnviar(String userEnviar) {
        this.userEnviar = userEnviar;
    }*/
    private void txtUsuarioBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioBuscarKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtUsuarioBuscar.getText())) {
                String user = txtUsuarioBuscar.getText();
                //Usuario usuario = new Usuario(Integer.parseInt(txtUsuarioBuscar.getText()));
                listarUsuarios(user);

            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un usuario existente.");
            }

        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtUsuarioBuscar.getText())) {
                String user = txtUsuarioBuscar.getText();
                ControladorRegistro reg = new ControladorRegistro();
                 registro = reg.buscarUsuariosID(user);
               txtIdUsuario.setText("" + registro.getId_usuario());
                //int id = registro.getId_usuario();
               // ventana.setId_clienteEnviar(id);
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un usuario existente.");

            }
        }


    }//GEN-LAST:event_txtUsuarioBuscarKeyPressed

    private void txtUsuarioBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaRegistroGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistroGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarRegistro;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> comboDepartamentos;
    private javax.swing.JComboBox<String> comboMunicipio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblContraseñaRegistro;
    private javax.swing.JLabel lblContraseñaRegistro1;
    private javax.swing.JLabel lblContraseñaRegistro2;
    private javax.swing.JLabel lblUsuarioRegistro;
    private javax.swing.JLabel lblUsuarioRegistro1;
    private javax.swing.JLabel lblUsuarioRegistro2;
    private javax.swing.JTable tableDepartamento;
    private javax.swing.JTable tableMunicipio;
    private javax.swing.JTable tableUsuario;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txtCompañiaCliente;
    private javax.swing.JPasswordField txtContraseñaRegistro;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtIdentificador;
    private javax.swing.JTextField txtNacionalidadCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNumIdentificador;
    private javax.swing.JTextField txtSexoCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtUsuarioBuscar;
    private javax.swing.JTextField txtUsuarioRegistro;
    // End of variables declaration//GEN-END:variables
}
