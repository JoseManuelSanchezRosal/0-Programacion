package Estudio;
    // CREACION DE CLASE Auto:
class Auto {
    // ATRIBUTOS:
    String marca;
    String modelo;
    int numeroRuedas;
    String color;
    String year;
    //CONSTRUCTOR:
    public Auto(String marca, String modelo, int numeroRuedas, String color, String year){
        this.marca = marca;
        this.modelo = modelo;
        this.numeroRuedas = numeroRuedas;
        this.color = color;
        this.year = year;
    }
    public void mostrarDatos(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Numero de ruedas: " + numeroRuedas);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        //INSTANCIAS:
        Auto auto1 = new Auto("Seat", "Ibiza", 4, "amarillo", "2020");
        Auto auto2 = new Auto("Audi", "A5", 4, "blanco", "2024");

        auto1.mostrarDatos();
        System.out.println();
        auto2.mostrarDatos();

    }
}