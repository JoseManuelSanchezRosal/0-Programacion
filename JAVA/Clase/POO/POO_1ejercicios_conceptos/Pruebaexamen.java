package POO_1ejercicios_conceptos;

public class Pruebaexamen {
    private int fecha;
    private String color;
    private int numero;

    Pruebaexamen(int fecha, String color, int numero){
        this.fecha = fecha;
        this.color = color;
        this.numero = numero;
    }

    public Pruebaexamen() { /**Constructor vacio para crear objetos sin pasar nada por parametro*/
    }


    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Pruebaexamen{" +
                "fecha=" + fecha +
                ", color='" + color + '\'' +
                ", numero=" + numero +
                '}';
    }

    public static void main(String[] args) {
        Pruebaexamen josema = new Pruebaexamen();
        josema.setColor("Rojo");
        System.out.println(josema.color);
        josema.setFecha(2025);
        System.out.println(josema.fecha);
        josema.setNumero(12);
        System.out.println(josema.numero);

        Pruebaexamen josema2 = new Pruebaexamen(39, "2025", 9);
        System.out.println(josema2);
        System.out.println(josema);

        Pruebaexamen josema3 = new Pruebaexamen();
        josema3.setColor("Verde");
        josema3.setFecha(1995);
        josema3.setNumero(40);

        System.out.println(josema2.getColor());
        

    }


}

