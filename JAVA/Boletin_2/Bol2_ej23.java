// 23. Pedir 5 numeros e indicar si alguno es multiplo de 3.

import java.util.Scanner;

public class Bol2_ej23 {
    public static void main (String[] arg) {
        Scanner sc = new Scanner(System.in);

        int num;
        boolean tres = false;
        int mul = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println("Introduzca numero: ");
            num = sc.nextInt();
            if (num % 3 == 0)//Si algun numero introducido es multiplo de 3 volvemos a true la variable.
                tres = true;

        }
        if (tres == true)
            System.out.println("Si hay multiplo de 3");
            else
                System.out.println("No hay multiplo de 3");
    }
}

