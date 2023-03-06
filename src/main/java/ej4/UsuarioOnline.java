package ej4;

public class UsuarioOnline extends Persona{
    public UsuarioOnline(IWhatsapp whatsapp) {
        super(whatsapp);
    }

    @Override
    public void send(String msg) {
        wpp.send(msg, this);
    }

    @Override
    public void received(String msg) {
        System.out.println("La persona con el nombre: "+getNombre()+" y CI: "+getCi()+" recibio el siguiente mensaje: "+msg);
    }
}
