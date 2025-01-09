// 4. Pedir dos numeros y decir si son iguales o no.

import java.util.Scanner;
public class Bol1_ej4
{
    public static void main(String[] args) 
    {
        // Objeto scanner leer teclado:
        Scanner sc = new Scanner(System.in);
        
        // Pedimos los 2 numeros enteros por teclado:
        System.out.println("Introduzca primer numero entero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca segundo numero entero: ");
        int num2 = sc.nextInt();

        // Hacemos comparacion y devolvemos resustado:
        if (num1 == num2){
            System.out.println("Los numeros SON IGUALES");
        }
        else {
            System.out.println("Los numeros SON DIFERENTES");
        }
    }
}