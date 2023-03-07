package ej5;

public class Main {
    public static void main(String[] args) {
        Git git = new Git();
        Repositorio repositorio = new Repositorio();

        repositorio.agregar(new Desarrollador("Ema","Developer"));
        repositorio.agregar(new Desarrollador("Lagu","DevOS"));
        repositorio.agregar(new Desarrollador("Beyer", "QA"));

        Codigo codigo;

        codigo = new Codigo("Hello world!");
        git.setCodigo(codigo);
        repositorio.createCommit("Primer commit", git.createCommit("11111"));

        codigo = new Codigo("Public abstract class Perrito(){}");
        git.setCodigo(codigo);
        repositorio.createCommit("Segundo commit", git.createCommit("22222"));

        codigo = new Codigo("private String Feliz;");
        git.setCodigo(codigo);
        repositorio.createCommit("Tercer commit", git.createCommit("33333"));

        codigo = new Codigo("public Perrito(String Feliz){}");
        git.setCodigo(codigo);
        repositorio.createCommit("Cuarto commit", git.createCommit("44444"));

        codigo = new Codigo("public static void main(String[] args){}");

        git.setCodigo(codigo);
        repositorio.createCommit("Quinto commit", git.createCommit("55555"));

        codigo.showInfo();
//===========================================================================================================
        System.out.println("\n");
        codigo = git.restoreCommit(repositorio.getCommit("Primer commit"), repositorio);

        codigo.showInfo();
        System.out.println("\n");

        // Eliminar a los desarrolladores antiguos
        repositorio.eliminarTodo();

        //Creando nuevos Desarrolladores
        repositorio.agregar(new Desarrollador("Hugo", "FullStack"));
        repositorio.agregar(new Desarrollador("Eynar", "QA"));
        repositorio.agregar(new Desarrollador("Rene", "Front End"));

        codigo = git.restoreCommit(repositorio.getCommit("Quinto commit"), repositorio);

        System.out.println("\n");
        codigo.showInfo();
    }
}
