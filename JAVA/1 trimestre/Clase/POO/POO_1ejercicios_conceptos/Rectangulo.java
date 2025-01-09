package POO_1ejercicios_conceptos;

public class Rectangulo {
    private int base;
    private int altura;
    private static int contadorR;

    Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
        contadorR++;
    }
    public void setcontadorR(int contadorR){
        this.contadorR = contadorR;
    }
    public int getcontadorR(){
        return contadorR;
    }
    public void setBase(int base){
        this.base = base;
    }
    public int getBase(){
        return base;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public int getAltura(){
        return altura;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < altura; i++) {  // Recorre la altura
            for (int j = 0; j < base; j++) {  // Recorre la base
                sb.append(" * ");  // Agrega un asterisco al StringBuilder
            }
            sb.append("\n");  // Salta a la siguiente línea después de imprimir una fila
        }
        return sb.toString();  // Devuelve la cadena construida

    }
    public static void main(String[] args) {
        Rectangulo rect1 = new Rectangulo(5, 5);
        Rectangulo rect2 = new Rectangulo(2, 7);
        System.out.println(rect1.getcontadorR());
    }
}