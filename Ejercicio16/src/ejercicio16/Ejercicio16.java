
package ejercicio16;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
Haz una clase llamada Persona que siga las siguientes condiciones:

Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura.
No queremos que se accedan directamente a ellos.
Piensa que modificador de acceso es el más adecuado, también su tipo.
Si quieres añadir algún atributo puedes hacerlo.


Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo
(0 números, cadena vacía para String, etc.).
Sexo será hombre por defecto, usa una constante para ello.


Se implantarán varios constructores:

Un constructor por defecto.
Un constructor con el nombre, edad y sexo, el resto por defecto.
Un constructor con todos los atributos como parámetro.

Los métodos que se implementaran son:

*calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2  en m)),
si esta fórmula devuelve un valor menor que 20, la función devuelve un -1,
si devuelve un número entre 20 y 25 (incluidos),
significa que está por debajo de su peso ideal la función devuelve un 0 
y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1.
Te recomiendo que uses constantes para devolver estos valores.

*esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.

*comprobarSexo(char sexo): comprueba que el sexo introducido es correcto.
Si no es correcto, sera H. No será visible al exterior.

*toString(): devuelve toda la información del objeto.

*generaDNI(): genera un número aleatorio de 8 cifras,
genera a partir de este su número su letra correspondiente.
Este método será invocado cuando se construya el objeto.
Puedes dividir el método para que te sea más fácil. No será visible al exterior.

*Métodos set de cada parámetro, excepto de DNI.


Ahora, crea una clase ejecutable que haga lo siguiente:

*Pide por teclado el nombre, la edad, sexo, peso y altura.

*Crea 3 objetos de la clase anterior,
el primer objeto obtendrá las anteriores variables pedidas por teclado,
el segundo objeto obtendrá todos los anteriores menos el peso y la altura
y el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.

*Para cada objeto, deberá comprobar si está en su peso ideal,
tiene sobrepeso o por debajo de su peso ideal con un mensaje.

*Indicar para cada objeto si es mayor de edad.

*Por último, mostrar la información de cada objeto.
 */

public class Ejercicio16 {
    
    public static void mostrarSobrepeso(int res, int n){
        switch(res) {
            case -1:
                JOptionPane.showMessageDialog(null, "La persona "+n+"está en su peso ideal");
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "La persona "+n+" está por dabejo de su peso ideal");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "La persona "+n+" tiene sobrepeso");
                break;
        }
    }

    public static void main(String[] args) {
        String nombre;
        int edad;
        double peso, altura;
        char sexo;
        
        nombre = JOptionPane.showInputDialog("Increse un nombre");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una edad"));
        sexo = (JOptionPane.showInputDialog("Increse un sexo")).toUpperCase().charAt(0);
        peso = Double.parseDouble(JOptionPane.showInputDialog("Increse un peso"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Increse una altura"));
        
        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona p2 = new Persona(nombre, edad, sexo);
        Persona p3 = new Persona();
        
        p3.setNombre("Christian");
        p3.setEdad(28);
        p3.setAltura(1.80);
        p3.setPeso(78);
        p3.setSexo('H');
        
        int res = p1.calcularIMC(p1.peso, p1.altura);
        mostrarSobrepeso(res, 1);
        
        res = p2.calcularIMC(p2.peso, p2.altura);
        mostrarSobrepeso(res, 2);

        res = p3.calcularIMC(p3.peso, p3.altura);
        mostrarSobrepeso(res, 3);
    }
    
}

/*
si la persona está en su peso ideal,
si esta fórmula devuelve un valor menor que 20, la función devuelve un -1,
si devuelve un número entre 20 y 25 (incluidos),
significa que está por debajo de su peso ideal la función devuelve un 0 
y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1.
*/