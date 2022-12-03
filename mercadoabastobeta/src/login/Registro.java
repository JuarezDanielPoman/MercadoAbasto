package login;

public class Registro {
    

    private String nombreUsuario;
    private String passwordUsuario; 
    private String correoElectronico;
    // Podriamos poner un atributo para determinar el rol (ADMIN O VISITA) 

    public Registro(String usermane, String password, String correo){

        this.nombreUsuario = usermane;
        this.passwordUsuario= password;
        this.correoElectronico = correo; 
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    

}
