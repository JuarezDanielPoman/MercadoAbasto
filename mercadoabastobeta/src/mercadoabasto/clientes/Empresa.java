package mercadoabasto.clientes;

public class Empresa extends Cliente{
    
    private Cuit cuit;
    private String razonSocial; 

    public Empresa(String nombre, NumeroTelefono numeroTelefono, String direccion,String razonSocial,Cuit cuit){
        super(nombre, numeroTelefono, direccion);
        this.setRazonSocial(razonSocial);
        this.cuit=cuit;    
    }

    public Empresa(String nombre, NumeroTelefono numeroTelefono, String direccion, String correoElectronico, String razonSocial, Cuit cuit){
        super(nombre, numeroTelefono, direccion, correoElectronico);
        this.setRazonSocial(razonSocial);
        this.cuit=cuit;    
    }

    public void setRazonSocial(String razonSocial){
        this.razonSocial = razonSocial;
    }
    public String getRazonSocial(){
        return razonSocial;
    }
    
    public Cuit getCuit(){
        return cuit;
    }
}