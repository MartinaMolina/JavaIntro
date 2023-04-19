
// Utilizando un Bucle for, aloja en el vector Equipo (Ej13), los nombres de tus compañeros de equipo.
 

package javaintro;

import java.util.Scanner;

public class JavaIntroEj14 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido/a, ingrese la cantidad de compañeros de su equipo: ");
        int num = leer.nextInt();
        
        String equipo[]  = new String[num];
        
        System.out.println("A continuacion, ingrese el nombre de cada compañero (presione enter para continuar): ");
        
        for (int i = 0; i < equipo.length; i++) {
            
            equipo[i] =  leer.nextLine();
            System.out.print("compañero " + (i+1) + " : ");
            equipo[i] =  leer.nextLine();
           
        }
        
        System.out.println("");
        System.out.print("El equipo quedaria asi: ");
        System.out.println("");
        
        for (int i = 0; i < equipo.length; i++) {
        
            System.out.print("[" + equipo[i] + "]");
            System.out.print("");
        
        }
    }
}