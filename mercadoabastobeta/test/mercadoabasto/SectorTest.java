package mercadoabasto;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import mercadoabasto.clientes.Cliente;
import mercadoabasto.clientes.NumeroTelefono;
import mercadoabasto.clientes.Quintero;
import mercadoabasto.clientes.Cuil;
import mercadoabasto.exepciones.*;
import mercadoabasto.mercado.*;

public class SectorTest {

  private Sector sector;
  private BigDecimal dimensiones;
  private Integer limitePuesto;
  private BigDecimal precioMetroCuadrado;
  private Puesto puesto1, puesto2;
  private Puesto puesto3;
  private Medidor medidor1, medidor2,medidor3;
  private LocalDate fechaInicioContrato,fechaFinContrato;
  private ResponsableAlquiler responsable;
  private Cliente cliente;
  private NumeroTelefono numeroTelefono;
  private Cuil cuil;

  @Before
  public void setUpSector() throws MedidorOcupadoException {

    limitePuesto = 2;
    precioMetroCuadrado = new BigDecimal("1500");
    Integer porcentajeGeneral = 10; //  10% 
    Integer porcentajeTecho = 20; // 20%
    Integer porcentajeCamara = 15; //15%
    fechaInicioContrato = LocalDate.of(2020, 1, 15);
    fechaFinContrato = LocalDate.of(2021, 1, 15);

    dimensiones = new BigDecimal("5");
    medidor1 = new Medidor(2020);
    medidor2 = new Medidor(2021);
    medidor3 = new Medidor(2022);

    sector = new Sector("NORTE", limitePuesto, precioMetroCuadrado, porcentajeGeneral, porcentajeTecho, porcentajeCamara);
    puesto1 = new Puesto(1, true, true, true, true, dimensiones, medidor1, sector);
    puesto2 = new Puesto(2, false, true, false, true, dimensiones, medidor2, sector);
    puesto3 = new Puesto(3, false, true, false, true, dimensiones, medidor3, sector);
    
    try{
      numeroTelefono = new NumeroTelefono("3834342404");
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
        cuil = new Cuil("20-40724681-1");
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

    cliente = new Quintero("braian", numeroTelefono, "av Alem 154", cuil);
    responsable = new ResponsableAlquiler("Daniel", "Juarez", cuil);
     

  }

  @Test
    public void agregarPuestoAlSector()throws PuestoExistenteException, LimitePuestosException, PuestoInexistenteException,
        MedidorOcupadoException {

      Puesto puestoEncontrado;

      sector.agregarPuesto(puesto1);

      puestoEncontrado = sector.obtenerUnPuesto(puesto1.getNumeroPuesto());

      assertEquals(puestoEncontrado, puesto1);

    }

  @Test
  public void obtenerCantidadPuesto() throws PuestoExistenteException, LimitePuestosException, MedidorOcupadoException {

    Integer valorEsperado = 2;

    sector.agregarPuesto(puesto1);
    sector.agregarPuesto(puesto2);

    assertEquals(valorEsperado, sector.obtenerCantidadDePuesto());
  }

  @Test
  public void modificarDisponibilidadDelPuesto()throws PuestoExistenteException, LimitePuestosException, PuestoInexistenteException,
      MedidorOcupadoException {

    Boolean esperado = false;
    Puesto puestoEncontrado;

    sector.agregarPuesto(puesto1);
    sector.mofidicarDisponibilidadDeUnPuesto(1, false);

    puestoEncontrado = sector.obtenerUnPuesto(1);

    assertEquals(esperado, puestoEncontrado.getDisponibilidad());

  }

  @Test
  public void obtenerCantidadPuestoDisponibles() throws PuestoExistenteException, LimitePuestosException, PuestosNoDisponiblesException, PuestoInexistenteException,
      MedidorOcupadoException {

          Integer cantidadEsperada = 1; 

          sector.agregarPuesto(puesto1);
          sector.agregarPuesto(puesto2);
          sector.mofidicarDisponibilidadDeUnPuesto(puesto1.getNumeroPuesto(), false);

          assertEquals(cantidadEsperada, sector.obtenerCantidadPuestosDisponibles());

        }


//------------------------------TEST DE EXEPCIONES DE PUESTOS----------------------------------

  @Test (expected = PuestoExistenteException.class)
        public void puestoExistenteExepcion() throws PuestoExistenteException, LimitePuestosException,
            MedidorOcupadoException {
          sector.agregarPuesto(puesto1);
          sector.agregarPuesto(puesto1);
        }

  @Test (expected = PuestoInexistenteException.class)
        public void PuestoInexistenteException() throws mercadoabasto.exepciones.PuestoInexistenteException {
          sector.obtenerUnPuesto(4);
        }

  @Test (expected = LimitePuestosException.class)
        public void LimiteDePuestosExeption() throws PuestoExistenteException, LimitePuestosException,
            MedidorOcupadoException {
          sector.agregarPuesto(puesto1);
          sector.agregarPuesto(puesto2);
          sector.agregarPuesto(puesto3);
        }

  @Test (expected = PuestosNoDisponiblesException.class)
        public void PuestosNoDisponiblesException() throws PuestoExistenteException, LimitePuestosException,mercadoabasto.exepciones.PuestoInexistenteException,
            mercadoabasto.exepciones.PuestosNoDisponiblesException, MedidorOcupadoException, PuestoOcupadoException {
       
        sector.agregarPuesto(puesto1);
        sector.agregarPuesto(puesto2);
        new Contrato (fechaInicioContrato, fechaFinContrato, responsable, cliente, puesto1, 1245);
        new Contrato (fechaInicioContrato, fechaFinContrato, responsable, cliente, puesto2, 12456);
        sector.obtenerCantidadPuestosDisponibles();        
        
        }









    
}