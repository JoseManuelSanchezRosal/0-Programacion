/*Programa que genera una bandera de colores aleatorios empleando un array de cadena de caracteres para almacenar colores */

import java.util.Scanner;

public class bandera 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String [] color = {"rojo","amarillo","verde","blanco","azul","negro"};
        System.out.println("Cuantas franjas quieres para tu bandera: ");
        int franjas = sc.nextInt();

        System.out.println("---------------");
        for (int i = 0; i < franjas; i++);
            System.out.println(color[(int)(Math.random() *color.length)]);//en lugar de * 6 se puede poner * color.length
            System.out.println("---------------");
    }
}
//INCOMPLETOOOO