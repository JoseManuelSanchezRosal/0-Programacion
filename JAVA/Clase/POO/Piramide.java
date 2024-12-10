public class Piramide {
    private int altura;
    private static int piramidesCreadas = 0;    //Contador de piramides creadas.

    public Piramide(int altura){   //Constructor de
        this.altura = altura;
        piramidesCreadas ++;

    }
    public void setAltura(int altura){  //Constructor que inicializa la altura:
        this.altura = altura;
    }
    public static int getPiramidesCreadas(){   //Metodo para obtener el numero de piramides creadas.
        return piramidesCreadas;
    }

    public static void main(String[] args) {
        Piramide pir1 = new Piramide(4);
        Piramide pir2 = new Piramide(7);
        System.out.println("Piramides creadas hasta el momento: "+Piramide.getPiramidesCreadas());

    }
}