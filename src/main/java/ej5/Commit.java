package ej5;

public class Commit {
    private Codigo state;
    private String id;

    public Commit(Codigo codigo, String id) {
        state = codigo;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Codigo getCodigo() {
        return state;
    }
}
