
package Fecha;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import mercadoabasto.exepciones.FechaInvalidaException;

/**
 *
 * @author Daniel Juarez
 */
public class FuncionFecha {
    
    
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
     
    public LocalDate getFecha(JDateChooser jdc) throws FechaInvalidaException{
        String fecha = null;
        LocalDate resultado = null;
        
        if(jdc.getDate()!= null){
            fecha= formato.format(jdc.getDate());
            resultado = LocalDate.parse(fecha);
        }
        
        if(resultado == null){
            throw new FechaInvalidaException();   
        }
        
        return resultado; 
    }
     
        
    public String diaDeLaSemana(){
        String diaDeLaSemana =null;
        String mes= null;
        LocalDate dia = LocalDate.now();
    
            if(dia.getDayOfWeek().equals(dia.getDayOfWeek().MONDAY)){
                diaDeLaSemana = "Lunes";
            }
            if(dia.getDayOfWeek().equals(dia.getDayOfWeek().TUESDAY)){
                diaDeLaSemana = "Martes";
            }
             if(dia.getDayOfWeek().equals(dia.getDayOfWeek().WEDNESDAY)){
                diaDeLaSemana = "Miércoles";
            }
             if(dia.getDayOfWeek().equals(dia.getDayOfWeek().THURSDAY)){
                diaDeLaSemana = "Jueves";
            }
            if(dia.getDayOfWeek().equals(dia.getDayOfWeek().FRIDAY)){
                diaDeLaSemana = "Viernes";
            }  
            if(dia.getDayOfWeek().equals(dia.getDayOfWeek().SATURDAY)){
                diaDeLaSemana = "Sabado";
            }
            if(dia.getDayOfWeek().equals(dia.getDayOfWeek().SUNDAY)){
                diaDeLaSemana = "Domingo";
            }
   
            if(dia.getMonth().equals(dia.getMonth().JANUARY)){
                mes ="Enero";
            }
             if(dia.getMonth().equals(dia.getMonth().FEBRUARY)){
                mes ="Febrero";
            }
             if(dia.getMonth().equals(dia.getMonth().MARCH)){
                mes ="Marzo";
            }
             if(dia.getMonth().equals(dia.getMonth().APRIL)){
                mes ="Abril";
            } 
             if(dia.getMonth().equals(dia.getMonth().MAY)){
                mes ="Mayo";
            }
            if(dia.getMonth().equals(dia.getMonth().JUNE)){
                mes ="Junio";
            } 
            if(dia.getMonth().equals(dia.getMonth().JULY)){
                mes ="Julio";
            }
            if(dia.getMonth().equals(dia.getMonth().AUGUST)){
                mes ="Agosto";
            }
            if(dia.getMonth().equals(dia.getMonth().SEPTEMBER)){
                mes="Septiembre";
            }
            if(dia.getMonth().equals(dia.getMonth().OCTOBER)){
                mes ="Octubre";
            }
            if(dia.getMonth().equals(dia.getMonth().NOVEMBER)){
                mes ="Noviembre";
            }
            if(dia.getMonth().equals(dia.getMonth().DECEMBER)){
                mes ="Diciembre";
            }
        return diaDeLaSemana +" "+dia.getDayOfYear()+ " de "+mes;
    }


    public String obtenerMes(LocalDate fecha){
    
        String mes = null;
    
    
            if(fecha.getMonth().equals(fecha.getMonth().JANUARY)){
                mes ="ENERO";
            }
             if(fecha.getMonth().equals(fecha.getMonth().FEBRUARY)){
                mes ="FEBRERO";
            }
             if(fecha.getMonth().equals(fecha.getMonth().MARCH)){
                mes ="MARZO";
            }
             if(fecha.getMonth().equals(fecha.getMonth().APRIL)){
                mes ="ABRIL";
            } 
             if(fecha.getMonth().equals(fecha.getMonth().MAY)){
                mes ="MAYO";
            }
            if(fecha.getMonth().equals(fecha.getMonth().JUNE)){
                mes ="JUNIO";
            } 
            if(fecha.getMonth().equals(fecha.getMonth().JULY)){
                mes ="JULIO";
            }
            if(fecha.getMonth().equals(fecha.getMonth().AUGUST)){
                mes ="AGOSTO";
            }
            if(fecha.getMonth().equals(fecha.getMonth().SEPTEMBER)){
                mes="SEPTIEMBRE";
            }
            if(fecha.getMonth().equals(fecha.getMonth().OCTOBER)){
                mes ="OCTUBRE";
            }
            if(fecha.getMonth().equals(fecha.getMonth().NOVEMBER)){
                mes ="NOVIEMBRE";
            }
            if(fecha.getMonth().equals(fecha.getMonth().DECEMBER)){
                mes ="DICIEMBRE";
            }
    
    
        return mes;
    }
    
}
