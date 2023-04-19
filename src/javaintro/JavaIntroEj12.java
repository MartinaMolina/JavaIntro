
/* Crea el procedimiento "EsMultiplo" que reciba dos números pasados por el usuario, validando
que el primer numero sea múltiplo del segundo, y si es asi, lo imprima por pantalla. 
De lo contrario, informe que no lo son.*/
 

package javaintro;

import java.util.Scanner;

public class JavaIntroEj12 {

    public static void main(String[] args) {

        System.out.println("Bienvenido/a, ingrese 2 numeros para saber si son multiplos: ");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        EsMultiplo(num1, num2);
    }
    
    public static void EsMultiplo (int num1, int num2) {
        
        if (num1 % num2 == 0) {
           System.out.println("El numero " + num1 + " SÍ es multiplo del numero " + num2);    
        } else {
            System.out.println("El numero " + num1 + " NO es multiplo del numero " + num2);
        }  
    }
}