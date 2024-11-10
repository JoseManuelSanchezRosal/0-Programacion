/* 13. Pedir 10 numeros. Mostrar la media de los numeros positivos, la media de los negativos y la cantidad de ceros*/

import java.util.Scanner;

public class Bol2_ej13 {
    public static void main(String[] arg) {
        // Primero declaramos las variables que vamos a necesitar:
        int ceros = 0;
        int suma_Pos = 0;
        int suma_Neg = 0;
        int cant_Pos = 0;
        int cant_Neg = 0;
        int numero;


        // Creamos nuestro objeto scanner para leer de teclado:
        Scanner sc = new Scanner(System.in);

        // Creamos nuestro bucle for para pedir los 10 numeros:
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca numero: ");
            numero = sc.nextInt();
            // Si el numero es 0 aumentamos en 1 el contador del mismo
            if (numero == 0)
                ceros += 1;
            // Si el numero es positivo, aumentamos contador de positivo y suma total
            else if (numero > 0){
                cant_Pos += 1;
                suma_Pos += numero;
                System.out.println(suma_Pos);//Sacamos por pantalla la suma total de positivos.
            }//Si el numero es negativo, aumentamos contador de negativos y la suma total
            else if(numero < 0){
                cant_Neg += 1;
            suma_Neg += numero;
                System.out.println(suma_Neg);}//Sacamos por pantalla la suma total de negativos.
        }
        System.out.println("La cantidad de ceros es: " + ceros);
        if (cant_Pos >= 1)
            System.out.println("La media de numeros positivos es: "+(suma_Pos/cant_Pos));
        if (cant_Neg >=1)
            System.out.println("La media de numeros negativos es: "+(suma_Neg/cant_Neg));
    }
}
