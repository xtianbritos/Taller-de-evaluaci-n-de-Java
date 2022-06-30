
package ejercicio15;

import javax.swing.JOptionPane;

/*
Hacer un programa que muestre el siguiente menú de opciones
****** GESTION CINEMATOGRÁFICA ********
1-NUEVO ACTOR
2-BUSCAR ACTOR
3-ELIMINAR ACTOR
4-MODIFICAR ACTOR
5-VER TODOS LOS ACTORES
6- VER PELICULAS DE LOS ACTORES
7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
8-SALIR


EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8,
MIENTRAS SE DIGITE UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU
Y SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE
" OPCION INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE.
PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.
 */

public class Ejercicio15 {
    
    public String mostrarMenu(){
        String opcion;
        
        opcion = JOptionPane.showInputDialog(null, "****** GESTION CINEMATOGRÁFICA ********\n" +
        "1-NUEVO ACTOR\n" +
        "2-BUSCAR ACTOR\n" +
        "3-ELIMINAR ACTOR\n" +
        "4-MODIFICAR ACTOR\n" +
        "5-VER TODOS LOS ACTORES\n" +
        "6- VER PELICULAS DE LOS ACTORES\n" +
        "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
        "8-SALIR");
        
        if ("1".equals(opcion) || "2".equals(opcion) || "3".equals(opcion) || "4".equals(opcion) || "5".equals(opcion) || "6".equals(opcion) || "7".equals(opcion)){
            opcion = "x";
        }
        
        this.opciones(opcion);
        
        return opcion;
    }
    
    public void opciones(String eleccion){
        switch(eleccion){
            case "x":{
                this.mostrarMenu();
                break;
            }
            case "8":{
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null, " OPCION INCORRECTO");
                this.mostrarMenu();
            }
        }
    }

    
    public static void main(String[] args) {
        
        Ejercicio15 ej = new Ejercicio15();

        ej.mostrarMenu();
        
    }
    
}
