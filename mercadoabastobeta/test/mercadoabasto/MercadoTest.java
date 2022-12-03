package mercadoabasto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import mercadoabasto.exepciones.*;
import mercadoabasto.mercado.*;
import mercadoabasto.clientes.*;
import mercadoabasto.conceptosCobro.Facturero;


public class MercadoTest {

    private LocalTime horarioAbierto;
    private LocalTime horarioCerrado;
    private ResponsableAlquiler responsable;
    private Sector sector1, sector2, sector3;
    private Mercado mercado;
    private NumeroTelefono numeroTelefono1, numeroTelefono2, numeroTelefono3;
    private Cuil cuil1, cuil2, cuil3;
    private Contrato contrato,contrato2;
    private LocalDate fechaInicioContrato;
    private LocalDate fechaFinContrato;
    private Puesto puesto, puesto2;
    private Cliente cliente1, cliente2, cliente3;
    private Medidor medidor, medidor2;
    private BigDecimal dimenciones;
    private BigDecimal precioMetroCuadrado;
    private Facturero facturero;
     


    // ---------------------- TEST DE LAS COLECCIONES DE SECTORES
    // --------------------------------
    @Before
    public void setUpSector() {
        Integer limite = 3; 
        precioMetroCuadrado = new BigDecimal("1500"); // precio m2
        Integer porcentajeGeneral = 10;  //  10% 
        Integer porcentajeTecho = 20; // 20%
        Integer porcentajeCamara = 15;//15%
       

        responsable = new ResponsableAlquiler("Nelson", "Romero", cuil1);
        horarioAbierto = LocalTime.of(8, 20);
        horarioCerrado = LocalTime.of(21, 30);

        try{
            numeroTelefono1 = new NumeroTelefono("3834426451");
            numeroTelefono2 = new NumeroTelefono("3834281801");
            numeroTelefono3 = new NumeroTelefono("3834342404");
            } catch (NumeroTelefonoCarenciaDigitosException e){
                e.printStackTrace();
            } catch (NumeroTelefonoContieneMasDeUnSignoMasException e){
                e.printStackTrace();
            } catch (NumeroTelefonoExcesoDigitosException e){
                e.printStackTrace();
            } catch (NumeroTelefonoInvalidoException e){
                e.printStackTrace();
            } catch (NumeroTelefonoSignoMasEnUbicacionEquivocadaException e){
                e.printStackTrace();
            }

            try{
                cuil1 = new Cuil("20-40724681-1");
                cuil2 = new Cuil("20-40724682-1");
                cuil3 = new Cuil("20-40724683-1");
            } catch (ClaveUnicaIdentificacionCarenciaDigitosException e){
                e.printStackTrace();
            } catch (ClaveUnicaIdentificacionClaveInvalidaException e){
                e.printStackTrace();
            } catch (ClaveUnicaIdentificacionContieneMasDeDosGuionesException e){
                e.printStackTrace();
            } catch (ClaveUnicaIdentificacionDigitosInvalidosException e){
                e.printStackTrace();
            } catch (ClaveUnicaIdentificacionExcesoDigitosException e){
                e.printStackTrace();
            } catch (ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException e){
                e.printStackTrace();
            }

        mercado = new Mercado("CarefourPlus", "chacabuco 134",numeroTelefono1, responsable, horarioAbierto,horarioCerrado, limite);
        sector1 = new Sector("SUR", 2, precioMetroCuadrado, porcentajeGeneral, porcentajeTecho, porcentajeCamara);
        sector2 = new Sector("NORTE", 5, precioMetroCuadrado,porcentajeGeneral, porcentajeTecho, porcentajeCamara);
        sector3 = new Sector("OESTE", 6, precioMetroCuadrado, porcentajeGeneral, porcentajeTecho, porcentajeCamara);
        
    }

    @Test
    public void IniciarResgistroVacioDeSectoresDelMercado() {
        Integer valorEsperado = 0;
        assertEquals(valorEsperado, mercado.obtenerCantidadDeSectores());
    }

  @Test
    public void agregarUnSectorAlMercado() {
        Sector sectorEsperado = null;
        try {
            mercado.agregarSector(sector1);
            sectorEsperado = mercado.buscarUnSector("SUR");

        } catch (SectorExistenteException e) {
            e.printStackTrace();
        } catch (LimiteSectoresException e) {
            e.printStackTrace();
        } catch (SectorInexistenteException e) {
            e.printStackTrace();
        }
        assertEquals(sector1, sectorEsperado);
    }

     @Test
    public void modificarSectorDelMercado() {

        Sector sectorModificado = null;
        Integer valorEsperado = 8;
        try {
            mercado.agregarSector(sector1);
            mercado.modificarElLimiteDeSectores("SUR", 8);
            sectorModificado = mercado.buscarUnSector("SUR");

        } catch (SectorInexistenteException e) {
            e.printStackTrace();
        } catch (SectorExistenteException e) {
            e.printStackTrace();
        } catch (LimiteSectoresException e) {
            e.printStackTrace();
        }
        assertEquals(valorEsperado, sectorModificado.getLimitePuestos());
    }

    @Test
    public void buscarUnSectorDelMercado() {

        Sector sectorEncontrado = null;
        try {
            mercado.agregarSector(sector1);
            sectorEncontrado = mercado.buscarUnSector("SUR");

        } catch (SectorExistenteException e) {
            e.printStackTrace();
        } catch (LimiteSectoresException e) {
            e.printStackTrace();
        } catch (SectorInexistenteException e) {
            e.printStackTrace();
        }
        assertEquals("SUR", sectorEncontrado.getNombreSector());
    }

    // ------------------------------- TEST DE LAS EXCEPCIONES DE SECTORES --------------------
    @Test(expected = SectorExistenteException.class)
    public void sectorExistenteEnElMercado() throws SectorExistenteException, LimiteSectoresException {

        mercado.agregarSector(sector1);
        mercado.agregarSector(sector1);
    }

    @Test (expected = LimiteSectoresException.class)
        
        public void limiteSectoresException() throws SectorExistenteException, LimiteSectoresException {
           
            mercado.agregarSector(sector1);
            mercado.agregarSector(sector2);
            mercado.agregarSector(sector3);    
        }

        @Test (expected = SectorInexistenteException.class)
        public void serctorInexistenteException() throws SectorInexistenteException {
            mercado.buscarUnSector("XXX");
        }
 
    //--------------- TEST DE LOS CONTRATO DEL MERCADO --------------------------

     @Before
        public void setUpContrato() throws MedidorOcupadoException, PuestoOcupadoException {
            facturero = new Facturero();

            cliente1 = new Quintero("Marcelo", numeroTelefono1, "virgen del valle 134", cuil1);
            dimenciones = new BigDecimal("5"); // metros cuadrados
            medidor = new Medidor(4556);
            medidor2 = new Medidor(4557);
            puesto = new Puesto(4, true, true, true, true, dimenciones, medidor,sector1);
            puesto2 = new Puesto(3, true, true,true, true, dimenciones, medidor2, sector1);
            fechaInicioContrato = LocalDate.of(2020, 10, 15);
            fechaFinContrato = LocalDate.of(2023, 10, 15);
            responsable = new ResponsableAlquiler("Daniel", "Juarez", cuil1);
            contrato = new Contrato(fechaInicioContrato, fechaFinContrato, responsable, cliente1, puesto, 2020);
            contrato2 = new Contrato(fechaInicioContrato, fechaFinContrato, responsable, cliente1, puesto2, 2021);
            mercado = new Mercado("CarefourPlus", "chacabuco 134", numeroTelefono1, responsable, horarioAbierto,horarioCerrado, 1);

    }

    @Test
        public void agregarContratoAlMercado() throws ContratoExistenteException, ContratoInexistenteException {

            Contrato contratoEsperado = null;

            mercado.agregarContrato(contrato);
            contratoEsperado = mercado.buscarUnContrato(contrato.getNumeroIdentificacionContrato());

            assertEquals(contratoEsperado, contrato);
        } 
    @Test
        public void darAltaUnContrato() throws ContratoExistenteException, ContratoInexistenteException {
            
            Boolean contratoEsperado = true; 
            Boolean puestoEsperado = false; 
            Contrato contratoEncontrado;
            
            
            mercado.agregarContrato(contrato);

            contratoEncontrado = mercado.buscarUnContrato(contrato.getNumeroIdentificacionContrato());

            //Contrato dado de alta
            assertEquals(contratoEsperado, contratoEncontrado.getEstadoContrato());

            //Puesto ocupado
            assertEquals(puestoEsperado, contratoEncontrado.getPuesto().getDisponibilidad());
        }    

    @Test 
        public void darDeBajaUnContrato() throws ContratoExistenteException, ContratoInexistenteException,
                ContratoDadoDeBajaException {

            Boolean contratoEsperado = false;
            Boolean puestoEsperado = true;
            Contrato contratoEncontrado;  

            mercado.agregarContrato(contrato);
        
            mercado.modificarEstadoDelCotrato(contrato.getNumeroIdentificacionContrato());

            contratoEncontrado = mercado.buscarUnContrato(contrato.getNumeroIdentificacionContrato());

            // Dar de baja el contrato
            assertEquals(contratoEsperado, contratoEncontrado.getEstadoContrato());
            
            // El puesto asociado pasar a estar diponible para el alquiler
            assertEquals(puestoEsperado, contratoEncontrado.getPuesto().getDisponibilidad());
    
    }

    @Test
        public void obtenerLaCantidadDeContratosActivosEnElMercado() throws ContratoExistenteException {
            Integer valorEsperado = 2;

            mercado.agregarContrato(contrato);
            mercado.agregarContrato(contrato2);

            Integer valorActual = mercado.contratosVigentes();

            assertEquals(valorEsperado, valorActual);

        }

    @Test (expected = ContratoInexistenteException.class)
        public void buscarUnContratoInexistenteEnElMercado() throws ContratoExistenteException, ContratoInexistenteException {

            mercado.agregarContrato(contrato);
            
            mercado.buscarUnContrato(1111);
            
            
        }
    
        @Test (expected = ContratoExistenteException.class) 
            public void agregarUnContratoQueExisteEnElMercado() throws ContratoExistenteException {
                mercado.agregarContrato(contrato);
                mercado.agregarContrato(contrato);
           }

       

//---------------------- TEST RESPONSABLE DEL MERCADO --------------------

    @Test 
        public void modificarResponsableDelMercado(){
        
            horarioAbierto = LocalTime.of(8, 20);
            horarioCerrado = LocalTime.of(21, 30);

            ResponsableAlquiler responsable = new ResponsableAlquiler("Daniel", "Juarez", cuil1);

            Mercado mercadoAbasto = new Mercado("Los pepitos", "Av. Virgen del valle", numeroTelefono1, responsable, horarioAbierto, horarioCerrado, 4);

            ResponsableAlquiler nuevoResponsableAlquiler = new ResponsableAlquiler("Braian", "Salavarria", cuil1);

            mercadoAbasto.setResponsableAlquiler(nuevoResponsableAlquiler);

        
            assertEquals(cuil1.getDNI(), mercadoAbasto.getResponsableAlquiler().getCuil().getDNI());

        

        } 


////////////////////////////////Test de coleccion de clientes////////////////////////////////////
    
    @Test
    public void inicializacionDeListaDeClientes(){
        Integer cantidadClientes = 0;
        assertEquals(cantidadClientes, mercado.obtenerCantidadClientes());
    }

    @Test
    public void agregarUnClienteAlMercado(){
        Integer cantidadAgregada=1;
        cliente1 = new Quintero("Nelson", numeroTelefono1, "Comodoro Rivadavia 1468", cuil1);
        try{
            mercado.agregarCliente(cliente1);
        } catch (ClienteYaAgregadoException e){
            e.printStackTrace();
        }
        assertEquals(cantidadAgregada, mercado.obtenerCantidadClientes());
    }

    @Test
    public void agregarTresClientesAlMercado(){
        Integer cantidadAgregada=3;
        cliente1 = new Quintero("Nelson", numeroTelefono1, "Comodoro Rivadavia 1468", cuil1);
        cliente2 = new Quintero("Juan", numeroTelefono2, "Calle Sin Nombre 1512", cuil2);
        cliente3 = new Quintero("Pedro", numeroTelefono3, "Nieva y Castilla 1468", cuil3);
        try{
            mercado.agregarCliente(cliente1);
            mercado.agregarCliente(cliente2);
            mercado.agregarCliente(cliente3);
        } catch (ClienteYaAgregadoException e){
            e.printStackTrace();
        }
        assertEquals(cantidadAgregada, mercado.obtenerCantidadClientes());
    }

    @Test
    public void buscarUnCliente(){
        Cliente clienteEncontrado = null;
        cliente1 = new Quintero("Nelson", numeroTelefono1, "Comodoro Rivadavia 1468", cuil1);
        Cuil cuilBusqueda = null;
        try{
            cuilBusqueda = new Cuil("20-40724681-1");
        } catch (ClaveUnicaIdentificacionCarenciaDigitosException e){
            e.printStackTrace();
        } catch (ClaveUnicaIdentificacionClaveInvalidaException e){
            e.printStackTrace();
        } catch (ClaveUnicaIdentificacionContieneMasDeDosGuionesException e){
            e.printStackTrace();
        } catch (ClaveUnicaIdentificacionDigitosInvalidosException e){
            e.printStackTrace();
        } catch (ClaveUnicaIdentificacionExcesoDigitosException e){
            e.printStackTrace();
        } catch (ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException e){
            e.printStackTrace();
        }
        try{
            mercado.agregarCliente(cliente1);
        } catch (ClienteYaAgregadoException e){
            e.printStackTrace();
        }
        try{
            clienteEncontrado = mercado.buscarCliente(cuilBusqueda.getNumeroClaveUnicaIdentificacion());
        } catch (ClienteInexistenteException e){
            e.printStackTrace();
        }
        assertEquals(cliente1, clienteEncontrado);
    }

    @Test (expected = ClienteYaAgregadoException.class)
    public void excepcionAlAgregarElMismoCliente() throws ClienteYaAgregadoException{
        cliente1 = new Quintero("Nelson", numeroTelefono1, "Comodoro Rivadavia 1468", cuil1);
        mercado.agregarCliente(cliente1);
        mercado.agregarCliente(cliente1);
    }

    @Test (expected = ClienteInexistenteException.class)
    public void excepcionAlBuscarUnClienteInexistente() throws ClienteInexistenteException{
        cliente1 = new Quintero("Nelson", numeroTelefono1, "Comodoro Rivadavia 1468", cuil1);
        cliente3 = new Quintero("Pedro", numeroTelefono3, "Nieva y Castilla 1468", cuil3);
        Cuil cuilBusqueda = null;
        try{
            cuilBusqueda = new Cuil("20-40724682-1");
        } catch (ClaveUnicaIdentificacionCarenciaDigitosException e){
            e.printStackTrace();
        } catch (ClaveUnicaIdentificacionClaveInvalidaException e){
            e.printStackTrace();
        } catch (ClaveUnicaIdentificacionContieneMasDeDosGuionesException e){
            e.printStackTrace();
        } catch (ClaveUnicaIdentificacionDigitosInvalidosException e){
            e.printStackTrace();
        } catch (ClaveUnicaIdentificacionExcesoDigitosException e){
            e.printStackTrace();
        } catch (ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException e){
            e.printStackTrace();
        }
        try{
            mercado.agregarCliente(cliente1);
            mercado.agregarCliente(cliente3);
            mercado.buscarCliente(cuilBusqueda.getNumeroClaveUnicaIdentificacion());
        } catch (ClienteYaAgregadoException e){
            e.printStackTrace();
        }
    }
}