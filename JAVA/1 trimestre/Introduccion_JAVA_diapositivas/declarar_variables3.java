public class declarar_variables3
{   // Existen tipos de variables para numeros muy grandes (Biginteger) y para mayor precision (Bigdecimal)
    public static void main(String[] args) 
    {
        int cantidad = 5+2; //guardamos en cantidad un 7
        System.out.println(cantidad);
        int precio = 10;    //guardamos en precio un 10
        System.out.println(precio);
        precio = 5; //modificamos el precio a 5
        System.out.println(precio);
        int precioFinal = cantidad * precio;    //guardamos 35 en preciofinal
        System.out.println(precioFinal);
        precioFinal = precioFinal + 10; // guardamos 45 en preciofinal
        System.out.println(precioFinal);

        // Hay otros tipos de variables:
        char d = 0;     // Almacena un unico caracter, puede ser letra, digito o cualquier caracter alfanumerico (2 bits)
        boolean si = true;  // Se usa para evaluar condiciones, puede ser "true" o "false"
        String cadena = "No me toques las palmas que me conozco";  // Se usa para almacenar cadenas de caracteres o conjunto de char.
        System.out.println(d);
        System.out.println(si);
        System.out.println(cadena);
    }
} 