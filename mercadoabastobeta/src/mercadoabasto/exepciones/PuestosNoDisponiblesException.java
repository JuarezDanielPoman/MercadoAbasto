package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class PuestosNoDisponiblesException extends Exception{
    
    public PuestosNoDisponiblesException(){
        super("NO HAY PUESTOS DISPONIBLES EN ESTOS MOMENTOS");
    }

}
