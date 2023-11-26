package prog.unidad04a.atributos.ejercicio03;

import java.util.Scanner;

public class PruebaLavadora {
  
//Colores
 private static final String COLOR_BLANCO = "blanco";
 private static final String COLOR_NEGRO = "negro";
 private static final String COLOR_ROJO = "rojo";
 private static final String COLOR_AZUL = "azul";
 private static final String COLOR_GRIS = "gris";

 /**
  * Punto de entrada a la aplicación
  * @param args
  */

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("PROGRAMA MANEJO LAVADORAS");
    int lavadorasACrear = 0;
    
    do {
      //Solicitamos la catidad de lavadoras que queremos crear.
      try {
        System.out.println("Introduzca el número de lavadoras que quiera crear");
        lavadorasACrear = Integer.parseInt(sc.nextLine());
        if (lavadorasACrear < 1) {
          System.out.println("El valor no es válido, inténtelo de nuevo.");
        }
      } catch (NumberFormatException e) {
        System.out.println("El valor no es válido, inténtelo de nuevo.");
      }    
    }while (lavadorasACrear < 1);
      
    
    for (int i = 0; i < lavadorasACrear ; i++) {
      System.out.println("Introudce los datos de la lavadora " + (i +1));
      
      Lavadora lavadora = new Lavadora();
      
      System.out.println("Introduce el precio de la lavadora, tiene que ser mayor que 0");
      lavadora.precioBase = Double.parseDouble(sc.nextLine());
      
      if (lavadora.precioBase > 0) {
        System.out.println("Introduce el color de la lavadora, tiene que ser blanco, negro, rojo, azul o gris");
        lavadora.color = sc.nextLine().toLowerCase();
        if ((lavadora.color.equals(COLOR_AZUL)) || (lavadora.color.equals(COLOR_NEGRO)) || (lavadora.color.equals(COLOR_ROJO)) || (lavadora.color.equals(COLOR_AZUL)) || (lavadora.color.equals(COLOR_GRIS))){
          System.out.println("Introduce la calificación energética de la lavadora, puede ser A,B,C,D o F");
          lavadora.calificacionEnergetica = sc.nextLine().toUpperCase().charAt(0);
          if ((lavadora.calificacionEnergetica >= 'A') && (lavadora.calificacionEnergetica <= 'F')) {
            System.out.println("Introduzca el peso de la lavadora, debe de ser mayo que cero.");
            lavadora.peso = Double.parseDouble(sc.nextLine());
            if (lavadora.peso > 0) {
              System.out.println("Introduzca la carga máxima de la lavadora.");
              lavadora.cargaMaxima = Double.parseDouble(sc.nextLine());
              if (lavadora.cargaMaxima > 0) {
                //Imprimimos los valores de la lavadora:
                System.out.println("El precio base de la lavadora es " + lavadora.precioBase);
                System.out.println("El color de la lavadora es " + lavadora.color);
                System.out.println("La calificación energética es " + lavadora.calificacionEnergetica);
                System.out.println("El peso de la lavadora es " + lavadora.peso);
                System.out.println("La carga máxima de la lavadora es " + lavadora.cargaMaxima);
              }else {
                System.out.println("El dato no es correcto, vuelva a introducirlo.");
              }
            }else {
              System.out.println("El dato no es correcto, vuelva a introducirlo.");
            }
          }else {
            System.out.println("El dato no es correcto, vuelva a introducirlo.");
          }
        }else {
          System.out.println("El dato no es correcto, vuelva a introducirlo.");
        }
      }else {
        System.out.println("El dato no es correcto, vuelva a introducirlo.");
      }
    }
    
    
    
    
      
  }

  

}
