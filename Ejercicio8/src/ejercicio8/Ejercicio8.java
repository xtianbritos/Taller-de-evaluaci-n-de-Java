
package ejercicio8;

import java.util.Scanner;

/*
Crea una aplicación por consola que nos pida un día de la semana y
que nos diga si es un día laboral o no. Usa un switch para ello.
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        String dia;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa un día de la semana");
        dia = entrada.next();
        
        switch (dia) {
            case "Lunes" : {
                System.out.println(dia+" es un día laboral");
                break;
            }
            case "Martes" : {
                System.out.println(dia+" es un día laboral");
                break;
            }
            case "Miercoles" : {
                System.out.println(dia+" es un día laboral");
                break;
            }
            case "Jueves" : {
                System.out.println(dia+" es un día laboral");
                break;
            }
            case "Viernes" : {
                System.out.println(dia+" es un día laboral");
                break;
            }
            case "Sabado" : {
                System.out.println(dia+" NO es un día laboral");
                break;
            }
            case "Domingo" : {
                System.out.println(dia+" NO es un día laboral");
                break;
            }
            default : {
                System.out.println("No has ingresado un día correctamente. Cuida que la primera letra sea mayúscula y no uses tildes");
            }
        }
    }
    
}
