/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Persona;
import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class PersonaServicio {
 
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
    
        Persona per = new Persona();
    
        System.out.println("Indique el Nombre de la Persona");
        per.setNombre(leer.next());
        System.out.println("Indique la Edad");
        per.setEdad(leer.nextInt());
        
       
            System.out.println("Indique el Género (H-Hombre; M-Mujer; O-Otro)");
            per.setSexo(leer.next());
            
       while (!per.getSexo().equalsIgnoreCase("H") && !per.getSexo().equalsIgnoreCase("M") && !per.getSexo().equalsIgnoreCase("O")){ 
                System.out.println("ERROR EN CARACTER");
                System.out.println("Indique el Género (H-Hombre; M-Mujer; O-Otro)");
                per.setSexo(leer.next());
       }
           
                       
        System.out.println("Indique el Peso (kg)");
        per.setPeso(leer.nextDouble());
        
        System.out.println("Indique la Altura (metros)");
        per.setAltura(leer.nextDouble());
        
        return per;
    }
    
    public  int calcularIMC(Persona per){
    
        int imc = 0;

        double calculo = per.getPeso() / (pow(per.getAltura(), 2));

        if (calculo < 20) {

            imc = -1;
        } else if (calculo > 19 && calculo < 26) {

            imc = 0;
        } else if (calculo > 25) {

            imc = 1;
        }
        return imc;
    }
    
    public  boolean esMayordeEdad (Persona per){
    
        boolean mayor = false;
        
        if (per.getEdad() > 17){
            
            mayor = true;
        
        }
        
        return mayor;
        
    }
    
    
}
