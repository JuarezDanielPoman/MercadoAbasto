package clientes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import mercadoabasto.clientes.ClaveUnicaIdentificacion;
import mercadoabasto.clientes.Cuil;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionCarenciaDigitosException;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionClaveInvalidaException;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionContieneMasDeDosGuionesException;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionDigitosInvalidosException;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionExcesoDigitosException;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException;

public class ClaveUnicaIdentificacionTest {
 
    @Test
    public void verificarClaveUnicaIdentificacionConGuion(){
        Cuil cuil = null;
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
        System.out.println(cuil.getDNI());
        assertEquals("20407246811", cuil.getNumeroClaveUnicaIdentificacion());
    }

    @Test
    public void verificarClaveUnicaIdentificacionSinGuion(){
        Cuil cuil = null;
        try{
            cuil = new Cuil("20407246811");
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
        assertEquals("20407246811", cuil.getNumeroClaveUnicaIdentificacion());
    }

    @Test (expected = ClaveUnicaIdentificacionExcesoDigitosException.class)
    public void verificarClaveUnicaIdentificacionConExcesoDigitos() throws ClaveUnicaIdentificacionCarenciaDigitosException, ClaveUnicaIdentificacionClaveInvalidaException, ClaveUnicaIdentificacionContieneMasDeDosGuionesException, ClaveUnicaIdentificacionDigitosInvalidosException, ClaveUnicaIdentificacionExcesoDigitosException, ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException{
        ClaveUnicaIdentificacion.verificarNumeroClaveUnica("200-18410294-1");
    }

    @Test (expected = ClaveUnicaIdentificacionCarenciaDigitosException.class)
    public void verificarClaveUnicaIdentificaionConCarenciaDigitos() throws ClaveUnicaIdentificacionCarenciaDigitosException, ClaveUnicaIdentificacionClaveInvalidaException, ClaveUnicaIdentificacionContieneMasDeDosGuionesException, ClaveUnicaIdentificacionDigitosInvalidosException, ClaveUnicaIdentificacionExcesoDigitosException, ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException{
        ClaveUnicaIdentificacion.verificarNumeroClaveUnica("2-424618-1");
    }

    @Test (expected = ClaveUnicaIdentificacionDigitosInvalidosException.class)
    public void verificarClaveUnicaIdentificacionConLetras() throws ClaveUnicaIdentificacionCarenciaDigitosException, ClaveUnicaIdentificacionClaveInvalidaException, ClaveUnicaIdentificacionContieneMasDeDosGuionesException, ClaveUnicaIdentificacionDigitosInvalidosException, ClaveUnicaIdentificacionExcesoDigitosException, ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException{
        ClaveUnicaIdentificacion.verificarNumeroClaveUnica("23-12902j12-2");
    }

    @Test (expected = ClaveUnicaIdentificacionDigitosInvalidosException.class)
    public void verificarClaveUnicaIdentificacionConDigitosAleatorios() throws ClaveUnicaIdentificacionCarenciaDigitosException, ClaveUnicaIdentificacionClaveInvalidaException, ClaveUnicaIdentificacionContieneMasDeDosGuionesException, ClaveUnicaIdentificacionDigitosInvalidosException, ClaveUnicaIdentificacionExcesoDigitosException, ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException{
        ClaveUnicaIdentificacion.verificarNumeroClaveUnica("12-{}+´´+}");    
    }

    @Test (expected = ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException.class)
    public void verificarClaveUnicaIdentificacionConGuionesEnUbicacionesEquivocadas() throws ClaveUnicaIdentificacionCarenciaDigitosException, ClaveUnicaIdentificacionClaveInvalidaException, ClaveUnicaIdentificacionContieneMasDeDosGuionesException, ClaveUnicaIdentificacionDigitosInvalidosException, ClaveUnicaIdentificacionExcesoDigitosException, ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException{
        ClaveUnicaIdentificacion.verificarNumeroClaveUnica("142-144214-22");
    }

    @Test (expected = ClaveUnicaIdentificacionClaveInvalidaException.class)
    public void verificarClaveUnicaIdentificacionSoloNumerosYExcesoDigitos() throws ClaveUnicaIdentificacionCarenciaDigitosException, ClaveUnicaIdentificacionClaveInvalidaException, ClaveUnicaIdentificacionContieneMasDeDosGuionesException, ClaveUnicaIdentificacionDigitosInvalidosException, ClaveUnicaIdentificacionExcesoDigitosException, ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException{
        ClaveUnicaIdentificacion.verificarNumeroClaveUnica("1422144214222");
    }
}