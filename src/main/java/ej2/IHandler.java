package ej2;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();

    void orden(Soldado soldado, String titulo);
}
