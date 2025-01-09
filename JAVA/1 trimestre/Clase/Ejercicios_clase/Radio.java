// Pedir el radio de un circulo para calcular su area (a = pi (r2))

import java.util.Scanner;

public class Radio
    {
        public static void main(String[] args) 
        {
            // Creamos nuestr objeto scanner (sc) para pedir el radio(numero entero):
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce radio del ciruculo (en cm)");
            int radio = sc.nextInt();

            // Calculamos area y la printeamos:
            System.out.println("Tu circulo tendra " + (3.141592*(radio*radio))+ " cm de area");
        }
    }