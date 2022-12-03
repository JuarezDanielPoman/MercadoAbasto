package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class LimiteSectoresException extends Exception{
    
    public LimiteSectoresException(){
        super("HA ALCANZADO EL LIMITE DE SECTORES PERMITIDO");
    }
}