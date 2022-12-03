package mercadoabasto.clientes;

import mercadoabasto.exepciones.ClaveUnicaIdentificacionCarenciaDigitosException;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionClaveInvalidaException;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionContieneMasDeDosGuionesException;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionDigitosInvalidosException;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionExcesoDigitosException;
import mercadoabasto.exepciones.ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException;

public abstract class ClaveUnicaIdentificacion {
    private String numeroClaveUnicaIdentificacion;

    public ClaveUnicaIdentificacion(String numeroClaveUnicaIdentificacion) throws ClaveUnicaIdentificacionCarenciaDigitosException, ClaveUnicaIdentificacionClaveInvalidaException, ClaveUnicaIdentificacionContieneMasDeDosGuionesException, ClaveUnicaIdentificacionDigitosInvalidosException, ClaveUnicaIdentificacionExcesoDigitosException, ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException{
        verificarNumeroClaveUnica(numeroClaveUnicaIdentificacion);
        this.numeroClaveUnicaIdentificacion=numeroClaveUnicaIdentificacion.replaceAll("-", "");
    }

    public String getNumeroClaveUnicaIdentificacion(){
        return numeroClaveUnicaIdentificacion;
    }

    public static void verificarNumeroClaveUnica(String numeroClaveUnicaIdentificacion) throws ClaveUnicaIdentificacionCarenciaDigitosException, ClaveUnicaIdentificacionClaveInvalidaException, ClaveUnicaIdentificacionContieneMasDeDosGuionesException, ClaveUnicaIdentificacionDigitosInvalidosException, ClaveUnicaIdentificacionExcesoDigitosException, ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException{
        int cantiadDeVecesQueSeEncuentraUnGuion=0;
        
       if(numeroClaveUnicaIdentificacion.length()>13){ //caracteres máximos con guiones, 8 del DNI + 3 de verificacion + 2 guiones
            throw new ClaveUnicaIdentificacionExcesoDigitosException();
        }
        if (numeroClaveUnicaIdentificacion.length()<11){ //caracteres mínimos sin guiones, 8 del DNI + 3 de verificacion
            throw new ClaveUnicaIdentificacionCarenciaDigitosException();
        }

        for(int i=0; i<numeroClaveUnicaIdentificacion.length(); i++){ //recorre el String
            switch(numeroClaveUnicaIdentificacion.charAt(i)){ //controla caracter por caracter
                case '-': cantiadDeVecesQueSeEncuentraUnGuion++;break; //cuenta los guiones
                case '0': break;
                case '1': break;
                case '2': break;
                case '3': break;
                case '4': break;
                case '5': break;
                case '6': break;
                case '7': break;
                case '8': break;
                case '9': break;
                default: throw new ClaveUnicaIdentificacionDigitosInvalidosException();
            }
        }

        if(numeroClaveUnicaIdentificacion.contains("-")){ //verifica si contiene guiones
            if(cantiadDeVecesQueSeEncuentraUnGuion>2){ //verifica si la cantidad de guiones es mayor a 2
                throw new ClaveUnicaIdentificacionContieneMasDeDosGuionesException();
            } //verifica la posición de los guiones
            if(numeroClaveUnicaIdentificacion.charAt(2)!='-' || numeroClaveUnicaIdentificacion.charAt(numeroClaveUnicaIdentificacion.length()-2)!='-'){
                throw new ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException();
            }//verifica que el largo de la cadena sea de 13 caracteres
            if(numeroClaveUnicaIdentificacion.length()!=13){
                throw new ClaveUnicaIdentificacionClaveInvalidaException();
            }
        }
        if(!numeroClaveUnicaIdentificacion.contains("-")){//verifica que no contenga guiones
            if(numeroClaveUnicaIdentificacion.length()!=11){ //verifica que el largo de la cadena sea de 11 caracteres
                throw new ClaveUnicaIdentificacionClaveInvalidaException();
            }
        }
    }
}