package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class ClaveUnicaIdentificacionExcesoDigitosException extends Exception{
    public ClaveUnicaIdentificacionExcesoDigitosException(){
        super("Exceso de caracteres en CUIL O CUIT, maximo permitido: 13 incluyendo guiones");
    }
}