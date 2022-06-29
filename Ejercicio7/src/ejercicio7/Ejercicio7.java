
package ejercicio7;

import javax.swing.JOptionPane;

/*
Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
si no lo es lo volverá a pedir (do while),
después muestra ese número por consola.
 */

public class Ejercicio7 {

    public static void main(String[] args) {
        int num;
        
        do {num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));}
        while(num < 0); //Si el número es menor que cero, no es mayor ni igual que cero
        
        System.out.println("Su número es: "+num);
    }
    
}
