package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class FacturaInexistenteExeption extends Exception{
    
    public FacturaInexistenteExeption(String mensaje){
        super(mensaje);
    }
}
