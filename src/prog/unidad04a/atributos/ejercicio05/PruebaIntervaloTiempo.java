//5. Crea una clase IntervaloTiempo que guarde un intervalo de tiempo, en horas.
//minutos y segundos. Igual que el anterior, los atributos deben ser públicos y crea
//una clase PruebaIntervaloTiempo para probar la clase.

package prog.unidad04a.atributos.ejercicio05;

import java.util.Scanner;

public class PruebaIntervaloTiempo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cantidadIntervalos = 0;
    
    System.out.println("Aplicación intervalos de tiempo:");
    
    try {
      System.out.println("Introduzca la cantidad de intervalos a crear (1 o más):");
      cantidadIntervalos = Integer.parseInt(sc.nextLine());
      
      for (int i = 0; i < cantidadIntervalos; i++) {
        IntervaloTiempo intervaloTiempo = new IntervaloTiempo();
        
        System.out.println("Introduce la cantidad de horas del intervalo " + (i + 1));
        intervaloTiempo.horas = Integer.parseInt(sc.nextLine());
        
        System.out.println("Introduce la cantidad de horas del intervalo " + (i + 1));
        intervaloTiempo.minutos = Integer.parseInt(sc.nextLine());
        
        System.out.println("Introduce la cantidad de horas del intervalo " + (i + 1));
        intervaloTiempo.segundos = Integer.parseInt(sc.nextLine());
        
        System.out.println("Intervalo de tiempo:");
        System.out.println("Horas: " + intervaloTiempo.horas);
        System.out.println("Minutos: " + intervaloTiempo.minutos);
        System.out.println("Segundos: " + intervaloTiempo.segundos);
      }
      
      
    
    }catch (NumberFormatException e) {
      System.out.println("Ha introducido un dato incorrecto.");
    }
    
  }

}
