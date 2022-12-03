package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class ConceptoYaAgregadoException extends Exception{
    public ConceptoYaAgregadoException(){
        super("EL CONCEPTO YA SE ENCUENTRA EN LA FACTURA");
    }
}