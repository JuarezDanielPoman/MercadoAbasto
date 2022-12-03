/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloTablaCliente;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Usuario
 */
public class CeldasRenderTableCliente extends DefaultTableCellRenderer {
    
     private Component componente; 
     
    
    @Override
    public Component getTableCellRendererComponent (JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
       
        this.setBackground(new Color(153,204,255)); //Azul claro
        
        this.setHorizontalAlignment(SwingConstants.CENTER);
      
        componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
        
        if(isSelected){
            this.setBackground(Color.YELLOW);
        }
        return componente;
    }
    
}
