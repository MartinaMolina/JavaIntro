
// Definir una variable de tipo boolean, double y char. Guarda información en ellas a través del Scanner.
 
package javaintro;

import java.util.Scanner;

public class JavaIntroEj05 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Buenas tardes, por favor ingrese su estatura: ");
        double num = leer.nextDouble();
        
        System.out.println("A continuacion, ingrese su sexo (M para masculino / F para femenino): ");
        char caracter = leer.next().charAt(0);
        
        System.out.println("Por ultimo, si esta informacion es correcta coloque true (verdadero), sino false (falso): ");
        boolean valor = leer.nextBoolean();
  
    }  
}