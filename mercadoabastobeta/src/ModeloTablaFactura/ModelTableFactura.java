/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloTablaFactura;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import mercadoabasto.conceptosCobro.Factura;

/**
 *
 * @author Usuario
 */
public class ModelTableFactura extends DefaultTableModel{
    public static int NUMEROFACTURA = 0;
    public static int FECHAEMISION = 1;
    public static int FECHAVENCIMIENTO = 2;
    public static int IMPORTE = 3;
    
    private String columnas[]={"Nro. FACTURA", "EMISION", "VENCIMIENTO", "IMPORTE"};
    
    public ModelTableFactura (){
        super();
        setColumnIdentifiers(columnas);
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
         if(columnas.length == 3){
            return true;
        }else{
            return false;
        }
    }
    
    public void cargarDatosDeFacturas(ArrayList<Factura> facturas){
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Object fila[] = new Object[4];
        for (int i =0;i<facturas.size();i++) {
            fila[NUMEROFACTURA] = facturas.get(i).getNumeroFactura();
            fila[FECHAEMISION] = facturas.get(i).getFechaEmision().format(formatoFecha);
            fila[FECHAVENCIMIENTO] = facturas.get(i).getFechaEVencimientoFactura().format(formatoFecha);
            fila[IMPORTE] = facturas.get(i).importeTotalAPagar().toString();
            this.addRow(fila);
        }
    }
    
    public void limpiarTabla(){
       
       int filas = this.getRowCount();
       
       for (int i = 0; i < filas; i++) {
           
           this.removeRow(0);
       }
    } 
}
