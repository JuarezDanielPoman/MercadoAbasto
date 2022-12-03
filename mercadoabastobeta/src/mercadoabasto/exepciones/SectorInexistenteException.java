package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class SectorInexistenteException extends Exception{
    
    public SectorInexistenteException(){
        super("EL SECTOR NO EXISTE EN EL SISTEMA");
    }
}
