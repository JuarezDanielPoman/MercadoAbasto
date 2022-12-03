package mercadoabasto.ordenamiento; 

import java.util.Comparator;

import mercadoabasto.conceptosCobro.Factura;

public class FacturaCamparatorFecha implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
       
        Factura factura1 = (Factura)o1;
        Factura factura2 = (Factura)o2;

        return factura1.getFechaEVencimientoFactura().compareTo(factura2.getFechaEVencimientoFactura());
    }
    
}
