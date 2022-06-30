
package ejercicio11;

import java.util.Scanner;

/*
Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola,
indicar cual es la longitud de esta frase,
adicionalmente cuantas vocales tiene de “a,e,i,o,u”.
 */

public class Ejercicio11 {

    public static void main(String[] args) {
        String frase;
        int vocales = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa una frase");
        frase = entrada.nextLine();
        
        System.out.println("La longitud de tu frase es "+frase.length()+" incluyendo espacios.");
        
        for(int i=0; i<frase.length(); i++){
            if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u'){
                vocales++;
            }
        }
        
        System.out.println("La frase tiene "+vocales+" vocales.");
    }
    
}
