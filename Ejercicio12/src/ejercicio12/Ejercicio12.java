
package ejercicio12;

import javax.swing.JOptionPane;

/*
Pedir dos palabras por teclado, indicar si son iguales,
sino son iguales mostrar sus diferencias.
 */

public class Ejercicio12 {

    public static void main(String[] args) {
        String palabra1, palabra2, diferencias = "", palabraCorta, palabraLarga;
        
        palabra1 = JOptionPane.showInputDialog("Ingresa una palabra");
        palabra2 = JOptionPane.showInputDialog("Ingresa otra palabra");
        
        if(palabra1.equalsIgnoreCase(palabra2)){
            JOptionPane.showMessageDialog(null, "Las dos palabras son iguales");
            
        //Si la primera palabra es más corta que la segunda
        }else if(palabra1.length() < palabra2.length()){
            palabraCorta = palabra1;
            palabraLarga = palabra2;
            
            for(int i=0; i<palabraLarga.length(); i++){
                if(i >= palabraCorta.length()){
                    diferencias+=palabraLarga.charAt(i);
                }else if(palabraCorta.charAt(i) != palabraLarga.charAt(i)){
                    diferencias+= String.valueOf(palabraCorta.charAt(i))+" ";
                }
            }
        }else{//Si tienen la misma longitud o la segunda es más larga
            palabraCorta = palabra2;
            palabraLarga = palabra1;
            
            for(int i=0; i<palabraLarga.length(); i++){
                if(i >= palabraCorta.length()){
                    diferencias+=palabraLarga.charAt(i);
                }else if(palabraCorta.charAt(i) != palabraLarga.charAt(i)){
                    diferencias+= String.valueOf(palabraCorta.charAt(i))+" ";
                }
            }
        }
            
        JOptionPane.showMessageDialog(null, "Las palabras se diferencian en las letras: "+diferencias);
    }
    
}
