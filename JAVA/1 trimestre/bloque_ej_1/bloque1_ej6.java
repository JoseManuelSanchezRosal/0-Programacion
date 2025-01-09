// Ejercicio 6. Escribe un programa que calcule el total de una factura a partir de la base imponible (precio sin IVA)
// La base imponible sera almacenada en una variable.

public class bloque1_ej6
{
    public static void main(String[] args) 
    {
        double baseimponible = 6500;
        double conIVA = baseimponible * 1.21;
        System.out.println(baseimponible + " euros " + "con iva son " + conIVA + " euros");
    } 
}