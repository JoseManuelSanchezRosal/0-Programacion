/** Ejercicio 6. Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo son intervalos de tiempo y se crean de la forma:
Tiempo t = new Tiempo(1, 20, 30)
Donde los parámetros que se le pasan al constructor son las horas, los minutos y los segundos respectivamente. Crea el metodo toString para ver los intervalos de tiempo de la forma 10h 35m 5s.
Si se suman por ejemplo 30m 40s y 35m 20s, el resultado debería ser 1h 6m 0s. Realiza un programa de prueba para comprobar que la clase funciona correctamente.*/

package POO_1ejercicios_conceptos;

public class Tiempo {
    private int horas;
    private int minutos;
    private int segundos;

    // Constructor:
    Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    //Metodos setters y getters:
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos){
        this.minutos = minutos;
    }
    public int getSegundos(){
        return segundos;
    }
    public void setSegundos(int segundos){
        this.segundos = segundos;
    }
    // Metodo suma
static void sumaTiempo(){

}

}
