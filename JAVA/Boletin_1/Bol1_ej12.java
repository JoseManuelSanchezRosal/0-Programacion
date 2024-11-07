// 12. Pedir un numero entre el 0 y el 9999 y mostrarlo con las cifras al reves.
import java.util.Scanner;
public class Bol1_ej12
{
    public static void main(String[] args) 
    {
        // Creamos el objeto scanner (sc) para leer de teclado:
        Scanner sc = new Scanner(System.in);

        // Pido numero por pantalla:
        System.out.println("Introduce un numero entre 0 y 9999");
        int num = sc.nextInt();

        // Cogemos unidades:
        int unidades = num % 10;

        // Descartamos unidades dividiendo por 10 y machacando num
        num = num/10;

        // Cogemos las decenas:
        int decenas = num %10;

        // Descartamos decenas dividiendo por 10 y machacando num
        num = num/10;

        // Cogemos las centenas:
        int centenas = num %10;

        // Descartamos centenas dividiendo por 10 y machacando num
        num = num/10;

        // Cogemos las decenas de millar:
        int dm = num;

        System.out.println(""+unidades+""+decenas+""+centenas+""+dm);
    }
}
