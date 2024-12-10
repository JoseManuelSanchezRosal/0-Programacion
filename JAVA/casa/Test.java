import Estudio.Auto;

 class Test {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Seat", "Ibiza", 4, "amarillo", "2020");
        Auto auto2 = new Auto("Audi", "A5", 4, "blanco", "2024");

        auto1.mostrarDatos();
        System.out.println();
        auto2.mostrarDatos();
    }
}
