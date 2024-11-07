// Ejercicio 3. Realiza un conversore de pesetas a euros. La cantidad de pesetas que se quiere convertir
//debe ser introducida por teclado:

import java.util.Scanner;

public class bloque2_ej3
{
    public static void main(String[] args) 
    {
        // Creamos objeto scanner (sc)
        Scanner sc = new Scanner(System.in);    

        // Pedimos introducir cantidad en pesetas por teclado:
        System.out.println("Introduzca cantidad de pesetas a convertir: ");
        float pesetas = sc.nextInt();

        // Por ultimo, sacamos por pantalla la conversion en euros:
        System.out.println(pesetas +" pesetas equivalen a " + (pesetas/166.386));
    }
}