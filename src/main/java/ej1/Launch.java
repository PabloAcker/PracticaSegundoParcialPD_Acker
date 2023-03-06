package ej1;

public class Launch {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Manuel", "74816410");
        VersionadorTesis versionadorTesis = new VersionadorTesis();
        Almacenamiento almacenamiento = new Almacenamiento();

        estudiante.setTesis(new Tesis(20," "));

        for(int a = 0; a<5; a++) {
            String revision = "";
            String version = "";

            switch (a) {

                case 0:
                    revision = "Primera";
                    version = "Primera";
                    break;
                case 1:
                    revision = "Segunda";
                    version = "Segunda";
                    break;

                case 2:
                    revision = "Tercera";
                    version = "Tercera";
                    break;

                case 3:
                    revision = "Cuarta";
                    version = "Cuarta";
                    break;

                case 4:
                    revision = "Quinta";
                    version = "Quinta";
                    break;
            }

            estudiante.setTesis(new Tesis(20, revision));

            versionadorTesis.setTesis(estudiante.getTesis());
            almacenamiento.crearVersionTesis(version + " version", versionadorTesis.crearVersionTesis());


        }

        System.out.println("Mostrando la Quinta version>>>>>");
        estudiante.showInfoEstudiante();

        estudiante.setTesis(versionadorTesis.restaurarVersionTesis(almacenamiento.getVersionTesis("Tercera version")));

        System.out.println("Mostrando la Tercera version>>>>>");
        estudiante.showInfoEstudiante();


    }
}

