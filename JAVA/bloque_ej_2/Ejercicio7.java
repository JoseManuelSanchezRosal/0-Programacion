// Ejercicio 7. Escribe un programa que calcule el total de una factura a partir de la base imponible:

import java.util.Scanner;

public class Ejercicio7 
{
    public static void main(String[] args) 
    {
        // Creamos nuestro objeto scaner (sc) para recoger datos de teclado:
        Scanner sc = new Scanner(System.in);
        
        // Pedimos al usuario que introduzca el valor de la base imponible:
        System.out.println("Introduzca base imponible en euros para calcular factura: ");
        float baseimp = sc.nextInt();

        // Calculamos el iva de la cantidad introducida:
        float iva = (baseimp * 21)/100;

        // Calculamos el total de la factura = base imponible + IVA y lo sacamos por pantalla:
        System.out.println("El total de la factura es "+ (baseimp+iva)+" euros");

        // Tambien podemos hacerlo directamente, multiplicando la base imponible por 1.21:
        System.out.println(baseimp * 1.21+" euros");
    }
}
