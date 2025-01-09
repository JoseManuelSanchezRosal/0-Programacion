package POO.POO_1ejercicios_conceptos.FigurasSuperheroes;

public class Main {
    public static void main(String[] args) {
        //CREAMOS UN OBJETO SUPERHEROE:
        Superheroe ironman = new Superheroe("Iron Man");
        //CREAMOS UN TAMAÑO PEQUEÑO DE FIGURAS:
        Dimension small = new Dimension(15, 5, 2);
        //CREAMOS UNA FIGURA, CON SU RESPECTIVO CÓDIGO, PRECIO, SUPERHEROE Y DIMENSIONES:
        Figura ironsmall = new Figura("AB205", 255, ironman, small);
        //CREAMOS UNA NUEVA COLECCION DE SUPERHEROES DE MARVEL Y AÑADIMOS LA FIGURA PEQUEÑA DE IRONSMALL:
        Coleccion vengadores = new Coleccion("Marvel");
        //AÑADIMOS LA FIGURA DE IRONSMALL A NUESTRA COLECCIÓN DE MARVEL:
        vengadores.anadirFigura(ironsmall);
        //SACAMOS POR PANTALLA LA LISTA DE FIGURAS DE LOS VENGADORES:
        System.out.println(vengadores);

        //CREAMOS UN NUEVO SUPERHÉROE, AHORA BATMAN:
        Superheroe batman = new Superheroe("Batman");
        //LE METEMOS CAPA A BATMAN:
        batman.setCapa(true);
        Superheroe jocker = new Superheroe("Joker");
        //DE DIMENSIONES GRANDE:
        Dimension grande = new Dimension(35, 10, 10);
        //CREAMOS UNA FIGURA GRANDE DE BATMAN:
        Figura batbig = new Figura("ER344", 125, batman, grande);
        //CREAMOS UNA FIGURA PEQUENIA DEL JOCKER:
        Figura minjocker = new Figura("AW555", 235, jocker, small);
        //CREAMOS COLECCION DE DCCOMICS:
        Coleccion dccomics = new Coleccion("DC");
        //ANADIMOS LA FIGURA GRANDE DE BATMAN O BATBIG A LA LISTA DE DCCOMICS:
        dccomics.anadirFigura(batbig);
        //ANADIMOS MINIJOCKER A DCCOMICS:
        dccomics.anadirFigura(minjocker);
        System.out.println(dccomics);
        System.out.println(dccomics);
        Superheroe thor = new Superheroe("Throll");
        thor.setCapa(true);
        Figura bigthroll = new Figura("TR433", 555, thor, grande);
        vengadores.anadirFigura(bigthroll);
        Superheroe wonder = new Superheroe("WonderWoman");
        Figura biwonder = new Figura("TY777", 555, wonder, grande);
        dccomics.anadirFigura(biwonder);
        System.out.println("Los vengadores con capa son: " + vengadores.conCapa());
        System.out.println("Los del mundo DC con capa son: " + dccomics.conCapa());
        //Probamos metodo mas valioso de nuestras colecciones:
        System.out.println(vengadores.masValioso());
        System.out.println(dccomics.masValioso());
        //Probamos el valor total de nuestras colecciones:
        System.out.println(vengadores.getValorColeccion());
        System.out.println(dccomics.getValorColeccion());
        //Probamos el metodo de volumen total de nuestras colecciones:
        System.out.println("El volumen total de la coleccion Marvel es: " + vengadores.getVolumenTotal() + " cm3");
        System.out.println("El volumen total de la coleccion DC es: " + dccomics.getVolumenTotal() + " cm3");

        vengadores.subirPrecio(1000, "AB205");
        System.out.println("La figura mas valiosa de Marvel es: " + vengadores.masValioso());
        System.out.println("La figura mas valiosa de DC es: " + dccomics.masValioso());
        //Probamos el valor total de nuestras colecciones:
        System.out.println("El valor total de la coleccion de Marvel es: " + vengadores.getValorColeccion() + " euros");
        System.out.println("El valor total de la coleccion de DC es: " + dccomics.getValorColeccion() + " euros");
    }
}