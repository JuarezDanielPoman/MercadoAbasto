package mercadoabasto;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;
import mercadoabasto.exepciones.*;
import mercadoabasto.mercado.*;

public class MedidorTest {

    private Medidor medidor;
    private Lectura lectura1;
    private BigDecimal consumo1;
    private LocalDate periodoLectura;
    private BigDecimal precioPorKW;

    @Before

        public void setUpMedidor() {

            precioPorKW = new BigDecimal(500);
            consumo1 = new BigDecimal("10");
                
            periodoLectura = LocalDate.of(2020, 10, 1);
    
            lectura1 = new Lectura(periodoLectura, consumo1, precioPorKW);  

            medidor = new Medidor(2020);
        }

    @Test
         public void agregarLecturaAlMedidor() throws LecturaExistenteExeption, LecturaInexistenteExeption {
         
            Lectura lecturaEsperada = null;
        
            medidor.agregarLectura(lectura1);

            lecturaEsperada = medidor.buscarUnaLectura(lectura1.getPeriodoLectura().getMonthValue(), lectura1.getPeriodoLectura().getYear());

            assertEquals(lectura1, lecturaEsperada);

           
        }
 

    @Test (expected = LecturaExistenteExeption.class)
        public void agregarUnaLecturaQueExisteEnElMedidor() throws LecturaExistenteExeption {

            medidor.agregarLectura(lectura1);
            medidor.agregarLectura(lectura1);
        }
    

    

    @Test (expected = LecturaInexistenteExeption.class)   
        public void buscarUnaLecturaNoExistente() throws LecturaExistenteExeption, LecturaInexistenteExeption {
          
            LocalDate periodo = LocalDate.now(); 
            
            medidor.agregarLectura(lectura1);

            medidor.buscarUnaLectura(periodo.getMonthValue(), periodo.getYear());

        }




}
