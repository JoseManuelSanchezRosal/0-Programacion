/**
 * Vamos a crear una clase abstracta de animal
 */
public abstract class animal {
    private int edad;
    private String nombre;

    /**
     * Constructor parametrizado de clase abstracta animal
     */
    public animal(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }
    /** @return edad*/
    public int getEdad(){
        return edad;
    }
    /** Establecer edad */
    public void setEdad(int edad){
        this.edad = edad;
    }
    /** @return nombre */
    public String getNombre(){
        return nombre;
    }
    /** @param nombre */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    /** Metodo que simula al animal durmiendo */
    public void dormir(){
        System.out.println(nombre + " esta durmiendo...");
    }
    /** Metodo abstracto que es implementado por las subclases */
    public abstract void hacerSonido();
}