/** Queremos gestionar la venta de entradas (no numeradas) de Expocoches Campanillas, que tiene 3 zonas:

 La sala principal con 1000 entradas disponibles.
 La zona de compra-venta con 200 entradas disponibles.
 La zona VIP con 25 entradas disponibles.

 Es necesario controlar que existen entradas antes de venderlas. Crea un programa que permita gestionar la venta de entradas con un menú:

 Mostrar número de entradas libres.
 Vender entradas.
 Salir.

 El programa debe preguntar para qué zona se quieren las entradas y cuántas se desean, asegurando que no se puedan vender más entradas de las disponibles.
 */

package POO_1ejercicios_conceptos;

import java.util.Scanner;

public class ej7_Expocoches {
    public static void main(String[] args) {
        Zona principal = new Zona(1000);
        Zona compraventa = new Zona(200);
        Zona vip = new Zona(20);

        int opcion = 0;
        int tipo_entrada;
        int numero_entradas;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Seleccione opcion: \n 1. Mostrar entradas. \n 2. Vender entradas. \n 3. Salir");
        opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.println("Disponibles principal: " + principal.getentradasDisponibles());
            System.out.println("Disponibles compraventa: " + compraventa.getentradasDisponibles());
            System.out.println("Disponibles vip: " + vip.getentradasDisponibles());
        } else if (opcion ==2) {
            System.out.println("Seleccione el tipo de entrada que desea: \n 1. Zona principal \n 2. Zona compraventa \n 3. VIP");
            tipo_entrada = sc.nextInt();
            System.out.println("Selecciona numero de entradas: ");
            numero_entradas = sc.nextInt();
            switch (tipo_entrada){
                case 1:
                    principal.venderEntradas(numero_entradas);
                    break;
                case 2:
                    compraventa.venderEntradas(numero_entradas);
                    break;
                case 3:
                    vip.venderEntradas(numero_entradas);
                    break;
                default:
                    System.out.println("error");
            }
            //SIN TERMINAR
        }
    }
}
