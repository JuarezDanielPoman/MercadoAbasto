package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class FacturaExistenteExeption extends Exception{
    
    public FacturaExistenteExeption(){
        super("LA FACTURA YA EXISTE");
    }
}
