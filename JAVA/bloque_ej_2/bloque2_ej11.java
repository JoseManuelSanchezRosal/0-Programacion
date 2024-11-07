// Ejercicio. Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura
// Programacion para obtener la media deseada. Hay que tener en cuenta que la nota del primer examen cuenta el 40%
// y la del segundo examen cuenta un 60%:
import java.util.Scanner;
public class bloque2_ej11
{
    public static void main(String[] args) 
    {
        // Creamos nuestro objeto SC para leer entrada de datos desde teclado:
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario la nota del primer examen de Programacion:
        System.out.println("Introduzca la nota del primer examen de Programacion: ");
        float primer = sc.nextFloat();
        
        // Pasamos la nota a escala 0/10:
        float unoadiez = (primer * 4)/10;

        // Pedimos al usuario la nota deseada en el trimestre de Programacion:
        System.out.println("Que nota deseas tener en el trimestre en Programacion??: ");
        float deseada = sc.nextFloat();

        // Restamos la nota del primer examen a la deseada (escala 0/10) para saber la nota del 2 examen en escala 0/10:
        float dosadiez = deseada - unoadiez;   

        // Pasamos la nota deseada de escala 0/10 a escala 0/6 y la mostramos por pantalla:
        float segundo = (dosadiez*10)/6;
        System.out.println("Deberias sacar en el segundo examen una nota de: " + segundo);
    }
}
