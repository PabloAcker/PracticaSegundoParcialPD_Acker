package ej2;

public class General implements IHandler{
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
        if (titulo.equals("entrevistas")){
            System.out.println("EL General pudo arreglar el siguiente problema: "+titulo);
            System.out.println("El soldado que resolvio el problema tiene los siguientes datos: ");
            soldado.showInfoSoldado();
        } else {
            System.out.println("El General no pudo arreglar el problema "+titulo+". Se lo pasa a revision al siguiente nivel superior...");
            next.orden(soldado, titulo);
        }
    }
}
