package ej4;

import java.util.ArrayList;
import java.util.List;

public class GrupoWhapp implements IWhatsapp{
    private List<UsuarioOnline> usuarioOnline = new ArrayList<>();

    public GrupoWhapp addUser(UsuarioOnline usuarioOnline) {
        this.usuarioOnline.add(usuarioOnline);
        return this;
    }

    @Override
    public void send(String msg, Persona persona) {
        UsuarioOnline usuarioOnline = (UsuarioOnline) persona;

        for(UsuarioOnline collegue : this.usuarioOnline) {
            for(UsuarioOnline colegaRemitente : usuarioOnline.getUsuarios()) {
                if (!usuarioOnline.getCi().equals(collegue.getCi())) {
                    if (collegue.getCi().equals(colegaRemitente.getCi())) {
                        collegue.received(msg);
                    }
                }
            }
        }
    }
}
