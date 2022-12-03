package conceptosCobro;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;
import mercadoabasto.clientes.Cliente;
import mercadoabasto.clientes.Cuil;
import mercadoabasto.clientes.NumeroTelefono;
import mercadoabasto.clientes.Quintero;
import mercadoabasto.conceptosCobro.Concepto;
import mercadoabasto.conceptosCobro.Factura;
import mercadoabasto.exepciones.*;
import mercadoabasto.mercado.Contrato;
import mercadoabasto.mercado.Lectura;
import mercadoabasto.mercado.Medidor;
import mercadoabasto.mercado.Puesto;
import mercadoabasto.mercado.ResponsableAlquiler;
import mercadoabasto.mercado.Sector;

public class FacturaTest {

    private Factura factura;
    private Cliente cliente;
    private Puesto puesto;
    private LocalDate fechaInicio, fechaFin;
    private NumeroTelefono numeroTelefono;
    private Cuil cuil;
    private BigDecimal dimensiones;
    private Medidor medidor;
    private Sector sector;
    private ResponsableAlquiler responsable;

    @Before
    public void setUpFactura()
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
        medidor = new Medidor(2020);

        BigDecimal precioMetroCuadrado = new BigDecimal("3500");
        Integer porcentajeGeneral = 10; // 10%
        Integer porcentajeTecho = 20; // 20%
        Integer porcentajeCamara = 5; // 15%

        sector = new Sector("norte", 2, precioMetroCuadrado, porcentajeGeneral, porcentajeTecho, porcentajeCamara);

        puesto = new Puesto(1, true, true, true, true, dimensiones, medidor, sector);

        fechaInicio = LocalDate.of(2020, 1, 10);
        fechaFin = LocalDate.of(2020, 1, 20);
        factura = new Factura(cliente, puesto,1,fechaInicio, fechaFin);

        responsable = new ResponsableAlquiler("Braian", "Salavarria", cuil);

    }

    @Test
    public void agregarConceptosAlaFactura() throws ConceptoYaAgregadoException, PuestoOcupadoException {

                LocalDate fechaInicioContrato = LocalDate.of(2020, 1, 1);
                LocalDate fechaFinContrato = LocalDate.of(2021, 1, 1);
                Concepto contrato1 = new Contrato(fechaInicioContrato, fechaFinContrato, responsable, cliente, puesto, 97);

                
                BigDecimal consumo = new BigDecimal(500); // 500KW
                BigDecimal precioPorKW = new BigDecimal(750); // $750 por 1KW
                LocalDate periodoLectura = LocalDate.of(2020, 5, 25);
                Concepto lectura1 = new Lectura(periodoLectura, consumo, precioPorKW);
                
                
                factura.agregarConceptoACobrar(contrato1);
                factura.agregarConceptoACobrar(lectura1);

                
                Integer esperado = 2;
                Integer actual = factura.obtenerCantidadConceptos();
                assertEquals(esperado, actual);
            
    }

    @Test
        public void totalAPagarDeLaFactura() throws ConceptoYaAgregadoException, PuestoOcupadoException {

            LocalDate fechaInicioContrato = LocalDate.of(2020, 1, 1);
            LocalDate fechaFinContrato = LocalDate.of(2021, 1, 1);
            Concepto contrato1 = new Contrato(fechaInicioContrato, fechaFinContrato, responsable, cliente, puesto, 97);

            
            BigDecimal consumo = new BigDecimal(500); // 500KW
            BigDecimal precioPorKW = new BigDecimal(750); // $750 por 1KW
            LocalDate periodoLectura = LocalDate.of(2020, 5, 25);
            Concepto lectura1 = new Lectura(periodoLectura, consumo, precioPorKW);
            
            factura.agregarConceptoACobrar(contrato1);
            factura.agregarConceptoACobrar(lectura1);

            BigDecimal esperado = new BigDecimal(472020);
            BigDecimal actual = factura.importeTotalAPagar();


            assertEquals(esperado, actual);
        }
        
    @Test (expected = ConceptoYaAgregadoException.class)
        
        public void AgregarUnConceptoQueYaExisteEnLaFactura() throws ConceptoYaAgregadoException,PuestoOcupadoException {

            LocalDate fechaInicioContrato = LocalDate.of(2020, 1, 1);
            LocalDate fechaFinContrato = LocalDate.of(2021, 1, 1);
            Concepto contrato1 = new Contrato(fechaInicioContrato, fechaFinContrato, responsable, cliente, puesto, 97);


            factura.agregarConceptoACobrar(contrato1);
            factura.agregarConceptoACobrar(contrato1);
        }
  
}
