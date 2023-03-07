package ej5;

import java.util.*;

public class Repositorio implements IRepositorio{
    private Map<String, Commit> commitSaved = new HashMap<>();

    private List<IDesarrollador> desarrolladores = new ArrayList<>();

    public void createCommit(String commitIdentifier, Commit commit) {
        commitSaved.put(commitIdentifier, commit);
    }

    public Commit getCommit(String commitIdentifier) {
        return commitSaved.get(commitIdentifier);
    }

    @Override
    public void agregar(IDesarrollador desarrollador) {
        desarrolladores.add(desarrollador);
    }

    @Override
    public void eliminarTodo() {
        desarrolladores.clear();
    }

    @Override
    public void notificacionDesarrolladores(Commit commit) {
        for(IDesarrollador desarrollador: desarrolladores) {
            desarrollador.update("Commit restaurado correctamente!", commit);
        }

    }
}
