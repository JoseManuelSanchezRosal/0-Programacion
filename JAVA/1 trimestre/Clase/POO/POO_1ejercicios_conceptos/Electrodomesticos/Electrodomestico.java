package Electrodomesticos;
import javax.swing.text.AbstractDocument;

//CLASE ELECTRODOMESTICO CON SUS PROPIEDADES:
public class Electrodomestico {
    private String tipo;
    private String marca;
    private double potencia;


    //CONSTRUCTOR PARAMETRIZADO:
    Electrodomestico(String tipo, String marca, double potencia){
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    //METODOS GET Y SET:
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    //METODO TOSTRING:
    @Override
    public String toString() {
        return "{" +
                "Tipo: '" + tipo + '\'' +
                ", Marca: '" + marca + '\'' +
                ", Potencia: " + potencia +
                '}';
    }

    //METODO PARA SABER EL CONSUMO DEL ELECTRODOMESTICO SEGUN HORAS DE FUNCIONAMIENTO:
    public double getConsumo(int horas){
        double consumo = getPotencia() * horas;
        return consumo;
    }

    //METODO PARA SABER EL COSTE SEGUN CONSUMO Y PRECIO POR KW/H:
    public double getCosteConsumo(int horas, double costeHora){
        double coste = (getPotencia()/100) * horas * costeHora;
        return coste;
    }
}