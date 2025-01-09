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
        batman.setCapa(true);
        //DE DIMENSIONES GRANDE:
        Dimension grande = new Dimension(35, 10, 10);
        //CREAMOS UNA FIGURA GRANDE DE BATMAN:
        Figura batbig = new Figura("ER344", 125, batman, grande);
        //CREAMOS COLECCION DE DCCOMICS:
        Coleccion dccomics = new Coleccion("DC");
        //ANADIMOS LA FIGURA GRANDE DE BATMAN O BATBIG A LA LISTA DE DCCOMICS:
        dccomics.anadirFigura(batbig);
        System.out.println(dccomics);

        dccomics.subirPrecio(122, "ER344");
        System.out.println(dccomics);
        Superheroe thor = new Superheroe("Throll");
        thor.setCapa(true);
        Figura bigthroll = new Figura("TR433", 555, thor, grande);
        bigthroll.subirPrecio(433);
        vengadores.anadirFigura(bigthroll);
        System.out.println(vengadores);
        dccomics.subirPrecio(333, "ER344");
        System.out.println(dccomics);


    }
}