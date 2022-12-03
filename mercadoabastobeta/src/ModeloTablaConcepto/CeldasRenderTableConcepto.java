/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloTablaConcepto;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Daniel Juarez
 */
public class CeldasRenderTableConcepto extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        
        this.setBackground(new Color(255,204,153));
        this.setHorizontalAlignment(SwingConstants.CENTER);
       
        if(column == 0){
            this.setHorizontalAlignment(SwingConstants.LEFT);
        }
        if(column == 1){
            
            this.setHorizontalAlignment(SwingConstants.RIGHT);
        }
        
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
