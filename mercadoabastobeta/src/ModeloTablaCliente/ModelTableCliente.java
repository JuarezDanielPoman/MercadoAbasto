/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloTablaCliente;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import mercadoabasto.clientes.Cliente;
import mercadoabasto.clientes.Empresa;
import mercadoabasto.clientes.Quintero;

/**
 *
 * @author Usuario
 */
public class ModelTableCliente extends DefaultTableModel {
    
    public static int NOMBRE = 0;
    public static int CUILCUIT = 1;
    public static int NUMEROTELEFONO = 2;
    public static int TIPOCLIENTE = 3;
    private String columnas[] = {"NOMBRE","CUIL/CUIT","TELEFONO","CLIENTE TIPO"};
    
    public ModelTableCliente(){
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
    
    public void cargarDatosDeClientes(ArrayList<Cliente> clientes){
        Object fila[] = new Object[4];
        for(int i=0;i<clientes.size();i++){
            fila[NOMBRE]=clientes.get(i).getNombre();
            if(clientes.get(i) instanceof Quintero){
                Quintero clienteQuintero = (Quintero) clientes.get(i);
                fila[CUILCUIT] = clienteQuintero.getCuil().getNumeroClaveUnicaIdentificacion();
            }
            if(clientes.get(i) instanceof Empresa){
                Empresa clienteEmpresa = (Empresa) clientes.get(i);
                fila[CUILCUIT] = clienteEmpresa.getCuit().getNumeroClaveUnicaIdentificacion();
            }
            fila[NUMEROTELEFONO]=clientes.get(i).getNumeroTelefono().getNumeroTelefono();
            if(clientes.get(i) instanceof Quintero){
                fila[TIPOCLIENTE]="QUINTERO";
            }
            if(clientes.get(i) instanceof Empresa){
                fila[TIPOCLIENTE]="EMPRESA";
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
