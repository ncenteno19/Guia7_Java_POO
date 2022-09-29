/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej04;

import Entidades.Rectangulo;
import Service.RectanguloServicio;

/**
 *
 * @author cynth
 */
public class POOEj04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        RectanguloServicio figura = new RectanguloServicio();
        
        Rectangulo rec1 = figura.creaRectangulo();
        
       figura.Superficie(rec1);
       figura.Perimetro(rec1);
       figura.Dibuja(rec1);
        
    }
    
}
