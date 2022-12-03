package mercadoabasto.conceptosCobro;

import mercadoabasto.exepciones.FacturaExistenteExeption;
import mercadoabasto.exepciones.FacturaInexistenteExeption;
import mercadoabasto.ordenamiento.FacturaCamparatorFecha;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import mercadoabasto.clientes.Cliente;
import mercadoabasto.exepciones.FacturaYaEmitidaException;
import mercadoabasto.mercado.Puesto;
import Fecha.FuncionFecha;

public class Facturero {
    
    private ArrayList<Factura> facturas = new ArrayList<Factura>();
    private FuncionFecha funcion = new FuncionFecha();
    
    
    public void setFacturas(ArrayList<Factura> facturas){
        this.facturas=facturas;
    }

    public ArrayList<Factura> getFacturas(){
        return facturas;
    }

    public void agregarFactura(Factura factura) throws FacturaExistenteExeption, FacturaYaEmitidaException {

        for (Factura var : facturas) {

            if(var.getNumeroFactura().equals(factura.getNumeroFactura())){
                throw new FacturaExistenteExeption();
            }
            if(var.getCliente().equals(factura.getCliente())){
                if(var.getPuesto().equals(factura.getPuesto())){
                    if(var.getFechaEmision().getMonth().equals(factura.getFechaEmision().getMonth())){
                        throw new FacturaYaEmitidaException("LA FACTURA DEL MES DE "+funcion.obtenerMes(factura.getFechaEmision())+ "YA EXISTE");
                    }
                }
            }
        }
        facturas.add(factura);
    }

    public Factura buscarUnaFactura(Integer numeroFactura) throws FacturaInexistenteExeption {
        Factura facturaEnontrada = null; 

        for (Factura var : facturas) {

            if(var.getNumeroFactura().equals(numeroFactura)){
                facturaEnontrada = var;
                break;
            }
        }

        if(facturaEnontrada == null){
            throw new FacturaInexistenteExeption("La factura no existe, Numero de factura: "+numeroFactura);
        }

        return facturaEnontrada; 
    }

    public Integer obtenerCantidadDeFacturas(){
        return getFacturas().size(); 
    }

    public BigDecimal calcularImporteTotalDeFacturas(){
        
        BigDecimal total = new BigDecimal(0);
        
        for (Factura factura : facturas) {
            
            total = total.add(factura.importeTotalAPagar()).setScale(0, RoundingMode.HALF_UP);
        }

        return total;
    }

       
    public ArrayList<Factura> buscarUnRagoDeFacturas(LocalDate inicioDeEmicion, LocalDate finDeEmicion) throws FacturaInexistenteExeption {

        ArrayList<Factura>resultadoDeBusqueda = new ArrayList<Factura>();
            
        for (Factura var : facturas) {
               
                if(var.getFechaEmision().equals(inicioDeEmicion)){
                    resultadoDeBusqueda.add(var);
                }
                if( (var.getFechaEmision().isAfter(inicioDeEmicion)) && (var.getFechaEmision().isBefore(finDeEmicion)) ){
                    resultadoDeBusqueda.add(var);
                }
                if(var.getFechaEmision().equals(finDeEmicion)){
                    resultadoDeBusqueda.add(var);
                }    
        }
         
        if (resultadoDeBusqueda.size() == 0){
        
            throw new FacturaInexistenteExeption("No se Encontraron Facturas");
        }

             return resultadoDeBusqueda; 
    }

    public BigDecimal rendicionMensual(LocalDate inicioDeEmicion, LocalDate finDeEmicion) throws FacturaInexistenteExeption {
        
        BigDecimal rendicion = new BigDecimal("0.00");
        
        ArrayList<Factura> resultadoDeBusqueda = buscarUnRagoDeFacturas(inicioDeEmicion, finDeEmicion);
            
        
        for (Factura var : resultadoDeBusqueda ) {
            
            rendicion = rendicion.add(var.importeTotalAPagar());
        }
        return rendicion;
    }


    public void ordenarFacturasPorFechaDeVencimiento(){

        Collections.sort(facturas, new FacturaCamparatorFecha());
    }
    
    public Integer cantidadDeFacturasVencidas(ArrayList<Factura> facturas){
        LocalDate fechaActual = LocalDate.now();
        Integer cantidadDeFacturasVencidas = 0;
        for (Factura factura : facturas) {
            if(fechaActual.isAfter(factura.getFechaEVencimientoFactura())){
                cantidadDeFacturasVencidas++;
            }
        }
        return cantidadDeFacturasVencidas;
    }
    
    public Integer cantidadDeFacturasVencidas(){
        LocalDate fechaActual = LocalDate.now();
        Integer cantidadDeFacturasVencidas = 0;
        for (Factura factura : this.facturas) {
            if(fechaActual.isAfter(factura.getFechaEVencimientoFactura())){
                cantidadDeFacturasVencidas++;
            }
        }
        return cantidadDeFacturasVencidas;
    }
    
    public Integer cantidadDeFacturasVigentes(ArrayList<Factura> facturas){
        LocalDate fechaActual = LocalDate.now();
        Integer cantidadDeFacturasVigentes = 0;
        for (Factura factura : facturas) {
            LocalDate periodo = factura.getFechaEVencimientoFactura().minusWeeks(1);
            
            if(fechaActual.isBefore(periodo)){
                cantidadDeFacturasVigentes++;
            }
        }
        return cantidadDeFacturasVigentes;
    }
    
    public Integer cantidadDeFacturasVigentes(){
        LocalDate fechaActual = LocalDate.now();
        Integer cantidadDeFacturasVigentes = 0;
        for (Factura factura : this.facturas) {
            LocalDate periodo = factura.getFechaEVencimientoFactura().minusWeeks(1);
            
            if(fechaActual.isBefore(periodo)){
                cantidadDeFacturasVigentes++;
            }
        }
        return cantidadDeFacturasVigentes;
    }
    
    public Integer cantidadDeFacturasPorVencer(ArrayList<Factura> facturas){
        LocalDate fechaActual = LocalDate.now();
        Integer cantidadDeFacturasPorVencer = 0;
        for (Factura factura : facturas) {
            LocalDate periodo = factura.getFechaEVencimientoFactura().minusWeeks(1);
            
            if(fechaActual.isAfter(periodo)){
                cantidadDeFacturasPorVencer++;
            }
        }
        return cantidadDeFacturasPorVencer;
    }
    
    public Integer cantidadDeFacturasPorVencer(){
        LocalDate fechaActual = LocalDate.now();
        Integer cantidadDeFacturasPorVencer = 0;
        for (Factura factura : this.facturas) {
            LocalDate periodo = factura.getFechaEVencimientoFactura().minusWeeks(1);
            
            if(fechaActual.isAfter(periodo)){
                cantidadDeFacturasPorVencer++;
            }
        }
        return cantidadDeFacturasPorVencer;
    }
    
    public ArrayList<Factura> facturasDeUnCliente(Cliente cliente){
        ArrayList<Factura> facturas = new ArrayList<Factura>();
        for (Factura factura : this.facturas) {
            if(factura.getCliente().getNombre().equals(cliente.getNombre())){
                facturas.add(factura);
            }
        }
        return facturas;
    }
    
    public Integer cantidadDeFacturasDeUnCliente(Cliente cliente){
        Integer cantidadDeFacturas = 0;
        for (Factura factura : this.facturas) {
            if(factura.getCliente().getNombre().equals(cliente.getNombre())){
                cantidadDeFacturas++;
            }
        }
        return cantidadDeFacturas;
    }
}