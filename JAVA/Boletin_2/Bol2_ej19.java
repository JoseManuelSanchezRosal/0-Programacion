// 19. Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos:
// En mi caso se han dado por hechas las notas, no se han pedido por teclado.

public class Bol2_ej19 {
    public static void main (String[] arg){
        int n1 = 4;
        int n2 = 8;
        int n3 = 3;
        int n4 = 10;
        int n5 = 7;
        int n6 = 4;

        int sus = 0;
        int cond = 0;
        int apr = 0;

        if (n1 < 4)
            sus +=1;
        else if (n1 ==4)
            cond +=1;
        else
            apr += 1;

        if (n2 < 4)
            sus +=1;
        else if (n2 ==4)
            cond +=1;
        else
            apr += 1;

        if (n3 < 4)
            sus +=1;
        else if (n3 ==4)
            cond +=1;
        else
            apr += 1;

        if (n4 < 4)
            sus +=1;
        else if (n4 ==4)
            cond +=1;
        else
            apr += 1;

        if (n5 < 4)
            sus +=1;
        else if (n5 ==4)
            cond +=1;
        else
            apr += 1;

        if (n6 < 4)
            sus +=1;
        else if (n6 ==4)
            cond +=1;
        else
            apr += 1;

        System.out.println("Suspensos: "+sus+". Condicionados: "+cond+". Aprobados: "+apr);
    }
}
