/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloTablaPuesto;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import mercadoabasto.mercado.Puesto;

/**
 *
 * @author Usuario
 */
public class ModelTablePuestoAlternativa extends DefaultTableModel {
    public static int SECTOR = 0;
    public static int PUESTO = 1;
    
    private String columnas[]={"SECTOR","PUESTO"};
    
    public ModelTablePuestoAlternativa(){
        super();
        this.setColumnIdentifiers(columnas);
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        if(columnas.length == 1){
            return true;
        }else{
            return false;
        }  
    }
    
    public void cargarDatosDeClientes(ArrayList<Puesto> puestos){
        Object fila[] = new Object[2];
        for(int i=0;i<puestos.size();i++){
            fila[SECTOR]=puestos.get(i).getSector().getNombreSector();
            fila[PUESTO]=puestos.get(i).getNumeroPuesto();
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
