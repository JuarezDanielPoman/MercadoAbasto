
package ModeloTablaContrato;

import java.awt.Color;
import java.awt.Component;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Daniel Juarez
 */
public class CeldasRenderTableContrato extends  DefaultTableCellRenderer{
    
   
    private String fecha;
    private LocalDate fechaActual;
    private LocalDate fechaVencimiento;
    private String condicion;
    private Component componente;
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    
        condicion = (String) table.getValueAt(row, ModelTableContrato.DISPONIBILIDAD);
        fecha = (String) table.getValueAt(row, ModelTableContrato.FECHAFIN);
        
        fechaVencimiento = LocalDate.parse(fecha,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        fechaActual  = LocalDate.now();
        
        
        if(fechaActual.isAfter(fechaVencimiento) || condicion.equals("NO")){
            
            this.setBackground(new Color(  255, 102,102 )); //Color Rojo - RGB
            
        }else{
          
               if(fechaVencimiento.getYear() == fechaActual.getYear() && fechaVencimiento.getMonth().equals(fechaActual.getMonth()) ){
                   
                  LocalDate periodo = fechaVencimiento.minusWeeks(1);
                     
                    if(fechaActual.isBefore(periodo)){ 
                        
                         this.setBackground(new Color( 102, 255, 102 )); //Color verde - RGB
                        
                    }
                    if(fechaActual.isAfter(periodo)){
                       this.setBackground(Color.ORANGE);
                      
                    }
 
                }else{
                        this.setBackground(new Color( 102, 255, 102 )); //Color verde - RGB  
                     }       
             }
        
         
        this.setHorizontalAlignment(SwingConstants.CENTER); 
        
        componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
        
          if(isSelected){
            this.setBackground(Color.YELLOW);
          }
    
        return componente;
    }
    
    
    
}
