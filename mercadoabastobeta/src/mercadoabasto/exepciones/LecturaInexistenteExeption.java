package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class LecturaInexistenteExeption extends Exception {
    
    public LecturaInexistenteExeption(String mensaje){
        super(mensaje);
    }
}
