
package ejercicio12;

import javax.swing.JOptionPane;

/*
Pedir dos palabras por teclado, indicar si son iguales,
sino son iguales mostrar sus diferencias.
 */

public class Ejercicio12 {

    public static void main(String[] args) {
        String palabra1, palabra2, diferencias = "";
        
        palabra1 = JOptionPane.showInputDialog("Ingresa una palabra");
        palabra2 = JOptionPane.showInputDialog("Ingresa otra palabra");
        
        if(palabra1.equals(palabra2)){
            JOptionPane.showMessageDialog(null, "Las dos palabras son iguales");
        }else{
            for(int i=0; i<palabra1.length(); i++){
                if(palabra1.charAt(i) != palabra2.charAt(i)){
                    diferencias+= String.valueOf(palabra1.charAt(i))+" ";
                }
            }
            JOptionPane.showMessageDialog(null, "La primera palabra se diferencia de la segunda en las letras: "+diferencias);
        }
    }
    
}
