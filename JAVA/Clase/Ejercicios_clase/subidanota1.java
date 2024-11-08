// Pintar tableta y pegar bocado.

import java.util.Scanner;
public class subidanota1 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        int filas;
        int columnas;

        System.out.println("indica altura: ");
        filas = sc.nextInt();
        System.out.println("indica anchura");
        columnas = sc.nextInt();

        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int contador = 0;//Inicializamos contador de "espacios" a 0
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                
                if ((i == 0)||(i == filas-1)||(j == 0)||(j == columnas - 1)){
                    boolean borde = true;//Si estamos en el borde entramos a pegar el bocado, sino pintamos asterisco
                    
                        if (borde = true && contador == 0){
                            System.out.print("");
                            contador+=1;}//una vez pintamos el bocado o el espacio en blanco subimos contador de bocados a 1 para no pegar mas.
                        else{
                            System.out.print("*");
                        }
                }
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}