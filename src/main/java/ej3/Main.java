package ej3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Celulares> celulares = new ArrayList<>();
        celulares.add(new Celulares("S20","1500bs","Samgung","alta"));
        celulares.add(new Celulares("iphone10","1000bs","Apple","alta"));
        celulares.add(new Celulares("iphone12","1700bs","Apple","alta"));
        celulares.add(new Celulares("S9","500bs","Samgung","alta"));
        celulares.add(new Celulares("A20","900bs","Samgung","alta"));
        //celulares.add(new Celulares("A50","1100bs","Samgung","alta"));

        TiendaCelulares tiendaCelulares = new TiendaCelulares(celulares,"Samsung");

        List<Celulares> resultados = tiendaCelulares.vender("A20");

        if (resultados.isEmpty()) {
            System.out.println("No se encontraron resultados para la búsqueda.");
        }
    }
}
