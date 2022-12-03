package mercadoabasto.ordenamiento;

import java.util.Comparator;

import mercadoabasto.clientes.Cliente;

public class ClienteComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
       
        Cliente cliente1 = (Cliente)o1;
        Cliente cliente2 = (Cliente)o2;

        return cliente1.getNombre().compareTo(cliente2.getNombre());
    }

    
}
