import java.util.ArrayList;


public class Teoria_ArraysList_Nivel2 
{
    public static void main(String[] args) 
    {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("manzana");
        frutas.add("pera");
        frutas.add("uva");
        frutas.add("naranja");

        for (int i = 0; i < frutas.size(); i++)
        {   //Para acceder al tamano o numero de items de la ArrayList hay que acceder con .size
           System.out.println("Fruta " +(i+1)+ ": "+ frutas.get(i));
        }

        // Imprimir usando un for-each
        for(String fruta:frutas){
            System.out.println("Fruta "+ fruta);
        }

        // Eliminar un elemento:
        frutas.remove("manzana");
        frutas.remove(1);
        System.out.println(frutas);

        // ArrayList de enteros donde se emplee lo siguiente:
        
        
        // Vaciar o limpiar los elementos del ArraysList
        
        // Buscar un elemento
        ArrayList<Integer> numeros = new ArrayList<>(5);
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        System.out.println("numeros: "+numeros);

        int numerobuscado = 30;
        if (numeros.contains(numerobuscado))
            System.out.println("El numero "+numerobuscado +" esta en la lista");
        
        else
            System.out.println("El numero no esta en la lista");
        
        // Clonar o copiar el ArraysList
        ArrayList<Integer> copiaNumeros = (ArrayList<Integer>)numeros.clone();
        System.out.println("copiaNumeros: "+copiaNumeros);
    }
}
