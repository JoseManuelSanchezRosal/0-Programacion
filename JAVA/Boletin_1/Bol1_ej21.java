/* 21. Pedir una nota numerica entera entre 0 y 10 y mostrarla de la forma: cero, uno, etc... */

import java.util.Scanner;

public class Bol1_ej21
{
    public static void main(String[] args) 
    {
        int num;
        String nota = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una nota de 0 a 10");
        num = sc.nextInt();
        switch (num) {
            case 0:
                nota = "Cero"; break;
            case 1:
                nota = "Uno"; break;
            case 2:
                nota = "Dos"; break;
            case 3:
                nota = "Tres"; break;
            case 4:
                nota = "Cuatro"; break;
            case 5:
                nota = "Cinco"; break;
            case 6:
                nota = "Seis"; break;
            case 7:
                nota = "Siete"; break;
            case 8:
                nota = "Ocho"; break;
            case 9:
                nota = "Nueve"; break;
            case 10:
                nota = "Diez"; break;

            default:
                System.err.println("Introduzca nota valida");break;}

        System.out.println(nota);
    }
}
//Esto es un comentario de prueba para hacer un commit