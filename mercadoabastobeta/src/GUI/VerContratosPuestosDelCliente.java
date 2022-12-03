/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Filtrado.Filtrado;
import ModeloTablaContrato.*;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;
import mercadoabasto.clientes.Cliente;
import mercadoabasto.exepciones.ClienteSinContratosException;
import mercadoabasto.exepciones.ContratoInexistenteException;
import mercadoabasto.mercado.Contrato;
import mercadoabasto.mercado.Mercado;

/**
 *
 * @author Usuario
 */
public class VerContratosPuestosDelCliente extends javax.swing.JInternalFrame {

    private Mercado mercado;
    private ModelTableContrato modeloContrato;
    private TableRowSorter trsFiltro;
    private Contrato contratoSeleccionado = null;
    private DetalleDeContrato detalleDeContrato;
    /**
     * Creates new form VerContratosPuestosDelCliente
     */
    public VerContratosPuestosDelCliente(Mercado mercado, Cliente clienteSeleccionado) {
        initComponents();
        
        this.mercado = mercado;
        this.mercado.modificarEstadoPorFecha();
        this.modeloContrato = new ModelTableContrato();
        tablaContrato.setModel(modeloContrato);
        tablaContrato.setDefaultRenderer(Object.class, new CeldasRenderTableContrato());
        
        trsFiltro = new TableRowSorter(tablaContrato.getModel());
        tablaContrato.setRowSorter(trsFiltro);
        
        //Evento Teclado -Busqueda
        txtBusqueda.addKeyListener(new KeyAdapter() {
           
            @Override
            public void keyReleased(KeyEvent e) {
                Filtrado.filtrarContratoPorNumeroContrato(txtBusqueda, trsFiltro);
                contratoSeleccionado = null;
            }
          
        });
        
        try {
            
            ArrayList<Contrato> listaDeContratos = this.mercado.obtenerContratosDeCliente(clienteSeleccionado);
            modeloContrato.cargarDatosDelContrato(listaDeContratos);
            lblCantidadContratos.setText("Contratos: "+this.mercado.cantidadContratosDeCliente(clienteSeleccionado));
            lblContratosInactivos.setText("Contratos inactivos: "+this.mercado.cantidadDeContratosInactivos(listaDeContratos));
            lblContratosVigentes.setText("Contratos vigentes: "+this.mercado.cantidadDeContratosVigentes(listaDeContratos));
            lblContratosPorVencer.setText("Contratos por vencer: "+this.mercado.cantidadDeContratosPorVencer(listaDeContratos));
        } catch (ClienteSinContratosException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaContrato = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnVerDetallesContrato = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblCantidadContratos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblContratosVigentes = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblContratosPorVencer = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblContratosInactivos = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(840, 530));

        tablaContrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaContratoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaContrato);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Contratos");

        txtBusqueda.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel3.setText("Buscar:");

        btnVerDetallesContrato.setText("Ver detalles del contrato");
        btnVerDetallesContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDetallesContratoActionPerformed(evt);
            }
        });

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 78, 204));

        lblCantidadContratos.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblCantidadContratos.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidadContratos.setText("Contratos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCantidadContratos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCantidadContratos, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));

        lblContratosVigentes.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblContratosVigentes.setText("Contratos vigentes:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblContratosVigentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblContratosVigentes, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 200, 0));

        lblContratosPorVencer.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblContratosPorVencer.setText("Contratos por vencer:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblContratosPorVencer, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblContratosPorVencer, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));

        lblContratosInactivos.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblContratosInactivos.setText("Contratos inactivos:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblContratosInactivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblContratosInactivos, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerDetallesContrato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVerDetallesContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerDetallesContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDetallesContratoActionPerformed
        if(contratoSeleccionado != null){
            if (detalleDeContrato == null || detalleDeContrato.isClosed()){
                    detalleDeContrato = new DetalleDeContrato(contratoSeleccionado);
                    MenuPrincipal.PanelEscritorio.add(detalleDeContrato);
                    Dimension desktopSize = MenuPrincipal.PanelEscritorio.getSize();
                    Dimension FrameSize = detalleDeContrato.getSize();
                    detalleDeContrato.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);  
                    detalleDeContrato.show();
            }else{
                JOptionPane.showMessageDialog(null, "La Ventana Se Encuentra Abierta");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un contrato para poder ver sus detalles");
        }
    }//GEN-LAST:event_btnVerDetallesContratoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaContratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaContratoMouseClicked
        try {
            Integer seleccion = (Integer) tablaContrato.getValueAt(tablaContrato.getSelectedRow(), ModelTableContrato.NUMEROCONTRATO);
            contratoSeleccionado = this.mercado.buscarUnContrato(seleccion);
        } catch (ContratoInexistenteException ex) {
            JOptionPane.showMessageDialog(null, "El contrato seleccionado no existe");
        }
    }//GEN-LAST:event_tablaContratoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerDetallesContrato;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidadContratos;
    private javax.swing.JLabel lblContratosInactivos;
    private javax.swing.JLabel lblContratosPorVencer;
    private javax.swing.JLabel lblContratosVigentes;
    private javax.swing.JTable tablaContrato;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
