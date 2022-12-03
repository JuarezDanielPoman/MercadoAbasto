package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class PuestoInexistenteException extends Exception{
    
    public PuestoInexistenteException(){
        super("EL PUESTO NO EXISTE EN EL SISTEMA");
    }
}
