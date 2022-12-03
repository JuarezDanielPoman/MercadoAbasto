package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class NumeroTelefonoSignoMasEnUbicacionEquivocadaException extends Exception{
    public NumeroTelefonoSignoMasEnUbicacionEquivocadaException(){
        super("El signo más solo es permitido al principio del número de teléfono");
    }
}