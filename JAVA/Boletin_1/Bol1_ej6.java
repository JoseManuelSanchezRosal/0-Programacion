// 6. Pedir dos numeros y decir si uno es multiplo del otro.

import java.util.Scanner;
public class Bol1_ej6
{
    public static void main(String[] args) 
    {
        // Objeto scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos los 3 numeros de teclado:
        System.out.println("Introduzca primer numero entero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca segundo numero entero: ");
        int num2 = sc.nextInt();

        // Comprobamos si el segundo numero es multiplo del primero y lo sacamos por pantalla:
        if (num1 % num2  == 0)  // Si el resto de la division de num1 entre num2 es 0, significa que num2 es multiplo de num1
        {
            System.out.println("SI es multiplo!!");
        }
        else
        {
            System.out.println("NO ES MULTIPLO");
        }
    }
}