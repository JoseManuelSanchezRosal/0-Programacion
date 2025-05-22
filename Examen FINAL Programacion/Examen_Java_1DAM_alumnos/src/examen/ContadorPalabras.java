package examen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase que cuenta el número total de palabras en un archivo de texto.
 * El alumno debe implementar el metodo contarPalabras(String rutaArchivo).
 */
public class ContadorPalabras {

    /**
     * Cuenta las palabras en el archivo indicado por la ruta.
     *
     * @param rutaArchivo Ruta del archivo de texto.
     * @return Número total de palabras encontradas.
     */
    public static int contarPalabras(String rutaArchivo) {
        // TODO: Implementar lectura del archivo línea a línea y conteo de palabras
        File ruta = new File(rutaArchivo);
        int contador = 0;
        try {
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
            String linea;
            while ((linea = lector.readLine())!=null){
                String []palabras = linea.split(" ");
                for(String palabra: palabras){
                    contador++;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return contador;
    }
    public static void main(String[] args) {
        // Ejemplo de ejecución
        String ruta = "resources/datos.txt"; // Asegúrate de que el archivo exista
        int total = contarPalabras(ruta);
        System.out.println("Total de palabras: " + total);
    }
}