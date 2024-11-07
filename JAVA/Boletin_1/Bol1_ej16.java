/* 16. Pedir dia, mes y year de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 dias
 * Sin years bisiestos:
*/

import java.util.Scanner;
public class Bol1_ej16
{
    public static void main(String[] args) 
    {

        int dia, mes, year; //Declaramos variables.
        Scanner sc = new Scanner(System.in);//Creamos nuestro objeto scanner
        //Pedimos dia, mes y year:
        System.out.println("Introduce dia: "); dia = sc.nextInt();
        System.out.println("Introduce mes: "); mes = sc.nextInt();
        System.out.println("Introduce year: "); year = sc.nextInt();

        if ((dia >=1 && dia <= 28)&&(mes >=1 && mes <=12)&&(year >=2024 && year <= 2100))
            System.out.println("fecha CORRECTA");
        if (dia > 28 && mes == 2)
                System.out.println("fecha INCORRECTA");
        if (dia == 31 && (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11))
            System.out.println("fecha INCORRECTA");
        
    }
}
//INCOMPLETO