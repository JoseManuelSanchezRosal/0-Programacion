/** Ejercicio 10. Las amebas son seres unicelulares de forma cambiante ya que carecen de pared celular. Fagocitan
 * cualquier cosa que se les pone por delante. Crea la clase ameba
 *
 *
 */
package POO_1ejercicios_conceptos;
public class ej10_ameba {
    private String nombre;
    private int peso;

    // Constructor
   public ej10_ameba(String nombre) { /**Le tenemos que pasar el nombre de la ameba por par'ametro*/
       this.nombre = nombre;
       this.peso = 3; /**El peso de la ameba siempre ser'a de 3 microgramos*/
   }
   //Metodo "come":
   public void come(int pesoComida){
       this.peso += pesoComida -1;
   }
   public void come(ej10_ameba a){
       this.peso += a.peso -1;
       a.peso = 0;
   }
   public String toString(){
       return "Soy una ameba llamada "+nombre+" y peso "+peso+ " microgramos";
   }
}