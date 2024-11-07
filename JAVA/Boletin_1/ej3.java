// 3. Pedir el radio de una circunferencia y calcular su longitud(L=2*PI*r).

import java.util.Scanner;
public class ej3 
{
    public static void main(String[] args) 
    {
        // Obejto scanner leer teclado:
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca radio de tu circunferencia en cm: ");
        float radio = sc.nextFloat();

        // Calculamos y sacamos por pantalla:
        double longitud = 2*3.14159265358*radio;
        System.out.println("El area de una circunferencia de "+radio+"cm de radio es "+longitud+" cm");
    }
}