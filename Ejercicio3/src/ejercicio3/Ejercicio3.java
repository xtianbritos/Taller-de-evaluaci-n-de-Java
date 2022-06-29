
package ejercicio3;

import javax.swing.JOptionPane;

/**
 Haz una aplicación que calcule el área de un círculo(pi*R2).
 El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
 Usa la constante PI y el método pow de Math.
 */

public class Ejercicio3 {

    public static void main(String[] args) {
        double radio, area;
        
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio del círculo"));
        
        area = Math.PI*Math.pow(radio, 2);
        
        JOptionPane.showMessageDialog(null, "El área es: "+area);
    }
    
}
