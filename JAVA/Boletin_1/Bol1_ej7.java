// 7. Pedir dos numeros y decir cual es mayor:
import java.util.Scanner;
public class Bol1_ej7 {
    public static void main(String[] args) 
    {
        // Objeto scanner sc
        Scanner sc = new Scanner(System.in);
        
        // Pedimos al usuario que introduzca dos numeros enteros:
        System.out.println("Introduzca numero a:");
        int a = sc.nextInt();
        System.out.println("Introduzca numero b:");
        int b = sc.nextInt();

        // Comparamos y sacamos por pantalla
        if (a > b){
            System.out.println("El numero " + a + " es mayor que " + b);
        }
        else {
            System.out.println("El numero "+ b +" es mayor que "+ a);
        }
    }
}