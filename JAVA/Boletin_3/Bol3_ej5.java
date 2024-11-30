// Ejercicio 5. Necesitamos mostrar un contador con 5 digitos X.X.X.X.X que muestre del 0-0-0-0-0 al 9-9-9-9-9
// con la peculiaridad que cada vez que vaya a mostrar un 3, lo sustituya una E en pantalla

public class Bol3_ej5 {
    //Realizamos 5 bucles for anidados, 1 por cada digito:
    public static void main(String[] arg) {
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    for (int d = 0; d < 10; d++) {
                        for (int e = 0; e < 10; e++) {
                            // A la hora de imprimir preguntamos si a == 3 me imprimes una "E", sino, su valor (y asi para todos los bucles)
                            System.out.println((a == 3 ? "E" : a) + "-" + (b == 3 ? "E" : b) + "-" + (c == 3 ? "E" : c) + "-" + (d == 3 ? "E" : d) + "-" + (e == 3 ? "E" : e));
                        }
                    }
                }
            }
        }
        for (int g = 0; g <20; g++){
            for (int s = 0;s< 20; s++){
                System.out.println("Asereje");
            }
        }
    }

}