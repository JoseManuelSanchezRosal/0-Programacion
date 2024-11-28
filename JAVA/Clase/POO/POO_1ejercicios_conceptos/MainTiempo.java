package POO_1ejercicios_conceptos;

public class MainTiempo {
    public static void main(String[] args){
        Tiempo t1 = new Tiempo(1, 55, 45);
        Tiempo t2 = new Tiempo(2, 45, 3);

        System.out.println("El tiempo de nuestro objeto tiempo t1 es :"+t1.getHoras()+" horas, " +t1.getMinutos()+" minutos, "+t1.getSegundos()+" segundos.");
        System.out.println(t1);

    }
}
