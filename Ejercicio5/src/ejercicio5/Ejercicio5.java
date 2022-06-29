
package ejercicio5;

/*
Muestra los números impares y pares del 1 al 100(ambos incluidos).
Usa un bucle While.
 */

public class Ejercicio5 {

    public static void main(String[] args) {
        int i = 1;
        
        while(i <= 100){
            if(i%2 == 0){
                System.out.println("Par: "+i);
            }else{
                System.out.println("Impar: "+i);
            }
            i++;
        }
    }
    
}
