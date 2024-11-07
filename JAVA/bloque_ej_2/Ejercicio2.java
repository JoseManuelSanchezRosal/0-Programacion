// Ejercicio 2. Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe
//ser introducida por teclado:

import java.util.Scanner;

public class Ejercicio2 
{
    public static void main(String[] args) 
    {
        // Creamos el objeto scanner (sc) para leer entradas desde teclado:
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuari que introduzca una cantidad en euros por teclado:
        System.out.println("Introduzca cantidad de EUROS a convertir: ");
        float euros = sc.nextInt();

        // Sacamos por pantalla el equivalente en pesetas:
        System.out.println(euros + " euros "+" equivalen a " +(euros*166.386)+ " pesetas");
    }
}
