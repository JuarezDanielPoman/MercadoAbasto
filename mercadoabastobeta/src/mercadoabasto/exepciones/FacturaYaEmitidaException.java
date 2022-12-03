package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class FacturaYaEmitidaException extends Exception{
    
    public FacturaYaEmitidaException(String message){
        super(message);
    }
}