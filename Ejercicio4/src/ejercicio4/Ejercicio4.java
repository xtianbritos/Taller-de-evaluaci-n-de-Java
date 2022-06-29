
package ejercicio4;

import javax.swing.JOptionPane;

/*
 Lee un número por teclado que pida el precio de un producto (puede tener decimales)
 y calcule el precio final con IVA.
 El IVA sera una constante que sera del 21%.
 */

public class Ejercicio4 {

    public static void main(String[] args) {
        double precio, precioFinal;
        final int iva=21;
        
        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del producto"));
        
        precioFinal = precio + (precio*iva/100);
        
        JOptionPane.showMessageDialog(null, "Su precio final con IVA es: "+precioFinal);
    }
    
}
