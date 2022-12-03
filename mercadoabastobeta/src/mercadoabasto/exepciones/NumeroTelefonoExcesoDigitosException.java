package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class NumeroTelefonoExcesoDigitosException extends Exception{
    public NumeroTelefonoExcesoDigitosException(){
        super("El numero de telefono no puede contener mas de  15 caracteres");
    }
}