package POO_1ejercicios_conceptos;

public class Zona {
    private int entradasDisponibles;

    Zona (int entradasDisponibles){
        this.entradasDisponibles = entradasDisponibles;
    }
    public int mostrarEntradas(){
        return entradasDisponibles;
    }
    public void setentradasDisponibles(int entradasDisponibles){
        this.entradasDisponibles = entradasDisponibles;
    }
    public int getentradasDisponibles(){
        return entradasDisponibles;
    }
    public void venderEntradas(int n){
        entradasDisponibles -= n;
        System.out.println("Venta de "+n+" entradas con éxito");
    }
}