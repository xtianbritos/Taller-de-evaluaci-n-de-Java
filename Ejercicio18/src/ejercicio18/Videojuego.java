
package ejercicio18;

public class Videojuego implements Entregable{
    final String tituloDefault = "", companiaDefault = "", generoDefault = "";
    final int horasDefault = 10;
    final boolean entregadoDefault = false;
    
    String titulo, compania, genero;;
    int horasEstimadas;
    boolean entregado;
    
    
    //Constructores
    public Videojuego() {
        this.titulo = tituloDefault;
        this.compania = companiaDefault;
        this.horasEstimadas = horasDefault;
        this.entregado = entregadoDefault;
        this.genero = generoDefault;
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.compania = companiaDefault;
        this.entregado = entregadoDefault;
        this.genero = generoDefault;
    }

    public Videojuego(String titulo, String compania, String genero, int horasEstimadas) {
        this.titulo = titulo;
        this.compania = compania;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.entregado = entregadoDefault;
    }
    
    
    //Métodos
    public String getTitulo() {
        return titulo;
    }

    public String getCompania() {
        return compania;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    @Override
    public String toString(){
        String cadena = "Videojuego: "
                + "Título: "+titulo+""
                + "  Genero: "+genero+""
                + "  Companía: "+compania+""
                + "  Horas Estidamas: "+horasEstimadas;
        
        return cadena;
    }
     
    @Override
    public void entregar(){
        entregado = true;
    }
    
    @Override
    public void devolver(){
        entregado = false;
    }
    
    @Override
    public boolean isEntregado(){
        return entregado;
    }
    
    @Override
    public int compareTo(Object a) {
        Videojuego juego = (Videojuego)a;

        if(horasEstimadas > juego.getHorasEstimadas()){
            return 1;
        }else if(horasEstimadas == juego.getHorasEstimadas()){
            return 0;
        }else{
            return -1;
        }
    }
}
