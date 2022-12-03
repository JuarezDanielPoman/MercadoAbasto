package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class ClienteYaAgregadoException extends Exception {
    public ClienteYaAgregadoException(){
        super("EL CLIENTE YA SE ENCUENTRA EN LA LISTA");
    }
}