package mercadoabasto.mercado;


import java.math.BigDecimal;
import java.time.LocalDate;
import mercadoabasto.conceptosCobro.Concepto;



public class Lectura implements Concepto {

   private LocalDate periodoLectura;    //Periodo de toma de lectura
   private BigDecimal consumo;
   private BigDecimal precioPorKW; 
   

//---------------- Método Constructor ----------------------- 

   public Lectura(LocalDate periodoLectura, BigDecimal consumo, BigDecimal precioPorKW){
       
        this.periodoLectura=periodoLectura;
        this.consumo=consumo;
        this.precioPorKW = precioPorKW;
         

   }


//----------------- Métodos Accesores ----------------------

    public void setPeriodoLectura(LocalDate periodoLectura){
        this.periodoLectura = periodoLectura;
    }
    public LocalDate getPeriodoLectura(){
        return periodoLectura;
    }

    public void setConsumo(BigDecimal consumo){
        this.consumo = consumo;
    }
    public BigDecimal getConsumo(){
        return consumo;
    }


   @Override
   public BigDecimal getImporte() {
      
       BigDecimal precioConsumoElectrico =  new BigDecimal("0.00");

       precioConsumoElectrico = consumo.multiply(precioPorKW);


       return precioConsumoElectrico;
   }

   @Override
   public String getCodigo() {
       
     return "CL".concat(consumo.toString());
   }
         // CL --> CODIGO DE LECTURA 
}