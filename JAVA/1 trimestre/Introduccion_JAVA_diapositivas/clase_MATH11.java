public class clase_MATH11 
{
    public static void main(String[] args) 
    {
        /** En JAVA existe una CLASE que nos facilita la realizacion de funciones matematicas complejas
         * Para utilizar las funciones de dicha clase debemos escribir la palabra math seguida de un punto y finalmente
         * la funcion que queramos utilizar
         * 
         * MIRAR DIAPOSITIVAS 103
         */
        // Importar clase MATH
        double r = Math.pow(3, 3);
        System.out.println(r);
        r = r+0.6;
        System.out.println(r);
        r = Math.sqrt(r);
        System.out.println(r);
        System.out.println(Math.random());
        System.out.println(Math.E);
        r = 5;
        double area = Math.PI*Math.pow(r, 2);
        System.out.println(area);
        System.out.println(0.1+0.2);
        int a = 10; int b = 3;
        System.out.println(a/b);
    }
}