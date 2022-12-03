package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class NumeroTelefonoInvalidoException extends Exception {
    public NumeroTelefonoInvalidoException(){
        super("Numero de telefono invalido, solo se permite ingresar numeros y el caracter +");
    }
}