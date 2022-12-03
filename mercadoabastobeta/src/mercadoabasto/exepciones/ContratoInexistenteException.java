package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class ContratoInexistenteException extends Exception {
    
    public ContratoInexistenteException(String mensaje){
        super(mensaje);
    }
}
