
package mercadoabasto.mercado;

import Fecha.FuncionFecha;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import mercadoabasto.exepciones.LecturaExistenteExeption;
import mercadoabasto.exepciones.LecturaInexistenteExeption;

public class Medidor {

    private Integer numeroMedidor;
    private Boolean disponibilidad;
    private ArrayList<Lectura> lecturas;
    private FuncionFecha funcion;
    private DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    
    // ------------------- Metodo Constructor -------------------

    public Medidor(Integer numeroMedidor) {

        this.numeroMedidor = numeroMedidor;
        this.setDisponibilidad(true);
        this.setLecturas(new ArrayList<Lectura>());
        funcion = new FuncionFecha();
    }

    // --------------- Metodos Accesores -------------------------

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Integer getNumeroMedidor() {
        return numeroMedidor;
    }

    
    

//---------------- METODOS DE LECTURA ----------------------  
   
    public ArrayList<Lectura> getLecturas() {
        return lecturas;
    }
    public void setLecturas(ArrayList<Lectura> lecturas) {
        this.lecturas = lecturas;
    }


    public void agregarLectura(Lectura lectura) throws LecturaExistenteExeption {

        for (Lectura var : lecturas) {
            
            if(var.getPeriodoLectura().getMonth().equals(lectura.getPeriodoLectura().getMonth())){
                
                throw new LecturaExistenteExeption("LA LECTURA DEL MES DE "+funcion.obtenerMes(lectura.getPeriodoLectura())+" YA EXISTE");
            }
        }
        
        lecturas.add(lectura);
    
    }


    public Lectura buscarUnaLectura(Integer mes, Integer anio) throws LecturaInexistenteExeption{

        Lectura lecturaEncontrada = null; 

        for (Lectura var : lecturas) {
            
            //if(var.getPeriodoLectura().getMonth().equals(periodoLectura.getMonth())){
            
                if(var.getPeriodoLectura().getMonthValue() == mes && var.getPeriodoLectura().getYear() == anio){
                lecturaEncontrada = var;
                break; 
    
            }
        }

        if(lecturaEncontrada == null){

            throw new LecturaInexistenteExeption("LA LECTURA NO EXISTE");
        }

        return lecturaEncontrada;
    }

   public Lectura obtenerUltimaLecturaRegistrada(){
      
       Lectura ultimaLectura = null;
       
       if(this.lecturas.size() ==0){
           
         
           LocalDate fechaInicial = LocalDate.now();
           fechaInicial.format(formatoFecha);
           
           ultimaLectura = new Lectura( fechaInicial, new BigDecimal(0.00),new BigDecimal (0.00));
       
        }else{
            
           int ultimaPosicion =  this.lecturas.size()-1;     
            ultimaLectura = this.lecturas.get(ultimaPosicion);
           
            }
        
             return ultimaLectura;
   }
    
   
    
    
    
    
    
}