package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class LecturaExistenteExeption extends Exception {

    public LecturaExistenteExeption(String mensaje){
        
        super(mensaje);
    }

}
