
// Deteccion de errores

package javaintro;

import java.util.Scanner;

public class JavaIntroEj05_DeteccionErrores {

  public static void main(String[] args) {
    
   Scanner leer = new Scanner(System.in);
   
   System.out.println("Ingresa tu nombre: ");
   String nombre = leer.nextLine();
   
   System.out.println("Ingresa tu edad: ");
   int edad = leer.nextInt();
  }
}
