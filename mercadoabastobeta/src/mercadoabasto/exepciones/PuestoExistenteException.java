package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class PuestoExistenteException extends Exception {
    
    public PuestoExistenteException(){
        super("EL PUESTO YA EXISTE EN EL SISTEMA");
    }
}
