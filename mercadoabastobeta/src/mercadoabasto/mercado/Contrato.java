package mercadoabasto.mercado;

import java.math.BigDecimal;
import java.time.LocalDate;
import mercadoabasto.exepciones.PuestoOcupadoException;
import mercadoabasto.clientes.*;
import mercadoabasto.conceptosCobro.Concepto;


public class Contrato implements Concepto{
    
    private LocalDate fechaInicioContrato; 
    private LocalDate fechaFinContrato; 
    private ResponsableAlquiler responsable;
    private Puesto puesto;
    private Cliente cliente; 
    private Integer numeroIdentificacionContrato;
    private boolean estadoContrato;
    private Lectura ultimaLecturaRegistrada;

   
  


    
     //------------Metodo Constructor ----------
    
    public Contrato(LocalDate fechaInicioContrato, LocalDate fechaFinContrato, ResponsableAlquiler responsable,Cliente cliente,Puesto puesto, Integer numeroIdentificacionContrato) throws PuestoOcupadoException{

        this.fechaInicioContrato=fechaInicioContrato;
	this.fechaFinContrato=fechaFinContrato;
	this.responsable=responsable;
        this.cliente=cliente;
        this.puesto=puesto;
        this.numeroIdentificacionContrato=numeroIdentificacionContrato;
        this.estadoContrato=true;
        this.ultimaLecturaRegistrada = puesto.getMedidor().obtenerUltimaLecturaRegistrada();
       
        if ( puesto.getDisponibilidad() == false){

            throw  new PuestoOcupadoException();
            
        }else{
            puesto.setDisponibilidad(false);
        } 
    
    }

     // ------------ Metodos Accesores ------------------

    public LocalDate getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public LocalDate getFechaFinContrato() {
        return fechaFinContrato;
    }

    public ResponsableAlquiler getResponsable() {
        return responsable;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Integer getNumeroIdentificacionContrato() {
        return numeroIdentificacionContrato;
    }

    public Boolean getEstadoContrato(){
        return estadoContrato; 
    }
    
    public Lectura getUltimaLecturaRegistrada() {
        return ultimaLecturaRegistrada;
    }

    public void setUltimaLecturaRegistrada(Lectura ultimaLecturaRegistrada) {
        this.ultimaLecturaRegistrada = ultimaLecturaRegistrada;
    }
    
 
//------------------- Cambiar estado de un contrato -------------

    public void bajaContrato(){

        this.estadoContrato = false;
        
    }

    @Override
    public BigDecimal getImporte() {

        BigDecimal precioDelPuesto= new BigDecimal("0");
        
        precioDelPuesto = puesto.precioDelPuesto();
        return precioDelPuesto;
    }

    @Override
    public String getCodigo() {
       
        return "CC".concat(Integer.toString(numeroIdentificacionContrato));
    }
        //CC --> CODIGO DE CONTRATO


    

    public void validarContrato(){
        
    }





}                   