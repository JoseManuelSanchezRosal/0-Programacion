// 22. Pedir 5 calificaciones de alumnos y decir si al final hay algun suspenso

import java.util.Scanner;

public class Bol2_ej22{
    public static void main (String[] arg){
        Scanner sc = new Scanner (System.in);
        double calificacion = 0;
        boolean suspenso = false;

        for (int i = 1; i < 6; i++) {
            System.out.println("Introduzca calificacion: ");
            calificacion = sc.nextDouble();
            if (calificacion < 5)
                suspenso = true;
        }
        if (suspenso == true)
            System.out.println("EXISTE ALGUN SUSPENSO");
            else
                System.out.println("TODOS APROBADOS");
    }
}