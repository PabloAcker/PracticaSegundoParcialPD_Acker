package ej3;

import java.util.ArrayList;
import java.util.List;

public class MuchosDatos implements IstrategyVenta{
    @Override
    public List<Celulares> estrategia(List<Celulares> celulares, String modelo) {
        List<Celulares> resultado = new ArrayList<>();

        for (Celulares celu:celulares){
            celu.setStrategy("Muchos Datos");
            if (celu.getModelo().equals(modelo)){
                System.out.println("\nIniciando busqueda de muchos celulares...");
                resultado.add(celu);
                celu.showInfoCel();
                System.out.println("=====================\n");
            }
        }

        return resultado;
    }
}


