/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

/**
 *
 * @author Santi
 */
public class Electrodomestico {
    final double precioBaseDefault=100;
    final int pesoDefault=5;
    final String colorDefault="Blanco";
    final char consumoEnergeticoDefault='F';
    
    double precioBase;
    int peso;
    String color;
    char consumoEnergetico;
    
    
    //Constructores
    public Electrodomestico() {
        this.precioBase = precioBaseDefault;
        this.peso = pesoDefault;
        this.color = colorDefault;
        this.consumoEnergetico = consumoEnergeticoDefault;
    }

    public Electrodomestico(double precio, int peso) {
        this.precioBase = precio;
        this.peso = peso;
        this.color = colorDefault;
        this.consumoEnergetico = consumoEnergeticoDefault;
    }

    public Electrodomestico(double precio, int peso, String color, char consumoEnergetico) {
        this.precioBase = precio;
        this.peso = peso;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    //Métodos get
    public double getPrecioBase() {
        return precioBase;
    }

    public int getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    
    //Métodos
    private char comprobarConsumoEnergetico(char letra){
        Character.toUpperCase(letra);
        
        if(letra != 'A' || letra != 'B' || letra != 'C' || letra != 'D' || letra != 'E' || letra != 'F'){
            letra = consumoEnergeticoDefault;
        }
        return letra;
    }
    
    private String comprobarColor(String color){
        if(!color.equalsIgnoreCase("blancos") || !color.equalsIgnoreCase("negro") || !color.equalsIgnoreCase("rojo") || !color.equalsIgnoreCase("azul") || !color.equalsIgnoreCase("gris")){
            color = colorDefault;
        }
        return color;
    }
    
    public void precioFinal(){
        
        switch (consumoEnergetico){
            case 'A':{
                precioBase+=100;
                break;
            }
            case 'B':{
                precioBase+=80;
                break;
            }
            case 'C':{
                precioBase+=60;
                break;
            }
            case 'D':{
                precioBase+=50;
                break;
            }
            case 'E':{
                precioBase+=30;
                break;
            }
            case 'F':{
                precioBase+=10;
                break;
            }
        }
        
        if(peso>=0 && peso<=19){
            precioBase+=10;
        }else if(peso<=49){
            precioBase+=50;
        }else if(peso<=79){
            precioBase+=80;
        }else if(peso>80){
            precioBase+=100;
        }
    }
}
