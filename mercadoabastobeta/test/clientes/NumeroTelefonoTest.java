package clientes;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import mercadoabasto.clientes.NumeroTelefono;
import mercadoabasto.exepciones.NumeroTelefonoContieneMasDeUnSignoMasException;
import mercadoabasto.exepciones.NumeroTelefonoExcesoDigitosException;
import mercadoabasto.exepciones.NumeroTelefonoInvalidoException;
import mercadoabasto.exepciones.NumeroTelefonoSignoMasEnUbicacionEquivocadaException;
import mercadoabasto.exepciones.NumeroTelefonoCarenciaDigitosException;

public class NumeroTelefonoTest {

/////////////////////////////////////////////////////Tests del metodo estático verificarNumeroTelefono

//___________________________________________________Sin excepciones

    @Test
    public void verificarNumeroDeTelefonoSoloNumeros(){
        NumeroTelefono numeroTelefono=null;
        try {
            numeroTelefono = new NumeroTelefono("3834977874");
        } catch (NumeroTelefonoContieneMasDeUnSignoMasException e){
            e.printStackTrace();
        } catch (NumeroTelefonoExcesoDigitosException e){
            e.printStackTrace();
        } catch (NumeroTelefonoInvalidoException e){
            e.printStackTrace();
        } catch (NumeroTelefonoSignoMasEnUbicacionEquivocadaException e){
            e.printStackTrace();
        } catch (NumeroTelefonoCarenciaDigitosException e){
            e.printStackTrace();
        }
        assertEquals("3834977874", numeroTelefono.getNumeroTelefono());
    }

    @Test
    public void verificarNumeroDeTelefonoConSignoMasAlPrincipio(){
        NumeroTelefono numeroTelefono = null;
        try{
            numeroTelefono = new NumeroTelefono("+543834629551");
        } catch (NumeroTelefonoContieneMasDeUnSignoMasException e){
            e.printStackTrace();
        } catch (NumeroTelefonoExcesoDigitosException e){
            e.printStackTrace();
        } catch (NumeroTelefonoInvalidoException e){
            e.printStackTrace();
        } catch (NumeroTelefonoSignoMasEnUbicacionEquivocadaException e){
            e.printStackTrace();
        } catch (NumeroTelefonoCarenciaDigitosException e){
            e.printStackTrace();
        }
        assertEquals("+543834629551", numeroTelefono.getNumeroTelefono());
    }

//___________________________________________________Con NumeroTelefonoExcesoDigitosException

    @Test (expected = NumeroTelefonoExcesoDigitosException.class)
    public void verificarNumeroDeTelefonoConExcesoDeNumeros() throws NumeroTelefonoExcesoDigitosException, NumeroTelefonoContieneMasDeUnSignoMasException, NumeroTelefonoInvalidoException, NumeroTelefonoSignoMasEnUbicacionEquivocadaException, NumeroTelefonoCarenciaDigitosException{
        NumeroTelefono.verificarNumeroTelefono("8983497787410979138742");
    }
    
//___________________________________________________Con NumeroTelefonoSignoMasEnUbicacionEquivocadaException

    @Test (expected = NumeroTelefonoSignoMasEnUbicacionEquivocadaException.class)
    public void verificarNumeroDeTelefonoConSignoMasEnOtraUbicacion() throws NumeroTelefonoExcesoDigitosException, NumeroTelefonoContieneMasDeUnSignoMasException, NumeroTelefonoInvalidoException, NumeroTelefonoSignoMasEnUbicacionEquivocadaException, NumeroTelefonoCarenciaDigitosException{
        NumeroTelefono.verificarNumeroTelefono("54383+4629551");
    }

//___________________________________________________Con NumeroTelefonoContieneMasDeUnSignoMasException

    @Test (expected = NumeroTelefonoContieneMasDeUnSignoMasException.class)
    public void verificarNumeroDeTelefonoConMasDeUnSignoMas() throws NumeroTelefonoExcesoDigitosException, NumeroTelefonoContieneMasDeUnSignoMasException, NumeroTelefonoInvalidoException, NumeroTelefonoSignoMasEnUbicacionEquivocadaException, NumeroTelefonoCarenciaDigitosException{
        NumeroTelefono.verificarNumeroTelefono("++543834629551");
    }

//___________________________________________________Con NumeroTelefonoInvalidoException

    @Test (expected = NumeroTelefonoInvalidoException.class)
    public void verificarNumeroDeTelefonoConNumeral() throws NumeroTelefonoExcesoDigitosException, NumeroTelefonoContieneMasDeUnSignoMasException, NumeroTelefonoInvalidoException, NumeroTelefonoSignoMasEnUbicacionEquivocadaException, NumeroTelefonoCarenciaDigitosException{
        NumeroTelefono.verificarNumeroTelefono("#08007882");
    }

    @Test (expected = NumeroTelefonoInvalidoException.class)
    public void verificarNumeroDeTelefonoConAsterisco() throws NumeroTelefonoExcesoDigitosException, NumeroTelefonoContieneMasDeUnSignoMasException, NumeroTelefonoInvalidoException, NumeroTelefonoSignoMasEnUbicacionEquivocadaException, NumeroTelefonoCarenciaDigitosException{
        NumeroTelefono.verificarNumeroTelefono("*0192864728");
    }

    @Test (expected = NumeroTelefonoInvalidoException.class)
    public void verificarSiIngresaronLetrasEnLugarDeNumeroTelefono() throws NumeroTelefonoExcesoDigitosException, NumeroTelefonoContieneMasDeUnSignoMasException, NumeroTelefonoInvalidoException, NumeroTelefonoSignoMasEnUbicacionEquivocadaException, NumeroTelefonoCarenciaDigitosException{
        NumeroTelefono.verificarNumeroTelefono("UnaWachaPiola");
    }

    @Test (expected = NumeroTelefonoInvalidoException.class)
    public void verificarSiIngresaronOtrosCaracteresEnNumeroTelefono() throws NumeroTelefonoExcesoDigitosException, NumeroTelefonoContieneMasDeUnSignoMasException, NumeroTelefonoInvalidoException, NumeroTelefonoSignoMasEnUbicacionEquivocadaException, NumeroTelefonoCarenciaDigitosException{
        NumeroTelefono.verificarNumeroTelefono("289+´{prñ}}||");
    }

//___________________________________________________Con NumeroTelefonoCarenciaDigitosException

    @Test (expected = NumeroTelefonoCarenciaDigitosException.class)
    public void verificarNumeroDeTelefonoConCarenciaDeNumeros() throws NumeroTelefonoCarenciaDigitosException, NumeroTelefonoContieneMasDeUnSignoMasException, NumeroTelefonoExcesoDigitosException, NumeroTelefonoInvalidoException, NumeroTelefonoSignoMasEnUbicacionEquivocadaException{
        NumeroTelefono.verificarNumeroTelefono("29832");
    }
    
/////////////////////////////////////////////////////Tests del constructor

//___________________________________________________Sin excepciones

    @Test
    public void crearNumeroTelefonoSoloNumeros(){
        String numeroTelefono = new String("3834977874");
        NumeroTelefono telefono = null;
        try{
            telefono = new NumeroTelefono(numeroTelefono);
        } catch (NumeroTelefonoContieneMasDeUnSignoMasException e){
            e.printStackTrace();
        } catch (NumeroTelefonoExcesoDigitosException e){
            e.printStackTrace();
        } catch (NumeroTelefonoInvalidoException e){
            e.printStackTrace();
        } catch (NumeroTelefonoSignoMasEnUbicacionEquivocadaException e){
            e.printStackTrace();
        } catch (NumeroTelefonoCarenciaDigitosException e){
            e.printStackTrace();
        }
        assertEquals("3834977874", telefono.getNumeroTelefono());
    }

    @Test
    public void crearNumeroTelefonoConSignoMas(){
        String numeroTelefono = new String("+543834629551");
        NumeroTelefono telefono = null;
        try{
            telefono = new NumeroTelefono(numeroTelefono);
        } catch (NumeroTelefonoContieneMasDeUnSignoMasException e){
            e.printStackTrace();
        } catch (NumeroTelefonoExcesoDigitosException e){
            e.printStackTrace();
        } catch (NumeroTelefonoInvalidoException e){
            e.printStackTrace();
        } catch (NumeroTelefonoSignoMasEnUbicacionEquivocadaException e){
            e.printStackTrace();
        } catch (NumeroTelefonoCarenciaDigitosException e){
            e.printStackTrace();
        }
        assertEquals("+543834629551", telefono.getNumeroTelefono());
    }

//___________________________________________________Con NumeroTelefonoExcesoDigitosException

    @Test (expected = NumeroTelefonoExcesoDigitosException.class)
    public void CrearNumeroTelefonoConExcesoDeDigitos() throws NumeroTelefonoExcesoDigitosException, NumeroTelefonoContieneMasDeUnSignoMasException, NumeroTelefonoInvalidoException, NumeroTelefonoSignoMasEnUbicacionEquivocadaException, NumeroTelefonoCarenciaDigitosException{
        String numeroTelefono = new String("3834909197412342177874");
        new NumeroTelefono(numeroTelefono);
    }

//___________________________________________________Con NumeroTelefonoSignoMasEnUbicacionEquivocadaException

    @Test (expected = NumeroTelefonoSignoMasEnUbicacionEquivocadaException.class)
    public void CrearNumeroTelefonoConUnSignoMasEnOtraUbicacion() throws NumeroTelefonoExcesoDigitosException, NumeroTelefonoContieneMasDeUnSignoMasException, NumeroTelefonoInvalidoException, NumeroTelefonoSignoMasEnUbicacionEquivocadaException, NumeroTelefonoCarenciaDigitosException{
        String numeroTelefono = new String("543834+629551");
        new NumeroTelefono(numeroTelefono);
    }

//___________________________________________________Con NumeroTelefonoContieneMasDeUnSignoMasException

    @Test (expected = NumeroTelefonoContieneMasDeUnSignoMasException.class)
    public void CrearNumeroTelefonoConMasDeUnSignoMas() throws NumeroTelefonoExcesoDigitosException, NumeroTelefonoContieneMasDeUnSignoMasException, NumeroTelefonoInvalidoException, NumeroTelefonoSignoMasEnUbicacionEquivocadaException, NumeroTelefonoCarenciaDigitosException{
        String numeroTelefono = new String("++543834629551");
        new NumeroTelefono(numeroTelefono);
    }

//___________________________________________________Con NumeroTelefonoInvalidoException

    @Test (expected = NumeroTelefonoInvalidoException.class)
    public void CrearNumeroTelefonoConUnNumeral() throws NumeroTelefonoExcesoDigitosException, NumeroTelefonoContieneMasDeUnSignoMasException, NumeroTelefonoInvalidoException, NumeroTelefonoSignoMasEnUbicacionEquivocadaException, NumeroTelefonoCarenciaDigitosException{
        String numeroTelefono = new String("#08007882");
        new NumeroTelefono(numeroTelefono);
    }

    @Test (expected = NumeroTelefonoInvalidoException.class)
    public void CrearNumeroTelefonoConAsterisco() throws NumeroTelefonoExcesoDigitosException, NumeroTelefonoContieneMasDeUnSignoMasException, NumeroTelefonoInvalidoException, NumeroTelefonoSignoMasEnUbicacionEquivocadaException, NumeroTelefonoCarenciaDigitosException{
        String numeroTelefono = new String("*0192864728");
        new NumeroTelefono(numeroTelefono);
    }

    @Test (expected = NumeroTelefonoInvalidoException.class)
    public void CrearNumeroTelefonoConLetras() throws NumeroTelefonoExcesoDigitosException, NumeroTelefonoContieneMasDeUnSignoMasException, NumeroTelefonoInvalidoException, NumeroTelefonoSignoMasEnUbicacionEquivocadaException, NumeroTelefonoCarenciaDigitosException{
        String numeroTelefono = new String("*UnaWachaPiola");
        new NumeroTelefono(numeroTelefono);
    }

    @Test (expected = NumeroTelefonoInvalidoException.class)
    public void CrearNumeroTelefonoConOtrosCaracteres() throws NumeroTelefonoExcesoDigitosException, NumeroTelefonoContieneMasDeUnSignoMasException, NumeroTelefonoInvalidoException, NumeroTelefonoSignoMasEnUbicacionEquivocadaException, NumeroTelefonoCarenciaDigitosException, NumeroTelefonoCarenciaDigitosException{
        String numeroTelefono = new String("289+´{prñ}}||");
        new NumeroTelefono(numeroTelefono);
    }

    //___________________________________________________Con NumeroTelefonoCarenciaDigitosException

    @Test (expected = NumeroTelefonoCarenciaDigitosException.class)
    public void CrearNumeroTelefonoConCarenciaDeNumeros() throws NumeroTelefonoCarenciaDigitosException, NumeroTelefonoContieneMasDeUnSignoMasException, NumeroTelefonoExcesoDigitosException, NumeroTelefonoInvalidoException, NumeroTelefonoSignoMasEnUbicacionEquivocadaException{
        NumeroTelefono.verificarNumeroTelefono("29832");
    }
}