package ej3;

public class Main {
    public static void main(String[] args) {
        TiendaCelulares tiendaCelulares = new TiendaCelulares("Samsung");
        tiendaCelulares.addCelulares(new Celulares("S20","1500bs","Samgung","alta"))
                .addCelulares(new Celulares("iphone10","1000bs","Apple","alta"))
                .addCelulares(new Celulares("iphone12","1700bs","Apple","alta"))
                .addCelulares(new Celulares("S9","500bs","Samgung","alta"))
                .addCelulares(new Celulares("A20","900bs","Samgung","alta"));
                //.addCelulares(new Celulares("A50","1100bs","Samgung","alta"));

        String tipoVenta="Pocos Datos";

        // condicion para saber cual es la mejor estrategia a usar

        if (tipoVenta.equals("Pocos Datos")){
            tiendaCelulares.setStrategyVenta(new PocosDatos());
        }else{
            tiendaCelulares.setStrategyVenta(new MuchosDatos());
        }

        tiendaCelulares.vender();
    }
}
