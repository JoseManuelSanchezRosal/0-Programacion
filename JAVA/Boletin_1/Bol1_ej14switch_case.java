// 14. Pedir una nota de 0 a 10 y mostrarla de la forma insuficiente, suficiente, bien, etc...

import java.util.Scanner;

public class Bol1_ej14switch_case
{
    public static void main(String[] args) 
    {
        int nota;
        // Creamos nuestro objeto scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una nota: ");
        nota = sc.nextInt();
        switch (nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Insuficiente"); break;
            case 5:
                System.out.println("Suficiente"); break;
            case 6:
                System.out.println("Bien"); break;
            case 7:
            case 8:
                System.out.println("Notable"); break;
            case 9:
                System.out.println("Sobresaliente"); break;
            case 10:
            System.out.println("Mattricula"); break;
        default:
            System.err.println("Ingrese una nota de 0 a 10: ");
        }
    }
}