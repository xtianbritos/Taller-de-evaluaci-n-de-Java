
package ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/*
Realizar un algoritmo que permita consulta la fecha y hora actual
en el formato (AAAA/MM/DD) (HH:MM:SS)
 */

public class Ejercicio13 {

    public static void main(String[] args) {
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("(yyyy/MM/dd) (HH:mm:ss)");
        System.out.println(formato.format(LocalDateTime.now()));
    }
    
}
