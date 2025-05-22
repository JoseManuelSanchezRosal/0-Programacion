package src.examen;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que permite serializar y deserializar una lista de objetos Persona.
 */
public class SerializadorObjetos {
    /**
     * Serializa una lista de personas en un archivo binario.
     */
    public static void guardarPersonas(List<Agenda.Persona> personas, String rutaArchivo) {
        // TODO: Implementar serialización con ObjectOutputStream
        try {
            ObjectOutputStream serializar= new ObjectOutputStream(new FileOutputStream(rutaArchivo));
            serializar.writeObject(personas);;
            serializar.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    /**
     * Deserializa una lista de personas desde un archivo binario.
     */
    public static List<Agenda.Persona> cargarPersonas(String rutaArchivo) {
        // TODO: Implementar deserialización con ObjectInputStream
        File ruta = new File(rutaArchivo);
        try {
            ObjectInputStream deserializar = new ObjectInputStream();
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        String ruta = "resources/personas.dat";

        List<Agenda.Persona> personas = new ArrayList<>();
        personas.add(new Agenda.Persona("Ana", 25));
        personas.add(new Agenda.Persona("Luis", 30));

        guardarPersonas(personas, ruta);
        List<Agenda.Persona> cargadas = cargarPersonas(ruta);

        for (Agenda.Persona p : cargadas) {
            System.out.println(p);
        }
    }
}