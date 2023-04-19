
/* Implementar un programa que le pida dos números enteros a usuario 
y determine si ambos o alguno de ellos es mayor a 25 */
 
package javaintro;

import java.util.Scanner;

public class JavaIntroEj06 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Buenas tardes, por favor ingrese 2 numeros: ");
        int num = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num > 25 && num2 > 25) { 
            System.out.println("Ambos numeros son mayores a 25");
            
        } else {
            if (num > 25 || num2 > 25) {
                System.out.println("Solo uno de los numeros ingresados es mayor a 25");    
            }
        }
        
        if (num <= 25 && num2 <= 25) {
            System.out.println("Muchas gracias!");
        }
    }  
}