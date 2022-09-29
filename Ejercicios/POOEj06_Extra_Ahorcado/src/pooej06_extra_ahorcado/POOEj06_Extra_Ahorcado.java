/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej06_extra_ahorcado;

import Entidades.Ahorcado;
import Servicio.AhorcadoServicio;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class POOEj06_Extra_Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        AhorcadoServicio llamar = new AhorcadoServicio();
        
        Ahorcado play = llamar.crearJuego();
        
        llamar.juego(play);
        
  

    }
    
}
