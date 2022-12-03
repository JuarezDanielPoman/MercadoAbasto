package conceptosCobro;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import mercadoabasto.clientes.Cliente;
import mercadoabasto.clientes.Cuil;
import mercadoabasto.clientes.NumeroTelefono;
import mercadoabasto.clientes.Quintero;
import mercadoabasto.conceptosCobro.*;
import mercadoabasto.exepciones.*;
import mercadoabasto.mercado.Contrato;
import mercadoabasto.mercado.Lectura;
import mercadoabasto.mercado.Medidor;
import mercadoabasto.mercado.Puesto;
import mercadoabasto.mercado.ResponsableAlquiler;
import mercadoabasto.mercado.Sector;

public class FactureroTest {

    private Factura factura,factura2;
    private Cliente cliente;
    private Puesto puesto, puesto2;
    private LocalDate fechaInicio, fechaFin;
    private NumeroTelefono numeroTelefono;
    private Cuil cuil;
    private BigDecimal dimensiones;
    private Medidor medidor,medidor2;
    private Sector sector;
    private ResponsableAlquiler responsable;
    private Facturero facturero;


    @Before
    public void setUpFacturero()
            throws NumeroTelefonoContieneMasDeUnSignoMasException, NumeroTelefonoExcesoDigitosException,
            NumeroTelefonoInvalidoException, NumeroTelefonoSignoMasEnUbicacionEquivocadaException,
            NumeroTelefonoCarenciaDigitosException, ClaveUnicaIdentificacionCarenciaDigitosException,
            ClaveUnicaIdentificacionClaveInvalidaException, ClaveUnicaIdentificacionContieneMasDeDosGuionesException,
            ClaveUnicaIdentificacionDigitosInvalidosException, ClaveUnicaIdentificacionExcesoDigitosException,
            ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException, MedidorOcupadoException {

        numeroTelefono = new NumeroTelefono("3834629551");
        cuil = new Cuil("20-40432472-2");
        cliente = new Quintero("daniel", numeroTelefono, "poman", cuil);

        dimensiones = new BigDecimal(20);
        medidor2 = new Medidor(2020);

        BigDecimal precioMetroCuadrado = new BigDecimal("3500");
        Integer porcentajeGeneral = 10; // 10%
        Integer porcentajeTecho = 20; // 20%
        Integer porcentajeCamara = 5; // 15%

        sector = new Sector("norte", 2, precioMetroCuadrado, porcentajeGeneral, porcentajeTecho, porcentajeCamara);

        puesto2 = new Puesto(2, false, true, true, true, dimensiones, medidor2, sector);

        fechaInicio = LocalDate.of(2020, 1, 10);
        fechaFin = LocalDate.of(2020, 1, 20);
        factura2 = new Factura(cliente, puesto2,2,fechaInicio, fechaFin);

        responsable = new ResponsableAlquiler("Braian", "Salavarria", cuil);
        
        
        medidor = new Medidor(2525);
        puesto = new Puesto(22, true, true, true, true, dimensiones, medidor, sector);
        factura = new Factura(cliente, puesto,1, fechaInicio, fechaFin);
        facturero = new Facturero();
    }

   

    @Test
        public void agregarFacturaAlFacturero() throws FacturaExistenteExeption, FacturaInexistenteExeption, FacturaYaEmitidaException {

            Factura facturaEncontrada;

            facturero.agregarFactura(factura);
           
            facturaEncontrada = facturero.buscarUnaFactura(factura.getNumeroFactura());

            assertEquals(facturaEncontrada, factura);

        }

    @Test
        public void obtenerLaCantidadDeFacturasEnElFacturero() throws FacturaExistenteExeption, FacturaYaEmitidaException {
            
            Integer valorEsperado = 2; 
            facturero.agregarFactura(factura);
            facturero.agregarFactura(factura2);

            assertEquals(valorEsperado,facturero.obtenerCantidadDeFacturas());
        }    

    @Test
    public void caltularRendicionMensual2()throws ConceptoYaAgregadoException, FacturaExistenteExeption, FacturaInexistenteExeption,
            PuestoOcupadoException, FacturaYaEmitidaException {

        LocalDate fechaInicioContrato = LocalDate.of(2020, 1, 1);
        LocalDate fechaFinContrato = LocalDate.of(2021, 1, 1);
        Concepto contrato1 = new Contrato(fechaInicioContrato, fechaFinContrato, responsable, cliente, puesto, 97);
        Concepto contrato2 = new Contrato(fechaInicioContrato, fechaFinContrato, responsable, cliente, puesto2, 98);
        
        BigDecimal consumo = new BigDecimal(500); // 500KW
        BigDecimal precioPorKW = new BigDecimal(750); // $750 por 1KW
        LocalDate periodoLectura = LocalDate.of(2020, 5, 25);
        Concepto lectura1 = new Lectura(periodoLectura, consumo, precioPorKW);
        Concepto lectura2 = new Lectura(periodoLectura, consumo, precioPorKW);
        
        factura.agregarConceptoACobrar(contrato1);
        factura.agregarConceptoACobrar(lectura1);
        factura2.agregarConceptoACobrar(contrato2);
        factura2.agregarConceptoACobrar(lectura2);

        facturero.agregarFactura(factura2);
        facturero.agregarFactura(factura);

        BigDecimal esperado = new BigDecimal("927870.00");

        LocalDate inicioDeEmicion = LocalDate.of(2020, 1, 1);
        LocalDate finDeEmicion = LocalDate.of(2020, 1, 30);
        BigDecimal actual = facturero.rendicionMensual(inicioDeEmicion, finDeEmicion);
       
        assertEquals(esperado, actual);
            
    }


    @Test
       public void ComprobarFacturasEnUnRango() throws FacturaExistenteExeption, FacturaInexistenteExeption, FacturaYaEmitidaException {

        
        ArrayList<Factura> resultado = new ArrayList<Factura>();
    
    
        facturero.agregarFactura(factura);
        facturero.agregarFactura(factura2);

        resultado = facturero.buscarUnRagoDeFacturas(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 5, 1));
    
        int cantidadDeFacturasEnElResutadoEsperado = 2;       
    
        assertEquals(cantidadDeFacturasEnElResutadoEsperado, resultado.size());
    }


      //-------------- Excepciones -------------    
      @Test (expected = FacturaExistenteExeption.class)
      public void agregarUnaFacturaQueExiste() throws FacturaExistenteExeption, FacturaYaEmitidaException {

          facturero.agregarFactura(factura);
          facturero.agregarFactura(factura);
      }
   
      @Test (expected = FacturaInexistenteExeption.class)
        public void buscarUnaFacturaInexistente() throws FacturaExistenteExeption, FacturaInexistenteExeption, FacturaYaEmitidaException {

            facturero.agregarFactura(factura);
            facturero.buscarUnaFactura(2222222); 

        }
 }
