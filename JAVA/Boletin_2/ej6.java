/* 6. Pedir numeros hasta que se teclee un 0. Mostrar la suma de todos los numeros introducidos */

import java.util.Scanner;

public class ej6 
{
    public static void main(String[] args) 
    {
        int num = 1;
        int suma = 0;
        int total = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduzca numero: "); num = sc.nextInt();
            suma += num;
            total++;
            
        } while (num != 0);
        System.out.println("La suma total de los "+total+ " numeros introducidos es "+ suma); 
    } 
}