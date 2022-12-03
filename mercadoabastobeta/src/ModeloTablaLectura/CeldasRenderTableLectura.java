
package ModeloTablaLectura;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author usuario
 */
public class CeldasRenderTableLectura extends DefaultTableCellRenderer{

    private String fecha;
    private Component componente; 
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
       
        //this.setBackground(new Color(153,204,255)); //Azul claro
       // this.setBackground(new Color(255,255,102)); //Amarillo claro
       this.setBackground(new Color(255,102,255));  
       this.setHorizontalAlignment(SwingConstants.CENTER);
        
        componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
        
        if(isSelected){
            this.setBackground(Color.YELLOW);
        }
    
        return componente;
    
    }
    
    
    
    
    
}
