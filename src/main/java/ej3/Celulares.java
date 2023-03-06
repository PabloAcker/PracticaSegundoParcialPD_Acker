package ej3;

public class Celulares {
    private String modelo;
    private String marca;
    private String gama;
    private String precio;
    private String strategy;

    public Celulares(String modelo, String precio, String marca, String gama) {
        this.modelo = modelo;
        this.precio = precio;
        this.gama=gama;
        this.marca=marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }
    public void showInfoCel(){
        System.out.println("Modelo: "+getModelo());
        System.out.println("Marca: "+getMarca());
        System.out.println("Gama: "+getGama());
        System.out.println("Precio: "+getPrecio());
        System.out.println("Strategy: "+getStrategy());
    }
}
