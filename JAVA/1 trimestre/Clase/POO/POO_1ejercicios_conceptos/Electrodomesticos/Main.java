package Electrodomesticos;

public class Main {
    public static void main(String[] args) {
        Electrodomesticos.Electrodomestico secador = new Electrodomesticos.Electrodomestico("Secador", "LG", 1500);
        System.out.println(secador.getCosteConsumo(3, 0.15));

    }
}
