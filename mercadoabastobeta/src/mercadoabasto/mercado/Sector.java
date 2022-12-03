package mercadoabasto.mercado;

import java.math.BigDecimal;
import java.util.ArrayList;
import mercadoabasto.exepciones.*;

public class Sector {

    private String nombreSector;
    private ArrayList<Puesto> puestos;
    private boolean disponibilidad;
    private Integer limitePuestos;
    private BigDecimal precioMetroCuadrado;
    private Integer porcentajeGeneral;
    private Integer porcentajeTecho;
    private Integer porcentajeCamara;



    public Sector(String nombreSector, Integer limitePuestos, BigDecimal precioMetroCuadrado, Integer porcentajeGeneral, Integer porcentajeTecho, Integer porcentajeCamara) {

        this.setNombreSector(nombreSector);
        this.setPuestos(new ArrayList<Puesto>());
        this.setLimitePuestos(limitePuestos);
        this.setPrecioMetroCuadrado(precioMetroCuadrado);
        this.setPorcentajeGeneral(porcentajeGeneral);
        this.setPorcentajeTecho(porcentajeTecho);
        this.setPorcentajeCamara(porcentajeCamara);

        this.setDisponibilidad(true);
    }

  

    public String getNombreSector() {
        return nombreSector;
    }
    public void setNombreSector(String nombreSector) {
        this.nombreSector = nombreSector.toUpperCase();
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    public Integer getLimitePuestos(){
        return limitePuestos;
    }
    public void setLimitePuestos(Integer limitePuestos) {
        this.limitePuestos = limitePuestos;
    }

    public void setPrecioMetroCuadrado(BigDecimal precioMetroCuadrado){
        this.precioMetroCuadrado = precioMetroCuadrado;
    }
    public BigDecimal getPrecioMetroCuadrado(){
        return precioMetroCuadrado;
    }
    

    public void setPorcentajeGeneral(Integer porcentajeGeneral) {
        this.porcentajeGeneral = porcentajeGeneral;
    }
    public Integer getPorcentajeGeneral() {
        return porcentajeGeneral;
    }
    
    public void setPorcentajeTecho(Integer porcentajeTecho) {
        this.porcentajeTecho = porcentajeTecho;
    }
    public Integer getPorcentajeTecho() {
        return porcentajeTecho;
    }

    public void setPorcentajeCamara(Integer porcentajeCamara) {
        this.porcentajeCamara = porcentajeCamara;
    }
    public Integer getPorcentajeCamara() {
        return porcentajeCamara;
    }


 //---------------- METODOS ASOCIADOS A LA COLECCION DE PUESTOS --------------------------   
    
    public ArrayList<Puesto> getPuestos() {
        return puestos;
    }
    public void setPuestos(ArrayList<Puesto> puestos) {
        this.puestos = puestos;
    }
    
    
    public void agregarPuesto(Puesto puesto) throws PuestoExistenteException, LimitePuestosException, MedidorOcupadoException {
        
        for (Puesto var : puestos) {

            if (var.getNumeroPuesto().equals(puesto.getNumeroPuesto())) {

                throw new PuestoExistenteException();    
            }
            
            if(var.getMedidor().getNumeroMedidor().equals(puesto.getMedidor().getNumeroMedidor())){
                
                throw  new MedidorOcupadoException();
            }

            if(obtenerCantidadDePuesto() + 1 > limitePuestos){
                
                this.disponibilidad = false;
                throw new LimitePuestosException();
            }
        }
        this.puestos.add(puesto);
    }
    

    public Puesto obtenerUnPuesto(Integer numeroPuesto) throws PuestoInexistenteException {
        
        Puesto puestoEncontrado = null;
        
        for(Puesto var : puestos) {

            if (var.getNumeroPuesto().equals(numeroPuesto)) {

                puestoEncontrado = var;
                break;
            }
        }

        if (puestoEncontrado == null) {

            throw new PuestoInexistenteException();
        }


        return puestoEncontrado;
    }


    public void mofidicarDisponibilidadDeUnPuesto(Integer numeroPuesto, Boolean disponibidad) throws PuestoInexistenteException {
        
        Puesto puestoEncontrado;
        
        puestoEncontrado = obtenerUnPuesto(numeroPuesto);
        puestoEncontrado.setDisponibilidad(disponibidad);
    }
    
    public void modificarCaracteristicaDePuesto(Puesto nuevoPuesto) throws PuestoInexistenteException{
        
        Puesto puestoEncontrado;
            
        puestoEncontrado = obtenerUnPuesto(nuevoPuesto.getNumeroPuesto());
        puestos.remove(puestoEncontrado);
        puestos.add(nuevoPuesto);
        
    }

    public Integer obtenerCantidadPuestosDisponibles() throws PuestosNoDisponiblesException {
    
        Integer puestoDisponibles = 0;
           
            for(Puesto var : puestos) {
                
                if(var.getDisponibilidad() == true){
                    
                    puestoDisponibles = puestoDisponibles +1;
                }
            }

            if(puestoDisponibles == 0){

                throw new PuestosNoDisponiblesException();
            } 


        return puestoDisponibles;
    }

    
    public Integer obtenerCantidadDePuesto(){

        Integer cantidadPuesto;

        cantidadPuesto = getPuestos().size();

        return cantidadPuesto;
   }

}