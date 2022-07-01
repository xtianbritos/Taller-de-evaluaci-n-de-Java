
package ejercicio18;

import javax.swing.JOptionPane;

public class Ejercicio18 {

    public static void main(String[] args) {
        Serie[] series = new Serie[5];
        Videojuego[] juegos = new Videojuego[5];
        
        Serie bb = new Serie("Breaking Bad", "Drama criminal", "Vince Gilligan", 5);
        series[0]= bb;
        Serie x = new Serie("The X-Files", "Ciencia ficción", "Chris Carter", 11);
        series[1]= x;
        Serie got = new Serie("Game of Thrones", "Fantasía oscura", "George R. R. Martin", 8);
        series[2] = got;
        Serie bcs = new Serie("Better call Saul", "Drama criminal", "Vince Guilligan", 6);
        series[3] = bcs;
        Serie tbl = new Serie("The Blacklist", "Drama policial", "Jon Bokenkamp", 9);
        series[4]= tbl;
        
        Videojuego gtasa = new Videojuego("Grand Theft Auto: San Andreas", "Rockstar North", "Acción-Aventura", 10);
        juegos[0] = gtasa;
        Videojuego gow = new Videojuego("God of War", "SCE Santa Monica Studio", "Acción-Aventura", 15);
        juegos[1] = gow;
        Videojuego pm = new Videojuego("Pac-Man", "Namco", "Laberinto", 2);
        juegos[2] = pm;
        Videojuego mk = new Videojuego("Mario Kart", "Nintendo", "Carreras", 5);
        juegos[3] = mk;
        Videojuego tloz = new Videojuego("The Legend of Zelda", "Nintendo", "Acción-Aventura", 11);
        juegos[4] = tloz;
        
        //Entrego algunos videojuegos y series
        gtasa.entregar();
        pm.entregar();
        mk.entregar();
        got.entregar();
        x.entregar();
        
        //Contar juegos y series entregados y devolverlos
        int contS = 0, contJ = 0;
        
        for(Videojuego a: juegos){
            if(a.entregado){
                contJ++;
                a.devolver();
            }
        }
        JOptionPane.showMessageDialog(null, contJ+" videojuegos entregados se han devuelto");
        
        for(Serie b: series){
            if(b.entregado){
                contS++;
                b.devolver();
            }
        }
        JOptionPane.showMessageDialog(null, contS+" series entregadas se han devuelto");
        
        
        Serie masTempos = series[0];
        Videojuego masHoras = juegos[0];
        
        for(int i=1; i<(series.length); i++){
            if (series[i].compareTo((Object)masTempos)==1 || series[i].compareTo((Object)masTempos)==0){
                masTempos = series[i];
            }
        }
        
        for(int z=1; z<(juegos.length); z++){
            if (juegos[z].compareTo((Object)masHoras)==1 || juegos[z].compareTo((Object)masHoras)==0){
                masHoras = juegos[z];
            }
        }
        
        JOptionPane.showMessageDialog(null, masTempos.toString());
        JOptionPane.showMessageDialog(null, masHoras.toString());
    }
    
}
