// 15. Pedir el dia, mes y year de una fecha e indicar si la fecha es correcta. Suponiendo que todos los meses
// tienen 30 dias:

import java.util.Scanner;

public class Bol1_ej15
{
    public static void main(String[] args) 
    {
        //Declaramos variables como integer:
        int dia, mes, year;

        //Creamos nuestro scanner para leer de teclado:
        Scanner sc = new Scanner(System.in);
        //Pedimos dia, mes y year en integer
        System.out.println("Introduzca numero de dia (1 a 30):"); dia = sc.nextInt();
        System.out.println("Introduzca numero de mes (1 a 12):"); mes = sc.nextInt();
        System.out.println("Introduzca numero year (entre 2024 y 2100):"); year = sc.nextInt();

        if ((dia < 1 || dia > 30)||(mes < 1 || mes > 12)||(year < 2024 || year > 2100))
            System.out.println("Fecha INCORRECTA");
        else System.out.println("Fecha CORRECTA");
    }
}