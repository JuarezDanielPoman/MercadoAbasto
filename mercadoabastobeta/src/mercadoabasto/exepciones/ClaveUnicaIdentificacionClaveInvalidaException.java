package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class ClaveUnicaIdentificacionClaveInvalidaException extends Exception{
    public ClaveUnicaIdentificacionClaveInvalidaException(){
        super("CUIL o CUIT invalido, verificar caracteres");
    }
}