package mercadoabasto.mercado;

import mercadoabasto.clientes.Cuil;
public class ResponsableAlquiler {

    private String nombre;
    private String apellido;
    private Cuil cuil;


    //------------- Metodo Contructor -----------------

    public ResponsableAlquiler(String nombre, String apellido, Cuil cuil) {
        this.nombre = nombre.toUpperCase();
        this.apellido = apellido.toUpperCase();
        this.cuil = cuil;
    }


//------------- Metodo Accersora -------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Cuil getCuil() {
        return cuil;
    }
    
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", DNI: " + cuil.getDNI();
    }
}
