package ej3;

import java.util.List;

public class MuchosDatos implements IstrategyVenta{
    @Override
    public void estrategia(List<Celulares> celulares) {
        for (Celulares celu:celulares){
            celu.setStrategy("Muchos Datos");
            if (celulares.size()>5){
                System.out.println("\nIniciando busqueda de muchos celulares...");
                celu.showInfoCel();
                System.out.println("=====================\n");
            }else {
                System.out.println("Muy pocos celulares para este tipo de busqueda");
            }
        }
    }
}
