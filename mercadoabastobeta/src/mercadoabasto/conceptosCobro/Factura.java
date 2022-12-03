package mercadoabasto.conceptosCobro;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import mercadoabasto.clientes.*;
import mercadoabasto.mercado.*;
import mercadoabasto.exepciones.ConceptoYaAgregadoException;

public class Factura {

    private Integer numeroFactura;
    private Cliente cliente;
    private LocalDate fechaEmisionFactura;
    private LocalDate fechaVencimientoFactura;
    private Puesto puesto;
    private ArrayList<Concepto> conceptosACobrar = new ArrayList<Concepto>();


    public Factura(Cliente cliente, Puesto puesto,Integer numeroFactura, LocalDate fechaEmision,LocalDate fechaVencimiento) {

        this.setCliente(cliente);
        this.setPuesto(puesto);
        this.setFechaEmisionFactura(fechaEmision);
        this.setFechaVencimientoFactura(fechaVencimiento);
        this.setNumeroFactura(numeroFactura);

    }

    public void setNumeroFactura(Integer numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
    public Integer getNumeroFactura(){
        return numeroFactura;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public Cliente getCliente(){
        return cliente;
    }

    public void setFechaEmisionFactura(LocalDate fechaEmision){
        this.fechaEmisionFactura = fechaEmision;
    }
    public LocalDate getFechaEmision(){
        return fechaEmisionFactura;
    }

    public void setFechaVencimientoFactura(LocalDate fechaVencimiento){
        this.fechaVencimientoFactura = fechaVencimiento;
    }
    public LocalDate getFechaEVencimientoFactura(){
        return fechaVencimientoFactura;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }
    public Puesto getPuesto() {
        return puesto;
    }

    
    //------------ Metodos de la coleccion conceptos A Cobrar  -------------


    public ArrayList<Concepto> getConceptoACobrar(){
        return conceptosACobrar;
    }

    public void setConceptoACobrar(ArrayList<Concepto> conceptosACobrar){
        this.conceptosACobrar=conceptosACobrar;
    }
    
    public void agregarConceptoACobrar(Concepto concepto) throws ConceptoYaAgregadoException{
        if(concepto instanceof Contrato){
            for(Concepto var : conceptosACobrar){
                if(var instanceof Contrato){
                    Contrato contrato = (Contrato) var;
                    if(contrato.getCodigo().equals(concepto.getCodigo())){
                        throw new ConceptoYaAgregadoException();
                    }
                }
            }
        }
        if(concepto instanceof Lectura){
            for(Concepto var : conceptosACobrar){
                if (var instanceof Lectura){
                    Lectura lectura = (Lectura) var;
                    if(lectura.getCodigo().equals(concepto.getCodigo())){
                        throw new ConceptoYaAgregadoException();
                    }
                }
            }
        }
        this.conceptosACobrar.add(concepto);
    }



    public BigDecimal importeTotalAPagar(){

        BigDecimal total = new BigDecimal(0.00);

        for (Concepto concepto : conceptosACobrar) {
            total = total.add(concepto.getImporte()).setScale(0, RoundingMode.HALF_UP);
        }
        
        return total;
    }

    public Integer obtenerCantidadConceptos(){
        return conceptosACobrar.size();
    }

   



}
