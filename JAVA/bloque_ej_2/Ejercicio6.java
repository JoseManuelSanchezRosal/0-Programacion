// Ejercicio 6. Escribe un programa qque calcule el area de un triangulo.

import java.util.Scanner;

public class Ejercicio6 
{
    public static void main(String[] args) 
    {
        // Creamos nuestro objeto scanner (sc) para introducir datos de teclado:
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que introduzca la base y la altura de nuestro triangulo:
        System.out.println("Introduzca base (b) del triangulo en cm: ");
        float base = sc.nextInt();
        System.out.println("Introduzca altura (h)");
        float altura = sc.nextInt();

        // Sacamos por pantalla el area del triangulo:
        System.out.println("El area del rectangulo de "+base+" cm de base y " +altura+" cm de altura es "+(base *altura)/2 +" cm");
    } 
}