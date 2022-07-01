
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

    public Television(double precio, int peso) {
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
    
    @Override
    public void precioFinal(){
        
        super.precioFinal();
        
        if(resolusion>40){
            precioBase+=(precioBase*30/100);
        }
        
        if(tdt == true){
            precioBase+=50;
        }
    }
}
