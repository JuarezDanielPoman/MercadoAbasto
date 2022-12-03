package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class NumeroTelefonoCarenciaDigitosException extends Exception{
    public NumeroTelefonoCarenciaDigitosException(){
        super("El numero de telefono no puede tener menos de 7 digitos");
    }
}