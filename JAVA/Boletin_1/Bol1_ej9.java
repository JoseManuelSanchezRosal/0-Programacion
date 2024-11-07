// 9. Pedir dos numeros y mostrarlos ordenados de mayor a menor:

import java.util.Scanner;
public class Bol1_ej9
{
    public static void main(String[] args) 
    {
        // Creamos objeto scanner para leer de teclado:
        Scanner sc = new Scanner(System.in);
        
        // Pedimos nuestros numeros a y b:
        System.out.println("Introduce numero a");
        int a = sc.nextInt();
        System.out.println("Introduce numero b");
        int b = sc.nextInt();

        // Comparamos y lo sacamos por pantalla ordenados de mayor a menor:
        if (a < b){
            System.out.println(b+" "+a);
        }
        else{
            System.out.println(a+" "+b);
        }
    }
}