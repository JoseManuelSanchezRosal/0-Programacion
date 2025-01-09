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
    public String toString(){
        String cadena = "";
        int espacios = altura -1;
        int planta = 1;
        int longitudLinea = 1;
        while (planta<= this.altura){
            //insercion de espacios
            for (int i = 1; i <= espacios; i++){
                cadena += " ";
            }


            //linea de piramide
            for (int i = 1; i <= longitudLinea; i++){
                cadena += "*";

            }
            cadena += "\n";
            planta++;
            espacios--;
            longitudLinea +=2;
        }
        return cadena;
    }
    public static void main(String[] args) {
        Piramide pir1 = new Piramide(4);
        Piramide pir2 = new Piramide(7);
        System.out.println("Piramides creadas hasta el momento: "+Piramide.getPiramidesCreadas());
        System.out.println(pir1);
    }
}