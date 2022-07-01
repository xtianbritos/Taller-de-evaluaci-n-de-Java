
package ejercicio16;

public class Persona {
    String nombre="", dni;
    int edad=0;
    final char hombre='H';
    char sexo=hombre;
    double peso=0, altura=0;

    //Constructores
    public Persona() {
        this.dni = generaDNI();
    }
    
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = hombre;
        this.dni = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //Métodos
    public int calcularIMC(double peso, double altura) {
        double imc;
        
        imc = peso/(altura*altura);
        
        if(imc<20){
            return -1;
        }else if(imc>=20 && imc<=25){
            return 0;
        }else{
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(int edad){
        return edad>=18;
    }
    
    public  void comprobarSexo(){
        if (this.sexo!='H' && this.sexo!='M') {
            this.sexo = hombre;
        }
    }
    
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+
                "  Edad: "+this.edad+
                "  DNI: "+this.dni+
                "  Sexo: "+this.sexo+
                "  Peso: "+this.peso+
                "  Altura: "+this.altura;
    }
    
    public static int generaNumeroRandom(){
        double numDouble;
        int numInt;
        
        numDouble = 10000000 + Math.random() * 90000000;
        numInt = (int)numDouble;
        
        //Si random da 1 y el número resultante es de 9 cifras le restamos uno
        if(numInt == 100000000){
            numInt--;
        }
        
        return numInt;
    }
    
    public static String generaDNI(){
        String dni;
        String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int num, i;
        
        num = generaNumeroRandom();
        i = num%23;
        
        dni = letras[i]+String.valueOf(num);
        
        return dni;
    }
    
    //Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
