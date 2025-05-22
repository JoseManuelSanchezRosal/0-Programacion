package src.examen;

import java.io.File;

/**
 * Clase que lista todos los archivos y carpetas de un directorio dado.
 */
public class ListadorDirectorios {
    /**
     * Lista el contenido del directorio especificado.
     *
     * @param rutaDirectorio Ruta absoluta o relativa del directorio.
     * @return Array de cadenas con el nombre y tipo de cada elemento.
     */
    public static String[] listarContenido(String rutaDirectorio) {
        // TODO: Implementar el listado de archivos y carpetas
        File directorio = new File(rutaDirectorio);
        if((directorio.exists()) && directorio.isDirectory()){
            File[] lista = directorio.listFiles();
            if(lista != null){
                for (File elemento: lista){
                    if(elemento.isFile()){
                        System.out.println(elemento.getName() + " Es un AARCHIVO");
                    }else if(elemento.isDirectory()){
                        System.out.println(elemento.getName()+" Es un DIRECTORIO");
                    }
                }
            }else {
                System.out.println("no se pudo leer el directorio");
            }
        }else {
            System.out.println("El directorio no existe");
        }
        return new String[0];
    }

    public static void main(String[] args) {
        String ruta = "resources/";
        String[] resultado = listarContenido(ruta);
        for (String s : resultado) {
            System.out.println(s);
        }
    }
}