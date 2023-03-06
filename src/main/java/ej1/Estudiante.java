package ej1;

public class Estudiante {
    private String nombre;
    private String ci;
    private Tesis tesis;

    public Estudiante(String nombre, String ci) {
        this.nombre = nombre;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public Tesis getTesis() {
        return tesis;
    }

    public void setTesis(Tesis tesis) {
        this.tesis = tesis;
    }

    public void showInfoEstudiante(){
        System.out.println("El estudiante tiene el siguiente Nombre: "+getNombre());
        System.out.println("Con CI: "+getCi());
        tesis.showInfoTesis();
    }
}
