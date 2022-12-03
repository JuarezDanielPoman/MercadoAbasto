/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ModeloTablaFactura.CeldasRenderTableFactura;
import ModeloTablaFactura.ModelTableFactura;
import mercadoabasto.mercado.*;
import Fecha.FuncionFecha;
import Filtrado.Filtrado;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;
import mercadoabasto.conceptosCobro.Factura;
import mercadoabasto.exepciones.FacturaInexistenteExeption;
import mercadoabasto.exepciones.FechaInvalidaException;
/**
 *
 * @author Usuario
 */
public class ListaFactura extends javax.swing.JInternalFrame {

    private Mercado mercado;
    private ModelTableFactura modeloTablaFacturas;
    private VerFactura verFactura = null;
    private TableRowSorter trsFiltro;
    
    public ListaFactura(Mercado mercado) {
        super("Lista de facturas");
        initComponents();
        this.mercado=mercado;
        modeloTablaFacturas = new ModelTableFactura();
        tablaFacturas.setModel(modeloTablaFacturas);
        tablaFacturas.setDefaultRenderer(Object.class, new CeldasRenderTableFactura());
        trsFiltro = new TableRowSorter(tablaFacturas.getModel());
        tablaFacturas.setRowSorter(trsFiltro);
        
        lblImporteTotal.setText("Importe total: "+this.mercado.getFacturero().calcularImporteTotalDeFacturas().toString());
        lblCantidadFacturas.setText("Cantidad de facturas: "+this.mercado.getFacturero().obtenerCantidadDeFacturas().toString());
        
        modeloTablaFacturas.cargarDatosDeFacturas(this.mercado.getFacturero().getFacturas());
        txtFacturasVencidas.setText("Facturas vencidas: "+this.mercado.getFacturero().cantidadDeFacturasVencidas());
        txtFacturasVigentes.setText("Facturas vigentes: "+this.mercado.getFacturero().cantidadDeFacturasVigentes());
        txtFacturasPorVencer.setText("Facturas por vencer: "+this.mercado.getFacturero().cantidadDeFacturasPorVencer());
        
        //Listener
        txtBuscarFactura.addKeyListener(new KeyAdapter(){
                @Override
                public void keyReleased(final KeyEvent e){
                    Filtrado.filtrarFacturasPorNumeroFactura(txtBuscarFactura, trsFiltro);
                }
            });
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
        tablaFacturas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarFactura = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        lblImporteTotal = new javax.swing.JLabel();
        lblCantidadFacturas = new javax.swing.JLabel();
        txtFacturasVencidas = new javax.swing.JTextField();
        txtFacturasVigentes = new javax.swing.JTextField();
        txtFacturasPorVencer = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        tablaFacturas.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaFacturasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaFacturas);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Buscar:");

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        lblImporteTotal.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblImporteTotal.setText("Importe total:");

        lblCantidadFacturas.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblCantidadFacturas.setText("Cantidad de facturas:");

        txtFacturasVencidas.setEditable(false);
        txtFacturasVencidas.setBackground(new java.awt.Color(255, 102, 102));
        txtFacturasVencidas.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtFacturasVencidas.setText("Factura vencida");
        txtFacturasVencidas.setBorder(null);
        txtFacturasVencidas.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFacturasVencidas.setEnabled(false);

        txtFacturasVigentes.setEditable(false);
        txtFacturasVigentes.setBackground(new java.awt.Color(102, 255, 102));
        txtFacturasVigentes.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtFacturasVigentes.setText("Factura vigente");
        txtFacturasVigentes.setBorder(null);
        txtFacturasVigentes.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFacturasVigentes.setEnabled(false);

        txtFacturasPorVencer.setEditable(false);
        txtFacturasPorVencer.setBackground(new java.awt.Color(255, 200, 0));
        txtFacturasPorVencer.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtFacturasPorVencer.setText("Factura por vencer");
        txtFacturasPorVencer.setBorder(null);
        txtFacturasPorVencer.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFacturasPorVencer.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImporteTotal)
                            .addComponent(lblCantidadFacturas)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtFacturasVencidas, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFacturasVigentes, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFacturasPorVencer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtBuscarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lblImporteTotal)
                        .addGap(18, 18, 18)
                        .addComponent(lblCantidadFacturas)
                        .addGap(18, 18, 18)
                        .addComponent(txtFacturasVencidas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFacturasVigentes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFacturasPorVencer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void tablaFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFacturasMouseClicked
        if(verFactura == null || verFactura.isClosed()){
            try {
                Integer numeroFacturaSeleccionada = (Integer) tablaFacturas.getValueAt(tablaFacturas.getSelectedRow(), ModelTableFactura.NUMEROFACTURA);
                Factura facturaEncontrada = this.mercado.getFacturero().buscarUnaFactura(numeroFacturaSeleccionada);
                verFactura = new VerFactura(this.mercado, facturaEncontrada);
                MenuPrincipal.PanelEscritorio.add(verFactura);
                Dimension desktopSize =  MenuPrincipal.PanelEscritorio.getSize();
                Dimension FrameSize = verFactura.getSize();
                verFactura.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);  
                verFactura.show();
            } catch (FacturaInexistenteExeption ex) {
                    JOptionPane.showMessageDialog(null, "La factura seleccionada no existe");
            }
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Ya se encuentra activa una ventana para ver factura");
        }
    }//GEN-LAST:event_tablaFacturasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidadFacturas;
    private javax.swing.JLabel lblImporteTotal;
    private javax.swing.JTable tablaFacturas;
    private javax.swing.JTextField txtBuscarFactura;
    private javax.swing.JTextField txtFacturasPorVencer;
    private javax.swing.JTextField txtFacturasVencidas;
    private javax.swing.JTextField txtFacturasVigentes;
    // End of variables declaration//GEN-END:variables
}
