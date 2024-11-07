public class MEDODOS_STRING6 
{
    public static void main(String[] args) 
    {
        // Una cadena de texto "string" es un bloque de caracteres alfanumericos, que usaremos para almacenar palabras
        //y frases. Pueden tener 0 o mas caracteres
        
        String nada = "";   //cadena de texto vacia
        String nombre = "Jose";
        String apellido = "Sanchez";
        String nombreapellido = nombre+apellido;

        // VER METODOS DE STRINGS UTILIZADOS 

        // A partir de la version 15 de JAVA estan disponibles los TEXT-BLOCKS, nos permiten introducir strings
        //varias lineas de forma sencilla USANDO COMILLAS DOBLES TRES VECES SEGUIDAS SIN ESCRIBIR NADA AL ABRIR NI
        //CERRAR COMILLAS:
        String bloque = """
                Que paso con el que dijo que te amaba??
                acaso se fue y te has quedado ilusionada??
                te dije que te pagarian con la misma moneda!
                """;
        System.out.println(bloque);
        System.out.println(bloque.length());

        // Se puede declarar un String de la forma sencilla o con un CONSTRUCTOR:
        String cancion = new String("Asereje");
        System.out.println(cancion);
    }
}
