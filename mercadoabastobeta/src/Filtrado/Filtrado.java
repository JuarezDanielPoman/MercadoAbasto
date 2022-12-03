
package Filtrado;

import ModeloTablaSector.ModelTableSector;
import ModeloTablaPuesto.ModelTablePuesto;
import GUI.DetalleDeContrato;
import GUI.DetalleDePuesto;
import GUI.MenuPrincipal;
import ModeloTablaCliente.ModelTableCliente;
import ModeloTablaContrato.ModelTableContrato;
import ModeloTablaFactura.ModelTableFactura;
import java.awt.Dimension;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.TableRowSorter;
import mercadoabasto.exepciones.ContratoInexistenteException;
import mercadoabasto.exepciones.PuestoInexistenteException;
import mercadoabasto.exepciones.SectorInexistenteException;
import mercadoabasto.mercado.Contrato;
import mercadoabasto.mercado.Mercado;
import mercadoabasto.mercado.Puesto;
import mercadoabasto.mercado.Sector;


public class Filtrado extends DefaultComboBoxModel{ 
   
    public static DetalleDePuesto detalleDePuesto = null; 
    public static DetalleDeContrato detalleDeContrato = null;
    


// NO ES NECESARIO ESTE METODO- YA QUE EL MODELO SE HACE CARGO DE CARGAR EL COMBO
   /* 
    public static void CargarComboBox(DefaultComboBoxModel modeloCombo , ArrayList <Sector> sectores){

        for ( Sector var : sectores ) {

            modeloCombo.addElement(var.getNombreSector().toString().toUpperCase());
        }

    }*/    
    
    public static void filtrarPorComboBox(String elementoSeleccionado ,Mercado mercado, ModelTablePuesto modeloTablaPuesto) throws SectorInexistenteException{

        Sector sectorSeleccionado = mercado.buscarUnSector(elementoSeleccionado);
        modeloTablaPuesto.LimpiarTabla();
        modeloTablaPuesto.cargarPuestos(sectorSeleccionado.getPuestos());

    }

   
    public static void infoDeSector(String elementoSeleccionado, Mercado mercado,  JTextField txtLimite, JTextField txtCantidadOcupado ,JTextField txtCantidadDisponible) throws SectorInexistenteException{
        Integer cantidadOcupado =0;
        Integer cantidadDisponible =0;
        
        Sector sectorSeleccionado = mercado.buscarUnSector(elementoSeleccionado);
        
        txtLimite.setText(sectorSeleccionado.getLimitePuestos().toString());
        txtLimite.setHorizontalAlignment(SwingConstants.CENTER);
        
        for (Puesto var : sectorSeleccionado.getPuestos()){
            
             if(var.getDisponibilidad() == false){
                 cantidadOcupado = cantidadOcupado + 1;
             }
    
             if(var.getDisponibilidad() == true){
                 cantidadDisponible = cantidadDisponible + 1;
             }
        }
        txtCantidadOcupado.setText(cantidadOcupado.toString());
        txtCantidadOcupado.setHorizontalAlignment(SwingConstants.CENTER);
        txtCantidadDisponible.setText(cantidadDisponible.toString());
        txtCantidadDisponible.setHorizontalAlignment(SwingConstants.CENTER);
   
    }
    
   
    public static void filtrarPorNumeroPuesto(JTextField txtBuscar, TableRowSorter trsFiltro){
       
        String cadena = (txtBuscar.getText()).toUpperCase();
        txtBuscar.setText(cadena);
        txtBuscar.repaint();
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(),ModelTablePuesto.NUMERO));
    
    }
   
    public static  void filtrarPorNombreSector(JTextField txtBusqueda, TableRowSorter trsFiltro){

        trsFiltro.setRowFilter(RowFilter.regexFilter("(?i)"+txtBusqueda.getText(), ModelTableSector.NOMBRE));
    }
  
   
   
    public static void filtrarContratoPorNumeroContrato(JTextField txtBusqueda, TableRowSorter trsFiltro){
       
        txtBusqueda.repaint();
        trsFiltro.setRowFilter(RowFilter.regexFilter("(?i)"+txtBusqueda.getText(), ModelTableContrato.NUMEROCONTRATO));
    }
   
    public static void filtrarClientesPorCuilCuit(JTextField txtCuilCuit, TableRowSorter trsFiltro){
        trsFiltro.setRowFilter(RowFilter.regexFilter("(?i)"+txtCuilCuit.getText(), ModelTableCliente.CUILCUIT));
    }
    
    public static void filtrarFacturasPorNumeroFactura(JTextField txtNumeroFactura, TableRowSorter trsFiltro){
        trsFiltro.setRowFilter(RowFilter.regexFilter("(?i)"+txtNumeroFactura.getText(), ModelTableFactura.NUMEROFACTURA));
    }
   
    public static void ObtenerDetallesDelPuesto(String sectorSeleccionado, String puestoSeleccionado, Mercado mercado) throws SectorInexistenteException, PuestoInexistenteException{
       
       
            Sector sectorEncontrado = mercado.buscarUnSector(sectorSeleccionado);
            Puesto puestoEncontrado =  sectorEncontrado.obtenerUnPuesto(Integer.parseInt(puestoSeleccionado));
           
           
            if(detalleDePuesto == null || detalleDePuesto.isClosed()){
                 
                detalleDePuesto = new DetalleDePuesto(puestoEncontrado);
                MenuPrincipal.PanelEscritorio.add(detalleDePuesto);

                Dimension desktopSize =  MenuPrincipal.PanelEscritorio.getSize();
                Dimension FrameSize = detalleDePuesto.getSize();
                detalleDePuesto.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);  
                detalleDePuesto.show();

            }else{
                JOptionPane.showMessageDialog(null, "La Ventana Se Encuentra Abierta");
            }
    }
  
    
    public static void obtenerDetalleDelContrato(Mercado mercado, Integer numeroContrato) throws ContratoInexistenteException{
        
        Contrato contratoEncontrado = mercado.buscarUnContrato(numeroContrato);
       
            if (detalleDeContrato == null || detalleDeContrato.isClosed()){

                detalleDeContrato = new DetalleDeContrato(contratoEncontrado);
                MenuPrincipal.PanelEscritorio.add(detalleDeContrato);

                Dimension desktopSize = MenuPrincipal.PanelEscritorio.getSize();
                Dimension FrameSize = detalleDeContrato.getSize();
                detalleDeContrato.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);  
                detalleDeContrato.show();
            }else{
                JOptionPane.showMessageDialog(null, "La Ventana Se Encuentra Abierta");
            }
       
    }
    
    
    
  
    
}
