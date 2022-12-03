package RelojThread;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 * Reloj Digital usando Hilos
 * Fecha: 5/12/20
 * Hora: 17:43
 * @author Braian
 */

public class RelojDigital extends Thread {

    private JLabel lblTime;
    private JLabel lblFecha;
    private JLabel lblAnio;
   
   
     public RelojDigital(JLabel lblTime, JLabel lblFecha){
            this.lblTime = lblTime;
            this.lblFecha=lblFecha;
            this.lblAnio = lblAnio;
    }
    
    
    public void obtenerHoraActual(){
       
       String hora,minuto,segundo;
       
       LocalTime time = LocalTime.now();
       
       if(time.getHour()<10){
           hora ="0"+time.getHour();
       }else{
           hora= ""+time.getHour();
       }
    
       if(time.getMinute()<10){
           minuto = "0"+time.getMinute();
       }else{
           minuto = ""+time.getMinute();
       }
       
       if(time.getSecond()<10){
           segundo = "0"+time.getSecond();
       }else{
           segundo = ""+time.getSecond();
       }
       
        lblTime.setText(hora + ":" + minuto + ":" + segundo);
    }
    
    
public String diaDeLaSemana(){
    String diaDeLaSemana =null;
    String mes= null;
    String anio = null;
    
    
    LocalDate dia = LocalDate.now();
    
            if(dia.getDayOfWeek().equals(dia.getDayOfWeek().MONDAY)){
                diaDeLaSemana = "Lunes";
            }
            if(dia.getDayOfWeek().equals(dia.getDayOfWeek().TUESDAY)){
                diaDeLaSemana = "Martes";
            }
             if(dia.getDayOfWeek().equals(dia.getDayOfWeek().WEDNESDAY)){
                diaDeLaSemana = "Miercoles";
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
            
           
            
             return diaDeLaSemana +" "+dia.getDayOfMonth()+ " de "+mes+" del "+dia.getYear();
}

    @Override
    public void run() {
       
        
        while(true){
          
            obtenerHoraActual();
            lblFecha.setText(diaDeLaSemana());
           
             
            try {
            
                sleep(1000);
            
            } catch (InterruptedException ex) {
                Logger.getLogger(RelojDigital.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }

        }

