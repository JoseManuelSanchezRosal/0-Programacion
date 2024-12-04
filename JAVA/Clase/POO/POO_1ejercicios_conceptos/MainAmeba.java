package POO_1ejercicios_conceptos;

public class MainAmeba {
    public static void main(String[] args){
        ej10_ameba a1 = new ej10_ameba("Antuan");
        ej10_ameba a2 = new ej10_ameba("Chechuan");

        a1.come(3);//Ameba 1 engorda 3-1
        System.out.println(a1);
        a2.come(5);//Ameba 2 engorda 5-1
        System.out.println(a2);
        a1.come(a2);//Ameba 1 se come ameba 2 (ameba 1 engorda
        System.out.println("Peso ameba 1: "+a1+". El peso de la ameba 2 es: "+a2);
        a1.come(45);

    }



}
