/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.math.BigDecimal;

import javax.swing.JOptionPane;
import mercadoabasto.exepciones.SectorInexistenteException;
import mercadoabasto.mercado.Mercado;
import mercadoabasto.mercado.Sector;
import java.lang.NumberFormatException;
/**
 *
 * @author Braian
 */
public class ModificarSector extends javax.swing.JInternalFrame {

    private Mercado mercado;
    private Sector sectorEncontrado = null; 
    private int index=0;
    private String elementoSeleccionado = null;
    private String nombreViejoDeSector = null;
    
    public ModificarSector(Mercado mercado) {
        initComponents();
        setTitle("Modificar Sector");
        setResizable(false);
        this.mercado = mercado;
        comboSectores.setModel(MenuPrincipal.modeloCombo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboSectores = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnGuardarCambios = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        txtNombreSector = new javax.swing.JTextField();
        txtCantidadPuestos = new javax.swing.JTextField();
        txtPrecioMetroCuadrado = new javax.swing.JTextField();
        txtCaracteristicaExtra = new javax.swing.JTextField();
        txtExtraPorTecho = new javax.swing.JTextField();
        txtExtraPorCamaraFrigorifica = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Sector: ");

        comboSectores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSectoresActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Nombre del sector:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Precio por metro cuadrado: $");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("Cantidad de puestos:");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Carateristicas extras:");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setText("Techo:");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setText("Camara Frigorifica:");

        btnGuardarCambios.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnGuardarCambios.setText("Guardar Cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        btnCerrar.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setText("%");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setText("%");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setText("%");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setText("Porcentaje de intereses agregados por:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCantidadPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel8)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboSectores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNombreSector, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnGuardarCambios)
                            .addGap(52, 52, 52)
                            .addComponent(btnCerrar))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrecioMetroCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCaracteristicaExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExtraPorTecho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExtraPorCamaraFrigorifica, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboSectores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantidadPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecioMetroCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCaracteristicaExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(txtExtraPorTecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtExtraPorCamaraFrigorifica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCambios)
                    .addComponent(btnCerrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void comboSectoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSectoresActionPerformed
   
        elementoSeleccionado = comboSectores.getSelectedItem().toString();
        try {
            sectorEncontrado = mercado.buscarUnSector(elementoSeleccionado);
            
            txtNombreSector.setText(sectorEncontrado.getNombreSector());
            txtCantidadPuestos.setText(sectorEncontrado.getLimitePuestos().toString());
            txtPrecioMetroCuadrado.setText(sectorEncontrado.getPrecioMetroCuadrado().toString());
            txtCaracteristicaExtra.setText(sectorEncontrado.getPorcentajeGeneral().toString());
            txtExtraPorTecho.setText(sectorEncontrado.getPorcentajeTecho().toString());
            txtExtraPorCamaraFrigorifica.setText(sectorEncontrado.getPorcentajeCamara().toString());
            
        } catch (SectorInexistenteException ex) {
            JOptionPane.showMessageDialog(null, "Sector No Encotrado");
        }    
    }//GEN-LAST:event_comboSectoresActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        if(comboSectores.getSelectedItem() != null && sectorEncontrado != null){
            int opcion = JOptionPane.showConfirmDialog(this, "¿DESEA MODIFICAR EL SECTOR?","Confirmar",JOptionPane.YES_OPTION,JOptionPane.QUESTION_MESSAGE);
            
            if(opcion == JOptionPane.YES_OPTION ){
                if(controlarCamposVacios()){
                    if(controlarNumerosIngresados()){
                        try{
                            //desde aquí hacia abajo sería el codígo que iría dentro del catch de SectorInexistenteException
                            //si es que ejecutamos la modificacion de datos dentro del tratamiento de la excepcion
                            nombreViejoDeSector = elementoSeleccionado;
                            sectorEncontrado.setNombreSector(txtNombreSector.getText().toUpperCase());
                            sectorEncontrado.setLimitePuestos(Integer.parseInt(txtCantidadPuestos.getText()));
                            sectorEncontrado.setPrecioMetroCuadrado(new BigDecimal(Integer.parseInt( txtPrecioMetroCuadrado.getText())));
                            sectorEncontrado.setPorcentajeGeneral(Integer.parseInt(txtCaracteristicaExtra.getText()));
                            sectorEncontrado.setPorcentajeTecho(Integer.parseInt(txtExtraPorTecho.getText()));
                            sectorEncontrado.setPorcentajeCamara(Integer.parseInt(txtExtraPorCamaraFrigorifica.getText()));

                            MenuPrincipal.modeloCombo.addElement(sectorEncontrado.getNombreSector());
                            MenuPrincipal.modeloCombo.removeElement(nombreViejoDeSector);

                            JOptionPane.showMessageDialog(null,"Sector Modificado Con Exito");
                        } catch (NumberFormatException ex){
                            JOptionPane.showMessageDialog(null, "Solo se permiten letras en el nombre del sector");
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento para modificar");
        }
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed
  
    private Boolean controlarCamposVacios(){
        //controla que haya texto en los campos, cambiando el cartel mostrado dependiendo del dato faltante
        
        if(txtNombreSector.getText().isEmpty() && txtCantidadPuestos.getText().isEmpty() && txtPrecioMetroCuadrado.getText().isEmpty() && txtCaracteristicaExtra.getText().isEmpty() && txtExtraPorTecho.getText().isEmpty() && txtExtraPorCamaraFrigorifica.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacios");
            return false;
        } else {        
            if(txtNombreSector.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El nombre del sector no puede estar vacio");
            }
            if(txtCantidadPuestos.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "La cantidad de puestos no puede estar vacia");
            }
            if(txtPrecioMetroCuadrado.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El precio por metro cuadrado no puede estar vacio");
            }
            if(txtCaracteristicaExtra.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El porcentaje general no puede estar vacio");
            }
            if(txtExtraPorTecho.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El porcentaje por el techo no puede estar vacio");
            }
            if(txtExtraPorCamaraFrigorifica.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El porcentaje por camara frigorifica no puede estar vacio");
            }
            if(txtNombreSector.getText().isEmpty() || txtCantidadPuestos.getText().isEmpty() || txtPrecioMetroCuadrado.getText().isEmpty() || txtCaracteristicaExtra.getText().isEmpty() || txtExtraPorTecho.getText().isEmpty() || txtExtraPorCamaraFrigorifica.getText().isEmpty()){
                return false;
            }
        }
        return true;
    }
    
    private Boolean controlarNumerosIngresados(){
        if(Integer.parseInt(txtCantidadPuestos.getText()) == 0){
            JOptionPane.showMessageDialog(null, "El limite de puestos debe ser mayor a 0");
        }
        if(Integer.parseInt(txtPrecioMetroCuadrado.getText()) == 0){
            JOptionPane.showMessageDialog(null, "El precio por metro cuadrado debe ser mayor a 0");
        }
        if(Integer.parseInt(txtCaracteristicaExtra.getText()) == 0){
            JOptionPane.showMessageDialog(null, "El porcentaje general debe ser mayor a 0");
        }
        if(Integer.parseInt(txtExtraPorTecho.getText()) == 0){
            JOptionPane.showMessageDialog(null, "El porcentaje por el techo debe ser mayor a 0");
        }
        if(Integer.parseInt(txtExtraPorCamaraFrigorifica.getText()) == 0){
            JOptionPane.showMessageDialog(null, "El porcentaje por camara frigorifica debe ser mayor a 0");
        }
        if(Integer.parseInt(txtCantidadPuestos.getText())==0 || Integer.parseInt(txtPrecioMetroCuadrado.getText())==0 || Integer.parseInt(txtCaracteristicaExtra.getText())==0 || Integer.parseInt(txtExtraPorTecho.getText())==0 || Integer.parseInt(txtExtraPorCamaraFrigorifica.getText())==0){
                return false;
        }
        return true;
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JComboBox<String> comboSectores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCantidadPuestos;
    private javax.swing.JTextField txtCaracteristicaExtra;
    private javax.swing.JTextField txtExtraPorCamaraFrigorifica;
    private javax.swing.JTextField txtExtraPorTecho;
    private javax.swing.JTextField txtNombreSector;
    private javax.swing.JTextField txtPrecioMetroCuadrado;
    // End of variables declaration//GEN-END:variables
}
