/* 14. Pedir 10 sueldos. Mostrar su suma y decir cuantos hay mayores de 1000*/

import java.util.Scanner;

public class Bol2_ej14 {
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);

        long salario;
        long sumaSalario = 0;
        long mayorMil = 0;

        // Creamos bucle for para pedir 10 salarios
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca salario: ");
            salario = sc.nextLong();
            if (salario < 1000) {
                sumaSalario += salario;
            } else if (salario > 1000) {
                sumaSalario += salario;
                mayorMil += 1;
            }
        }
        System.out.println("La suma de salarios es de: "+sumaSalario+" euros, y el numero de sueldos mayores de 1000 es: "+mayorMil);
    }
}
