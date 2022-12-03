

package ModeloTablaContrato;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import mercadoabasto.mercado.Contrato;

/**
 *
 * @author Daniel Juarez
 */

public class ModelTableContrato extends  DefaultTableModel{
    
    public static int NUMEROCONTRATO = 0;
    private static int FECHAINI = 1;
    public static int FECHAFIN = 2;
    public static int DISPONIBILIDAD = 3;
    
    private String columnas[] = {"NRO DE CONTRATO","FECHA INIC.","FECHA VENC.","DISPONIBILIDAD"};  
    
    
    public ModelTableContrato(){
        
        super();
        this.setColumnIdentifiers(columnas);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        
        
         if(columnas.length == 2){
            return true;
        }else{
            return false;
        }
       
    }
    
    
    public void cargarDatosDelContrato(ArrayList<Contrato> contratos){
        
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Object fila [] = new Object[6];
        
        for (int i = 0; i < contratos.size(); i++) {
            
            fila[NUMEROCONTRATO] = contratos.get(i).getNumeroIdentificacionContrato();
            fila[FECHAINI] = contratos.get(i).getFechaInicioContrato().format(formatoFecha);
            fila[FECHAFIN] = contratos.get(i).getFechaFinContrato().format(formatoFecha);
            
            if(contratos.get(i).getEstadoContrato() == true){
                fila[DISPONIBILIDAD] ="SI";
            }else{
                  fila[DISPONIBILIDAD] ="NO";
                 }
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
