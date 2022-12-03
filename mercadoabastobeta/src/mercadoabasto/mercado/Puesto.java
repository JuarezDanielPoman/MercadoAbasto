package mercadoabasto.mercado;

import java.math.BigDecimal;
import java.math.RoundingMode;

import mercadoabasto.exepciones.MedidorOcupadoException;


public class Puesto {

    private Integer numeroPuesto;
    private boolean techo;
    private boolean camaraRefrigerante;
    private BigDecimal dimensiones;
    private boolean banio;
    private boolean aguaPotable;
    private boolean disponibidad;
    private Medidor medidor;
    private Sector sector;


    public Puesto(Integer numeroPuesto, boolean techo, boolean camaraRefrigerante, boolean banio, boolean aguaPotable, BigDecimal dimensiones, 
            Medidor medidor, Sector sector) throws MedidorOcupadoException {

        this.setNumeroPuesto(numeroPuesto);
        this.setTecho(techo);
        this.setCamaraRefrigerante(camaraRefrigerante);
        this.setBanio(banio);
        this.setAguaPotable(aguaPotable);
        this.setDimensiones(dimensiones);
        this.medidor=medidor;
        this.sector=sector;
        this.setDisponibilidad(true);

        if(medidor.getDisponibilidad() == false){
           
            throw new MedidorOcupadoException();
        
        }else{
            medidor.setDisponibilidad(false);
        }
    }

   

    // ---------- Metodos Accesores -----------------------
    public Integer getNumeroPuesto() {
        return numeroPuesto;
    }
    public void setNumeroPuesto(Integer numeroPuesto) {
        this.numeroPuesto = numeroPuesto;
    }

    public boolean getTecho() {
        return techo;
    }
    public void setTecho(boolean techo) {
        this.techo = techo;
    }

    public boolean getCamaraRefrirante() {
        return camaraRefrigerante;
    }
    public void setCamaraRefrigerante(boolean camaraRefrigerante) {
        this.camaraRefrigerante = camaraRefrigerante;
    }

    public boolean getBanio() {
        return banio;
    }
    public void setBanio(boolean banio) {
        this.banio = banio;
    }

    public boolean getAguaPotable() {
        return aguaPotable;
    }
    public void setAguaPotable(boolean aguaPotable) {
        this.aguaPotable = aguaPotable;
    }

    public BigDecimal getDimensiones() {
        return dimensiones;
    }
    public void setDimensiones(BigDecimal dimenciones) {
        this.dimensiones = dimenciones;
    }

    public Medidor getMedidor() {
        return medidor;
    }
    
    public Sector getSector() {
        return sector;
    }

    public void setDisponibilidad(boolean disponibidad) {  
        this.disponibidad = disponibidad;
    }
    public boolean  getDisponibilidad(){
        return disponibidad;
    }
   

    public BigDecimal precioDelPuesto(){

        BigDecimal precioDelPuesto= new BigDecimal("0.00");
        BigDecimal precioDimencion = new BigDecimal("0.00");
 
        // Calcula PrecioDelPuesto en base al precio del metro cuadrado, dimension*precioDelMetroCuadrado
        precioDimencion = precioDimencion.add(dimensiones.multiply(sector.getPrecioMetroCuadrado()));
       
        // Calcula precio base con agua + baño, PrecioDelPuesto + PrecioDelPuesto*(PorcentajeGeneral/100)
        precioDelPuesto = precioDimencion.add(precioDimencion.multiply(new BigDecimal(sector.getPorcentajeGeneral()*0.01))).setScale(0, RoundingMode.HALF_UP);
        

        if(techo == true){
            precioDelPuesto = precioDelPuesto.add(precioDelPuesto.multiply(new BigDecimal(sector.getPorcentajeTecho()*0.01))).setScale(0, RoundingMode.HALF_UP);
         }

        if(camaraRefrigerante == true){
            precioDelPuesto = precioDelPuesto.add(precioDelPuesto.multiply(new BigDecimal(sector.getPorcentajeCamara()*0.01))).setScale(0, RoundingMode.HALF_UP);
        } 
       
        return precioDelPuesto.setScale(0, RoundingMode.HALF_UP);

    }


 
}