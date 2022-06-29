
package ejercicio9;

import java.util.Scanner;

/*
Del texto, “La sonrisa sera la mejor arma contra la tristeza”
Reemplaza todas las a del String anterior por una e,
adicionalmente concatenar a esta frase una adicional
que ustedes quieran incluir por consola y las muestre luego unidas.
 */

public class Ejercicio9 {

    public static void main(String[] args) {
        String frase = "La sonrisa sera la mejor arma contra la tristeza", nuevaFrase, miFrase;
        
        nuevaFrase = frase.replace("a", "e");
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa una frase para concatenar");
        miFrase = entrada.nextLine();
        
        nuevaFrase = nuevaFrase.concat(miFrase);
        
        System.out.println(nuevaFrase);
    }
    
}
