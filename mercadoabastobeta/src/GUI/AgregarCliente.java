/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;
import mercadoabasto.clientes.Cliente;
import mercadoabasto.clientes.Cuil;
import mercadoabasto.clientes.Cuit;
import mercadoabasto.clientes.Empresa;
import mercadoabasto.clientes.NumeroTelefono;
import mercadoabasto.clientes.Quintero;
import mercadoabasto.mercado.Mercado;
import mercadoabasto.exepciones.*;
import ModeloTablaCliente.ModelTableCliente;
/**
 *
 * @author Daniel Juarez
 */
public class AgregarCliente extends javax.swing.JInternalFrame {

    private Mercado mercado;
    private ModelTableCliente tablaClientes;
    
    public AgregarCliente(Mercado mercado, ModelTableCliente tablaClientes) {
        initComponents();
        this.mercado = mercado;
        PanelContenedor.setVisible(false);
        this.tablaClientes = tablaClientes;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PanelContenedor = new javax.swing.JPanel();
        PanelQuintero = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNombreQuintero = new javax.swing.JTextField();
        txtDireccionQuintero = new javax.swing.JTextField();
        txtCuil = new javax.swing.JTextField();
        txtNumeroTelefonoQuintero = new javax.swing.JTextField();
        txtCorreoQuintero = new javax.swing.JTextField();
        PanelEmpresa = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreEmpresa = new javax.swing.JTextField();
        txtDireccionEmpresa = new javax.swing.JTextField();
        txtCuit = new javax.swing.JTextField();
        txtNumeroTelefonoEmpresa = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        txtCorreoEmpresa = new javax.swing.JTextField();
        RadioQuintero = new javax.swing.JRadioButton();
        RadioEmpresa = new javax.swing.JRadioButton();
        btnRegistrarCliente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setTitle("REGISTRAR NUEVO CLIENTE");

        PanelPrincipal.setBackground(new java.awt.Color(204, 204, 255));

        PanelContenedor.setLayout(new java.awt.CardLayout());

        PanelQuintero.setBackground(new java.awt.Color(153, 204, 255));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("NOMBRE:");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("CUIL:");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("TELEFONO:");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("DIRECCION:");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel12.setText("E-MAIL:");

        txtNombreQuintero.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtDireccionQuintero.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtCuil.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtNumeroTelefonoQuintero.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtCorreoQuintero.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout PanelQuinteroLayout = new javax.swing.GroupLayout(PanelQuintero);
        PanelQuintero.setLayout(PanelQuinteroLayout);
        PanelQuinteroLayout.setHorizontalGroup(
            PanelQuinteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelQuinteroLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(PanelQuinteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelQuinteroLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtCuil, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelQuinteroLayout.createSequentialGroup()
                        .addGroup(PanelQuinteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(PanelQuinteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreQuintero, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroTelefonoQuintero, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreoQuintero, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelQuinteroLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtDireccionQuintero, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        PanelQuinteroLayout.setVerticalGroup(
            PanelQuinteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelQuinteroLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(PanelQuinteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreQuintero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelQuinteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccionQuintero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelQuinteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelQuinteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroTelefonoQuintero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelQuinteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoQuintero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(60, 60, 60))
        );

        PanelContenedor.add(PanelQuintero, "card2");

        PanelEmpresa.setBackground(new java.awt.Color(153, 204, 255));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel13.setText("NOMBRE:");

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel14.setText("DIRECCION:");

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel15.setText("CUIT:");

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel16.setText("TEFEFONO:");

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel17.setText("E-MAIL:");

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("RAZON SOCIAL:");

        txtNombreEmpresa.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtDireccionEmpresa.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtCuit.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtNumeroTelefonoEmpresa.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtRazonSocial.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtCorreoEmpresa.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout PanelEmpresaLayout = new javax.swing.GroupLayout(PanelEmpresa);
        PanelEmpresa.setLayout(PanelEmpresaLayout);
        PanelEmpresaLayout.setHorizontalGroup(
            PanelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEmpresaLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(PanelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PanelEmpresaLayout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(18, 18, 18)
                            .addComponent(txtDireccionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelEmpresaLayout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel15)
                            .addGap(18, 18, 18)
                            .addComponent(txtCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelEmpresaLayout.createSequentialGroup()
                        .addGroup(PanelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel1)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(PanelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreEmpresa)
                            .addComponent(txtNumeroTelefonoEmpresa)
                            .addComponent(txtCorreoEmpresa)
                            .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        PanelEmpresaLayout.setVerticalGroup(
            PanelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEmpresaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(PanelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtDireccionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroTelefonoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        PanelContenedor.add(PanelEmpresa, "card3");

        RadioQuintero.setBackground(new java.awt.Color(204, 204, 255));
        RadioQuintero.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        RadioQuintero.setText("QUINTERO");
        RadioQuintero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioQuinteroActionPerformed(evt);
            }
        });

        RadioEmpresa.setBackground(new java.awt.Color(204, 204, 255));
        RadioEmpresa.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        RadioEmpresa.setText("EMPRESA");
        RadioEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioEmpresaActionPerformed(evt);
            }
        });

        btnRegistrarCliente.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnRegistrarCliente.setText("REGISTRAR CLIENTE");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(PanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(RadioQuintero)
                        .addGap(18, 18, 18)
                        .addComponent(RadioEmpresa)
                        .addGap(169, 169, 169))))
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btnRegistrarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioEmpresa)
                    .addComponent(RadioQuintero))
                .addGap(18, 18, 18)
                .addComponent(PanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarCliente)
                    .addComponent(jButton1))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioQuinteroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioQuinteroActionPerformed
        if(RadioQuintero.isSelected() == true){

            PanelContenedor.setEnabled(true);
            PanelContenedor.setVisible(true);

            PanelQuintero.setEnabled(true);
            PanelQuintero.setVisible(true);

            PanelEmpresa.setEnabled(false);
            PanelEmpresa.setVisible(false);

            RadioEmpresa.setEnabled(false);
        }
        if(RadioQuintero.isSelected() == false){

            PanelContenedor.setEnabled(false);
            PanelContenedor.setVisible(false);

            PanelQuintero.setEnabled(false);
            PanelQuintero.setVisible(false);

            RadioEmpresa.setEnabled(true);
        }
    }//GEN-LAST:event_RadioQuinteroActionPerformed

    private void RadioEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioEmpresaActionPerformed
        if(RadioEmpresa.isSelected() == true){

            PanelContenedor.setVisible(true);
            PanelContenedor.setEnabled(true);

            PanelEmpresa.setEnabled(true);
            PanelEmpresa.setVisible(true);

            PanelQuintero.setEnabled(false);
            PanelQuintero.setVisible(false);

            RadioQuintero.setEnabled(false);
        }
        if(RadioEmpresa.isSelected() == false){

            PanelContenedor.setEnabled(false);
            PanelContenedor.setVisible(false);

            PanelEmpresa.setEnabled(false);
            PanelEmpresa.setVisible(false);

            RadioQuintero.setEnabled(true);
        }
    }//GEN-LAST:event_RadioEmpresaActionPerformed

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        try {
            
            //QUINTERO - SIN CORREO ELECCTRONICO
            if(RadioQuintero.isSelected() == true && txtCorreoQuintero.getText().isEmpty() == true){
                if(comprobarCamposVaciosQuintero()){
                    String nombreQuintero = txtNombreQuintero.getText();
                    String direccionQuintero = txtDireccionQuintero.getText();
                    Cuil cuilQuintero = new Cuil(txtCuil.getText());
                    NumeroTelefono numeroDeTelefonoQuintero = new NumeroTelefono(txtNumeroTelefonoQuintero.getText());


                    Cliente nuevoCliente = new Quintero(nombreQuintero, numeroDeTelefonoQuintero, direccionQuintero, cuilQuintero);

                    this.mercado.agregarCliente(nuevoCliente);

                    JOptionPane.showMessageDialog(null, "CLIENTE REGISTRADO CON EXITO");
                    limpiarCampos();

                    tablaClientes.limpiarTabla();
                    tablaClientes.cargarDatosDeClientes(mercado.getClientes());
                }
            }
            
            //QUINTERO - CON CORREO ELECTRONICO
            if(RadioQuintero.isSelected() == true && txtCorreoQuintero.getText().isEmpty() == false){
                if(comprobarCamposVaciosQuintero()){
                    if(txtCorreoQuintero.getText().contains("@")){
                        String nombreQuintero = txtNombreQuintero.getText();
                        String direccionQuintero = txtDireccionQuintero.getText();
                        Cuil cuilQuintero = new Cuil(txtCuil.getText());
                        NumeroTelefono numeroDeTelefonoQuintero = new NumeroTelefono(txtNumeroTelefonoQuintero.getText());
                        String correoQuintero = txtCorreoQuintero.getText();

                        Cliente nuevoCliente = new Quintero(nombreQuintero, numeroDeTelefonoQuintero, direccionQuintero, correoQuintero, cuilQuintero);

                        this.mercado.agregarCliente(nuevoCliente);

                        JOptionPane.showMessageDialog(null, "CLIENTE REGISTRADO CON EXITO");
                        limpiarCampos();

                        tablaClientes.limpiarTabla();
                        tablaClientes.cargarDatosDeClientes(mercado.getClientes());
                    } else {
                        JOptionPane.showMessageDialog(null, "El correo electr\u00F3nico debe contener un \u0040");
                    }
                }
            }
            
            //EMPRESA - SIN CORREO ELECTRONICO
            if(RadioEmpresa.isSelected() == true && txtCorreoEmpresa.getText().isEmpty() == true){
                if(comprobarCamposVaciosEmpresa()){
                    String nombreEmpresa = txtNombreEmpresa.getText();
                    String direccionEmpresa = txtDireccionEmpresa.getText();
                    Cuit cuitEmpresa = new Cuit(txtCuit.getText());
                    NumeroTelefono numeroDeTelefonoEmpresa = new NumeroTelefono(txtNumeroTelefonoEmpresa.getText());
                    String razonSocial = txtRazonSocial.getText();

                    Cliente nuevoCliente = new Empresa(nombreEmpresa,numeroDeTelefonoEmpresa, direccionEmpresa, razonSocial, cuitEmpresa);

                    this.mercado.agregarCliente(nuevoCliente);

                    JOptionPane.showMessageDialog(null, "CLIENTE REGISTRADO CON EXITO");
                    limpiarCampos();

                    tablaClientes.limpiarTabla();
                    tablaClientes.cargarDatosDeClientes(mercado.getClientes());
                }
            }
            
            //EMPRESA - CON CORREO ELECTRONICO
            if(RadioEmpresa.isSelected() == true && txtCorreoEmpresa.getText().isEmpty() == false){
                if(comprobarCamposVaciosEmpresa()){
                    if(txtCorreoEmpresa.getText().contains("@")){
                        String nombreEmpresa = txtNombreEmpresa.getText();
                        String direccionEmpresa = txtDireccionEmpresa.getText();
                        Cuit cuitEmpresa = new Cuit(txtCuit.getText());
                        NumeroTelefono numeroDeTelefonoEmpresa = new NumeroTelefono(txtNumeroTelefonoEmpresa.getText());
                        String razonSocial = txtRazonSocial.getText();
                        String correoEmoresa = txtCorreoEmpresa.getText();

                        Cliente nuevoCliente = new Empresa(nombreEmpresa, numeroDeTelefonoEmpresa, direccionEmpresa, correoEmoresa, razonSocial, cuitEmpresa);

                        this.mercado.agregarCliente(nuevoCliente);
                        JOptionPane.showMessageDialog(null, "CLIENTE REGISTRADO CON EXITO");
                        //System.out.println("EMPRESA CON Correo electronico");
                        limpiarCampos();

                        tablaClientes.limpiarTabla();
                        tablaClientes.cargarDatosDeClientes(mercado.getClientes());
                    } else {
                        JOptionPane.showMessageDialog(null, "El correo electr\u00F3nico debe contener un \u0040");
                    }
                }
            }

        } catch (ClaveUnicaIdentificacionCarenciaDigitosException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClaveUnicaIdentificacionClaveInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClaveUnicaIdentificacionContieneMasDeDosGuionesException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClaveUnicaIdentificacionDigitosInvalidosException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClaveUnicaIdentificacionExcesoDigitosException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (NumeroTelefonoContieneMasDeUnSignoMasException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (NumeroTelefonoExcesoDigitosException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (NumeroTelefonoInvalidoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (NumeroTelefonoSignoMasEnUbicacionEquivocadaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (NumeroTelefonoCarenciaDigitosException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClienteYaAgregadoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void limpiarCampos(){
        txtNombreQuintero.setText(null);
        txtDireccionQuintero.setText(null);
        txtCuil.setText(null);
        txtNumeroTelefonoQuintero.setText(null);
        txtCorreoQuintero.setText(null);
        
        txtNombreEmpresa.setText(null);
        txtDireccionEmpresa.setText(null);
        txtCuit.setText(null);
        txtRazonSocial.setText(null);
        txtNumeroTelefonoEmpresa.setText(null);
        txtCorreoEmpresa.setText(null);
    }
    
    private Boolean comprobarCamposVaciosQuintero(){
        if(txtNombreQuintero.getText().isEmpty() && txtDireccionQuintero.getText().isEmpty() && txtCuil.getText().isEmpty() && txtNumeroTelefonoQuintero.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Los campos no pueden estar vac\u00EDos");
        } else {
            if(txtNombreQuintero.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El nombre del quintero no puede estar vac\u00EDo");
            }
            if(txtDireccionQuintero.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "La direcci\u00F3n del quintero no puede estar vac\u00EDa");
            }
            if(txtCuil.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El cuil del quintero no puede estar vac\u00EDo");
            }
            if(txtNumeroTelefonoQuintero.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El n\u00FAmero de tel\u00E9fono del quintero no puede estar vac\u00EDo");
            }
        }
        if(txtNombreQuintero.getText().isEmpty() || txtDireccionQuintero.getText().isEmpty() || txtCuil.getText().isEmpty() || txtNumeroTelefonoQuintero.getText().isEmpty()){
            return false;
        }
        return true;
    }
    
    private Boolean comprobarCamposVaciosEmpresa(){
    if(txtNombreEmpresa.getText().isEmpty() && txtDireccionEmpresa.getText().isEmpty() && txtCuit.getText().isEmpty() && txtNumeroTelefonoEmpresa.getText().isEmpty() && txtRazonSocial.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Los campos no pueden estar vac\u00EDos");
        } else {
            if(txtNombreEmpresa.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El nombre la empresa no puede estar vac\u00EDo");
            }
            if(txtDireccionEmpresa.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "La direcci\u00F3n de la empresa no puede estar vac\u00EDa");
            }
            if(txtCuit.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El cuit de la empresa no puede estar vac\u00EDo");
            }
            if(txtNumeroTelefonoEmpresa.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El n\u00FAmero de tel\u00E9fono de la empresa no puede estar vac\u00EDo");
            }
            if(txtRazonSocial.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "La raz\u00F3n social de la empresa no puede estar vac\u00EDa");
            }
        }
        if(txtNombreEmpresa.getText().isEmpty() || txtDireccionEmpresa.getText().isEmpty() || txtCuit.getText().isEmpty() || txtNumeroTelefonoEmpresa.getText().isEmpty() || txtRazonSocial.getText().isEmpty()){
            return false;
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JPanel PanelEmpresa;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelQuintero;
    private javax.swing.JRadioButton RadioEmpresa;
    private javax.swing.JRadioButton RadioQuintero;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCorreoEmpresa;
    private javax.swing.JTextField txtCorreoQuintero;
    private javax.swing.JTextField txtCuil;
    private javax.swing.JTextField txtCuit;
    private javax.swing.JTextField txtDireccionEmpresa;
    private javax.swing.JTextField txtDireccionQuintero;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextField txtNombreQuintero;
    private javax.swing.JTextField txtNumeroTelefonoEmpresa;
    private javax.swing.JTextField txtNumeroTelefonoQuintero;
    private javax.swing.JTextField txtRazonSocial;
    // End of variables declaration//GEN-END:variables
}