
package ejercicio17;

public class Ejercicio17 {

    /*
     La letra del ejercicio es muy extensa, así que por comodidad esta vez no la colocaré aquí
     */
    public static void main(String[] args) {
        Electrodomestico[] array = new Electrodomestico[10];
        double total=0;
        
        //Instancio los objetos
        for(int i=0; i<6; i++){
            array[i] = new Lavadora();
            i++;
            array[i] = new Television();
        }
        
        array[6] = new Lavadora(40);
        array[7] = new Television(550.5, 3);
        array[8] = new Television(50, true);
        array[9] = new Lavadora(500, 2);
        
        //Le aplico a todos los objetos el método preciofinal
        //y sumo todos los precios
        for(Electrodomestico y: array){
            y.precioFinal();
            total += y.precioBase;
        } 
        
        //Muestro los precios de las lavadoras
        for(Electrodomestico e: array){
            if(e instanceof Lavadora){
                System.out.println("Lavadora: Precio: €"+e.getPrecioBase());               
            }
        }
        
        System.out.println(""); //Para separar
        
        //Muestro los precios de las televisiones
        for(Electrodomestico j: array){
            if(j instanceof Television){
                System.out.println("Television: Precio: €"+j.getPrecioBase());               
            }
        }
        
        System.out.println(""); //Para separar

        //Muestro el total
        System.out.println("Total: €"+total);
    }
    
}
