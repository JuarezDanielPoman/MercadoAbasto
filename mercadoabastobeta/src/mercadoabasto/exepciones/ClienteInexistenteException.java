package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class ClienteInexistenteException extends Exception{
    public ClienteInexistenteException(){
        super("NO SE ENCONTRO NINGUN CLIENTE");
    }
}