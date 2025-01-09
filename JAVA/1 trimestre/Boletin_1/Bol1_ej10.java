// 10. Pedir 3 numeros y mostrarlos ordenados de mayor a menor:
import java.util.Scanner;
public class Bol1_ej10
{
    public static void main(String[] args) 
    {
        // Creamos nuestro objeto scanner para leer de teclado.
        Scanner sc = new Scanner(System.in);
        
        // Pedimos los numeros a, b y c por teclado.
        System.out.println("Introduzca numero a: ");
        int a = sc.nextInt();
        System.out.println("Introduzca numero b: ");
        int b = sc.nextInt();
        System.out.println("Introduzca numero c: ");
        int c = sc.nextInt();

        // Comparamos los 3 numeros e imprimimos los numeros ordenados de mayor a menor:
        if (a >= b && b >= c){
            System.out.println("El numero "+a+" es mayor que "+b+" es mayor que "+c);
        }
        else if (a >= c && c >= b){
            System.out.println("El numero "+a+" es mayor que "+c+" es mayor que "+b);
        }
        else if (b >= a && a >= c){
            System.out.println("El numero "+b+" es mayor que "+a+" es mayor que "+c);
        }
        else if (b >= c && c >= a){
            System.out.println("El numero "+b+" es mayor que "+c+" es mayor que "+a);
        }
        else if (c >= a && a >= b){
            System.out.println("El numero "+c+" es mayor que "+a+" es mayor que "+b);
        }
        else if (c >= b && b >= a){
            System.out.println("El numero "+c+" es mayor que "+b+" es mayor que "+a);
        }
    }
}