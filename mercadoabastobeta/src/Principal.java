
import java.time.LocalTime;
import login.Login;

import mercadoabasto.clientes.*;
import mercadoabasto.exepciones.*;
import mercadoabasto.mercado.Mercado;
import mercadoabasto.mercado.ResponsableAlquiler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel Juarez
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NumeroTelefonoContieneMasDeUnSignoMasException, NumeroTelefonoExcesoDigitosException, NumeroTelefonoInvalidoException, NumeroTelefonoSignoMasEnUbicacionEquivocadaException, NumeroTelefonoCarenciaDigitosException, ClaveUnicaIdentificacionCarenciaDigitosException, ClaveUnicaIdentificacionClaveInvalidaException, ClaveUnicaIdentificacionContieneMasDeDosGuionesException, ClaveUnicaIdentificacionExcesoDigitosException, ClaveUnicaIdentificacionDigitosInvalidosException, ClaveUnicaIdentificacionGuionesEnUbicacionesErroneasException, ClienteYaAgregadoException {
        // TODO code application logic here
        
        String nombre = "Mercado de Abasto Municipal";
        String direccion = "Av. Siempre viva";
        NumeroTelefono numeroTelefono = new NumeroTelefono("3834977874");
        Cuil cuil = new Cuil("15-10123456-2");
        ResponsableAlquiler responsable = new ResponsableAlquiler("Oscar", "Capital", cuil);
        LocalTime horarioAbierto = LocalTime.of(8, 00);
        LocalTime horarioCerrado = LocalTime.of(22, 30);
        Integer limiteSectores = 4; 
        
        Mercado mercadoAbasto = new Mercado(nombre, direccion, numeroTelefono, responsable,horarioAbierto, horarioCerrado, limiteSectores);
        
        Quintero quintero1 = new Quintero("Nelson Daniel Romero", new NumeroTelefono("3824989796"), "Av. Maximo Victoria", "nelson34@live.com.ar",new Cuil("20-40724681-1"));
        Quintero quintero2 = new Quintero("Sergio Daniel Juarez", new NumeroTelefono("3834629551"), "Almagro 555",new Cuil("20-40432472-2"));
        Quintero quintero3 = new Quintero("Braian Antonio Salavarria", new NumeroTelefono("3462998877"), "Aqui va donde vive billy",new Cuil("27-38753918-1"));
        Empresa empresa1 = new Empresa("McDonalds", new NumeroTelefono("9283475913"), "Av Guemes 0932", "correo@correo.com", "Restaurantes McDonalds S.A.", new Cuit("22467946897"));
        Empresa empresa2 = new Empresa("BMW", new NumeroTelefono("9289023913"), "Av Maximo Victoria", "BMWW Ibérica S.A.", new Cuit("23349238492"));
        Empresa empresa3 = new Empresa("BBVA", new NumeroTelefono("9283475913"), "Nieva y castilla 1500", "Banco Bilbao Vizcaya Argentaria S.A", new Cuit("23477266813"));
        
        mercadoAbasto.agregarCliente(quintero1);
        mercadoAbasto.agregarCliente(quintero2);
        mercadoAbasto.agregarCliente(quintero3);
        mercadoAbasto.agregarCliente(empresa1);
        mercadoAbasto.agregarCliente(empresa2);
        mercadoAbasto.agregarCliente(empresa3);
        
       // MenuPrincipal menuPrincipal = new MenuPrincipal(mercadoAbasto);
        //menuPrincipal.setVisible(true);
    
        Login loginNv = new Login(mercadoAbasto);
        loginNv.setVisible(true);
    }
    
}
