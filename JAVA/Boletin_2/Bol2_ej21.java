// 21. Pedir 10 numeros, y mostrar al final si se ha introducido alguno negativo

import java.util.Scanner;

public class Bol2_ej21 {
    //Creamos nuestro objeto scanner
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);
        //Damos de alta las variables que vamos a usar
        double num;
        boolean neg = false;
        // Creamos un bucle que recoja los 10 numeros
        for (int i = 1; i < 11; i++){
            System.out.println("Introduzca numero: ");
            num = sc.nextInt();
            //Si algun numero introducido es negativo, cambiamos estado de variable neg a true
            if (num < 0)
                neg = true;}

        //Sacamos por pantalla si se ha introducido o no, algun numero negativo.
        if (neg == true)
            System.out.println("SE HA INGRESADO alguno negativo");
            else
                System.out.println("NO SE HA INGRESADO alguno negativo");

    }
}
