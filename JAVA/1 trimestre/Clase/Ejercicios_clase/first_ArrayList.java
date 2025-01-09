// ECPLICACION Y EJEMPLOS DE ARRAYLIST

import java.util.ArrayList;
public class first_ArrayList{
    public static void main(String[] args){
        // Un ArrayList es lo que conocemos en PYTHON como LISTA.
        // Un ArrayList es una estructura de datos en JAVA que permite almacenar elementos de forma dinamica.
        // Ventaja sobre Array: No necesito definir su tamano de antemano.

        // Declarar un ArrayList:
        ArrayList<String> nombres= new ArrayList<>();
       
        // Agregar elementos al ArrayList
        nombres.add("Ester");
        nombres.add("Jose");
        nombres.add("Carlos");
        nombres.add("Jaime");
        System.out.println("Lista de nombres: "+ nombres);
        
        // Acceder a un elemento especifico:
        System.out.println("Primer nombre:" + nombres.get(0));
        System.out.println("Primer nombre:" + nombres.get(1));

        // Cambiar un elemento:
        nombres.set(1, "Carmen");
        System.out.println(nombres);} 
        /*
         * add() agregar items
         * get() acceder a un elemento por su index
         * set() cambia un elemento en una posicion especifica(posicion, "nuevo valor")
         */}