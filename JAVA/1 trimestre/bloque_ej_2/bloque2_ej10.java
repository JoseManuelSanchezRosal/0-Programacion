// Ejercicio 10. Realiza un conversor de Kb a Mb:

import java.util.Scanner;
public class bloque2_ej10
{
    public static void main(String[] args) 
    {
        // Creamos nuestro objeto scanner (sc) para leer entrada de datos desde teclado.
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que introduzca la cantidad en Kb a convertir:
        System.out.println("Introduzca cantidad en Kb: ");
        float kb = sc.nextInt();

        // Sacamos por pantalla la conversion en Mb directamente:
        System.out.println(kb +" Kb equivalen a "+ (kb/1024)+" Mb");
    }   
}
