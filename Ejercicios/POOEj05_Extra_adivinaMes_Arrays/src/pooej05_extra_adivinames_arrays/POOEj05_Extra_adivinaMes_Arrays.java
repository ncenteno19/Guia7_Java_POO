/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej05_extra_adivinames_arrays;

import Entidades.Meses;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author cynth
 */
public class POOEj05_Extra_adivinaMes_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        Meses adivina = new Meses();

        System.out.println("Adivine el mes secreto:");
        String respuesta = leer.next();

        while (!respuesta.equalsIgnoreCase(adivina.getMesSecreto())) {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            respuesta = leer.next();

        }
        
        System.out.println("Ha acertado!");


    }
    
}
