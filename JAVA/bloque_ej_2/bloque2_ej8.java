// Ejercicio 8. Escribe un programa que calcule el salario semanal(mensual, bruto y neto) de un empleado en base a las
// horas trabajadas, a razon de 12 euros la hora:

import java.util.Scanner;
public class bloque2_ej8
{
    public static void main(String[] args) 
    {
        // Creamos nuestro objeto scanner (sc) para pedir datos de teclado.
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario horas trabajadas y los dias de trabajo a la semana:
        System.out.println("Introduzca las horas trabajadas al dia: ");
        float horas = sc.nextInt();
        System.out.println("Introduzca dias de trabajo a la semana: ");
        float dias = sc.nextInt();

        // Sacamos el calculo de salario semanal y el mensual (de regalo):
        System.out.println("Tu salario semanal es de "+((horas*12)*dias)+" euros");
        System.out.println("Tu salario mensual bruto es de " + (((horas*12)*dias))*4 + " euros");
        float bruto = (((horas*12)*dias))*4;

        // Vamos a pedir el % de IRPF a descontar para sacar el neto de la factura:
        System.out.println("Introduzca IRPF en %: ");
        float ierrepeefe = sc.nextInt();

        // Calculamos el salario neto y lo sacamos por pantalla:
        float neto = (bruto - ((bruto * ierrepeefe)/100));
        System.out.println("Su salario neto a percibir es "+ neto + " euros");
    }
}