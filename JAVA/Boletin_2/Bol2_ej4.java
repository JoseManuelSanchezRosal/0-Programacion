/* 4. Pedir numeros hasta que se teclee uno negativo. Mostrar cuantos numeros se han introducido */

import java.util.Scanner;

public class Bol2_ej4
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num;
        int cant = 0;
        do {
            System.out.println("Introduzca numero: "); num = sc.nextInt();
            cant++;
        } while (num >= 0);
        System.out.println("Se han introducido "+cant+ " numeros");
    }
}