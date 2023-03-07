package ej6;

import java.util.ArrayList;
import java.util.List;

public class ChatGrupal implements IChat {
    private List<SalaComunicacion> desarrolladores = new ArrayList<>();

    public ChatGrupal addDesarrolador(SalaComunicacion desarroladorSala) {
        desarrolladores.add(desarroladorSala);
        return this;
    }

    @Override
    public void send(String msg, Desarrollador desarrollador) {
        SalaComunicacion salaComunicacion = (SalaComunicacion) desarrollador;
        for(Desarrollador desarrolladorCollegue: desarrolladores) {
            if(!desarrolladorCollegue.getCi().equals(salaComunicacion.getCi())) {
                desarrolladorCollegue.received(msg);
            }
        }
    }
}
