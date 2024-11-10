// 20. Pedir un numero N, introducir N sueldos y mostrar el sueldo maximo.

import java.util.Scanner;

public class Bol2_ej20 {
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);
        int numeroSalarios = 0;
        int salario;
        int salarioMaximo = 0;

        // Pedimos N sueldos
        System.out.println("Introduce numero de salarios a ingresar");
        numeroSalarios = sc.nextInt();
        for (int i = 0; i < numeroSalarios; i++){
            System.out.println("Introduzca salario: ");
            salario = sc.nextInt();
            if (salario > salarioMaximo)
                salarioMaximo = salario;
        }
        System.out.println("El salario maximo de los "+numeroSalarios+" salarios introducidos es de :"+salarioMaximo+" euros");
        }
    }