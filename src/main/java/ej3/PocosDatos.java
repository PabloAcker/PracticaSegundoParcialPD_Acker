package ej3;

import java.util.ArrayList;
import java.util.List;

public class PocosDatos implements IstrategyVenta{
    @Override
    public List<Celulares> estrategia(List<Celulares> celulares, String modelo) {
        List<Celulares> resultado = new ArrayList<>();

        for (Celulares celu:celulares){
            celu.setStrategy("Pocos Datos");
            if (celu.getModelo().equals(modelo)){
                System.out.println("\nIniciando busqueda de pocos celulares...");
                resultado.add(celu);
                celu.showInfoCel();
                System.out.println("=====================\n");
            }
        }

        return resultado;
    }
}
