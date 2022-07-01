
package ejercicio17;

public class Ejercicio17 {

    /*
     La letra del ejercicio es muy extensa, así que por comodidad esta vez no la colocaré aquí
     */
    public static void main(String[] args) {
        Electrodomestico[] array = new Electrodomestico[10];
        
        for(int i=0; i<array.length; i++){
            array[i] = new Lavadora();
            i++;
            array[i] = new Television();
        }
        
        for(Electrodomestico i:array){
            
        }
    }
    
}
