/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej02_extra_distpuntos;

import Entidades.Puntos;
import Service.PuntosServicio;

/**
 *
 * @author cynth
 */
public class POOEj02_Extra_DistPuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PuntosServicio llamar = new PuntosServicio();
        
        Puntos hipo = llamar.crearPuntos();
        
        System.out.println("La distancia entre los puntos es: " + llamar.calculaDistancia(hipo));
        
        
        
    }
    
}
