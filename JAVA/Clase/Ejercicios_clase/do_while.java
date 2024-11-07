// Estructura do while. Mostrar numero introducido con Bucle do while que termina cuando se introduce por teclado un numero impar:

import java.util.Scanner;

public class do_while 
{
    public static void main(String[] args) 
    {
        int num;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Introduzca numero: ");
            num = sc.nextInt();
        } while (num % 2 == 0);
        System.out.println("El numero introducido es IMPAR");
    }
}