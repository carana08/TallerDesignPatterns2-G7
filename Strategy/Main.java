
public class Main {
    public static void main(String[] args) {
        // Crear el contexto de distribución
        DistribuirContext context = new DistribuirContext();

        // Establecer la estrategia de distribución por vía automotriz
        context.setStrategy(new Automotriz());
        context.distribute(); // Distribuyendo artículos por vía automotriz.

        
        //En un futuro nuevas formas de distribucion
        // Cambiar la estrategia de distribución por vía ciclista
        context.setStrategy(new Ciclista());
        context.distribute(); // Distribuyendo artículos por vía ciclista.

        // Cambiar la estrategia de distribución por vía férrea
        context.setStrategy(new Ferrea());
        context.distribute(); // Distribuyendo artículos por vía férrea.

        // Cambiar la estrategia de distribución por vía aérea
        context.setStrategy(new Aerea());
        context.distribute(); // Distribuyendo artículos por vía aérea.

        // Cambiar la estrategia de distribución por vía fluvial
        context.setStrategy(new Fluvial());
        context.distribute(); // Distribuyendo artículos por vía fluvial.
    }
}
