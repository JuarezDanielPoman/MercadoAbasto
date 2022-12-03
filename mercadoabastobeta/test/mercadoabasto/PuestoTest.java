package mercadoabasto;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;
import mercadoabasto.mercado.*;
import mercadoabasto.exepciones.LimitePuestosException;
import mercadoabasto.exepciones.MedidorOcupadoException;
import mercadoabasto.exepciones.PuestoExistenteException;

public class PuestoTest {

    private Sector sector;
    private Integer limitePuestos;
    private BigDecimal precioMetroCuadrado;
    private Integer porcentajeGeneral, porcentajeTecho, porcentajeCamara;
    private Puesto puesto;
    private Medidor medidor;
    private BigDecimal dimensionesPuesto;

    @Before
    public void setUpPuesto() {

        limitePuestos = 2;
        precioMetroCuadrado = new BigDecimal("3500");
        porcentajeGeneral = 10;
        porcentajeTecho = 20;
        porcentajeCamara = 5;

        sector = new Sector("norte", limitePuestos, precioMetroCuadrado, porcentajeGeneral, porcentajeTecho,porcentajeCamara);
        dimensionesPuesto = new BigDecimal(20);
        medidor = new Medidor(555);
    }

    @Test
    public void importeDelPuestoConTechoYCamaraFrigorifica()throws PuestoExistenteException, LimitePuestosException, MedidorOcupadoException {

        puesto = new Puesto(1, true, true, true, true, dimensionesPuesto, medidor, sector);
        BigDecimal valorEsperado = new BigDecimal(97020);

        sector.agregarPuesto(puesto);
      
        
        assertEquals(valorEsperado, puesto.precioDelPuesto());
    }

    @Test
    public void importeDelPuestoSinTechoYConCamaraFrigorifica() throws PuestoExistenteException, LimitePuestosException,MedidorOcupadoException {
        puesto = new Puesto(1, false, true, true, true, dimensionesPuesto, medidor, sector);
        BigDecimal valorEsperado = new BigDecimal(80850);
        sector.agregarPuesto(puesto);
        
        assertEquals(valorEsperado, puesto.precioDelPuesto());
    }

    @Test
    public void importeDelPuestoConTechoYSinCamaraFrigorifica() throws PuestoExistenteException, LimitePuestosException,MedidorOcupadoException {
        puesto = new Puesto(1, true, false, true, true, dimensionesPuesto, medidor, sector);
        BigDecimal valorEsperado = new BigDecimal(92400);
        sector.agregarPuesto(puesto);
        
        assertEquals(valorEsperado, puesto.precioDelPuesto());
    }

   @Test
    public void importeDelPuestoSinTechoYSinCamaraFrigorifica() throws PuestoExistenteException, LimitePuestosException,MedidorOcupadoException {
        puesto = new Puesto(1, false, false, true, true, dimensionesPuesto, medidor, sector);
        BigDecimal valorEsperado = new BigDecimal(77000);
        sector.agregarPuesto(puesto);
        
        assertEquals(valorEsperado,  puesto.precioDelPuesto());
    }
  
}
