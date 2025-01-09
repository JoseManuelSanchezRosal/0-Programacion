// Ejercicio 4. Escribe un programa que sume, reste, multiplique y divida dos numeros introducidos por teclado:

import java.util.Scanner;

public class bloque2_ej4
{
    public static void main(String[] args) 
    {
        // Creamos nuestro objeto scanner (sc) para leer datos desde teclado:
        Scanner sc = new Scanner(System.in);

        // Pedimos los numeros por teclado:
        System.out.println("Introduzca primer numero: ");
        float num1 = sc.nextInt();
        System.out.println("Introduzca segundo numero: ");
        float num2 = sc.nextInt();

        System.out.println("Suma de " + num1 +" y " + num2 + " = " + (num1 + num2));
        System.out.println("Resta de " + num1 +" y " + num2 + " = " + (num1 - num2));
        System.out.println("Producto de " + num1 +" y " + num2 + " = " + (num1 * num2));
        System.out.println("Division de " + num1 +" y " + num2 + " = " + (num1 / num2));
    }
}
