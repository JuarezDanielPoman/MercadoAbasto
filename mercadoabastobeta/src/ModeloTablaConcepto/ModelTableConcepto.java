/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloTablaConcepto;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import mercadoabasto.conceptosCobro.*;
import mercadoabasto.mercado.Contrato;
import mercadoabasto.mercado.Lectura;
import mercadoabasto.mercado.Medidor;
import mercadoabasto.mercado.Puesto;

/**
 *
 * @author Usuario
 */
public class ModelTableConcepto extends DefaultTableModel{
    private static int DESCRIPCION = 0;
    private static int IMPORTE = 1;
    private String columnas[]={"DESCRIPCION","IMPORTE"};
    
    public ModelTableConcepto(){
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
    
    public void cargarDatosDeConceptos (ArrayList<Concepto> conceptos){
        Object fila[] = new Object[2];
        for(int i=0;i<conceptos.size();i++){
            if(conceptos.get(i) instanceof Contrato){
                Contrato contrato = (Contrato) conceptos.get(i);
                fila[DESCRIPCION] = "Puesto Nro "+contrato.getPuesto().getNumeroPuesto().toString()+" en Sector "+contrato.getPuesto().getSector().getNombreSector();
                fila[IMPORTE] = contrato.getImporte().toString();
            }
            if(conceptos.get(i) instanceof Lectura){
                Lectura lectura = (Lectura) conceptos.get(i);
                fila[DESCRIPCION] = "Consumo electrico: "+lectura.getConsumo();
                fila[IMPORTE] = lectura.getImporte().toString();
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
