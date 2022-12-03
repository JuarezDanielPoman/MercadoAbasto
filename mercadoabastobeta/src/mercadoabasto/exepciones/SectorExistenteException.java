package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class SectorExistenteException extends Exception {
    
    public SectorExistenteException(){
        super("EL SECTOR YA EXISTE EN EL SISTEMA");
    }
}
