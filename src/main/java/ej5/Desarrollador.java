package ej5;

public class Desarrollador implements IDesarrollador{
    private String nombre;
    private String puesto;

    public Desarrollador(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public void update(String msg, Commit commit) {
        System.out.println("El siguiente mensaje es para " +getNombre()+ ", con puesto "+getPuesto()+": \n" +msg+ ". Proveniente del commit: " + commit.getId());
    }
}
