
/* Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. */
 
package javaintro;

import java.util.Scanner;

public class JavaIntroEj09 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
   
        int num, suma = 0, cant = 0 ;
        
        do { 
            
          System.out.println("Ingrese un numero: ");
          num = leer.nextInt();
          
           if (num > 0) {
            suma = suma + num;
            }
          
          cant = cant + 1;
          
            if (num == 0) {
                System.out.println("Perfecto!!! Se capturó el numero cero."); 
                break;
            }
          
        } while (cant < 20);
        
          
          System.out.println("La suma de todos los numeros POSITIVOS ingresados es: " + suma );
    }  
}