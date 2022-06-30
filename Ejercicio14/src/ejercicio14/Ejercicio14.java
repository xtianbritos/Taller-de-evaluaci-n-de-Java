
package ejercicio14;

import javax.swing.JOptionPane;

/*
Crear un programa que pida un numero por teclado y que imprima por pantalla
los números desde el numero introducido hasta 1000 con saldos de 2 en 2.
 */

public class Ejercicio14 {

    public static void main(String[] args) {
        int num;
        String listaNums = "";
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrea un número"));
        
        for(int i=num; i<=1000; i+=2){
            listaNums+= String.valueOf(i)+" ";
        }
        
        JOptionPane.showMessageDialog(null, listaNums);
    }
    
}
