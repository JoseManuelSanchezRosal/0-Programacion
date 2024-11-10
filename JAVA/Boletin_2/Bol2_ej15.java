/* Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media.
   la cantidad de alumnos mayores de 18 years, y la cantidad de alumnos que miden mas de 1.75*/

import java.util.Scanner;

public class Bol2_ej15 {
    public static void main (String[] arg){
        // Damos de alta las variable que necesitamos:

        double edad;
        double altura;
        int mayorEdad = 0;
        int altos = 0;
        double mediaEdad = 0;
        double mediaAltura = 0;
        //Creamos nuestro objeto scanner:
        Scanner sc = new Scanner(System.in);
        // Creamos bucle for para pedir edad y altura de 5 alumnos
        for (int i = 0; i < 5; i++){
            System.out.println("Introduzca edad: ");
            edad = sc.nextDouble();
            mediaEdad += edad;//Aumentamos suma edad para sacar media.

            System.out.println("Introduzca altura: ");
            altura = sc.nextDouble();
            mediaAltura += altura;//Aumentamos suma altura para hacer media.

            if (edad > 18)
                mayorEdad += 1;
            if (altura > 1.75)
                altos += 1;
        }
        System.out.println("Edad media de alumnos: "+(mediaEdad/5)+" years,  altura media de alumnos: "+(mediaAltura/5)+" m");
        System.out.println("Alumnos mayor de 18: "+mayorEdad+" el numero de alumnos altos es de: "+altos);



    }
}
