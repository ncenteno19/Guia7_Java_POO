/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej12_persona_date;

import Entidades.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class POOEj12_Persona_Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        PersonaServicio llamar = new PersonaServicio();
        
        Persona per1 = llamar.crearPersona();
        
               
        
        
        int edadActual = llamar.calcularEdad(per1); //se utiliza variable para la comp. de edades
        
        System.out.println("La edad Actual de la Persona es: " + edadActual );
        
        
        
        System.out.println("Ingrese la edad a comparar");
        int nuevaEdad = leer.nextInt();
        
        System.out.println("La nueva edad es menor que la Persona: " + llamar.menorQue(edadActual, nuevaEdad));
        
        llamar.mostrarPersona(per1);
        
    }
    
}
