/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloTablaLectura;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import mercadoabasto.mercado.Lectura;

/**
 *
 * @author usuario
 */
public class ModelTableLectura extends DefaultTableModel{
    
    public static int PERIODOLECTURA = 0;
    private static int CONSUMO = 1;
    private static int IMPORTE = 2;
    private static int CODIGO = 3;
    
    private String[] columnas = {"FECHA","CONSUMO","IMPORTE","CODIGO"};
    
    
    public ModelTableLectura(){
        super();
        this.setColumnIdentifiers(columnas);
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
         if(columnas.length == 3){
            return true;
        }else{
            return false;
        }
    }
    
    public void cargarDatosLectura(ArrayList<Lectura> lecturas){
    
         Object fila[] = new Object[4];
         DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
         for (int i = 0; i <lecturas.size(); i++) {
            
             fila[PERIODOLECTURA] = lecturas.get(i).getPeriodoLectura().format(formatoFecha);
             fila[CONSUMO] = lecturas.get(i).getConsumo();
             fila[IMPORTE] = lecturas.get(i).getImporte();
             fila[CODIGO]= lecturas.get(i).getCodigo();
             
             this.addRow(fila);
        }
    }
    
    public void cargarDatosLectura(Lectura lectura){
        
     
        Object fila[] = new Object[4];
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        fila[PERIODOLECTURA] = lectura.getPeriodoLectura().format(formatoFecha);
        fila[CONSUMO] = lectura.getConsumo();
        fila[IMPORTE] = lectura.getImporte();
        fila[CODIGO]= lectura.getCodigo();

        this.addRow(fila);
    }
    
    public void limpiarTabla(){
       int filas = this.getRowCount();
       for (int i = 0; i < filas; i++) {
           this.removeRow(0);
       }
    } 
}
