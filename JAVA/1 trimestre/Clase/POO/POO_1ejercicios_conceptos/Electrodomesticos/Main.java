package POO.POO_1ejercicios_conceptos.Electrodomesticos;

public class Main {
    public static void main(String[] args) {
        Electrodomestico lavadora = new Electrodomestico("lavado", "LG", 2500);
        System.out.println("El consumo de de la lavadora es de: " + lavadora.getConsumo(5) + " watios");
        System.out.println(lavadora);
    }
}
