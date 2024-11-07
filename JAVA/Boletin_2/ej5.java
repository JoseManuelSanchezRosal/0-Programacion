/* 5. Realizar un juego para adivinar un numero. Para ello pedir un numero N y luego
 ir pidiendo numeros indicando mayor o menor. El juego acaba cuando el usuario acierte.
 */

import java.util.Scanner;

public class ej5 
{
    public static void main(String[] args) 
    {
        int num = 156, adi;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce numero: "); adi = sc.nextInt();
            if (adi > num)
                System.out.print("MAYOR...>>> ");
            else if (adi < num)
                System.out.print("MENOR...>>> ");
            
        } while (num != adi);
        System.out.println("ACERTASTE!!!!");
    }
}