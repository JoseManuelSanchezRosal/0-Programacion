package POO.POO_1ejercicios_conceptos.FigurasSuperheroes;

import java.util.ArrayList;
//CLASE COLECCION Y SUS PROPIEDADES:
public class Coleccion {
    private String nombreColeccion;
    private ArrayList<Figura> listaColeccion; //DECLARAR ARRAYLIST COMO ATRIBUTO O PROPIEDAD DE CLASE.

    //CONSTRUCTOR
    Coleccion(String nombreColeccion){
        this.nombreColeccion = nombreColeccion;
        this.listaColeccion = new ArrayList<Figura>(); //CREAR ARRAYLIST VACIO.
    }

    //METODOS GET Y SET:

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public ArrayList<Figura> getListaColeccion() {
        return listaColeccion;
    }

    public void setListaColeccion(ArrayList<Figura> listaColeccion) {
        this.listaColeccion = listaColeccion;
    }

    /**public void setListaColeccion(ArrayList<String> listaColeccion) {
        this.listaColeccion = listaColeccion;
    }*/

    //METODO PARA AÑADIR FIGURA:
    public Figura anadirFigura(Figura figura){
        listaColeccion.add(figura);
        return figura;
    }

    //METODO TOSTRING:
    @Override
    public String toString() {
        return "{" +
                "Colección ='" + nombreColeccion + '\'' +
                ", Lista =" + listaColeccion +
                '}';
    }

    //METODO PARA SUBIR PRECIO DE LA FIGURA DESDE LA COLECCION:
    public void subirPrecio(double cantidad, String codigo){
        for (Figura f: listaColeccion){//PARA RECORRER LA LISTA DE FIGURAS...
            if (f.getCodigo() == codigo){//...SI EL CODIGO DE ALGUNA COINCIDE CON LA QUE LE HEMOS DADO POR PARAMETRO...
                f.subirPrecio(cantidad);//...AUMENTAMOS EL PRECIO DE LA MISMA LA CANTIDAD PASADA.
                System.out.println("Precio figura "+ f.getSuperheroe()+" aumentada");
            } else System.out.println("El codigo no coincide con ninguna figura");
        }
    }
    
}
