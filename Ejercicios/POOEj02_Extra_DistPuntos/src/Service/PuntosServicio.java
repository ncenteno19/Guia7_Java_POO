/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class PuntosServicio {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Puntos crearPuntos(){
    
        Puntos points = new Puntos ();
        
        System.out.println("Ingrese la coordenada X e Y del punto 1");
        points.setX1(leer.nextInt());
        points.setY1(leer.nextInt());
        System.out.println("Ingrese la coordenada X e Y del punto 2");
        points.setX2(leer.nextInt());
        points.setY2(leer.nextInt());
        
    return points;
    
    }
    
    public double calculaDistancia(Puntos points){
        double distancia = 0;
        
        distancia = Math.sqrt(Math.pow(points.getX2() - points.getX1(),2) + Math.pow(points.getY2()-points.getY1(),2))  ;
        
        
        return distancia;
        
    } 
    
}
