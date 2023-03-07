package ej7;

public class Main {
    public static void main(String[] args) {
        SingletonPrestamo.getInstance().setMontoOriginal(100);

        Banco banco = new Banco();

        banco.pagarDeuda(10);
        banco.pagarDeuda(25);
        banco.pagarDeuda(10);
        banco.pagarDeuda(30);
        banco.pagarDeuda(25);
    }
}
