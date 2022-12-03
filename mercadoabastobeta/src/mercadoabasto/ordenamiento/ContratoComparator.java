package mercadoabasto.ordenamiento;

import java.util.Comparator;

import mercadoabasto.mercado.Contrato;

public class ContratoComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        
        Contrato contrato1 = (Contrato)o1;
        Contrato contrato2 = (Contrato)o2;

        return contrato1.getFechaFinContrato().compareTo(contrato2.getFechaFinContrato());
    }

    
}
