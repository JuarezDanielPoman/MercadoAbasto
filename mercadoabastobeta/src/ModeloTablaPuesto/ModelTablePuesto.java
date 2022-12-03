
package ModeloTablaPuesto;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import mercadoabasto.mercado.Puesto;

/**
 *
 * @author Braian
 */
public class ModelTablePuesto extends DefaultTableModel{
 
      
    public static int NUMERO = 0;
    public static int DISPONIBILIDAD =1;
    private String columnas[]={"NUMERO","ESTADO"};
    
    
    public ModelTablePuesto(){
        super();
        this.setColumnIdentifiers(columnas);
        
    }
    
    
     @Override
    public boolean isCellEditable(int row, int column) {
        
        if (columnas.length == 1){
            return true;
        }else{
            return false;
        }
    }
  
    
public void cargarPuestos(ArrayList<Puesto>puestos){
    
     Object fila[] = new Object[2];
        
        for(int i=0; i < puestos.size();i++){
           
            fila[NUMERO] = puestos.get(i).getNumeroPuesto();
            
            if(puestos.get(i).getDisponibilidad() == true){
                fila[DISPONIBILIDAD] = "DISPONIBLE";
            }else{
                if(puestos.get(i).getDisponibilidad() == false){
                    fila[DISPONIBILIDAD] = "NO DISPONIBLE";
                }
            }   
            this.addRow(fila);   
        }
            
}


   public void LimpiarTabla(){
       
    int filas = this.getRowCount();
       
       for (int i =0; i<filas ;i++){
           
           this.removeRow(0);
       }
   }





































}
