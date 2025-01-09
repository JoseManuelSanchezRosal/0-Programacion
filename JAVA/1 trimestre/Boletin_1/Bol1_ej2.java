// 2. Pedir el radio de un circulo y calcular su area (A=PI*r^2)

import java.util.Scanner;
public class Bol1_ej2
{
    public static void main(String[] args) 
    {
        // Creamos nuestro objeto scanner para leer radio por teclado.
        Scanner sc = new Scanner(System.in);

        // Pedimos radio de nuestro circulo por teclado:
        System.out.println("Introduzca radio en cm: ");
        float radio = sc.nextFloat();

        // Calculamos el area del circulo y la sacamos por pantalla:
        double area = 3.1415926 * (radio*radio);
        System.out.println("El area de un circulo de radio "+ radio +" es de " +area+ " cm2");
    }
}