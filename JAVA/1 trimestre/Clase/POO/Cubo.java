public class Cubo {
    //ATRIBUTOS
    int capacidad; // volumen maximo en litros
    int contenido; // contenido actual en litros
    //METODOS

    // Constructor
    Cubo(int c) {
        this.capacidad = c;
    }
    int getCapacidad() {
        return this.capacidad;
    }
    void setCapacidad(int c) {
        this.capacidad = c;
    }
    int getContenido() {
        return this.contenido;
    }
    void llena(){
        this.contenido = this.capacidad;
    }
    void vacio(){
        this.contenido = 0;
    }
    void pinta(){
        System.out.println("------------");
        System.out.println("|");
    }
}

    //SIN TERMINAR