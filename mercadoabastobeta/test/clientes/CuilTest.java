package clientes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import mercadoabasto.clientes.Cuil;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionCarenciaDigitosException;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionClaveInvalidaException;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionContieneMasDeDosGuionesException;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionDigitosInvalidosException;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionExcesoDigitosException;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException;
import clientes.ClaveUnicaIdentificacionTest;
public class CuilTest {
      
    @Test
    public void crearClaveUnicaIdentificacionConGuion(){
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
        assertEquals("20407246811", cuil.getNumeroClaveUnicaIdentificacion());
    }

    @Test
    public void crearClaveUnicaIdentificacionSinGuion(){
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
    public void crearClaveUnicaIdentificacionConExcesoDigitos() throws ClaveUnicaIdentificacionCarenciaDigitosException, ClaveUnicaIdentificacionClaveInvalidaException, ClaveUnicaIdentificacionContieneMasDeDosGuionesException, ClaveUnicaIdentificacionDigitosInvalidosException, ClaveUnicaIdentificacionExcesoDigitosException, ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException{
        new Cuil("20-407246681-1");
    }    

    @Test (expected = ClaveUnicaIdentificacionCarenciaDigitosException.class)
    public void crearClaveUnicaIdentificacionConCarenciaDigitos() throws ClaveUnicaIdentificacionCarenciaDigitosException, ClaveUnicaIdentificacionClaveInvalidaException, ClaveUnicaIdentificacionContieneMasDeDosGuionesException, ClaveUnicaIdentificacionDigitosInvalidosException, ClaveUnicaIdentificacionExcesoDigitosException, ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException{
        new Cuil("20-407248-");
    }

    @Test (expected = ClaveUnicaIdentificacionDigitosInvalidosException.class)
    public void crearClaveUnicaIdentificacionConLetras() throws ClaveUnicaIdentificacionCarenciaDigitosException, ClaveUnicaIdentificacionClaveInvalidaException, ClaveUnicaIdentificacionContieneMasDeDosGuionesException, ClaveUnicaIdentificacionDigitosInvalidosException, ClaveUnicaIdentificacionExcesoDigitosException, ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException{
        new Cuil("23-09dj3894-4");
    }

    @Test (expected = ClaveUnicaIdentificacionDigitosInvalidosException.class)
    public void crearClaveUnicaIdentificacionConDigitosAleatorios() throws ClaveUnicaIdentificacionCarenciaDigitosException, ClaveUnicaIdentificacionClaveInvalidaException, ClaveUnicaIdentificacionContieneMasDeDosGuionesException, ClaveUnicaIdentificacionDigitosInvalidosException, ClaveUnicaIdentificacionExcesoDigitosException, ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException{
        new Cuil("-¨$&/($][*&");
    }

    @Test (expected = ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException.class)
    public void crearClaveUnicaIdentificacionConGuionesEnUbicacionesEquivocadas() throws ClaveUnicaIdentificacionCarenciaDigitosException, ClaveUnicaIdentificacionClaveInvalidaException, ClaveUnicaIdentificacionContieneMasDeDosGuionesException, ClaveUnicaIdentificacionDigitosInvalidosException, ClaveUnicaIdentificacionExcesoDigitosException, ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException{
        new Cuil("20-407246-811");
    }

    @Test (expected = ClaveUnicaIdentificacionClaveInvalidaException.class)
    public void crearClaveUnicaIdentificacionSoloNumerosYExcesoDigitos() throws ClaveUnicaIdentificacionCarenciaDigitosException, ClaveUnicaIdentificacionClaveInvalidaException, ClaveUnicaIdentificacionContieneMasDeDosGuionesException, ClaveUnicaIdentificacionDigitosInvalidosException, ClaveUnicaIdentificacionExcesoDigitosException, ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException{
        new Cuil("204072468111");
    }

    @Test
    public void obtenerDNIDesdeCuilConGuiones(){
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
        assertEquals("40724681", cuil.getDNI());
    }
    
    @Test
    public void obtenerDNIDesdeCuilSinGuiones(){
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
        assertEquals("40724681", cuil.getDNI());
    }
}