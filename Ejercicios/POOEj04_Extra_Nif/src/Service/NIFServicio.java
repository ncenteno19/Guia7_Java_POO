/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class NIFServicio {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
 
    public NIF crearNif(){
    
        NIF documento = new NIF();
        
        System.out.println("Ingrese su DNI");
        documento.setDni(leer.nextLong());
        
        String [] vector = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        
        int posicion = (int) documento.getDni() % 23;
        
        documento.setLetra(vector[posicion]);
        
 
        return documento;
    }
    
    public void mostrar(NIF documento){
        
        System.out.println("El NIF es: " + documento.getDni() + "-" + documento.getLetra());
    }
    
}
