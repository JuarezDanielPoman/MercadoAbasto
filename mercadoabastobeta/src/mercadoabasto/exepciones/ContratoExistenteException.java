package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class ContratoExistenteException extends Exception{
    
    public ContratoExistenteException(){
        super("EL CONTRATO YA EXISTE");
    }
}
