
package GUI;

import ModeloTablaCliente.ModelTableCliente;
import javax.swing.JOptionPane;
import mercadoabasto.mercado.Mercado;
import mercadoabasto.clientes.*;
import mercadoabasto.exepciones.NumeroTelefonoCarenciaDigitosException;
import mercadoabasto.exepciones.NumeroTelefonoContieneMasDeUnSignoMasException;
import mercadoabasto.exepciones.NumeroTelefonoExcesoDigitosException;
import mercadoabasto.exepciones.NumeroTelefonoInvalidoException;
import mercadoabasto.exepciones.NumeroTelefonoSignoMasEnUbicacionEquivocadaException;

/**
 *
 * @author Usuario
 */
public class DetallesDelCliente extends javax.swing.JInternalFrame {

    private Mercado mercado;
    private Cliente cliente;
    private ModelTableCliente modeloTablaClientes;
    /**
     * Creates new form DetallesDelCliente
     */
    public DetallesDelCliente(Mercado mercado, ModelTableCliente modeloTablaClientes, Cliente cliente) {
        initComponents();
        this.mercado=mercado;
        this.cliente=cliente;
        this.modeloTablaClientes=modeloTablaClientes;
        configurarVentana();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedor = new javax.swing.JPanel();
        panelQuintero = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreQuintero = new javax.swing.JTextField();
        txtDireccionQuintero = new javax.swing.JTextField();
        txtCuil = new javax.swing.JTextField();
        txtTelefonoQuintero = new javax.swing.JTextField();
        txtCorreoQuintero = new javax.swing.JTextField();
        panelEmpresa = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNombreEmpresa = new javax.swing.JTextField();
        txtDireccionEmpresa = new javax.swing.JTextField();
        txtCuit = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        txtCorreoEmpresa = new javax.swing.JTextField();
        txtTelefonoEmpresa = new javax.swing.JTextField();
        tbtnEditar = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        panelContenedor.setLayout(new java.awt.CardLayout());

        panelQuintero.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Tipo de cliente: Quintero");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Direccion:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("CUIL:");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Telefono:");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setText("Correo electronico:");

        txtNombreQuintero.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtDireccionQuintero.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtCuil.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtTelefonoQuintero.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtCorreoQuintero.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelQuinteroLayout = new javax.swing.GroupLayout(panelQuintero);
        panelQuintero.setLayout(panelQuinteroLayout);
        panelQuinteroLayout.setHorizontalGroup(
            panelQuinteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQuinteroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelQuinteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(panelQuinteroLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreQuintero))
                    .addGroup(panelQuinteroLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccionQuintero))
                    .addGroup(panelQuinteroLayout.createSequentialGroup()
                        .addGroup(panelQuinteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelQuinteroLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCuil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelQuinteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelQuinteroLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefonoQuintero, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                            .addComponent(txtCorreoQuintero))))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        panelQuinteroLayout.setVerticalGroup(
            panelQuinteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQuinteroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelQuinteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreQuintero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelQuinteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDireccionQuintero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelQuinteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefonoQuintero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelQuinteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCorreoQuintero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelContenedor.add(panelQuintero, "card2");

        panelEmpresa.setBackground(new java.awt.Color(204, 204, 255));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setText("Tipo de cliente: Empresa");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setText("Nombre:");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setText("Direccion:");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setText("CUIT:");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setText("Razon social:");

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel12.setText("Correo electronico:");

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel13.setText("Telefono:");

        txtNombreEmpresa.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtDireccionEmpresa.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtCuit.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtRazonSocial.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtCorreoEmpresa.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtTelefonoEmpresa.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelEmpresaLayout = new javax.swing.GroupLayout(panelEmpresa);
        panelEmpresa.setLayout(panelEmpresaLayout);
        panelEmpresaLayout.setHorizontalGroup(
            panelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEmpresaLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreoEmpresa))
                    .addGroup(panelEmpresaLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRazonSocial))
                    .addGroup(panelEmpresaLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccionEmpresa))
                    .addGroup(panelEmpresaLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreEmpresa))
                    .addGroup(panelEmpresaLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelEmpresaLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefonoEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelEmpresaLayout.setVerticalGroup(
            panelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(panelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDireccionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtTelefonoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCorreoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelContenedor.add(panelEmpresa, "card3");

        tbtnEditar.setText("Editar");
        tbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnEditarActionPerformed(evt);
            }
        });

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(tbtnEditar))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnEditarActionPerformed
        if(tbtnEditar.isSelected()){
            tbtnEditar.setText("Guardar");
            if(this.cliente instanceof Empresa){
                habilitarCamposEmpresa();
            }
            if(this.cliente instanceof Quintero){
                habilitarCamposQuintero();
            }
        }
        
        if(!tbtnEditar.isSelected()){
            if(this.cliente instanceof Empresa){
                if(comprobarCamposVaciosEmpresa()){
                    try {
                        // si txtCorreoEmpresa no está vacío, tiene que contener un @
                        if(!txtCorreoEmpresa.getText().isEmpty() && txtCorreoEmpresa.getText().contains("@")){
                            Empresa empresa = (Empresa) this.cliente;
                            
                            if(!empresa.getNumeroTelefono().getNumeroTelefono().equals(txtTelefonoEmpresa.getText())){
                                NumeroTelefono numeroTelefonoNuevo = new NumeroTelefono(txtTelefonoEmpresa.getText());
                                empresa.setNumeroTelefono(numeroTelefonoNuevo);
                            }
                            
                            empresa.setNombre(txtNombreEmpresa.getText());
                            empresa.setDireccion(txtDireccionEmpresa.getText());
                            empresa.setRazonSocial(txtRazonSocial.getText());
                            empresa.setCorreoElectronico(txtCorreoEmpresa.getText());
                            
                            inhabilitarCamposEmpresa();
                            tbtnEditar.setText("Editar");
                            this.modeloTablaClientes.limpiarTabla();
                            this.modeloTablaClientes.cargarDatosDeClientes(this.mercado.getClientes());
                        } else {
                            JOptionPane.showMessageDialog(null, "El correo electr\u00F3nico debe contener un \u0040 o estar completamente vac\u00EDo");
                            tbtnEditar.setText("Editar");
                            configurarVentana();
                        }
                        
                        //solo se reemplaza el correo anterior (en caso que haya habido) si se lo borra completamente
                        if(txtCorreoEmpresa.getText().isEmpty()){
                            Empresa empresa = (Empresa) this.cliente;

                            if(!empresa.getNumeroTelefono().getNumeroTelefono().equals(txtTelefonoEmpresa.getText())){
                                NumeroTelefono numeroTelefonoNuevo = new NumeroTelefono(txtTelefonoEmpresa.getText());
                                empresa.setNumeroTelefono(numeroTelefonoNuevo);
                            }

                            empresa.setNombre(txtNombreEmpresa.getText());
                            empresa.setDireccion(txtDireccionEmpresa.getText());
                            empresa.setRazonSocial(txtRazonSocial.getText());
                            empresa.setCorreoElectronico(txtCorreoEmpresa.getText());
                            
                            inhabilitarCamposEmpresa();
                            tbtnEditar.setText("Editar");
                            this.modeloTablaClientes.limpiarTabla();
                            this.modeloTablaClientes.cargarDatosDeClientes(this.mercado.getClientes());
                        }
                        
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
                    }
                    
                    
                } else {
                    tbtnEditar.setText("Editar");
                    configurarVentana();
                }
            }
            if(this.cliente instanceof Quintero){
                if(comprobarCamposVaciosQuintero()){
                    try {
                        // si txtCorreoQuintero no está vacío, tiene que contener un @
                        if(!txtCorreoQuintero.getText().isEmpty() && txtCorreoQuintero.getText().contains("@")){
                            Quintero quintero = (Quintero) this.cliente;
                            
                            if(!quintero.getNumeroTelefono().getNumeroTelefono().equals(txtTelefonoQuintero.getText())){
                                NumeroTelefono numeroTelefonoNuevo = new NumeroTelefono(txtTelefonoQuintero.getText());
                                quintero.setNumeroTelefono(numeroTelefonoNuevo);
                            }
                            
                            quintero.setNombre(txtNombreQuintero.getText());
                            quintero.setDireccion(txtDireccionQuintero.getText());
                            quintero.setCorreoElectronico(txtCorreoQuintero.getText());
                            
                            inhabilitarCamposQuintero();
                            tbtnEditar.setText("Editar");
                            this.modeloTablaClientes.limpiarTabla();
                            this.modeloTablaClientes.cargarDatosDeClientes(this.mercado.getClientes());
                        } else {
                            JOptionPane.showMessageDialog(null, "El correo electr\u00F3nico debe contener un \u0040 o estar completamente vac\u00EDo");
                            tbtnEditar.setText("Editar");
                            configurarVentana();
                        }
                        
                        //solo se reemplaza el correo anterior (en caso que haya habido) si se lo borra completamente
                        if(txtCorreoQuintero.getText().isEmpty()){
                            Quintero quintero = (Quintero) this.cliente;
                            
                            if(!quintero.getNumeroTelefono().getNumeroTelefono().equals(txtTelefonoQuintero.getText())){
                                NumeroTelefono numeroTelefonoNuevo = new NumeroTelefono(txtTelefonoQuintero.getText());
                                quintero.setNumeroTelefono(numeroTelefonoNuevo);
                            }
                            
                            quintero.setNombre(txtNombreQuintero.getText());
                            quintero.setDireccion(txtDireccionQuintero.getText());
                            quintero.setCorreoElectronico(txtCorreoQuintero.getText());
                            
                            inhabilitarCamposQuintero();
                            tbtnEditar.setText("Editar");
                            this.modeloTablaClientes.limpiarTabla();
                            this.modeloTablaClientes.cargarDatosDeClientes(this.mercado.getClientes());
                        }
                        
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
                    }
                    
                    
                } else {
                    tbtnEditar.setText("Editar");
                    configurarVentana();
                }
            }
        }
    }//GEN-LAST:event_tbtnEditarActionPerformed

    private void configurarVentana(){
        if(this.cliente instanceof Empresa){
            Empresa empresa = (Empresa) this.cliente;
            panelEmpresa.setEnabled(true);
            panelEmpresa.setVisible(true);
            panelQuintero.setEnabled(false);
            panelQuintero.setVisible(false);
            
            txtNombreEmpresa.setText(empresa.getNombre());
            txtDireccionEmpresa.setText(empresa.getDireccion());
            txtCuit.setText(empresa.getCuit().getNumeroClaveUnicaIdentificacion());
            txtTelefonoEmpresa.setText(empresa.getNumeroTelefono().getNumeroTelefono());
            txtRazonSocial.setText(empresa.getRazonSocial());
            if(empresa.getCorreoElectronico()!=null){
                txtCorreoEmpresa.setText(empresa.getCorreoElectronico());
            }
            inhabilitarCamposEmpresa();
        }
        if(this.cliente instanceof Quintero){
            Quintero quintero = (Quintero) this.cliente;
            panelEmpresa.setEnabled(false);
            panelEmpresa.setVisible(false);
            panelQuintero.setEnabled(true);
            panelQuintero.setVisible(true);
            
            txtNombreQuintero.setText(quintero.getNombre());
            txtDireccionQuintero.setText(quintero.getDireccion());
            txtCuil.setText(quintero.getCuil().getNumeroClaveUnicaIdentificacion());
            txtTelefonoQuintero.setText(quintero.getNumeroTelefono().getNumeroTelefono());
            if(quintero.getCorreoElectronico()!=null){
                txtCorreoQuintero.setText(quintero.getCorreoElectronico());
            }
            inhabilitarCamposQuintero();
        }
    }
    
    private void inhabilitarCamposEmpresa(){
        txtNombreEmpresa.setEnabled(false);
        txtDireccionEmpresa.setEnabled(false);
        txtCuit.setEnabled(false);
        txtTelefonoEmpresa.setEnabled(false);
        txtRazonSocial.setEnabled(false);
        txtCorreoEmpresa.setEnabled(false);
    }
    
    private void habilitarCamposEmpresa(){
        txtNombreEmpresa.setEnabled(true);
        txtDireccionEmpresa.setEnabled(true);
        txtCuit.setEnabled(false);
        txtTelefonoEmpresa.setEnabled(true);
        txtRazonSocial.setEnabled(true);
        txtCorreoEmpresa.setEnabled(true);
    }
    
    private void habilitarCamposQuintero(){
        txtNombreQuintero.setEnabled(true);
        txtDireccionQuintero.setEnabled(true);
        txtCuil.setEnabled(false);
        txtTelefonoQuintero.setEnabled(true);
        txtCorreoQuintero.setEnabled(true);
    }
    
    private void inhabilitarCamposQuintero(){
        txtNombreQuintero.setEnabled(false);
        txtDireccionQuintero.setEnabled(false);
        txtCuil.setEnabled(false);
        txtTelefonoQuintero.setEnabled(false);
        txtCorreoQuintero.setEnabled(false);
    }
    
    private Boolean comprobarCamposVaciosEmpresa(){
    if(txtNombreEmpresa.getText().isEmpty() && txtDireccionEmpresa.getText().isEmpty() && txtCuit.getText().isEmpty() && txtTelefonoEmpresa.getText().isEmpty() && txtRazonSocial.getText().isEmpty()){
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
            if(txtTelefonoEmpresa.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El n\u00FAmero de tel\u00E9fono de la empresa no puede estar vac\u00EDo");
            }
            if(txtRazonSocial.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "La raz\u00F3n social de la empresa no puede estar vac\u00EDa");
            }
        }
        if(txtNombreEmpresa.getText().isEmpty() || txtDireccionEmpresa.getText().isEmpty() || txtCuit.getText().isEmpty() || txtTelefonoEmpresa.getText().isEmpty() || txtRazonSocial.getText().isEmpty()){
            return false;
        }
        return true;
    }
    
    private Boolean comprobarCamposVaciosQuintero(){
        if(txtNombreQuintero.getText().isEmpty() && txtDireccionQuintero.getText().isEmpty() && txtCuil.getText().isEmpty() && txtTelefonoQuintero.getText().isEmpty()){
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
            if(txtTelefonoQuintero.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El n\u00FAmero de tel\u00E9fono del quintero no puede estar vac\u00EDo");
            }
        }
        if(txtNombreQuintero.getText().isEmpty() || txtDireccionQuintero.getText().isEmpty() || txtCuil.getText().isEmpty() || txtTelefonoQuintero.getText().isEmpty()){
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelEmpresa;
    private javax.swing.JPanel panelQuintero;
    private javax.swing.JToggleButton tbtnEditar;
    private javax.swing.JTextField txtCorreoEmpresa;
    private javax.swing.JTextField txtCorreoQuintero;
    private javax.swing.JTextField txtCuil;
    private javax.swing.JTextField txtCuit;
    private javax.swing.JTextField txtDireccionEmpresa;
    private javax.swing.JTextField txtDireccionQuintero;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextField txtNombreQuintero;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtTelefonoEmpresa;
    private javax.swing.JTextField txtTelefonoQuintero;
    // End of variables declaration//GEN-END:variables
}