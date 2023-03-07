package ej2;

public class CuerpoDelEjercito implements IHandler{
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
        General gral = new General();
        Teniente tte = new Teniente();
        Coronel crnl = new Coronel();
        Cabo cabo = new Cabo();

        this.setNext(cabo);
        cabo.setNext(crnl);
        crnl.setNext(tte);
        tte.setNext(gral);

        this.next.orden(soldado, titulo);
    }
}
