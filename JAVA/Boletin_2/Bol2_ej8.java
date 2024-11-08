/* 8. Pedir un numero N e imprimir todos los numeros del 1 al N */

import java.util.Scanner;

public class Bol2_ej8{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca numero: ");
        int num = sc.nextInt();

        for (int i = 1; i < num + 1; i++)
            System.out.print(i+" ");//Sacamos el print sin el salto de linea para ver mejor los numeros
    }
}