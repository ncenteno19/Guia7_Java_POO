/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej04_extra_nif;

import Entidades.NIF;
import Service.NIFServicio;

/**
 *
 * @author cynth
 */
public class POOEj04_Extra_Nif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    NIFServicio llamar = new NIFServicio ();
    
    NIF doc1 = llamar.crearNif();
    
    llamar.mostrar(doc1);
    
  }
    
}
