// Ejercicio 4. Dibuja un cuadrado de "N" elementos usando * (pidiendo N con JOption pane)

import javax.swing.*;

public class Bol3_ej4 {
    public static void main(String[] arg){
        //Pedir el numero entero N por JOptionPane:
        int lados = Integer.parseInt(JOptionPane.showInputDialog("Introduce lados de tu cuadrado: "));
        //Hacemos un bucle for anidado para imprimir el cuadrado de longitud "N":
        for (int i = 0; i < lados; i++) {
            // En cada fila, dibujamos n asteriscos
            for (int j = 0; j < lados; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
