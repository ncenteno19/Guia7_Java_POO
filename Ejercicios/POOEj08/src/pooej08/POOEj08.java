/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej08;

import Entidades.Cadena;
import Service.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class POOEj08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Cadena palabra = new Cadena();
        
        System.out.println("Ingrese una frase");
                          
        palabra.setFrase(leer.next());
        
        palabra.setFraseLong(palabra.getFrase().length());
        
        
        //se le pase la frase a Servicio Cadena
        CadenaServicio cs = new CadenaServicio(palabra.getFrase());
        
      
        System.out.println("La frase tiene " + cs.mostrarVocales() + " vocales");
        
        System.out.println("La frase INVERTIDA ES:");
        System.out.println(cs.invertirFrase());
        
        //Se compara longitud de frases
        System.out.println("Ingrese una NUEVA frase");
        String nuevaFrase = leer.next();
        
        cs.compararLongitud(nuevaFrase);
        
      
        System.out.println("Frases unidas");
        
        cs.unirFrases(nuevaFrase);
        
        System.out.println("Ingrese un caracter a reemplar por la letra A");
        String caracter = leer.next();
        
        cs.reemplazar(caracter);
        
        System.out.println("Ingrese una letra a buscar");
        String letra = leer.next();
        System.out.println("La letra se encuentra en la frase?");
        System.out.println(cs.contiene(letra));
        
        
        
    }

      
}
