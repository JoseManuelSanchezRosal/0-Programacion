import java.util.Scanner;

public class EstudianteMain {
    public static void main(String[] arg) {
        Estudiante jose = new Estudiante("Jose", 39, "123ddde");
        Estudiante salva = new Estudiante("Salva", 18, "1 síndromeDAM");

        //Meter estudiante por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca nombre: ");
        String n = sc.nextLine();
        System.out.println("Introduzca edad: ");
        int e = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduzca matricula: ");
        String m = sc.nextLine();
        Estudiante jaime = new Estudiante(n, e, m);

      jose.mostrarInformacion();
      salva.mostrarInformacion();
      jaime.mostrarInformacion();
    }
}