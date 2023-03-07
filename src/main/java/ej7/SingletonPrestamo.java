package ej7;

public class SingletonPrestamo {
    private static SingletonPrestamo instance;
    private int montoOriginal = 0;
    private int montoPagado = 0;
    private SingletonPrestamo() {}
    public static SingletonPrestamo getInstance() {

        if(instance == null) {
            instance = new SingletonPrestamo();
        }
        return instance;
    }
    public int getMontoOriginal() {
        return montoOriginal;
    }
    public void setMontoOriginal(int montoOriginal) {
        this.montoOriginal = montoOriginal;
    }
    public int getMontoPagado() {
        return montoPagado;
    }
    public void setMontoPagado(int montoPagado) {
        this.montoPagado = montoPagado;
    }
}
