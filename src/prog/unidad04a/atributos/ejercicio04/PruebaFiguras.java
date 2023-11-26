//coordenadas (X e Y) reales. Un triángulo se define a partir de los tres puntos que
//definen sus vértices, un círculo a partir de su centro (un punto) y su radio (real) y un
//rectángulo a partir de los puntos correspondientes a dos vértices opuestos. Crea
//todos los atributos como públicos y crea la clase PruebaFigura que cree una figura
//a partir de las entradas del usuario y la imprima por pantalla

package prog.unidad04a.atributos.ejercicio04;

import java.util.Scanner;

public class PruebaFiguras {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("PROGRAMA PARA CREAR FIGURAS");
    
    int figurasCreadas = 0;
    char figuraACrear;
    
    do {
      try {
        System.out.println("Introduce el número de figuras que quieres crear.");
        figurasCreadas = Integer.parseInt(sc.nextLine());
        
      }catch (NumberFormatException e) {
        System.out.println("Dato introducido no válido.");
      }
    }while (figurasCreadas < 1);
    
    for (int i = 0; i < figurasCreadas ; i++) {
      try {
        System.out.println("Introduce la figura que quieres crear, t para triángulo, r para rectángulo o c para círculo:");
        figuraACrear = sc.nextLine().toLowerCase().charAt(0);
        
          if (figuraACrear == 't') {
            // Creamos un triángulo
            Triangulo triangulo = new Triangulo();
            // Creamos el primer punto para el primer vértice
            Punto punto = new Punto();
            System.out.println("Introduce el valor de la coordenada x del primer vértice:");
            punto.x = Double.parseDouble(sc.nextLine());
            System.out.println("Introduce el valor de la coordenada y del primer vértice:");
            punto.y = Double.parseDouble(sc.nextLine());   
            // Creamos el primer vértice
            triangulo.primerVertice = punto;
            
            punto = new Punto();
            
            System.out.println("Introduce el valor de la coordenada x del segundo vértice:");
            punto.x = Double.parseDouble(sc.nextLine());
            System.out.println("Introduce el valor de la coordenada y del segundo vértice:");
            punto.y = Double.parseDouble(sc.nextLine());   
            // Creamos el segundo vértice
            triangulo.segundoVertice = punto;
            
            punto = new Punto();
            
            System.out.println("Introduce el valor de la coordenada x del tercer vértice:");
            punto.x = Double.parseDouble(sc.nextLine());
            System.out.println("Introduce el valor de la coordenada y del tercer vértice:");
            punto.y = Double.parseDouble(sc.nextLine());   
            // Creamos el segundo vértice
            triangulo.tercerVertice = punto;
            
            //Imprimimos los datos del triángulo:
            
            System.out.println("Los datos del triángulo:");
            System.out.println("Primer vértice: (" + triangulo.primerVertice.x + "," + triangulo.primerVertice.y + ")");
            System.out.println("Segundo vértice: (" + triangulo.segundoVertice.x + "," + triangulo.segundoVertice.y + ")");
            System.out.println("Tercer vértice: (" + triangulo.tercerVertice.x + "," + triangulo.tercerVertice.y + ")");          
          
          }else if(figuraACrear == 'r') {
            
            Rectangulo rectangulo = new Rectangulo();
            Punto punto = new Punto();
            
            // Creamos el primer punto para el primer vértice
            
            System.out.println("Introduce el valor de la coordenada x del primer vértice:");
            punto.x = Double.parseDouble(sc.nextLine());
            System.out.println("Introduce el valor de la coordenada y del primer vértice:");
            punto.y = Double.parseDouble(sc.nextLine());   
            // Creamos el primer vértice
            rectangulo.primerVertice = punto;
            punto = new Punto();
            
            // Creamos el primer punto para el primer vértice
            
            System.out.println("Introduce el valor de la coordenada x del segundo vértice:");
            punto.x = Double.parseDouble(sc.nextLine());
            System.out.println("Introduce el valor de la coordenada y del segundo vértice:");
            punto.y = Double.parseDouble(sc.nextLine());   
            // Creamos el primer vértice
            rectangulo.segundoVertice = punto;
            
            //Imprimimos los datos del rectángulo:
            System.out.println("Los datos del rectángulo:");
            System.out.println("Primer vértice: (" + rectangulo.primerVertice.x + "," + rectangulo.primerVertice.y + ")");
            System.out.println("Segundo vértice: (" + rectangulo.segundoVertice.x + "," + rectangulo.segundoVertice.y + ")");
     
            
            
          }else if(figuraACrear == 'c') {
            Circulo circulo = new Circulo();
            Punto punto = new Punto();
            System.out.println("Introduce el valor de la coordenada x del centro del círculo:");
            punto.x = Double.parseDouble(sc.nextLine());
            System.out.println("Introduce el valor de la coordenada y del centro del círculo: ");
            punto.y = Double.parseDouble(sc.nextLine());
            circulo.centro = punto;
            
            System.out.println("Introduzca la longitud del radio del círculo:");
            circulo.radio = Double.parseDouble(sc.nextLine());
            
            // Imprimimos los resultados del circulo:
            System.out.println("Los datos del círculo:");
            System.out.println("Las coordenadas del centro del círculo: (" + circulo.centro.x + "/" + circulo.centro.y + ")");
            System.out.println("El radio del círculo es: " + circulo.radio);
          }
          
        
      } catch (NumberFormatException e) {
        System.out.println("Dato introducido no válido.");
      }
    }
    

  }

}
