/* 16. Pide un numero (que debe estar entre 1 y 10) mostrar la trabla de multiplicar de dicho numero */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bol2_ej16 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);//Objeto scanner
        int numero;
        boolean entradaCorrectadatos = false;
        while (!entradaCorrectadatos){
            System.out.println("Introduce tabla de multiplicar para mostrar del 1 al 10: ");// Pedimos tabla de multiplicar a mostrar
            try {
                numero = sc.nextInt();
                entradaCorrectadatos = true;

                for (int i = 1; i < 11; i++)
                    System.out.println(numero + " x " + i + " = " + (numero * i));
            } catch (InputMismatchException e) {
                System.out.println("Error, debe introducir un numero valido");
                sc.nextLine();//Limpiar el buffer de entrada de datos, para pedir otra vez el numero
            }
        }
    }
}
