// 11. Pedir un numero entre 0 y 9999 y decir cuantas cifras tiene.
import java.util.Scanner;
public class Bol1_ej11
{
    public static void main(String[] args) 
    {
        // Creamos nuestro objeto scanner para leer de teclado:
        Scanner sc = new Scanner(System.in);

        // Pedimos nuestro numero entero de 0 a 9999:
        System.out.println("Introduce numero entero de 0 a 9999: ");
        int numero = sc.nextInt();

        // Comparamos y sacamos el numero de cifras por pantalla:
        if (numero >= 0 && numero <=9){     //Se puede hacer con if(numero < 10)
            System.out.println("El numero tiene 1 cifra");
        }
        else if (numero >= 10 && numero <=99){      //Se puede hacer con if(numero < 100)
            System.out.println("El numero tiene 2 cifrasss");
        }
        else if (numero >= 100 && numero <=999){        //Se puede hacer con if(numero < 1000
            System.out.println("El numero tiene 3 cifras");
        }
        else {
            System.out.println("El numero tiene 4 cifras");     //Se puede hacer con if(numero < 10000) NOTA(pero con los if{else, if{elser, if{...}}})
        }
    }
}