
package ejercicio10;

import javax.swing.JOptionPane;

/*
Realizar una aplicación de consola,
que al ingresar una frase por teclado elimine los espacios que esta contenga.
 */

public class Ejercicio10 {

    public static void main(String[] args) {
        String frase, fraseSinEspacios;
        
        System.out.println("Ingresa una frase por teclado");
        
        frase = JOptionPane.showInputDialog("Escribe aquí tu frase");
        
        fraseSinEspacios = frase.replace(" ", "");
        
        System.out.println(fraseSinEspacios);
    }
    
}
