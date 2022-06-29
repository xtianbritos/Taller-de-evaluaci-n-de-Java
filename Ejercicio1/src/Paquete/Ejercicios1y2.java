
package Paquete;

import java.util.Scanner;

/**
Declara 2 variables numéricas (con el valor que desees),
 he indica cual es mayor de los dos. Si son iguales indicarlo también.
 Ve cambiando los valores para comprobar que funciona.
  
 Al ejercicio anterior agregar entrada por consola de dos valores
 e indicar si son mayores, menores o iguales.
 */

public class Ejercicios1y2 {
    
    public static void main(String[] args){
        int num1 , num2;
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa un número");
        num1 = entrada.nextInt();
        
        System.out.println("Ingresa otro número");
        num2 = entrada.nextInt();
        
        if (num1 == num2){
            System.out.println("Ambos números son iguales");
        }else if(num1 > num2){
            System.out.println("El primer número es mayor al segundo");
        }else{
            System.out.println("El segundo número es mayor al primero");
        }
    }
}
