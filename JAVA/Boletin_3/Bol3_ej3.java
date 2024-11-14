// Ejercicio 3. Disena un programa que muestre las tablas de multiplicar del 1 al 10

public class Bol3_ej3 {
    public static void main(String[] arg){
        for (int i = 1; i < 11; i++){
            System.out.println("La tabla del "+i+" es:");
            for (int j = 1; j < 11; j++){

                System.out.println(i+" * "+j+" = "+(i*j));
            }
            System.out.println();
        }
    }
}
