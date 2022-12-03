package mercadoabasto.mercado;

//import static com.google.common.base.Predicates.instanceOf;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import login.Registro;
import mercadoabasto.conceptosCobro.Facturero;
import mercadoabasto.exepciones.*;
import mercadoabasto.ordenamiento.ClienteComparator;
import mercadoabasto.ordenamiento.ContratoComparator;
import mercadoabasto.clientes.*;

public class Mercado {

    private ArrayList<Sector> sectores;
    private String nombre;
    private String direccion;
    private NumeroTelefono numeroTelefono;
    private LocalTime horarioAbierto;
    private LocalTime horarioCerrado;
    private ResponsableAlquiler responsable;
    private ArrayList<Contrato> listaDeContratos;
    private Integer limiteSectores;
    private Facturero facturero = new Facturero();
    private ArrayList<Cliente> clientes;
    private Registro registroLogin;
    public Mercado(String nombre, String direccion, NumeroTelefono numeroTelefonico, ResponsableAlquiler responsable,LocalTime horarioAbierto, LocalTime horarioCerrado, Integer limiteSectores) {

        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setNumeroTelefono(numeroTelefonico);
        this.setResponsableAlquiler(responsable);
        this.setHorarioAbierto(horarioAbierto);
        this.setHorarioCerrado(horarioCerrado);
        this.setLimiteSectores(limiteSectores);
        this.setSectores(new ArrayList<Sector>());
        this.setListaDeContrato(new ArrayList<Contrato>());
        this.setClientes(new ArrayList<Cliente>());
    }

    public void setRegistroLogin(Registro registroLogin) {
        this.registroLogin = registroLogin;
    }

    public Registro getRegistroLogin() {
        return registroLogin;
    }

    
    public Facturero getFacturero() {
        return facturero;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre.toUpperCase();
    }

    public String getDireccion(){
        return direccion;
    } 
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public NumeroTelefono getNumeroTelefono(){
        return numeroTelefono;
    }
    public void setNumeroTelefono(NumeroTelefono numeroTelefono){
        this.numeroTelefono = numeroTelefono;
    }

    public ResponsableAlquiler getResponsableAlquiler(){
        return responsable;
    }
    public void setResponsableAlquiler(ResponsableAlquiler responsable){  // METODO PARA MODIFICAR UN RESPONSABLE
        this.responsable = responsable;
    }
    
    public LocalTime getHorarioAbierto(){
        return horarioAbierto;
    }
    public void setHorarioAbierto(LocalTime horarioAbierto){
        this.horarioAbierto = horarioAbierto;
    }

    public LocalTime getHorarioCerrado(){
        return horarioCerrado;
    }
    public void setHorarioCerrado(LocalTime horarioCerrado){
        this.horarioCerrado = horarioCerrado;
    }
    
    public Integer getLimiteSectores(){
        return limiteSectores;
    }
    public void setLimiteSectores(Integer limiteSectores){
        this.limiteSectores = limiteSectores;
    }

    public ArrayList<Sector> getSectores() {
        return sectores;
    }
    public void setSectores(ArrayList<Sector> sectores) {
        this.sectores = sectores;
    }




//-------------------------------- METODOS ASOCIADOS A LAS COLECCIONES DE SECTORES -------------------------------------
    
    public void agregarSector(Sector sector) throws SectorExistenteException, LimiteSectoresException {
       
       
        for (Sector var : sectores) {
            if (var.getNombreSector().equals(sector.getNombreSector())) { //compara con el nombre de los sectores
                throw new SectorExistenteException();  
            }
        }
        
        if(obtenerCantidadDeSectores() + 1 > getLimiteSectores()) {
            
            throw new LimiteSectoresException();
        }

       
        this.sectores.add(sector);
    }

   
    public Sector buscarUnSector(String nombreSector) throws SectorInexistenteException {
        Sector sectorEncontrado = null;
        
        for (Sector var : sectores) {

            if (var.getNombreSector().equals(nombreSector)) {
                sectorEncontrado = var;
                break;
            }
        }
        if (sectorEncontrado == null) {
             throw new SectorInexistenteException();
        }
        return sectorEncontrado;
    }

   
    public void modificarElLimiteDeSectores(String nombre,Integer nuevoLimiteDePuestos) throws SectorInexistenteException { 
        Sector sectorEncontrado;

        sectorEncontrado = buscarUnSector(nombre);
        sectorEncontrado.setLimitePuestos(nuevoLimiteDePuestos);
    }

    public Integer obtenerCantidadDeSectores(){
        Integer cantidadDeSectores;
        cantidadDeSectores = getSectores().size();
        return cantidadDeSectores;
    }

//-------------------------------- METODOS ASOCIADOS A LAS COLECCIONES DE CONTRATOS -------------------------------------

    public ArrayList<Contrato> getContrato(){
        return listaDeContratos;    
    }

    public void setListaDeContrato(ArrayList<Contrato> listaDeContrato){
        this.listaDeContratos = listaDeContrato;
    }


    public void agregarContrato(Contrato contrato) throws ContratoExistenteException {

        for (Contrato var : listaDeContratos) {

            if (var.getNumeroIdentificacionContrato().equals(contrato.getNumeroIdentificacionContrato())) {

                throw new ContratoExistenteException();
            }
        } 

        listaDeContratos.add(contrato);
    }


    public Contrato buscarUnContrato(Integer numeroIdentificacionContrato) throws ContratoInexistenteException {
    
        Contrato contratoEncontrado = null;

        for (Contrato var : listaDeContratos) {

            if(var.getNumeroIdentificacionContrato().equals(numeroIdentificacionContrato)) {
                
                contratoEncontrado = var;
                break;
            }
        }

        if(contratoEncontrado == null){

             throw new ContratoInexistenteException("El contrato no existe, Numero de Identificacion: " + numeroIdentificacionContrato);
        }
    
       return contratoEncontrado;
    }


    public void modificarEstadoDelCotrato(Integer numeroIdentificacion) throws ContratoInexistenteException, ContratoDadoDeBajaException {
    
        Contrato contratoEncontrado;

        contratoEncontrado = buscarUnContrato(numeroIdentificacion);
        
        if(contratoEncontrado.getEstadoContrato() == false){
                //si el contrato ya fu dado de baja, le avisamos al usuario
                throw new ContratoDadoDeBajaException("EL CONTRATO NRO: "+contratoEncontrado.getNumeroIdentificacionContrato().toString()+" YA ESTA DADO DE BAJA");
        }
        
        contratoEncontrado.bajaContrato();  //Damos de baja el contrato 
        contratoEncontrado.getPuesto().setDisponibilidad(true); //al puesto asociodo lo ponemos disponible 
        
      
    }
    
    public void verificarContrato(Integer numeroDeContrato) throws ContratoExistenteException{
        for (Contrato var : listaDeContratos){
                
            if(var.getNumeroIdentificacionContrato() == numeroDeContrato){
                throw new ContratoExistenteException();
            }
        }
    }
    

     public void modificarEstadoPorFecha(){
        LocalDate fechaActual = LocalDate.now();
        for (Contrato var : this.listaDeContratos ){
            
            if(fechaActual.isAfter( var.getFechaFinContrato())){
                 var.bajaContrato();
                 var.getPuesto().setDisponibilidad(true);
            }
        }
    }
    
    
    
    
    public Integer obtenerCantidadDeContratos(){

        return this.getContrato().size();
    }

    public Integer contratosVigentes(){
        Integer cantidad = 0;

        for (Contrato var : listaDeContratos) {
            
            if(var.getEstadoContrato().equals(true)){
                
                cantidad++;
            }
        }

        return cantidad; 
    }

    public void ordenarContratosPorFechaVencimiento(){

        Collections.sort(listaDeContratos, new ContratoComparator());
    }
    
    public  ArrayList<Puesto> obtenerPuestosDeCliente(Cliente cliente){
        ArrayList<Puesto> puestoDelCliente = new ArrayList<Puesto>();
            if(cliente instanceof Quintero){
                for (Contrato  var : this.listaDeContratos) {
                    if(var.getCliente() instanceof Quintero){
                        Quintero clienteQuintero = (Quintero)var.getCliente();
                        if(clienteQuintero.getCuil().getNumeroClaveUnicaIdentificacion().equals(((Quintero) cliente).getCuil().getNumeroClaveUnicaIdentificacion())){
                            puestoDelCliente.add(var.getPuesto());
                        }
                    }
                }
            }
            if(cliente instanceof Empresa){
                for (Contrato  var : this.listaDeContratos) {
                    if(var.getCliente() instanceof Empresa){
                        Empresa clienteEmpresa = (Empresa)var.getCliente();
                        if(clienteEmpresa.getCuit().getNumeroClaveUnicaIdentificacion().equals(((Empresa) cliente).getCuit().getNumeroClaveUnicaIdentificacion())){
                            puestoDelCliente.add(var.getPuesto());
                        }
                    }
                }
            }
        return puestoDelCliente; 
    }
    
    public ArrayList<Contrato> obtenerContratosDeCliente(Cliente cliente) throws ClienteSinContratosException{
        ArrayList<Contrato> contratosDelCliente = new ArrayList<Contrato>();
            if(cliente instanceof Quintero){
                for (Contrato  var : this.listaDeContratos) {
                    if(var.getCliente() instanceof Quintero){
                        Quintero clienteQuintero = (Quintero)var.getCliente();
                        if(clienteQuintero.getCuil().getNumeroClaveUnicaIdentificacion().equals(((Quintero) cliente).getCuil().getNumeroClaveUnicaIdentificacion())){
                            contratosDelCliente.add(var);
                        }
                    }
                }
            }
            if(cliente instanceof Empresa){
                for (Contrato  var : this.listaDeContratos) {
                    if(var.getCliente() instanceof Empresa){
                        Empresa clienteEmpresa = (Empresa)var.getCliente();
                        if(clienteEmpresa.getCuit().getNumeroClaveUnicaIdentificacion().equals(((Empresa) cliente).getCuit().getNumeroClaveUnicaIdentificacion())){
                            contratosDelCliente.add(var);
                        }
                    }
                }
            }
            if(contratosDelCliente.size()==0){
                throw new ClienteSinContratosException();
            }
        return contratosDelCliente; 
    }
    
    public Integer cantidadContratosDeCliente(Cliente cliente){
        Integer cantidadDeContratos = 0;
            if(cliente instanceof Quintero){
                for (Contrato  var : this.listaDeContratos) {
                    if(var.getCliente() instanceof Quintero){
                        Quintero clienteQuintero = (Quintero)var.getCliente();
                        if(clienteQuintero.getCuil().getNumeroClaveUnicaIdentificacion().equals(((Quintero) cliente).getCuil().getNumeroClaveUnicaIdentificacion())){
                            cantidadDeContratos++;
                        }
                    }
                }
            }
            if(cliente instanceof Empresa){
                for (Contrato  var : this.listaDeContratos) {
                    if(var.getCliente() instanceof Empresa){
                        Empresa clienteEmpresa = (Empresa)var.getCliente();
                        if(clienteEmpresa.getCuit().getNumeroClaveUnicaIdentificacion().equals(((Empresa) cliente).getCuit().getNumeroClaveUnicaIdentificacion())){
                            cantidadDeContratos++;
                        }
                    }
                }
            }
        return cantidadDeContratos; 
    }
    
    public Integer cantidadDeContratosInactivos(ArrayList<Contrato> contratos){
        LocalDate fechaActual = LocalDate.now();
        Integer cantidadDeContratosVencidos = 0;
        for (Contrato contrato : contratos) {
            if(fechaActual.isAfter(contrato.getFechaFinContrato()) || contrato.getEstadoContrato() == false){
                cantidadDeContratosVencidos++;
            }
        }
        return cantidadDeContratosVencidos;
    }
    
    public Integer cantidadDeContratosInactivos(){
        LocalDate fechaActual = LocalDate.now();
        Integer cantidadDeContratosVencidos = 0;
        for (Contrato contrato : this.listaDeContratos) {
            if(fechaActual.isAfter(contrato.getFechaFinContrato()) || contrato.getEstadoContrato() == false){
                cantidadDeContratosVencidos++;
            }
        }
        return cantidadDeContratosVencidos;
    }
    
    public Integer cantidadDeContratosVigentes(ArrayList<Contrato> contratos){
        LocalDate fechaActual = LocalDate.now();
        Integer cantidadDeContratosVigentes = 0;
        for (Contrato contrato : contratos) {
            LocalDate periodo = contrato.getFechaFinContrato().minusWeeks(1);
            
            if(fechaActual.isBefore(periodo) && contrato.getEstadoContrato() == true){
                cantidadDeContratosVigentes++;
            }
        }
        return cantidadDeContratosVigentes;
    }
    
    public Integer cantidadDeContratosPorVencer(ArrayList<Contrato> contratos){
        LocalDate fechaActual = LocalDate.now();
        Integer cantidadDeContratosPorVencer = 0;
        for (Contrato contrato : contratos) {
            LocalDate periodo = contrato.getFechaFinContrato().minusWeeks(1);
            
            if(fechaActual.isAfter(periodo) && contrato.getEstadoContrato() == true){
                cantidadDeContratosPorVencer++;
            }
        }
        return cantidadDeContratosPorVencer;
    }
    
    public Integer cantidadDeContratosPorVencer(){
        LocalDate fechaActual = LocalDate.now();
        Integer cantidadDeContratosPorVencer = 0;
        for (Contrato contrato : this.listaDeContratos) {
            LocalDate periodo = contrato.getFechaFinContrato().minusWeeks(1);
            
            if(fechaActual.isAfter(periodo) && contrato.getEstadoContrato() == true){
                cantidadDeContratosPorVencer++;
            }
        }
        return cantidadDeContratosPorVencer;
    }
    
    public static Contrato buscarContratoPorPuesto(ArrayList<Contrato> contratos, Puesto puesto){
        Contrato contratoEncontrado = null;
        for (Contrato var : contratos) {
            if(var.getPuesto().equals(puesto)){
                contratoEncontrado = var;
            }
        }
        return contratoEncontrado;
    }
       
    public ArrayList<Cliente> obtenerClienteContratoVigente() throws ClienteInexistenteException{
        
        ArrayList<Cliente> clientesActivos = new ArrayList<Cliente>(); 
    
            for (Contrato var : this.listaDeContratos) {
                
                if(var.getEstadoContrato() == true){
                    if(!clientesActivos.contains(var.getCliente())){
                        clientesActivos.add(var.getCliente());
                    }
                }
            }
            
            
            if(clientesActivos.size() == 0){
                throw new ClienteInexistenteException();
            }
            
        return clientesActivos;
    }
       
   
    
//--------------- Metodos asociados a la coleccion de clientes -----------------------

    public void setClientes(ArrayList<Cliente> clientes){
        this.clientes=clientes;
    }

    public ArrayList<Cliente> getClientes(){
        return clientes;
    }

   
    public void agregarCliente(Cliente clienteNuevo) throws ClienteYaAgregadoException{
        
        if(clienteNuevo instanceof  Quintero){
            
             for (Cliente var : clientes){
            
                   if (var instanceof Quintero) {
                     
                       if(((Quintero) var).getCuil().getDNI().equals(((Quintero) clienteNuevo).getCuil().getDNI())){
                           throw new ClienteYaAgregadoException();
                       }
                 }
             }
        
        }
        
        if(clienteNuevo instanceof Empresa){
            
            for (Cliente var : clientes) {
                
                if(var instanceof  Empresa){
                    
                    if(((Empresa) var).getCuit().getNumeroClaveUnicaIdentificacion().equals(((Empresa) clienteNuevo).getCuit().getNumeroClaveUnicaIdentificacion())){
                        throw  new ClienteYaAgregadoException();
                    }
                }
            }
        }
    
       
     this.clientes.add(clienteNuevo);
    }

   
     public Cliente buscarCliente(String clave) throws ClienteInexistenteException{
        
         Cliente clienteEncontrado = null;
        
        
            for(Cliente var: clientes){
                
                if(var instanceof Quintero){
                    
                    Quintero clienteActualSeleccionadoArray = (Quintero) var;
                    if(clienteActualSeleccionadoArray.getCuil().getNumeroClaveUnicaIdentificacion().equals(clave)){
                        clienteEncontrado = var;
                        break;
                    }
                }
                
                 if(var instanceof Empresa){
                    Empresa clienteActualSeleccionadoArray = (Empresa) var;
                    if(clienteActualSeleccionadoArray.getCuit().getNumeroClaveUnicaIdentificacion().equals(clave)){
                        clienteEncontrado = var;
                        break;
                    }
                }
                
            }
        
        
        if(clienteEncontrado==null){
            throw new ClienteInexistenteException();
        }
        return clienteEncontrado;
    }

    public Integer obtenerCantidadClientes(){
        return clientes.size();
    }

    public void ordenarClientesDelMercado(){
        Collections.sort(clientes, new ClienteComparator());
    }
    
    
    public void comprobarMedidor(Integer numeroMedidor) throws MedidorOcupadoException{
        ArrayList<Sector> sectores = this.getSectores();
        for (int i=0;i<sectores.size(); i++){
            ArrayList<Puesto> puestos = sectores.get(i).getPuestos();
            for (int j=0; j<puestos.size(); j++){
                if(puestos.get(j).getMedidor().getNumeroMedidor().equals(numeroMedidor)){
                        throw new MedidorOcupadoException();
                }
            }
        }
    }
     
     
     public Medidor buscarMedidorMercado (Integer numeroMedidor) throws MedidorInexistenteException{
         
         Medidor medidorEncontrado = null; 
         
         ArrayList<Sector> sectores = this.getSectores();
        
        for (int i=0 ; i<sectores.size() ; i++){
        
             ArrayList<Puesto> puestos = sectores.get(i).getPuestos();
             
                for (int j =0; j<puestos.size(); j++){
                    
                    if(puestos.get(j).getMedidor().getNumeroMedidor().equals(numeroMedidor)){
                           medidorEncontrado = puestos.get(j).getMedidor();
                           break;
                    }
                } 
        }
        
         if (medidorEncontrado == null) {
             
             throw new MedidorInexistenteException();
         }
        
        
        return  medidorEncontrado;
     }
             
}