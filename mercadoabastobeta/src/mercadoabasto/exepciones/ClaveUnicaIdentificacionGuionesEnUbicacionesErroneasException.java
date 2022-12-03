package mercadoabasto.exepciones;

@SuppressWarnings("serial")
public class ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException extends Exception{
    public ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException(){
        super("Guiones en ubicaciones erroneas, solo son admitidos en el formato XX-XXXXXXXX-X");
    }
}