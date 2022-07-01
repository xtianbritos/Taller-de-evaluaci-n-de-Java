
package ejercicio17;

public class Television extends Electrodomestico{
    final int pulgadasDefault=20;
    final boolean tdtDefault=false;
    
    int resolusion;
    boolean tdt;
    
    
    //Constructores
    public Television() {
        super();
        this.resolusion = pulgadasDefault;
        this.tdt = tdtDefault;
    }

    public Television(int precio, int peso) {
        super(precio, peso);
        this.resolusion = pulgadasDefault;
        this.tdt = tdtDefault;
    }

    public Television(int pulgadas, boolean tdt) {
        super();
        this.resolusion = pulgadas;
        this.tdt = tdt;
    }
    
    
    //Métodos
    public int getResolusion() {
        return resolusion;
    }

    public boolean isTdt() {
        return tdt;
    }
    
    public double precioFinal(int res, boolean tdt){
        double precioFinalTV;
        
        precioFinalTV = super.precioFinal(consumoEnergetico, peso);
        
        if(res>40){
            precioFinalTV+=(precioFinalTV*30/100);
        }
        
        if(tdt == true){
            precioFinalTV+=50;
        }
        
        return precioFinalTV;
    }
}
