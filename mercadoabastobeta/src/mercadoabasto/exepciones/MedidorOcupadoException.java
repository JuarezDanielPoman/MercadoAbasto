package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class MedidorOcupadoException extends Exception{

    public MedidorOcupadoException(){
        super("EL MEDIDOR YA ESTA OCUPADO");
    }
    
}
