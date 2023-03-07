package ej6;

public class Main {
    public static void main(String[] args) {
        ChatIndividual chatIndividual = new ChatIndividual();
        ChatGrupal chatGrupal = new ChatGrupal();

        SalaComunicacion desarrollador1 = new SalaComunicacion(chatIndividual);
        SalaComunicacion desarrollador2 = new SalaComunicacion(chatIndividual);

        chatIndividual.addDesarrolador(desarrollador1).addDesarrolador(desarrollador2);

        desarrollador1.setNombre("Hugo").setCi("67941691");
        desarrollador2.setNombre("Enrique").setCi("7694311");

        desarrollador1.setCollegue(desarrollador2);

        desarrollador1.send("Necesito un reporte de tu ultimo trabajo lo mas pronto posible por favor.");

        System.out.println("=====================================");

        SalaComunicacion desarrollador3 = new SalaComunicacion(chatGrupal);
        SalaComunicacion desarrollador4 = new SalaComunicacion(chatGrupal);
        SalaComunicacion desarrollador5 = new SalaComunicacion(chatGrupal);


        desarrollador3.setNombre("Ema").setCi("689412911");
        desarrollador4.setNombre("Mishele").setCi("68940810");
        desarrollador5.setNombre("Fabiana").setCi("79014198");

        chatGrupal.addDesarrolador(desarrollador3)
                .addDesarrolador(desarrollador4)
                .addDesarrolador(desarrollador5);


        desarrollador3.send("Necesitamos hablar sobre el futuro proyecto grupal que haremos!.");

    }
}
