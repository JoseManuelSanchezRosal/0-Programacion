package src.examen;
import src.examen.Agenda.Contacto;
import java.util.Scanner;

/**
 * Clase principal del gestor de contactos.
 * El alumno debe implementar el menú y la lógica de interacción con la clase Agenda.
 */
public class ProbarAgenda {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Contacto contacto = new Contacto();


        // TODO: Implementar lógica del menú interactivo

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n== GESTOR DE CONTACTOS DE MI AGENDA ==");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Listar todos los contactos");
            System.out.println("5. Guardar y salir");
            System.out.print("Elige una opción: ");

            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    // TODO: Llamar a método para agregar contacto
                    agenda.agregarContacto(contacto);

                    break;
                case 2:
                    // TODO: Llamar a método para eliminar contacto
                    break;
                case 3:
                    // TODO: Llamar a método para buscar contacto
                    break;
                case 4:
                    // TODO: Llamar a método para listar contactos
                    break;
                case 5:
                    // TODO: Guardar en JSON antes de salir
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

        sc.close();
        System.out.println("¡Hasta pronto!");
    }
}
