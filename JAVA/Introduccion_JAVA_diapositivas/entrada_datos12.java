import java.util.Scanner;

public class entrada_datos12 
{
    // ENTRADA DE DATOS DIAPOSITIVAS 113

    public static void main(String[] args) 
    {
        String nombre;  // Declaramos la variable nombre clase String "vacia"
        System.out.println("Introduzca su nombre (una palabra): ");
        Scanner entrada = new Scanner(System.in);
        nombre = entrada.next();    //Leemos hasta llegar a un espacio en blanco
        System.out.println("Hola, "+nombre);

        // Si queremos leer texto: .next() hasta espacio en blanco // .nextLine() lee hasta salto de linea
        // Para leer numeros: objetoscanner.nextInt().nextFloat().nextDouble()
        // Si queremos leer mas de un dato podemos repetir con .hasNext() que nos devolvera un booleano.
    }
}