public class MAIN {
    public static void main(String[] arg){
        animal perro = new perro(5, "Toby", "Pastor aleman");
        animal perro2 = new perro(3, "Yoni", "Chiwawa");

        perro.hacerSonido();
        perro.dormir();

        perro2.hacerSonido();
        perro2.dormir();

        System.out.println("La edad de " + perro.getNombre()+ " es "+ perro.getEdad()+" años");
        System.out.println("Edad "+ perro.getEdad()+ " Nombre: "+ perro.getNombre());
    }
}