import javax.swing.*;

public class JoptionPane /*Panel emergente para introducir valores */
{
    public static void main(String[] args) 
    {   
        // Array tipo "String":
        String [] paises = new String[6];/*Creamos nuestro array vacio de 6 elementos vacia*/
        for (int i = 0; i < 6;i++)/*USO FOR NORMAL */
            paises[i] = JOptionPane.showInputDialog("Introduce el pais "+ (i+1)+"");
        
        
        for (String pais : paises)/*"FOR-EACH" = variable "pais" recorra lista "paises" y las imprima */
            System.out.println(pais);
        
        // Array tipo "Integer":
        Integer [] numeros = new Integer[6];/*creamos nuestra lista o Array de numeros (6) vacia */

        for (int i = 0; i < 6; i++)
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce numeros "+(i+1)+""));/*pedimos por teclado los 
            *numeros con ventana emergente . Como la entrada de teclado es tipo "String", hay que pasarlo a Integer.parseInt */
            
        for (int numero : numeros)/*Uso FOR-EACH */
            System.out.println(numero);
    }
}