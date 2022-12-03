package mercadoabasto.clientes;

public abstract class Cliente{

    private String nombre;
    private NumeroTelefono numeroTelefono;
    private String direccion;
    private String correoElectronico;

    Cliente(String nombre, NumeroTelefono numeroTelefono, String direccion){
        this.setNombre(nombre);
        this.setNumeroTelefono(numeroTelefono);
        this.setDireccion(direccion);
    }

    Cliente(String nombre, NumeroTelefono numeroTelefono, String direccion, String correoElectronico){
        this.setNombre(nombre);
        this.setNumeroTelefono(numeroTelefono);
        this.setDireccion(direccion);
        this.setCorreoElectronico(correoElectronico);
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNumeroTelefono(NumeroTelefono numeroTelefono){
        this.numeroTelefono=numeroTelefono;
    }

    public NumeroTelefono getNumeroTelefono(){
        return numeroTelefono;
    }

    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico=correoElectronico;
    }

    public String getCorreoElectronico(){
        return correoElectronico;
    }
}