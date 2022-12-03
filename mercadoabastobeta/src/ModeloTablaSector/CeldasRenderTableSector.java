
package ModeloTablaSector;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Daniel Juarez
 */
public class CeldasRenderTableSector extends DefaultTableCellRenderer{
    
    
    private int DISPONIBILIDAD = 2;
    private String condicion;
    private Component componente; 
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        condicion = (String) table.getValueAt(row, DISPONIBILIDAD);
        
            if(condicion.equals("DISPONIBLE")){
                this.setBackground(new Color( 102, 255, 102 )); //Color verde - RGB
            }else{
                this.setBackground(new Color(  255, 102,102 )); //Color Rojo - RGB
            }
           
            this.setHorizontalAlignment(SwingConstants.CENTER);
            
       componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    
        if (isSelected) {
            componente.setBackground(Color.YELLOW);
        }
       
       
       return componente;
    }
    
}
