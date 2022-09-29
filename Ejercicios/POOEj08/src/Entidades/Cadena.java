/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author cynth
 */
public class Cadena {
    
    private String frase; 
    private int fraseLong; 

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getFraseLong() {
        return fraseLong;
    }

    public void setFraseLong(int fraseLong) {
        this.fraseLong = fraseLong;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", fraseLong=" + fraseLong + '}';
    }

    
    
    
    
}

   