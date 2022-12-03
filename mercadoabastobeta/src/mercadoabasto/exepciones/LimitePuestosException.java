package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class LimitePuestosException extends Exception{
    
    public LimitePuestosException(){
        super("ALCANZO EL LIMITE DE PUESTO PERMITIDO");
    }
}
