import java.util.Scanner;

public class Bol2_ej12 {
    public static void main (String[] arg) {

        int num;
        long factorial = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca numero: ");
        num = sc.nextInt();

        for (int i = num; i > 0; i--){
            factorial *=i;
            System.out.print(factorial+" ");
            System.out.println(i);}

        System.out.println(factorial);
    }
}