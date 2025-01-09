/* 11. Disenar un programa que muestre el producto de los 10 primeros numeros impares*/

import java.util.Scanner;

public class Bol2_ej11 {
    public static void main(String[] args){
        System.out.println("Opcion rapida 10 primeros numeros: "+1*3*5*7*9);
        //Damos de alta nuestra variable que sera el numero de impares a multiplicar
        double cantidad = 0;
        double producto = 1;
        double contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca numero de multiplicaciones: ");
        cantidad = sc.nextInt();
        for (int i = 1; contador < cantidad; i+=2) {
            producto *= i;
            contador++;
            System.out.println(producto);
        }
        System.out.println("El resultado de realizar el producto de los primeros "+cantidad+" numeros impares es :"+producto);













    }
}
