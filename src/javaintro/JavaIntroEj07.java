
/* Estás desarrollando una web para una empresa que fabrica motores (tipo de motor de una bomba para mover fluidos).
Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. 
El programa debe mostrar lo siguiente:
- Si tipo de motor = 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
- Si tipo de motor = 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
- Si tipo de motor = 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
- Si tipo de motor = 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
- Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
válido para tipo de bomba” */
 

package javaintro;

import java.util.Scanner;

public class JavaIntroEj07 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Bienvenido/a, por favor ingrese un valor del 1 al 4 segun el tipo de motor a fabricar: ");
        int tipoMotor = leer.nextInt();
        
        switch (tipoMotor) { 
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para un tipo de bomba");
        }
    }  
}
