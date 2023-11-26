//6. Se desea crear una clase Fraccion que represente una fracción. Crea las clases
//con los atributos adecuados, públicos para que se puedan acceder desde otras
//clases. Crea el programa PruebaFraccion que cree objetos de esta clase y los
//pruebe.

package prog.unidad04a.atributos.ejercicio06;

import java.util.Scanner;

public class FraccionPrueba {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    Fraccion fraccion = new Fraccion();
    System.out.println("Introduzca el numerador de la fraccion: ");
    fraccion.numerador = Integer.parseInt(sc.nextLine());
    
    System.out.println("Introduzca el denominador de la fraccion: ");
    fraccion.denominador = Integer.parseInt(sc.nextLine());
    
    System.out.println("Resultado de la fracción: ");
    System.out.println(fraccion.numerador + "/" + fraccion.denominador);
    
  }

}
