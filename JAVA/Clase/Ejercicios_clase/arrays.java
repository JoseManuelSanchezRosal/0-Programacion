public class arrays 
{public static void main(String[] args){
        int[] n;
        n = new int[4];

        n[0] = 23;
        n[1] = -33;
        n[2] = -45;
        n[3] = 45;
        for (int i = 0; i < n.length; i++)
            System.out.print(n[i]+ " ");

        //Arrays de chars.
        char[] caracter = new char[6];
        
        caracter [0] = 'R';
        caracter [1] = 'a';
        caracter [2] = 'f';
        caracter [3] = 'a';
        caracter [4] = 'e';
        caracter [5] = 'l';

        for (int i = 0; i < caracter.length; i++)
            System.out.print(caracter[i] + " ");}}
