package mercadoabasto.clientes;

import mercadoabasto.exepciones.NumeroTelefonoContieneMasDeUnSignoMasException;
import mercadoabasto.exepciones.NumeroTelefonoExcesoDigitosException;
import mercadoabasto.exepciones.NumeroTelefonoInvalidoException;
import mercadoabasto.exepciones.NumeroTelefonoSignoMasEnUbicacionEquivocadaException;
import mercadoabasto.exepciones.NumeroTelefonoCarenciaDigitosException;

public class NumeroTelefono {
    private String numeroTelefono;

    public NumeroTelefono(String numeroTelefono) throws NumeroTelefonoContieneMasDeUnSignoMasException, NumeroTelefonoExcesoDigitosException, NumeroTelefonoInvalidoException, NumeroTelefonoSignoMasEnUbicacionEquivocadaException, NumeroTelefonoCarenciaDigitosException{
        this.setNumeroTelefono(numeroTelefono);
    }

    public void setNumeroTelefono(String numeroTelefono) throws NumeroTelefonoContieneMasDeUnSignoMasException, NumeroTelefonoExcesoDigitosException, NumeroTelefonoInvalidoException, NumeroTelefonoSignoMasEnUbicacionEquivocadaException, NumeroTelefonoCarenciaDigitosException{
        verificarNumeroTelefono(numeroTelefono);
        this.numeroTelefono=numeroTelefono;
    }

    public String getNumeroTelefono(){
        return numeroTelefono;
    }

    public static void verificarNumeroTelefono(String numeroTelefono) throws NumeroTelefonoContieneMasDeUnSignoMasException, NumeroTelefonoExcesoDigitosException, NumeroTelefonoInvalidoException, NumeroTelefonoSignoMasEnUbicacionEquivocadaException, NumeroTelefonoCarenciaDigitosException{
        int cantidadDeVecesQueSeEncuentraElSignoMas=0;
        if(numeroTelefono.length()>15){
            throw new NumeroTelefonoExcesoDigitosException();
        }
        if(numeroTelefono.length()<7){
            throw new NumeroTelefonoCarenciaDigitosException();
        }
        for(int i=0; i<numeroTelefono.length(); i++){
            switch(numeroTelefono.charAt(i)){
                case '+': cantidadDeVecesQueSeEncuentraElSignoMas++;break;
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
                default: throw new NumeroTelefonoInvalidoException();
            }
        }
        if(cantidadDeVecesQueSeEncuentraElSignoMas>1){
            throw new NumeroTelefonoContieneMasDeUnSignoMasException();
        }
        if(numeroTelefono.contains("+")){
            if(numeroTelefono.charAt(0)!='+'){
                throw new NumeroTelefonoSignoMasEnUbicacionEquivocadaException();
            }
        }
    }
}