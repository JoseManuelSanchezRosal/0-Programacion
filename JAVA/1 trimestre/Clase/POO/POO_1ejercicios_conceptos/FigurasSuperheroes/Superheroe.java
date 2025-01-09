package POO.POO_1ejercicios_conceptos.FigurasSuperheroes;
//CLASE CON SUS PROPIEDADES:
public class Superheroe {
    private String nombre;
    private String descripcion;
    private boolean capa;
//CONSTRUCTOR:
    Superheroe(String nombre){
        this.nombre = nombre;
    }
//METODOS GET Y SET:
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean isCapa() {
        return capa;
    }
    public void setCapa(boolean capa) {
        this.capa = capa;
    }
//METODO TOSTRING:
    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", capa=" + capa +
                '}';
    }

    public static void main(String[] args) {
        Superheroe jose = new Superheroe("Jose");
        System.out.println(jose);
    }
}
