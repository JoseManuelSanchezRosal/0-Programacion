
public class perro extends animal{
    private String raza;

    public perro(int edad, String nombre, String raza){
        super(edad, nombre); /** Heredadas de superclase "animal" */
        this.raza = raza;
    }

    @Override
    public void hacerSonido(){
        System.out.println(getNombre() + " dice GUAU");
    }
}