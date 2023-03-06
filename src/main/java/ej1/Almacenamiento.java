package ej1;

import java.util.HashMap;
import java.util.Map;

public class Almacenamiento {
    private Map<String, VersionTesis> versionTesisMap = new HashMap<>();
    public void crearVersionTesis(String identificador, VersionTesis versionTesis) {
        versionTesisMap.put(identificador, versionTesis);
    }

    public VersionTesis getVersionTesis(String identificador) {
        return versionTesisMap.get(identificador);
    }
}
