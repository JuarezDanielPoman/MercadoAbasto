/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloTablaPuesto;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Daniel Juarez
 */
public class CeldasRenderTablePuestoAlternativo extends DefaultTableCellRenderer{

    private Component comoponente; 

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        this.setBackground(new Color(153,204,255)); //Azul claro
        
        this.setHorizontalAlignment(SwingConstants.CENTER);
                
        comoponente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
       
        if(isSelected){
            this.setBackground(Color.YELLOW);
        }
     return comoponente;    
    }
    
    
    
    
}
