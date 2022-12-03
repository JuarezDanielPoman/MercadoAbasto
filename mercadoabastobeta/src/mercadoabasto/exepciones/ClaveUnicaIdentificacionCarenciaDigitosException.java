package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class ClaveUnicaIdentificacionCarenciaDigitosException extends Exception{
    public ClaveUnicaIdentificacionCarenciaDigitosException(){
        super("Faltan de caracteres en CUIL O CUIT, minimo permitido: 11 excluyendo guiones");
    }
}