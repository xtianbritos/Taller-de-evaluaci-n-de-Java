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
    final int precioBaseDefault=100, pesoDefault=5;
    final String colorDefault="Blanco";
    final char consumoEnergeticoDefault='F';
    
    int precioBase, peso;
    String color;
    char consumoEnergetico;
    
    
    //Constructores
    public Electrodomestico() {
        this.precioBase = precioBaseDefault;
        this.peso = pesoDefault;
        this.color = colorDefault;
        this.consumoEnergetico = consumoEnergeticoDefault;
    }

    public Electrodomestico(int precio, int peso) {
        this.precioBase = precio;
        this.peso = peso;
        this.color = colorDefault;
        this.consumoEnergetico = consumoEnergeticoDefault;
    }

    public Electrodomestico(int precio, int peso, String color, char consumoEnergetico) {
        this.precioBase = precio;
        this.peso = peso;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    //Métodos get
    public int getPrecioBase() {
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
    
    public int precioFinal(char letra, int peso){
        int precioFinal=0;
        
        switch (letra){
            case 'A':{
                precioFinal+=100;
                break;
            }
            case 'B':{
                precioFinal+=80;
                break;
            }
            case 'C':{
                precioFinal+=60;
                break;
            }
            case 'D':{
                precioFinal+=50;
                break;
            }
            case 'E':{
                precioFinal+=30;
                break;
            }
            case 'F':{
                precioFinal+=10;
                break;
            }
        }
        
        if(peso>=0 && peso<=19){
            precioFinal+=10;
        }else if(peso<=49){
            precioFinal+=50;
        }else if(peso<=79){
            precioFinal+=80;
        }else if(peso>80){
            precioFinal+=100;
        }
        
        return precioFinal;
    }
}
