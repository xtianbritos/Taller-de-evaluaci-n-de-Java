
package ejercicio17;

public class Lavadora extends Electrodomestico{
    final int cargaDefault=5;
    int carga;

    
    //Constructores
    public Lavadora() {
        super();
        this.carga = cargaDefault;
    }

    public Lavadora(int precio, int peso) {
        super(precio, peso);
        this.carga = cargaDefault;
    }

    public Lavadora(int carga) {
        super();
        this.carga = carga;
    }

    //Métodos
    public int getCarga() {
        return carga;
    }
    
    public int precioFinal(int carga){
        int precioFinalCarga;
        
        precioFinalCarga = super.precioFinal(consumoEnergetico, peso);
        
        if(carga>30){
            precioFinalCarga+=30;
        }
        
        return precioFinalCarga;
    }
    
}
