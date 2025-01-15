// Ejercicio 1. Escribe un programa en el que se declaren las variables enteras X e Y. Asignales los valores 144 y 999 respectivamente
// A continuacion, muestra por pantalla el valor de cada variable, la suma, la resta, la division y la multiplicacion:
package bloque_ej_1;
public class bloque1_ej1
{
    public static void main(String[] args) 
    {
        int x = 144;    //asignamos valor de variable tipo int X
        int y = 999;    //asinamos valor de avaribale tipo int Y
        System.out.println(x);  //sacamos por pantalla el valor de la variable X
        System.out.println(y);  //sacamos por pantalla el valor de la variable Y
        System.out.println(x+y);    //sacamos por pantalla la suma
        System.out.println(x-y);    //sacamos por pantalla la resta
        System.out.println(x*y);    //sacamos por pantalla la multiplicacion
        System.out.println((float)x/(float)y);    //sacamos por pantalla la division, pero antes haciendo conversion de tipos de las mismas
        //de entero a float, porque sino, el resultado de la division seria 0. Cuando en realidad seria 0,1441....
    }
}
