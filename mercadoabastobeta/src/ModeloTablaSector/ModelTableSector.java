
package ModeloTablaSector;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import mercadoabasto.mercado.Sector;

/**
 *
 * @author Usuario
 */
public class ModelTableSector extends DefaultTableModel{
    
    public static Integer NOMBRE = 0;
    private static Integer LIMITEPUESTO = 1;
    private static Integer DISPONIBILIDAD = 2;
   
    private String columnas[]={"NOMBRE", "LIMITE DE PUESTOS","ESTADO"};
    
    public ModelTableSector(){
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
    
    public void cargarDatosDelSector(ArrayList<Sector> sectores){
        Object fila[] = new Object[3];
        for(int i=0; i <sectores.size();i++){
            fila[NOMBRE] = sectores.get(i).getNombreSector();
            fila[LIMITEPUESTO] = sectores.get(i).getLimitePuestos();
            if(sectores.get(i).getDisponibilidad() == true){
                fila[DISPONIBILIDAD] = "DISPONIBLE";
            }else{
                fila[DISPONIBILIDAD] = "NO DISPONIBLE";
            }
            this.addRow(fila);
        }
    }
    
    public void cargarDatoAlSector(ArrayList<Sector>sectores){
        Object fila[] = new Object[3];
        for(int i=0; i < sectores.size();i++){
            fila[NOMBRE] = sectores.get(i).getNombreSector();
            fila[LIMITEPUESTO]= sectores.get(i).getLimitePuestos();
            if(sectores.get(i).getDisponibilidad() == true){
                fila[DISPONIBILIDAD] = "SI";
            }else{
                fila[DISPONIBILIDAD] = "NO";
            }
        }
            this.addRow(fila);
    }
    
    public void limpiarTabla(){
        int filas = this.getRowCount();
        for (int i = 0; i < filas; i++) {
            this.removeRow(0);
        }
   } 
   
     
}
