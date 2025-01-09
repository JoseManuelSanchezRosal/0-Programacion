/* 3. Leer numeros hasta que se introduzca un 0, para cada uno indicar si es par o impar */

import java.util.Scanner;

public class Bol2_ej3 {
    public static void main(String[] args) 
    {
        double num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduzca numero: "); num = sc.nextDouble();
            if (num % 2 == 0){
                System.out.print("El numero "+num+" es PAR...>> ");
            }
            else {
                System.out.print("El numero "+num+" es IMPAR...>> ");
            }
        } while (num != 0);
        System.out.println("Saliendo del programa....");
    }
}