package mercadoabasto.clientes;

import mercadoabasto.exepciones.ClaveUnicaIdentificacionCarenciaDigitosException;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionClaveInvalidaException;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionContieneMasDeDosGuionesException;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionDigitosInvalidosException;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionExcesoDigitosException;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException;

public class Cuil extends ClaveUnicaIdentificacion{

    public Cuil(String numeroClaveUnicaIdentificaion) throws ClaveUnicaIdentificacionCarenciaDigitosException, ClaveUnicaIdentificacionClaveInvalidaException, ClaveUnicaIdentificacionContieneMasDeDosGuionesException, ClaveUnicaIdentificacionDigitosInvalidosException, ClaveUnicaIdentificacionExcesoDigitosException, ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException{
        super(numeroClaveUnicaIdentificaion);
    }

    public String getDNI(){
        String documento;
        documento = getNumeroClaveUnicaIdentificacion().substring(2, 10);
        return documento;
    }
}