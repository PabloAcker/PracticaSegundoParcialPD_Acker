package ej4;

public class Main {
    public static void main(String[] args) {
        Inbox inbox = new Inbox();
        GrupoWhapp grupoWhapp = new GrupoWhapp();

        UsuarioOnline persona1 = new UsuarioOnline(inbox);
        UsuarioOnline persona2 = new UsuarioOnline(inbox);
        UsuarioOnline persona3 = new UsuarioOnline(inbox);
        UsuarioOnline persona4 = new UsuarioOnline(inbox);
        UsuarioOnline persona5 = new UsuarioOnline(inbox);
        UsuarioOnline persona6 = new UsuarioOnline(inbox);
        UsuarioOnline persona7 = new UsuarioOnline(inbox);
        UsuarioOnline persona8 = new UsuarioOnline(inbox);
        UsuarioOnline persona9 = new UsuarioOnline(inbox);
        UsuarioOnline persona10 = new UsuarioOnline(inbox);

        persona1.setCi("64819642").setNombre("Ema");
        persona2.setCi("64710643").setNombre("Lagu");
        persona3.setCi("68901641").setNombre("Jotace");
        persona4.setCi("91904980").setNombre("Rotis");
        persona5.setCi("64178011").setNombre("Lucky");
        persona6.setCi("11111111").setNombre("Arduz");
        persona7.setCi("22222222").setNombre("Franz");
        persona8.setCi("33333333").setNombre("Fabian");
        persona9.setCi("44444444").setNombre("Charlie");
        persona10.setCi("55555555").setNombre("Andres");

            inbox.addUser(persona1)
                .addUser(persona2)
                .addUser(persona3)
                .addUser(persona4)
                .addUser(persona5)
                .addUser(persona6)
                .addUser(persona7)
                .addUser(persona8)
                .addUser(persona9)
                .addUser(persona10);

        persona1.addUser(persona5);

        persona1.send("Hola, como estas?!");

        System.out.println("==============================");


        persona1.setWpp(grupoWhapp);
        persona2.setWpp(grupoWhapp);
        persona3.setWpp(grupoWhapp);
        persona4.setWpp(grupoWhapp);
        persona5.setWpp(grupoWhapp);
        persona6.setWpp(grupoWhapp);
        persona7.setWpp(grupoWhapp);
        persona8.setWpp(grupoWhapp);
        persona9.setWpp(grupoWhapp);
        persona10.setWpp(grupoWhapp);

        grupoWhapp.addUser(persona1)
                .addUser(persona2)
                .addUser(persona3)
                .addUser(persona4)
                .addUser(persona5)
                .addUser(persona6)
                .addUser(persona7)
                .addUser(persona8)
                .addUser(persona9)
                .addUser(persona10);

        persona10.addUser(persona1)
                .addUser(persona2)
                .addUser(persona3)
                .addUser(persona4)
                .addUser(persona5)
                .addUser(persona6)
                .addUser(persona7)
                .addUser(persona8)
                .addUser(persona9);

        persona10.send("Hola grupo como estan el dia de hoy?");
    }
}
