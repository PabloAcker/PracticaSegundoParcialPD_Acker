package ej3;

import java.util.List;

public class PocosDatos implements IstrategyVenta{
    @Override
    public void estrategia(List<Celulares> celulares) {
        for (Celulares celu:celulares){
            celu.setStrategy("Pocos Datos");
            if (celulares.size()<=5){
                System.out.println("\nIniciando busqueda de pocos celulares...");
                celu.showInfoCel();
                System.out.println("=====================\n");
            }else {
                System.out.println("Demasiados celulares para este tipo de busqueda");
            }
        }
    }
}
