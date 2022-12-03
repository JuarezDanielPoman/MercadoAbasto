/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadoabasto.exepciones;

/**
 *
 * @author usuario
 */
public class MedidorInexistenteException extends Exception{
    
    public MedidorInexistenteException(){
    super("EL MEDIDOR NO EXISTE");
    }
}
