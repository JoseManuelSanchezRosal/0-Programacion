// Ejercicio 1. Realizar detenidamente una traza al enunciado xxx y decir cual seria la salida por pantalla

public class Bol3_ej1 {
    public static void main(String[] arg){
        // Variables
        int suma, i, j;

        // Bucle exterior (i va de 1 a 4)
        for (i = 1; i <= 4; i++) {
            // Bucle interior (j va de 3 a 0, decrementando)
            for (j = 3; j >= 0; j--) {
                // Calculamos la suma
                suma = i * 10 + j;
                // Mostramos el valor de suma
                System.out.println(suma);
            }
        }
    }
}