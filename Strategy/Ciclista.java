public class Ciclista implements DistribuirStrategy {
    @Override
    public void distribuir() {
        System.out.println("Distribuyendo artículos por vía Ciclista.");
    }
}