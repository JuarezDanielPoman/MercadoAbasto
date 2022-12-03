package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class ClienteSinContratosException extends Exception{
    public ClienteSinContratosException() {
        super("El cliente no tiene contratos");
    }
    
}
