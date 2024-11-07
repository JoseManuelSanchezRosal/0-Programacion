// 5. Pedir un numero e indicar si es positivo o negativo.

import java.util.Scanner;
public class ej5 
{
    public static void main(String[] args) 
    {
        // Objeto scanner leer de teclado:
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero positivo o negativo: ");
        double num = sc.nextDouble();

        // Comparar y mostrar por pantalla si es positivo o negativo:
        if (num > 0){
            System.out.println("El numero es POSITIVO");
        }
        else if(num < 0){
            System.out.println("El numero es NEGATIVO");
        }
        else{
            System.out.println("El numero es 0");
        }
    }
}
