import java.util.Scanner;

public class calculadora {
    /** Creamos metodos para suma, resta, producto y division*/
    public static double suma(double a, double b){
        return a + b;
    }
    public static double resta(double a, double b){
        return a - b;
    }
    public static double producto(double a, double b){
        return a * b;
    }
    public static double division(double a, double b){
        return a / b;
    }
    /**Metodo que nos devuelve el iva en funcion del precio y del tanto por ciento del mismo*/
    public static double iva(double precio, double porciento){
        return (precio * porciento)/100;
    }
    /**Metodo que nos devuelve el area de un circulo*/
    public static double areaCirculo(double r){
        return(Math.PI * r * r);
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        double c = suma(6,4);// Aqui declaramos la variable c y le pasamos el resultado del metodo suma
        System.out.println(c);// Se recomienda almacenar el resultado de un metodo en una variable.

        double resultado;
        System.out.println(suma(5, 4));
        System.out.println(resta(5, 3));

        /**
         * Tambien podemos pedir por teclado las variables y luego, aplicarles nuestro metodo.
          */

        double num1, num2;//Declaramos las 2 variables
        System.out.println("Introduce numero 1: ");
        num1 = sc.nextDouble();//Las pedimos por teclado
        System.out.println("Introduce numero 2: ");
        num2 = sc.nextDouble();//Las pedimos por teclado

        /**
         * LA BUENA PRAXIS ES, CREARNOS UNA VARIABLE A LA QUE LE APLICAREMOS NUESTRO METODO
         **/
        resultado = producto(num1, num2);
        System.out.println(resultado);

        
        System.out.println(producto(4, 6));
        System.out.println(division(10, 5));
        System.out.println(areaCirculo(5));
    }
}