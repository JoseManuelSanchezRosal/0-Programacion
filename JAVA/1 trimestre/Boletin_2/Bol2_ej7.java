/* 7. Pedir numeros hasta que se introduzca uno negativo. Calcular la media y mostrarla. */

import java.util.Scanner;

public class Bol2_ej7
{
    public static void main(String[] args) 
    {
        int num = 1;
        int suma = 0;
        int total = 0;
        int media = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduzca numero: "); num = sc.nextInt();
            if (num >= 0){/*Tambien podemos quitar el if, y tambien contabiliza el numero negativo para la media*/
            suma = num + suma;
            total++;}

        } while (num >= 0);
        media = suma / total;
        System.out.println("Suma total: "+suma+" la cantidad de numeros: "+total+ " ,la media es de: "+ media); 
    }
}