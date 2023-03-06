package ej2;

public class Coronel implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void orden(Soldado soldado, String titulo) {
        if (titulo.equals("desbloqueosManifestaciones")){
            System.out.println("EL Coronel pudo arreglar el siguiente problema: "+titulo);
            System.out.println("El Coronel que resolvio el problema tiene los siguientes datos: ");
            soldado.showInfoSoldado();
        } else {
            System.out.println("El Coronel no pudo arreglar el problema "+titulo+". Se lo pasa a revision al siguiente nivel superior...");
            next.orden(soldado, titulo);
        }
    }
}
