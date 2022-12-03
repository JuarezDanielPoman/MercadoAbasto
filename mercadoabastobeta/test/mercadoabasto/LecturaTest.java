package mercadoabasto;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import mercadoabasto.mercado.Lectura;

public class LecturaTest {
    
    private Lectura lectura;
    private BigDecimal consumo;
    private BigDecimal precioPorKW;
    private LocalDate periodoLectura; 



    @Before
        public void setUpLectura(){

            consumo = new BigDecimal(500); // 500KW
            precioPorKW = new BigDecimal(750); // $750 por 1KW
            periodoLectura = LocalDate.of(2020, 5, 25);

            lectura = new Lectura(periodoLectura, consumo, precioPorKW);
        }


    @Test
        public void calcularElPrecioConsumoElectrico(){
            BigDecimal valorActual = new BigDecimal("0.00");
            BigDecimal valorEsperado = new BigDecimal("375000");
            
            valorActual= lectura.getImporte();

            assertEquals(valorEsperado, valorActual);
        }
}
