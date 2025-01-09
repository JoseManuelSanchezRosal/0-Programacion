public class Cuadrado {
    // Atributos
    private int lado = 3;
    // Constructor
    Cuadrado(int l) {
        this.lado = l;
    }
    // Metodo pinta. Pintamos un cuadrado que va en funcion de los lados que le introcuzcamos en "lado"
    public void PintaCuadrado() {
        for (int a = 0; a < lado; a++) {
            for (int b = 0; b < lado; b++) {
                if (a == 0 || b == 0 || a == lado - 1 || b == lado - 1) {
                    System.out.print(" + ");//Si estamos en bordes pintamos, sino, no.
                } else System.out.print("   ");
            }
            System.out.println();
        }
    }
}