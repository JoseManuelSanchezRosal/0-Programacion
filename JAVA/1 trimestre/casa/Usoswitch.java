import java.util.Scanner;

public class Usoswitch 
{
    public static void main(String[] args) 
    {
        // Creamos nuestro objeto scanner para leer numero de teclado:
        System.out.println("Introduzca un numero entero");
        Scanner sc = new Scanner(System.in);


        // Pedimos valor de "a" desde teclado:
        int a = sc.nextInt();
        switch (a)
        {
            case 1://Si "a" vale 1:
                System.out.println("a es igual a 1");
                break;
            case 2://Si "a" vale 2:
                System.out.println("a es igual a 2");
                break;
            case 455://Si "a" vale 2:
                System.out.println("a es igual a 455");
                break;
            default://Si "a" no vale 1 ni 2:
                System.out.println("a no es igual a 1 ni a 2");
        } 
    }
}
