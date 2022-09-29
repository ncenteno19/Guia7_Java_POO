/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        
        Persona people = new Persona();
        
        System.out.println("Ingrese el nombre de la persona");
        people.setNombre(leer.next());
        System.out.println("Ingrese fecha de nacimiento");
        System.out.println("DIA");
        int dia = leer.nextInt();
        System.out.println("MES");
        int mes = leer.nextInt();
        System.out.println("AÑO");
        int anio = leer.nextInt();
        Date fecha = new Date(anio-1900,mes-1,dia);
        
        people.setFechaNacimiento(fecha);
        
        return people;
    }
    
    public int calcularEdad(Persona people){
    
        Date fechaActual = new Date();
        
       int edad = (fechaActual.getYear() - people.getFechaNacimiento().getYear());
        
        return edad;
        
    }
    
    
    public boolean menorQue(int edadActual, int nuevaEdad){
        boolean menor = false;
        
        if (nuevaEdad<edadActual){
            menor= true;
        
        }
        
        return menor;
    
    }
    
    public void mostrarPersona(Persona people){
    
        System.out.println(people.toString());
    
    }
    
    
    
}
