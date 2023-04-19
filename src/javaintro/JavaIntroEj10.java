
/* Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
e imprima el número ingresado seguido de tantos asteriscos como indique su valor. */
 
package javaintro;

import java.util.Scanner;

public class JavaIntroEj10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 4 numeros (del 1 al 20)");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int num3 = leer.nextInt();
        int num4 = leer.nextInt();
        
        System.out.println();
        System.out.println("Los numeros ingresados quedarian asi: ");
        System.out.println();
        
        if (num1 >= 1 && num1 <= 20) {
            System.out.print(num1);
        for (int i = 0; i < num1; i++) {
            System.out.print("*");   
        }
        } else {
            System.out.println("EL numero " + num1 + " es invalido");
        }
       
        System.out.println();
        
        if (num2 >= 1 && num2 <= 20) {
            System.out.print(num2);
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }    
        } else {
            System.out.println("EL numero " + num2 + " es invalido");
        }
        
        System.out.println();
        
        if (num3 >= 1 && num3 <= 20) {
            System.out.print(num3);
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }    
        } else {
            System.out.println("EL numero " + num3 + " es invalido");
        }
        
        System.out.println();
        
        if (num4 >= 1 && num4 <= 20) {
            System.out.print(num4);
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }    
        } else {
            System.out.println("EL numero " + num4 + " es invalido");
        }
        
        System.out.println();
    }
}