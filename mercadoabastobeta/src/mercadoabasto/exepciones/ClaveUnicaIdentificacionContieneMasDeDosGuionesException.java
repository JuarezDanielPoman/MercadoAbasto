package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class ClaveUnicaIdentificacionContieneMasDeDosGuionesException extends Exception {
    public ClaveUnicaIdentificacionContieneMasDeDosGuionesException(){
        super("El CUIL o CUIT no puede contener mas de dos guiones");
    }
}