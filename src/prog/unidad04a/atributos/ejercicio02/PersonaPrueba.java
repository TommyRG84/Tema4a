package prog.unidad04a.atributos.ejercicio02;

import java.util.Scanner;

/**
 * Prueba de la clase persona
 */


public class PersonaPrueba {
  /**
   * Punto de entrada a la aplicación
   * @param args
   */

  public static void main(String[] args) {
    //Creamos el scanner para introducir datos desde el teclado
    Scanner sc = new Scanner(System.in);
    
    // Mostramos la cabecera
    System.out.println("Programa creación personas.");
    
    //Para cada persona
    
    Persona persona1 = new Persona();
    
    //Solicitamos los datos de la persona
    
    System.out.println("Introduzca el nombre de la persona:");
    persona1.nombre = sc.nextLine();
    
    System.out.println("Introduzca el nombre de la persona:");
    persona1.edad = Integer.parseInt(sc.nextLine());
    
    System.out.println("Introduzca el nombre de la persona:");
    persona1.dni = sc.nextLine();
    
    System.out.println("Introduzca el nombre de la persona:");
    persona1.sexo = sc.next().charAt(0);
    
    System.out.println("Introduzca el nombre de la persona:");
    persona1.peso = Double.parseDouble(sc.nextLine());
    
    System.out.println("Introduzca el nombre de la persona:");
    persona1.altura = Double.parseDouble(sc.nextLine());
    
    // Imprimimos los resultados:
    
    System.out.println("El nombre de la persona es " + persona1.nombre);
    System.out.println("La edad de la persona es " + persona1.edad);
    System.out.println("El dni de la persona es " + persona1.dni);
    System.out.println("El sexo de la persona es " + Character.toUpperCase(persona1.sexo));
    System.out.println("El peso de la persona es " + persona1.peso);
    System.out.println("La altura de la persona es " + persona1.altura);

  }

}
