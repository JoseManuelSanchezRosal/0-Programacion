// Ejercicio 2. Realice una traza del siguiente algoritmo y muestra la salida por pantalla

public class Bol3_ej2 {
    public static void main(String[] arg){
        int i, j;
        // Bucle exterior: i va de 1 a 3
        for (i = 1; i <= 3; i++) {
            j = i + 1;  // Inicializamos j
            // Bucle interior: mientras j < 4
            while (j < 4) {
                System.out.println(j - i);  // Imprimir el resultado de j - i
                j= j+1;  // Incrementar j
            }
        }
    }
}