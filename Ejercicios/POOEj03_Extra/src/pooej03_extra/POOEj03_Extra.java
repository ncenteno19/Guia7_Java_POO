/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej03_extra;

import Entidades.Raices;
import Service.RaicesServicio;

/**
 *
 * @author cynth
 */
public class POOEj03_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RaicesServicio llamar = new RaicesServicio(); 
        
        Raices r = llamar.crearRaiz();
        
        llamar.getDiscriminante(r);
        
        llamar.calcular(r, llamar.getDiscriminante(r));
        
    }
    
}
