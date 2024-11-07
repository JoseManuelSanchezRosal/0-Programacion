public class operadores_relacionales10 
{
    public static void main(String[] args) 
    {
        //En JAVA tambien tenemos las expresiones logicas. El resultado sera de tipo booleano
        // es decir, true o false. Operadores relacionales:
        /**
         * == igual
         * != distinto
         * > mayor que
         * < menor que
         * >= mayor o igual que
         * <= menor o igual que
         */ 
         // Tambien podemos asignar el resultado de una expresion logica a una variable booleana:
         int a = 0, b = 1;
         boolean iguales = a == b; // 0 es igual a 1??
         System.out.println(iguales);   // la salida sera FALSE
         // Para comparar strings se utiliza EQUALS:
         String nombre1 = "Pepe";
         String nombre2 = "Jose";
         String nombre3 = "pepe";

         boolean iguales1 = nombre1.equals(nombre2);
         boolean iguales2 = nombre1.equals(nombre3);
         boolean iguales3 = nombre1.equalsIgnoreCase(nombre3);
         System.err.println(iguales1);//false
         System.err.println(iguales2);//false
         System.out.println(iguales3);//true
    }
}
