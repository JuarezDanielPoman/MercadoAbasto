
package ModeloTablaPuesto;


import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import mercadoabasto.exepciones.SectorInexistenteException;
import mercadoabasto.mercado.Mercado;
import mercadoabasto.mercado.Puesto;
import mercadoabasto.mercado.Sector;


public class CeldasRenderTablePuesto extends DefaultTableCellRenderer {

       private  Mercado mercado;
       private JComboBox combo;
       private ArrayList<Puesto> puestos;
       private Component componente; 
      
    
    public CeldasRenderTablePuesto(Mercado mercado, JComboBox combo){
        this.mercado = mercado;
        this.combo = combo;
    }
    // EL COMBO NO CONTINE LA INFORMACION SI NO EL MODELO
    
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
       
        //SE PINTA LAS FILAS SEGUN LA DISPONIBILIDAD
           String elementoSeleccionado = combo.getSelectedItem().toString();
           
           String estado = table.getValueAt(row, ModelTablePuesto.DISPONIBILIDAD).toString();
           
           if(estado == "DISPONIBLE"){
               this.setBackground(new Color( 102, 255, 102 )); //Color verde - RGB
           }
           if(estado == "NO DISPONIBLE"){
               this.setBackground(new Color(  255, 102,102 )); //Color Rojo - RGB
           }
           
          
        // SE ALINEAN LOS CAMPOS
        this.setHorizontalAlignment(SwingConstants.CENTER);
        
        // ALTO DE CELDAS  
        table.setRowHeight(20);
        
        // SE CONFIGURA LA FUENTE DE LAS CELDAS
        table.setFont(new java.awt.Font("Calibri",Font.BOLD,14));
        
        
        
        
        componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
        
          if(isSelected){
            this.setBackground(Color.YELLOW);
        }
     
        return  componente;
    }
 
    
    
    
    
    
    
    
    
    
}
