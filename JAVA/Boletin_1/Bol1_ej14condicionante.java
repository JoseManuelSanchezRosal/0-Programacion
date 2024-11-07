// 14. Pedir una nota de 0 a 10 y mostrarla de la forma insuficiente, suficiente, bien, etc... trata errores.

import java.util.Scanner;

public class Bol1_ej14condicionante
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nota de 0 a 10");
        float nota = sc.nextFloat();
            
        if (nota < 0 || nota > 10)
            System.err.println("Introduzca nota valida");

        else if (nota >=0 && nota < 5)
            System.out.println("Insuficiente");
        else if (nota >=5 && nota < 6)
            System.out.println("Suficiente");
        else if (nota >=6 && nota < 7)
            System.out.println("Bien");
        else if (nota >=7 && nota < 9)
            System.out.println("Notable");
        else if (nota >=9 && nota < 10)
            System.out.println("Sobresaliente");
        else if (nota == 10)
            System.out.println("Matricula");
    }
}