package mercadoabasto.clientes;

public class Quintero extends Cliente{

    private Cuil cuil;
    
    public Quintero(String nombre, NumeroTelefono numeroTelefono, String direccion, Cuil cuil){
        super(nombre, numeroTelefono, direccion);
        this.cuil=cuil;
    }

    public Quintero(String nombre, NumeroTelefono numeroTelefono, String direccion, String correoElectronico, Cuil cuil){
        super(nombre, numeroTelefono, direccion, correoElectronico);
        this.cuil=cuil;
    }

    public Cuil getCuil(){
        return cuil;
    }
}