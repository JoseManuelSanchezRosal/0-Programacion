//Ejercicio 9. Realiza un conversor de Mb a Kb:

import java.util.Scanner;
public class Ejercicio9
{
    public static void main(String[] args) 
    {
        // Creamos objeto (sc) para leer entrada de datos desde teclado:
        Scanner sc = new Scanner(System.in);

        // Pedimos la candidad que queremos convertir en Mb:
        System.out.println("Introduzca cantidad en (Megabytes)");
        float megas = sc.nextInt();

        // Hacemos la conversion a Kb y la mostramos por pantalla directamente:
        System.out.println(megas + " megas equivalen a "+ (megas*1024)+" Kb");
    }
}
