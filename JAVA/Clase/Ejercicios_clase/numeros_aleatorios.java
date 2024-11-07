public class numeros_aleatorios 
{
    public static void main(String[] args) 
    {
        System.out.println("Genera al azar un piedra papel o tijera: ");
        switch ((int) (Math.random() * 3)) {    //DEVUELVE UN NUMERO ENTRE 0.0 Y MENOR DE 1.0 (Por eso multiplicamos por 3 para tener desde 0,0 a 2,9)
            case 0:
                System.out.println("Piedra");break;
            case 1:
                System.out.println("Papel");break;
            case 2:
                System.out.println("Tijera");break;
            default:
                System.err.println("Error");
                break;
        }
    }
}
