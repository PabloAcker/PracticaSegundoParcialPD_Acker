package ej6;

public abstract class Desarrollador {
    private String nombre;
    private SalaComunicacion collegue;
    private String ci;
    protected IChat chat;

    public Desarrollador(IChat chat) {
        this.chat = chat;
    }

    public String getNombre() {
        return nombre;
    }

    public Desarrollador setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public SalaComunicacion getCollegue() {
        return collegue;
    }

    public void setCollegue(SalaComunicacion collegue) {
        this.collegue = collegue;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public abstract void send(String msg);
    public abstract void received(String msg);
}
