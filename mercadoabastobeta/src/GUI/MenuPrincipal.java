

package GUI;

import RelojThread.RelojDigital;
import java.awt.Dimension;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import mercadoabasto.mercado.Mercado;


public class MenuPrincipal extends javax.swing.JFrame {
    
    
    private ListaSector listaSectores = null;
    private InformacionMercado informacionMercado = null;
    private ConfiguracionDeMercado configurarMercado = null;
    private AgregarSector agregarSector = null;
    private ModificarSector modificarSector =null;
    private AgregarPuesto agregarPuesto = null;
    private AgregarContrato agregarContrato = null;
    private ListaContrato listaContrato = null;
    private AgregarLectura agregarLectura = null; 
    private AgregarFactura agregarFactura = null;
    private BuscarFactura buscarFactura = null;
    private ListaFactura listaFactura = null;
    private ListarClientes listarClientes = null;
    private ControlUsuario controlUsuario = null;
    private ServicioTecnico servicioTecnico = null;
    
    private Mercado mercado;
    public static DefaultComboBoxModel modeloCombo; // se crea una instancia de modelo de Jcombo que se utilizara desde el inicio
    
    
    public MenuPrincipal(Mercado mercado) {
    
        initComponents();
        this.setExtendedState(MenuPrincipal.MAXIMIZED_BOTH);
        
        this.mercado = mercado;
        
        cargarDatosDelMercado(this.mercado);
        
        modeloCombo = new DefaultComboBoxModel();
        
        RelojDigital reloj = new RelojDigital(lblTime, lblFecha);
        reloj.start();
         
        
         this.setIconImage(new ImageIcon(getClass().getResource("/imagen/unnamed.jpg")).getImage());
       
    }
    
    public MenuPrincipal(){
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelEscritorio = new javax.swing.JDesktopPane();
        PanelFechaHora = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        PanelInfoMercado = new javax.swing.JPanel();
        Jlabel = new javax.swing.JLabel();
        Jlabel3 = new javax.swing.JLabel();
        LabelHoraAbierto = new javax.swing.JLabel();
        LabelHoraCerrado = new javax.swing.JLabel();
        Jlabel2 = new javax.swing.JLabel();
        LabelNumeroTelefono1 = new javax.swing.JLabel();
        Jlabel1 = new javax.swing.JLabel();
        LabelDireccion = new javax.swing.JLabel();
        PanelTituloMercado = new javax.swing.JPanel();
        LabelNombreMercado = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        ItemClientes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ItemInformacion = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        ItemConfiguracion = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        ItemSalir = new javax.swing.JMenuItem();
        MenuSector = new javax.swing.JMenu();
        ItemListar = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        MenuAdm = new javax.swing.JMenu();
        ItemAgregar = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        ItemModificar = new javax.swing.JMenuItem();
        MenuPuesto = new javax.swing.JMenu();
        ItemConsultar = new javax.swing.JMenuItem();
        MenuMedidor = new javax.swing.JMenu();
        ItemLectura = new javax.swing.JMenuItem();
        MenuConceptos = new javax.swing.JMenu();
        MenuContrato = new javax.swing.JMenu();
        ItemNuevoContrato = new javax.swing.JMenuItem();
        jSeparator20 = new javax.swing.JPopupMenu.Separator();
        ItemListarContrato = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        MenuFactura = new javax.swing.JMenu();
        ItemNuevaFactura = new javax.swing.JMenuItem();
        jSeparator22 = new javax.swing.JPopupMenu.Separator();
        ItemBuscarFactura = new javax.swing.JMenuItem();
        jSeparator23 = new javax.swing.JPopupMenu.Separator();
        ItemListarFacturas = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MercadoSoft");

        PanelEscritorio.setBackground(new java.awt.Color(153, 255, 153));

        PanelFechaHora.setBackground(new java.awt.Color(153, 255, 153));
        PanelFechaHora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblFecha.setBackground(new java.awt.Color(0, 0, 0));
        lblFecha.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        lblFecha.setText("Lunes 00 De Diciembre del 0000");

        lblTime.setBackground(new java.awt.Color(0, 0, 0));
        lblTime.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        lblTime.setText("00:00:00");

        javax.swing.GroupLayout PanelFechaHoraLayout = new javax.swing.GroupLayout(PanelFechaHora);
        PanelFechaHora.setLayout(PanelFechaHoraLayout);
        PanelFechaHoraLayout.setHorizontalGroup(
            PanelFechaHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFechaHoraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelFechaHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFechaHoraLayout.createSequentialGroup()
                        .addComponent(lblFecha)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFechaHoraLayout.createSequentialGroup()
                        .addComponent(lblTime)
                        .addGap(142, 142, 142))))
        );
        PanelFechaHoraLayout.setVerticalGroup(
            PanelFechaHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFechaHoraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        PanelInfoMercado.setBackground(new java.awt.Color(153, 255, 153));
        PanelInfoMercado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Jlabel.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        Jlabel.setText("Horario de Atencion:");

        Jlabel3.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        Jlabel3.setText("Lun - Sab");

        LabelHoraAbierto.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N

        LabelHoraCerrado.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N

        Jlabel2.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        Jlabel2.setText("Numero de Telefono:");

        LabelNumeroTelefono1.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N

        Jlabel1.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        Jlabel1.setText("Direccion:");

        LabelDireccion.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N

        javax.swing.GroupLayout PanelInfoMercadoLayout = new javax.swing.GroupLayout(PanelInfoMercado);
        PanelInfoMercado.setLayout(PanelInfoMercadoLayout);
        PanelInfoMercadoLayout.setHorizontalGroup(
            PanelInfoMercadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoMercadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInfoMercadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Jlabel)
                    .addComponent(Jlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelInfoMercadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelHoraAbierto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelHoraCerrado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(PanelInfoMercadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Jlabel1)
                    .addComponent(Jlabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(PanelInfoMercadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelNumeroTelefono1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PanelInfoMercadoLayout.setVerticalGroup(
            PanelInfoMercadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoMercadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInfoMercadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelHoraAbierto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jlabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelNumeroTelefono1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jlabel3)
                .addGap(1, 1, 1)
                .addGroup(PanelInfoMercadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Jlabel1)
                    .addComponent(LabelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelHoraCerrado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelTituloMercado.setBackground(new java.awt.Color(204, 204, 255));
        PanelTituloMercado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(153, 153, 153), new java.awt.Color(102, 102, 102)));

        LabelNombreMercado.setBackground(new java.awt.Color(204, 204, 255));
        LabelNombreMercado.setFont(new java.awt.Font("Calibri", 0, 45)); // NOI18N
        LabelNombreMercado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNombreMercado.setText("n");

        javax.swing.GroupLayout PanelTituloMercadoLayout = new javax.swing.GroupLayout(PanelTituloMercado);
        PanelTituloMercado.setLayout(PanelTituloMercadoLayout);
        PanelTituloMercadoLayout.setHorizontalGroup(
            PanelTituloMercadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTituloMercadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelNombreMercado, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelTituloMercadoLayout.setVerticalGroup(
            PanelTituloMercadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTituloMercadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelNombreMercado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelEscritorio.setLayer(PanelFechaHora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PanelEscritorio.setLayer(PanelInfoMercado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PanelEscritorio.setLayer(PanelTituloMercado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PanelEscritorioLayout = new javax.swing.GroupLayout(PanelEscritorio);
        PanelEscritorio.setLayout(PanelEscritorioLayout);
        PanelEscritorioLayout.setHorizontalGroup(
            PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTituloMercado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelFechaHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelInfoMercado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PanelEscritorioLayout.setVerticalGroup(
            PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEscritorioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(PanelFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addGroup(PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelTituloMercado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelInfoMercado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        getContentPane().add(PanelEscritorio, java.awt.BorderLayout.CENTER);

        MenuArchivo.setText("Archivo");
        MenuArchivo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        ItemClientes.setText("Clientes");
        ItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemClientesActionPerformed(evt);
            }
        });
        MenuArchivo.add(ItemClientes);
        MenuArchivo.add(jSeparator1);

        ItemInformacion.setBackground(new java.awt.Color(153, 255, 153));
        ItemInformacion.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        ItemInformacion.setText("Informacion");
        ItemInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemInformacionActionPerformed(evt);
            }
        });
        MenuArchivo.add(ItemInformacion);
        MenuArchivo.add(jSeparator2);

        ItemConfiguracion.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        ItemConfiguracion.setText("Configuracion");
        ItemConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemConfiguracionActionPerformed(evt);
            }
        });
        MenuArchivo.add(ItemConfiguracion);
        MenuArchivo.add(jSeparator3);

        jMenuItem1.setText("Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuArchivo.add(jMenuItem1);
        MenuArchivo.add(jSeparator4);

        ItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        ItemSalir.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        ItemSalir.setText("Salir");
        ItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemSalirActionPerformed(evt);
            }
        });
        MenuArchivo.add(ItemSalir);

        MenuBar.add(MenuArchivo);

        MenuSector.setText("Sector");
        MenuSector.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        ItemListar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        ItemListar.setText("Listar");
        ItemListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemListarActionPerformed(evt);
            }
        });
        MenuSector.add(ItemListar);
        MenuSector.add(jSeparator7);

        MenuAdm.setText("Administrar");
        MenuAdm.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        ItemAgregar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        ItemAgregar.setText("Agregar");
        ItemAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAgregarActionPerformed(evt);
            }
        });
        MenuAdm.add(ItemAgregar);
        MenuAdm.add(jSeparator8);

        ItemModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        ItemModificar.setText("Modificar");
        ItemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemModificarActionPerformed(evt);
            }
        });
        MenuAdm.add(ItemModificar);

        MenuSector.add(MenuAdm);

        MenuBar.add(MenuSector);

        MenuPuesto.setText("Puesto");
        MenuPuesto.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        ItemConsultar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        ItemConsultar.setText("Administrar");
        ItemConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemConsultarActionPerformed(evt);
            }
        });
        MenuPuesto.add(ItemConsultar);

        MenuBar.add(MenuPuesto);

        MenuMedidor.setText("Medidor");
        MenuMedidor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        ItemLectura.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        ItemLectura.setText("Agregar Lectura");
        ItemLectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemLecturaActionPerformed(evt);
            }
        });
        MenuMedidor.add(ItemLectura);

        MenuBar.add(MenuMedidor);

        MenuConceptos.setText("Conceptos");
        MenuConceptos.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        MenuContrato.setText("Contrato");
        MenuContrato.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        ItemNuevoContrato.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        ItemNuevoContrato.setText("Nuevo Contrato");
        ItemNuevoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNuevoContratoActionPerformed(evt);
            }
        });
        MenuContrato.add(ItemNuevoContrato);
        MenuContrato.add(jSeparator20);

        ItemListarContrato.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        ItemListarContrato.setText("Listar");
        ItemListarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemListarContratoActionPerformed(evt);
            }
        });
        MenuContrato.add(ItemListarContrato);

        MenuConceptos.add(MenuContrato);
        MenuConceptos.add(jSeparator18);

        MenuFactura.setText("Factura");
        MenuFactura.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        ItemNuevaFactura.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        ItemNuevaFactura.setText("Nueva Factura");
        ItemNuevaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNuevaFacturaActionPerformed(evt);
            }
        });
        MenuFactura.add(ItemNuevaFactura);
        MenuFactura.add(jSeparator22);

        ItemBuscarFactura.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        ItemBuscarFactura.setText("Buscar por Rango");
        ItemBuscarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemBuscarFacturaActionPerformed(evt);
            }
        });
        MenuFactura.add(ItemBuscarFactura);
        MenuFactura.add(jSeparator23);

        ItemListarFacturas.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        ItemListarFacturas.setText("Listar ");
        ItemListarFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemListarFacturasActionPerformed(evt);
            }
        });
        MenuFactura.add(ItemListarFacturas);

        MenuConceptos.add(MenuFactura);

        MenuBar.add(MenuConceptos);

        jMenu1.setText("Ayuda");
        jMenu1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jMenuItem2.setText("Servicio Tecnico");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        MenuBar.add(jMenu1);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemListarActionPerformed
        comprobarVentanaListaSector();
    }//GEN-LAST:event_ItemListarActionPerformed

    private void ItemAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAgregarActionPerformed
       comprobarVentanaAgregarSector();
        
    }//GEN-LAST:event_ItemAgregarActionPerformed

    private void ItemConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConsultarActionPerformed
       comprobarVentanaAgregarPuesto();
    }//GEN-LAST:event_ItemConsultarActionPerformed

    private void ItemInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemInformacionActionPerformed
        comprobarVentanaInformacionMercado();
    }//GEN-LAST:event_ItemInformacionActionPerformed

    private void ItemConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConfiguracionActionPerformed
        comprobarVentanaConfiguracionMercado();
    }//GEN-LAST:event_ItemConfiguracionActionPerformed

    private void ItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ItemSalirActionPerformed

    private void ItemNuevoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNuevoContratoActionPerformed
       controlVentanaAgregarContrato();        
    }//GEN-LAST:event_ItemNuevoContratoActionPerformed

    private void ItemListarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemListarContratoActionPerformed
        comprobarVentanaListaContrato();
    }//GEN-LAST:event_ItemListarContratoActionPerformed

    private void ItemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemModificarActionPerformed
       comprobarVentanaModificarSector();
    }//GEN-LAST:event_ItemModificarActionPerformed

    private void ItemLecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemLecturaActionPerformed
        comprobarVentanaAgregarLectura();
    }//GEN-LAST:event_ItemLecturaActionPerformed

    private void ItemBuscarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemBuscarFacturaActionPerformed
        comprobarVentanaBuscarFactura();
    }//GEN-LAST:event_ItemBuscarFacturaActionPerformed

    private void ItemNuevaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNuevaFacturaActionPerformed
        comprobarVentanaAgregarFactura();
    }//GEN-LAST:event_ItemNuevaFacturaActionPerformed

    private void ItemListarFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemListarFacturasActionPerformed
        comprobarVentanaListaFactura();
    }//GEN-LAST:event_ItemListarFacturasActionPerformed

    private void ItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemClientesActionPerformed
        comprobarVentanaListarClientes();
    }//GEN-LAST:event_ItemClientesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        comprobarVerificacionUsuario();
      
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        comprobarVentanaServicioTecnico();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
    
    
    public static void cargarDatosDelMercado(Mercado mercado){
        
        LabelDireccion.setText(mercado.getDireccion());
       
        LabelNumeroTelefono1.setText(mercado.getNumeroTelefono().getNumeroTelefono());
      
        DateTimeFormatter formatoHora = DateTimeFormatter.ISO_LOCAL_TIME;
        LabelHoraAbierto.setText(mercado.getHorarioAbierto().format(formatoHora)+".hs");
        
        LabelHoraCerrado.setText(mercado.getHorarioCerrado().format(formatoHora)+".hs");
        
        LabelNombreMercado.setText(mercado.getNombre());
    }
    
    
    
  
//EJEMPLO DE COMPROBACION DE VENTANA ABIERTA
   public void comprobarVentanaListaSector(){
        
       if(listaSectores == null || listaSectores.isClosed()){
       
            listaSectores= new ListaSector(mercado);
            PanelEscritorio.add(listaSectores);
            listaSectores.setVisible(true);
            Dimension desktopSize = PanelEscritorio.getSize();
            Dimension FrameSize = listaSectores.getSize();
            listaSectores.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        }else{
            JOptionPane.showMessageDialog(null,"La Ventana Se Encuentra Abierta");
        }        
    }
   
    
   //CONTRO DE EJECUCION DE VENTANA INFORMACION
   
   public void comprobarVentanaInformacionMercado(){
       if(informacionMercado == null || informacionMercado.isClosed()){
        informacionMercado = new InformacionMercado(mercado);
        PanelEscritorio.add(informacionMercado);
        Dimension desktopSize = PanelEscritorio.getSize();
        Dimension FrameSize = informacionMercado.getSize();
        informacionMercado.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);          
        informacionMercado.show();
       }else{
           JOptionPane.showMessageDialog(null, "La Ventana Se Encuentra Abierta");
       }
   }
   // CONTROL DE EJECUCION DE VENTANA CONFIGURACION DE MERCADO
   public void comprobarVentanaConfiguracionMercado(){
       if(configurarMercado == null || configurarMercado.isClosed()){
           configurarMercado = new ConfiguracionDeMercado(mercado);
           PanelEscritorio.add(configurarMercado);
           Dimension desktopSize = PanelEscritorio.getSize();
           Dimension FrameSize = configurarMercado.getSize();
           configurarMercado.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);  
           configurarMercado.show();
           
       }else{
           JOptionPane.showMessageDialog(null, "La Ventana Se Encuentra Abierta");
       }
   }
   
   //CONTROL DE EJECUCION DE VENTANA AGREGAR SECTOR
   
   public void comprobarVentanaAgregarSector(){
       
       if(agregarSector == null || agregarSector.isClosed()){
           
           agregarSector = new AgregarSector(mercado);
        PanelEscritorio.add(agregarSector);
        Dimension desktopSize = PanelEscritorio.getSize();
        Dimension FrameSize = agregarSector.getSize();
        agregarSector.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);          
        agregarSector.show();
       }else{
           JOptionPane.showMessageDialog(null, "La Ventana Se Encuentra Abierta");
       }
   }

   //CONTROL DE EJECUCION DE VENTANA MODIFICAAR SECTOR
   
   public void comprobarVentanaModificarSector(){
       
       if(modificarSector == null || modificarSector.isClosed()){
           
           modificarSector = new ModificarSector(mercado);
           PanelEscritorio.add(modificarSector);
           Dimension desktopSize = PanelEscritorio.getSize();
           Dimension FrameSize = modificarSector.getSize();
        modificarSector.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);          
        modificarSector.show();
       }else{
           JOptionPane.showMessageDialog(null, "La Ventana Se Encuentra Abierta");
       }
   }
       
   //CONTROL DE EJECUCION DE VENTANA ADMINISTRAR PUESTO
   
   public void comprobarVentanaAgregarPuesto(){
       
       if(agregarPuesto == null || agregarPuesto.isClosed()){
         agregarPuesto = new AgregarPuesto(mercado);
        PanelEscritorio.add(agregarPuesto);
        Dimension desktopSize = PanelEscritorio.getSize();
        Dimension FrameSize = agregarPuesto.getSize();
        agregarPuesto.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);          
        agregarPuesto.show();     
       }else{
           JOptionPane.showMessageDialog(null, "La Ventana Se Encuentra Abierta");
       }
   }
   
   //CONTROL DE EJECUCION DE VENTANA AGREGAR CONTRATO
    public void controlVentanaAgregarContrato(){
        if(agregarContrato == null || agregarContrato.isClosed()){
             
        agregarContrato = new AgregarContrato(mercado);
        PanelEscritorio.add(agregarContrato);
        Dimension desktopSize = PanelEscritorio.getSize();
        Dimension FrameSize = agregarContrato.getSize();
        agregarContrato.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);  
        agregarContrato.show();
        }else{
            JOptionPane.showMessageDialog(null, "La Ventana Se Encuentra Abierta");
        }
    }
   
    //CONTROL DE EJECUCION DE VENTANA LISTA CONTRATO
    public void comprobarVentanaListaContrato(){
        if(listaContrato ==  null || listaContrato.isClosed() ){
        listaContrato = new ListaContrato(mercado);
        PanelEscritorio.add(listaContrato);
        Dimension desktopSize = PanelEscritorio.getSize();
        Dimension FrameSize = listaContrato.getSize();
        listaContrato.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);  
        listaContrato.show();
        }else{
            JOptionPane.showMessageDialog(null, "La Ventana Se Encuentra Abierta");
        }
    }
    
    public void comprobarVentanaAgregarLectura(){
        if(agregarLectura == null || agregarLectura.isClosed()){
           
            agregarLectura = new AgregarLectura(mercado);
            PanelEscritorio.add(agregarLectura);
            Dimension desktopSize = PanelEscritorio.getSize();
            Dimension FrameSize = agregarLectura.getSize();
            agregarLectura.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);  
            agregarLectura.show();
        }else{
             JOptionPane.showMessageDialog(null, "La Ventana Se Encuentra Abierta");
        }
        
    }
    
    public void comprobarVentanaAgregarFactura(){
        if(agregarFactura == null || agregarFactura.isClosed()){
            agregarFactura = new AgregarFactura(mercado);
            PanelEscritorio.add(agregarFactura);
            Dimension desktopSize = PanelEscritorio.getSize();
            Dimension FrameSize = agregarFactura.getSize();
            agregarFactura.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
            agregarFactura.show();
        } else {
            JOptionPane.showMessageDialog(null, "Ya se encuentra una ventana activa");
        }
    }
    
    public void comprobarVentanaBuscarFactura(){
        if(buscarFactura == null || buscarFactura.isClosed()){
            buscarFactura = new BuscarFactura(mercado);
            PanelEscritorio.add(buscarFactura);
            Dimension desktopSize = PanelEscritorio.getSize();
            Dimension FrameSize = buscarFactura.getSize();
            buscarFactura.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
            buscarFactura.show();
        } else {
            JOptionPane.showMessageDialog(null, "Ya se encuentra una ventana activa");
        }
    }
    
    public void comprobarVentanaListaFactura(){
        if(listaFactura == null || listaFactura.isClosed()){
            listaFactura = new ListaFactura(mercado);
            PanelEscritorio.add(listaFactura);
            Dimension desktopSize = PanelEscritorio.getSize();
            Dimension FrameSize = listaFactura.getSize();
            listaFactura.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
            listaFactura.show();
        } else {
            JOptionPane.showMessageDialog(null, "Ya se encuentra una ventana activa");
        }
    }
    
    public void comprobarVentanaListarClientes(){
        if(listarClientes == null || listarClientes.isClosed()){
            listarClientes = new ListarClientes(mercado);
            PanelEscritorio.add(listarClientes);
            Dimension desktopSize = PanelEscritorio.getSize();
            Dimension FrameSize = listarClientes.getSize();
            listarClientes.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
            listarClientes.show();
        } else {
            JOptionPane.showMessageDialog(null, "Ya se encuentra una ventana activa");
        }
    }
    
   public void comprobarVerificacionUsuario(){
       
       if(controlUsuario == null || controlUsuario.isClosed()){
          
           controlUsuario = new ControlUsuario(this.mercado);
           PanelEscritorio.add(controlUsuario);
           Dimension desktopSize = PanelEscritorio.getSize();
           Dimension FrameSize = controlUsuario.getSize();
           controlUsuario.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
           controlUsuario.show();
       }else{
           JOptionPane.showMessageDialog(null, "Ya se encuentra una ventana activa");
       }
       
   }
   
   public void comprobarVentanaServicioTecnico(){
   
       if(servicioTecnico == null || servicioTecnico.isClosed() ){
           
           servicioTecnico = new ServicioTecnico();
           PanelEscritorio.add(servicioTecnico);
           Dimension desktopSize = PanelEscritorio.getSize();
           Dimension FrameSize = servicioTecnico.getSize();
           servicioTecnico.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
           servicioTecnico.show();
       }else{
           JOptionPane.showMessageDialog(null, "Ya se encuentra una ventana activa");
       }
   
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemAgregar;
    private javax.swing.JMenuItem ItemBuscarFactura;
    private javax.swing.JMenuItem ItemClientes;
    private javax.swing.JMenuItem ItemConfiguracion;
    private javax.swing.JMenuItem ItemConsultar;
    private javax.swing.JMenuItem ItemInformacion;
    private javax.swing.JMenuItem ItemLectura;
    private javax.swing.JMenuItem ItemListar;
    private javax.swing.JMenuItem ItemListarContrato;
    private javax.swing.JMenuItem ItemListarFacturas;
    private javax.swing.JMenuItem ItemModificar;
    private javax.swing.JMenuItem ItemNuevaFactura;
    private javax.swing.JMenuItem ItemNuevoContrato;
    private javax.swing.JMenuItem ItemSalir;
    private javax.swing.JLabel Jlabel;
    private javax.swing.JLabel Jlabel1;
    private javax.swing.JLabel Jlabel2;
    private javax.swing.JLabel Jlabel3;
    public static javax.swing.JLabel LabelDireccion;
    public static javax.swing.JLabel LabelHoraAbierto;
    public static javax.swing.JLabel LabelHoraCerrado;
    public static javax.swing.JLabel LabelNombreMercado;
    public static javax.swing.JLabel LabelNumeroTelefono1;
    private javax.swing.JMenu MenuAdm;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuConceptos;
    private javax.swing.JMenu MenuContrato;
    private javax.swing.JMenu MenuFactura;
    private javax.swing.JMenu MenuMedidor;
    private javax.swing.JMenu MenuPuesto;
    private javax.swing.JMenu MenuSector;
    public static javax.swing.JDesktopPane PanelEscritorio;
    private javax.swing.JPanel PanelFechaHora;
    private javax.swing.JPanel PanelInfoMercado;
    private javax.swing.JPanel PanelTituloMercado;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator20;
    private javax.swing.JPopupMenu.Separator jSeparator22;
    private javax.swing.JPopupMenu.Separator jSeparator23;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblTime;
    // End of variables declaration//GEN-END:variables

   
}
