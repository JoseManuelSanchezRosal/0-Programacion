package POO.POO_1ejercicios_conceptos.FigurasSuperheroes;
//CLASE FIGURA Y SUS ATRIBUTOS:
public class Figura {
    private String codigo;
    private double precio;
    private Superheroe superheroe;
    private Dimension dimension;

    //CONSTRUCTOR PARAMETRIZADO:
    Figura(String codigo, double precio, Superheroe superheroe, Dimension dimension){
        this.codigo = codigo;
        this.precio = precio;
        this.superheroe = superheroe;
        this.dimension = dimension;
    }

    //METODOS GET Y SET:

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Superheroe getSuperheroe() {
        return superheroe;
    }
    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }
    public Dimension getDimension() {
        return dimension;
    }
    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    //METODO TOSTRING:
    @Override
    public String toString() {
        return "{" +
                "codigo='" + codigo + '\'' +
                ", precio=" + precio +
                ", superheroe=" + superheroe +
                ", dimension=" + dimension +
                '}';
    }

    //METODO MODIFICADOR ADICIONAL AUMENTAR PRECIO:
    public void subirPrecio(double cantidad){
        this.precio += cantidad;
    }
    //METODO MODIFICADOR ADICIONAL DISMINUIR PRECIO:
    public void bajarPrecio(double cantidad) {
        this.precio -= cantidad;
    }
}