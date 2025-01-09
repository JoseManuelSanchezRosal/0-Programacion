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
    public void bajarPrecio(double cantidad, String codigo){
        for (Figura f: listaColeccion){
            if (f.getCodigo() == codigo){
                f.bajarPrecio(cantidad);
                System.out.println("Precio figura "+ f.getSuperheroe()+" disminuido");
            }else System.out.println("El codigo no coincide con ninguna figura");
        }
    }
    //METODO PARA RETORNAR LISTA DE SUPERHEROES CON CAPA MEDIANTE ARRAYLIST:
    /*public ArrayList<String> conCapa(){
        ArrayList<String> superheroeConCapa = new ArrayList<>();
        for (Figura f: listaColeccion){
            if (f.getSuperheroe().isCapa()){
                superheroeConCapa.add(f.getSuperheroe().getNombre());
            }
        }
        return superheroeConCapa;
    }*/
    //METODO CONCAPA MEDIANTE STRINGBUILDER:
    public StringBuilder conCapa(){
        StringBuilder sb = new StringBuilder();
        for (Figura f: listaColeccion){
            if (f.getSuperheroe().isCapa()){
                sb.append(f.getSuperheroe().getNombre());
            }
        }
        return sb;
    }

    //METODO PARA RETORNAR EL MAS VALIOSO:
    public String masValioso(){
        String figuraCara = "";
        double masCaro = 0;
        for (Figura f: listaColeccion){
            if (f.getPrecio() > masCaro){
                masCaro = f.getPrecio();
                figuraCara = f.getSuperheroe().getNombre();
            }
        }
        return figuraCara;
    }

    //METODO PARA DEVOLVER EL VALOR TOTAL DE LA COLECCION:
    public double getValorColeccion(){
        double total = 0;
        for (Figura f: listaColeccion){
            total += f.getPrecio();
        }
        return total;
    }

    //METODO PARA DEVOLVER EL VOLUMEN TOTAL DE LA COLECCION:
    public double getVolumenTotal(){
        double volTotal = 0;
        for (Figura f: listaColeccion){
            volTotal += f.getDimension().getVolumen();
        }
        return volTotal + 200;
    }
}