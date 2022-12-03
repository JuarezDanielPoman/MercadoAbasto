package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class PuestoOcupadoException extends Exception {
    
    public PuestoOcupadoException(){
        super("Error: EL PUESTO YA ESTA OCUPADO");
    }
}
