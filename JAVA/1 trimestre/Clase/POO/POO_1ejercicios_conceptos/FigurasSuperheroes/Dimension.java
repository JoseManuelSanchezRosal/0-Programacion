package POO.POO_1ejercicios_conceptos.FigurasSuperheroes;
//CLASE DIMENSION CON SUS PROPIEDADES
public class Dimension {
    private double alto;
    private double ancho;
    private double profundidad;

    //CONSTRUCTOR INICIALIZADO A 0:
    Dimension(){
        this.alto = 0;
        this.ancho = 0;
        this.profundidad = 0;
    }

    //CONSTRUCTOR PARAMETRIZADO:
    Dimension(double alto, double ancho, double profundidad){
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    //METODOS GET Y SET:
    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public double getProfundidad() {
        return profundidad;
    }
    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    //METODO PARA CONSULTAR EL VOLUMEN DE LA FIGURA:
    public double getVolumen(){
        return alto * ancho * profundidad;
    }

    //METODO TOSTRING:
    @Override
    public String toString() {
        return "{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", profundidad=" + profundidad +
                '}';
    }
}