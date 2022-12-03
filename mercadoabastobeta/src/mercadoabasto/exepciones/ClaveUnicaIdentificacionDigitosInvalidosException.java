package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class ClaveUnicaIdentificacionDigitosInvalidosException extends Exception{
    public ClaveUnicaIdentificacionDigitosInvalidosException(){
        super("Caracteres invalidos, solo se permiten números y (-)");
    }
}