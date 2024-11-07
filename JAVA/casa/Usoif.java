// Uso del condicional if:

import java.util.Scanner;

public class Usoif 
{
    public static void main(String[] args) 
    {
        // Cremos nuestro objeto scanner para leer de teclado:
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que introduzca un numero del 1 al 10:
        System.out.println("Introduzca un numero del 1 al 10:");
        int num = sc.nextInt();

        if (num == 1) 
        {
            System.out.println("Ha elegido el numero 1");
        }
        else if (num == 2) 
        {
            System.out.println("Ha elegido el numero 2");
        }
        else if (num == 3) 
        {
            System.out.println("Ha elegido el numero 3");
        }
        else if (num == 4) 
        {
            System.out.println("Ha elegido el numero 4");
        }
        else if (num == 5) 
        {
            System.out.println("Ha elegido el numero 5");
        }
        else if (num == 6) 
        {
            System.out.println("Ha elegido el numero 6");
        }
        else if (num == 7) 
        {
            System.out.println("Ha elegido el numero 7");
        }
        else if (num == 8) 
        {
            System.out.println("Ha elegido el numero 8");
        }
        else if (num == 9) 
        {
            System.out.println("Ha elegido el numero 9");
        }
        else if (num == 10) 
        {
            System.out.println("Ha elegido el numero 10");
        }
        else
        {
            System.out.println("Ha elegido el numero 0");
        }
    }
}