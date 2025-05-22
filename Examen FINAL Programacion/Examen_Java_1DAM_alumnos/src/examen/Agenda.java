package src.examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que gestiona una lista de contactos.
 * Se deben implementar los métodos indicados y completar getters y setters de la clase Agenda
 */
public class Agenda {
    private List<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public List<Contacto> getContactos() {
        return null;
    }

    public void setContactos(List<Contacto> contactos) {

    }

    /**
     * Agrega un nuevo contacto a la agenda.
     */
    //Implementada
    public void agregarContacto(Contacto contacto) {
        // TODO: Añadir el contacto a la lista
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca nombre: ");
        String nombreContacto = sc.nextLine();
        System.out.println("Introduzca telefono: ");
        String telefonoContacto = sc.nextLine();
        System.out.println("Introduzca email :");
        String emailContacto = sc.nextLine();

        Contacto nuevoContacto = new Contacto(nombreContacto, telefonoContacto, emailContacto);
        contactos.add(nuevoContacto);
        System.out.println("Contacto añadido correctamente");
    }

    /**
     * Elimina un contacto por nombre.
     * @return true si se eliminó correctamente, false si no se encontró
     */
    public boolean eliminarContacto(String nombre) {
        // TODO: Buscar y eliminar contacto por nombre (ignorar mayúsculas/minúsculas)
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca nombre del contacto a borrar: ");
        String nombreEliminar = sc.nextLine();
        return false;
    }

    /**
     * Busca todos los contactos que contengan el nombre dado.
     */
    public List<Contacto> buscarContacto(String nombre) {
        Scanner sc = new Scanner(System.in);
        // TODO: Buscar contactos cuyo nombre contenga el texto indicado
        return null;
    }

    //Se implementa la clase CONTACTO:
    public static class Contacto{
        private String nombre;
        private String telefono;
        private String email;

        public Contacto() {
        }
        public Contacto(String nombre, String telefono, String email) {
            this.nombre = nombre;
            this.telefono = telefono;
            this.email = email;
        }
        @Override
        public String toString() {
            return "Contacto{" +
                    "nombre='" + nombre + '\'' +
                    ", telefono=" + telefono +
                    ", email='" + email + '\'' +
                    '}';
        }
    }
    public static class Persona{
        private String nombre;
        private int edad;

        public Persona() {
        }
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
        @Override
        public String toString() {
            return "Persona{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    '}';
        }
    }
}