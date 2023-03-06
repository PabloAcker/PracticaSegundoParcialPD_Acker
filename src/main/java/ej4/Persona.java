package ej4;

import java.util.ArrayList;
import java.util.List;

public abstract class Persona {
    protected IWhatsapp wpp;
    private String nombre;
    private String ci;

    private List<UsuarioOnline> usuarios = new ArrayList<>();

    public Persona(IWhatsapp whatsapp) {
        this.wpp = whatsapp;
    }

    public Persona addUser(UsuarioOnline usuario) {
        usuarios.add(usuario);
        return this;
    }

    public IWhatsapp getWpp() {
        return wpp;
    }

    public void setWpp(IWhatsapp wpp) {
        this.wpp = wpp;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getCi() {
        return ci;
    }

    public Persona setCi(String ci) {
        this.ci = ci;
        return this;
    }

    public List<UsuarioOnline> getUsuarios() {
        return usuarios;
    }

    public Persona setUsuarios(List<UsuarioOnline> usuarios) {
        this.usuarios = usuarios;
        return this;
    }

    public abstract void send(String msg);
    public abstract void received(String msg);

}
