// 10. Pedir 15 numeros y escribir la suma total.

import java.util.Scanner;

public class Bol2_ej10 {
    public static void main(String[]args){
        // Damos de alta nuestro objeto scanner para leer de teclado:
        Scanner sc = new Scanner(System.in);
        // Inicializamos variables que vamos a usar
        int numeros = 0;
        int cantidad = 0;
        int suma = 0;
        do {System.out.println("Introduzca numero: ");
            numeros = sc.nextInt();
            suma = suma + numeros;
            cantidad+= 1;
            System.out.println(suma);
            System.out.println(cantidad);

        }while (cantidad < 15);
        System.out.println("La suma total es de "+suma+" dividida entre "+cantidad+" es de "+ suma/cantidad);
    }
}
