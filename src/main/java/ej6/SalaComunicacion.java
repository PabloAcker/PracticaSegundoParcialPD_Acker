package ej6;

public class SalaComunicacion extends Desarrollador{
    public SalaComunicacion(IChat salaChat) {
        super(salaChat);
    }
    @Override
    public void send(String msg) {
        chat.send(msg, this);
    }
    @Override
    public void received(String msg) {
        System.out.println("El siguiente mensaje es para: " + getNombre() +", con CI" + getCi() + ": \n" + msg);
    }

}
