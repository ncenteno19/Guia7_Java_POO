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
public class Ahorcado {
    
    private String[] vecPalabra;
    private int encontradas;
    private int turnos;
    private int jugadasMax;

    public Ahorcado() {
    }

        public Ahorcado(String[] vecPalabra, int encontradas, int turnos, int jugadasMax) {
        this.vecPalabra = vecPalabra;
        this.encontradas = encontradas;
        this.turnos = turnos;
        this.jugadasMax = jugadasMax;
    }

    public String[] getVecPalabra() {
        return vecPalabra;
    }

    public void setVecPalabra(String[] vecPalabra) {
        this.vecPalabra = vecPalabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getTurnos() {
        return turnos;
    }

    public void setTurnos(int turnos) {
        this.turnos = turnos;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }
    
        
    
        
}