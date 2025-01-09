/* 20. Pedir una hora de la forma hora, minutos, segundos y mostrar la hora en el segundo siguiente */

import java.util.Scanner;

public class Bol1_ej20
{
    public static void main(String[] args) 
    {
        int hora, min, seg;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce hora: "); hora = sc.nextInt();
        System.out.println("Introduce minutos: "); min = sc.nextInt();
        System.out.println("Introduce segundos: "); seg = sc.nextInt();

        if ((hora < 0 || hora > 24)||(min < 0 || min > 59)||(seg < 0 || seg > 59))
            System.out.println("Introduce formato valido");

    }
}

// INCOMPLETO.