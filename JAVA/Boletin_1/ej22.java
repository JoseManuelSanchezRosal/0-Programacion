// 22. Pedir un numero de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar "cincuenta y seis":
import java.util.Scanner;
public class ej22;
{
    public static void main(String[] args) 
    {
        // Declaramos variables:
        int numero, decenas, unidades;
        // Creamos nuestro objeto scanner:
        Scanner sc = new Scanner(System.in);
        // Pedimos nuestro numerod e 0 a 99 por teclado:
        System.out.println("Introduce un numero de 0 a 99: ");
        numero = sc.nextInt();

        decenas = numero / 10;
        unidades = numero % 10;
      

        switch (decenas) {
            case 0:
                System.out.print("");break;
            case 1:
                System.out.print("Diez ");break;
            case 2:
                System.out.print("Veinte ");break;
            case 3:
                System.out.print("Treinta ");break;
            case 4:
                System.out.print("Cuarenta ");break;
            case 5:
                System.out.print("Cincuenta ");break;
            case 6:
                System.out.print("Sesenta ");break;
            case 7:
                System.out.print("Setenta ");break;
            case 8:
                System.out.print("Ochenta ");break;
            case 9:
                System.out.print("Noventa ");break;

            default:
                System.err.println("Error, introduzca numero correcto de 0 a 99: ");break;}
            switch (unidades) {
                case 0:
                    System.out.print("");break;
                case 1:
                    System.out.print("uno");break;
                case 2:
                    System.out.print("dos");break;
                case 3:
                    System.out.print("tres");break;
                case 4:
                    System.out.print("cuatro");break;
                case 5:
                    System.out.print("cinco");break;
                case 6:
                    System.out.print("seis");break;
                case 7:
                    System.out.print("siete");break;
                case 8:
                    System.out.print("ocho");break;
                case 9:
                    System.out.print("nueve");break;
               
                default:
                System.err.println("Error, introduzca numero correcto de 0 a 99: ");break;}
    }
    @Override
    public String toString() {
        return "ej22 []";
    } 
}