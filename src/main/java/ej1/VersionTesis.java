package ej1;

public class VersionTesis {
    private Tesis state;
    public VersionTesis(Tesis tesis) {
        state = tesis;
    }

    public Tesis getTesis() {
        return state;
    }
}
