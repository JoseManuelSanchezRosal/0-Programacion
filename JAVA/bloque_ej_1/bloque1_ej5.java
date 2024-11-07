// Ejercicio 5. Realizar un conversor de pesetas a euros. La cantidad en pesetas a convertir debera estar almacenada en una variable.

public class bloque1_ej5
{
    public static void main(String[] args) 
    {
        double peseta = 250000; //Aqui vamos cambiando el valor de pesetas.
        double conversion = peseta / 166.386;   //Aqui metemos la formula de la conversion de pesetas a euros
        System.out.println(peseta + " pesetas son " + conversion + " euros");
    }
}
