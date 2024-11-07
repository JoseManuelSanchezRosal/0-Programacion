// Ejercicio 1. Realiza un programa que pida dos numeros y luego muestre el resultado de su multiplicacion.

import java.util.Scanner;

public class Ejercicio1
{
    public static void main(String[] args) 
    {
        //Creamos objeto scanner (sc) para leer desde teclado.
        Scanner sc = new Scanner(System.in);    
        
        // Leemos primer numero entero desde teclado:
        System.out.println("Ingrese primer numero entero");
        int num1 = sc.nextInt();

        // Leemos segundo numero entero desde teclado:
        System.out.println("Introduce segundo numero entero: ");
        int num2 = sc.nextInt();

        //Realizamos la operacion de multiplicacion y la mostramos por pantalla:
        System.out.println("El resultado del producto de los numeros " + num1 + " y "+ num2 + " es " + (num1 * num2));
    }
}