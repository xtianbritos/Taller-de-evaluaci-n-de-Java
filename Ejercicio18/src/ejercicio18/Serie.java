
package ejercicio18;

public class Serie implements Entregable{
    final String tituloDefault="", generoDefault="", creadorDefault="";
    final int numeroTempsDefault=3;
    final boolean entregadoDefault=false;
    
    String titulo, genero, creador;
    int numeroTemps;
    boolean entregado;
    
    
    //Constructores
    public Serie() {
        this.titulo = tituloDefault;
        this.genero = generoDefault;
        this.creador = creadorDefault;
        this.numeroTemps = numeroTempsDefault;
        this.entregado = entregadoDefault;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.genero = generoDefault;
        this.numeroTemps = numeroTempsDefault;
        this.entregado = entregadoDefault;
    }

    public Serie(String titulo, String genero, String creador, int numeroTemps) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.numeroTemps = numeroTemps;
        this.entregado = entregadoDefault;
    }
    
    
    //Métodos
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public int getNumeroTemps() {
        return numeroTemps;
    }
    

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setNumeroTemps(int numeroTemps) {
        this.numeroTemps = numeroTemps;
    }
    
    
    @Override
    public String toString(){
        String cadena = "Serie: "
                + "Título: "+titulo+""
                + "  Genero: "+genero+""
                + "  Creador: "+creador+""
                + "  Número de temporadas: "+numeroTemps;
        
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
        Serie serie = (Serie)a;

        if(numeroTemps > serie.getNumeroTemps()){
            return 1;
        }else if(numeroTemps == serie.getNumeroTemps()){
            return 0;
        }else{
            return -1;
        }
    }
}
