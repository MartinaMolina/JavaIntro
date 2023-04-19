
/* Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
   pedirá de nuevo hasta que la nota sea correcta. */
 
package javaintro;

import java.util.Scanner;

public class JavaIntroEj08 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Bienvenido/a, por favor cargue su nota: ");
        int nota = leer.nextInt();
        
        while (nota < 0 || nota > 10) { 
            
          System.out.println("Nota incorrecta, vuelva a introducir la nota");
          nota = leer.nextInt();
        } 
        
          System.out.println("Su nota es correcta");
    }  
}
