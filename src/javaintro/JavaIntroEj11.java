
/* Escribir un programa que procese una secuencia de caracteres ingresada por teclado 
y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: 

Cada vocal se reemplaza por: (a = @), (e = #), (i = $), (o = %), (u = *)

El resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente.*/
 

package javaintro;

import java.util.Scanner;

public class JavaIntroEj11 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Bienvenido/a, escriba una palabra o frase que desee (termine con punto), y yo la codifico por ud.: ");
        String frase = leer.nextLine();
        
        String retorno = codificacion(frase);
        System.out.println();
        System.out.println("La frase/palabra queda codificada de la siguiente manera: ");
        System.out.println(retorno);
    }
    
    public static String codificacion (String frase) {
        
        String frase2 = "";
        
        for (int i = 0; i < frase.length(); i++) {
            
        String SubCadena = frase.substring(i, i+1);
        
        switch (SubCadena) {
            case "a":
                frase2 = frase2.concat("@");
                continue;
            case "e":
                frase2 = frase2.concat("#");
                continue;
            case "i":
                frase2 = frase2.concat("$");
                continue;
            case "o":
                frase2 = frase2.concat("%");
                continue;
            case "u":
                frase2 = frase2.concat("*");
                break;
            default:
               frase2 = frase2.concat(SubCadena);
        }
    }
         return frase2;
}
}