/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej02;

import Entidades.Circunferencia;
import Service.CircunferenciaServicio;

/**
 *
 * @author cynth
 */
public class POOEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CircunferenciaServicio circulo = new CircunferenciaServicio();
        
        Circunferencia c1 = circulo.cargaCircunferencia();
        
       circulo.Area(c1);
       circulo.Perimetro(c1);
        
       Circunferencia c2 = circulo.cargaCircunferencia();
        
       circulo.Area(c2);
       circulo.Perimetro(c2);
       
        
    }
    
}
