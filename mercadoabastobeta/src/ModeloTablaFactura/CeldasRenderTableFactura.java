/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloTablaFactura;

import java.awt.Color;
import java.awt.Component;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Usuario
 */
public class CeldasRenderTableFactura extends DefaultTableCellRenderer{
        
    
   // private int FECHAVENCIMIENTO = 1;
    private String fechaVencimientoObtenida;
    private LocalDate fechaActual;
    private LocalDate fechaVencimiento;
    private String condicion;
    private Component componente;
    
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    
        //condicion = (String) table.getValueAt(row, ModelTableContrato.DISPONIBILIDAD);
        fechaVencimientoObtenida = (String) table.getValueAt(row, ModelTableFactura.FECHAVENCIMIENTO);
        fechaVencimiento = LocalDate.parse(fechaVencimientoObtenida, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        fechaActual  = LocalDate.now();
        
        if(fechaActual.isAfter(fechaVencimiento)){ // pregunta si la fecha actual se encuentra después de la fecha de vencimiento
            this.setBackground(new Color(  255, 102,102 )); //Color Rojo - RGB
        }else{
            //pregunta si la fecha de vencimiento tiene el mismo año y mes que en la fecha actual, si tiene años y fechas distintos,
            //quiere decir que la factura no está próxima a vencer
            if(fechaVencimiento.getYear() == fechaActual.getYear() && fechaVencimiento.getMonth().equals(fechaActual.getMonth()) ){
                //le resta una semana a la fecha de vencimiento, la cantidad de semanas restadas, es el intervalo de tiempo usado
                //para saber si la factura está por vencerse (cantidad de semanas restadas = cantidad de tiempo en el que se verifica
                //si la factura se está por vencer)
                LocalDate periodo = fechaVencimiento.minusWeeks(1);
                //pregunta si la fecha actual se encuentra antes del periodo, si se cumple la condicion, quiere decir que falta más
                //de una semana para que la factura se esté por vencer
                if(fechaActual.isBefore(periodo)){
                        this.setBackground(new Color( 102, 255, 102 )); //Color verde - RGB
                }
                //pregunta si la fecha actual está luego del periodo, si se cumple la condición, quiere decir que falta menos
                //de una semana que la factura se esté por vencer
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
    
      return  componente;
    }
    
    
    

}
