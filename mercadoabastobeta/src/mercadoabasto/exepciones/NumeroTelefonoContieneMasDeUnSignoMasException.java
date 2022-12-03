package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class NumeroTelefonoContieneMasDeUnSignoMasException extends Exception{
    public NumeroTelefonoContieneMasDeUnSignoMasException(){
        super("El número de telefono contiene un signo mas");
    }
}