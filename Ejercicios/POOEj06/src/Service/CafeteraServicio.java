/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class CafeteraServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public Cafetera crearCafetera(){
    
        //Instanciar objeto
        
        Cafetera caf = new Cafetera();
        
        caf.setCapacidadMaxima(100.00);
        caf.setCapacidadActual(0);
        
        return caf;
    }
    
    public void llenarCafetera(Cafetera caf){
    
        caf.setCapacidadActual(caf.getCapacidadMaxima());
        
        System.out.println("La capacidad Actual es: " + caf.getCapacidadActual());
        
        
    }
    
    public void servirTaza (Cafetera caf){
    
        System.out.println("Indique el tamaño de la taza");
        double taza = leer.nextDouble();
        
        if (caf.getCapacidadActual()-taza < 0){
        
            System.out.println("LA TAZA NO SE LLENÓ");
            System.out.println("Se sirvió " + caf.getCapacidadActual() + "de café");
            
            caf.setCapacidadActual(0);
            
        } else {
            System.out.println("TAZA LLENA!!!!");
            caf.setCapacidadActual(caf.getCapacidadActual()-taza);
            System.out.println("La capacidad Actual es : " + caf.getCapacidadActual());
        }
        
        
    }
    
    
    public void vaciarCafetera(Cafetera caf){
            caf.setCapacidadActual(0);
             System.out.println("La capacidad Actual es : " + caf.getCapacidadActual());
    }
    
      public void agregarCafe(Cafetera caf){
          
          System.out.println("Indique la cantidad a Agregar: ");
          double agregar = leer.nextDouble();
          
          if (caf.getCapacidadActual() + agregar > caf.getCapacidadMaxima()){
          
              System.out.println("Supera la capacidad Máxima");
              System.out.println("Se agrega " + (caf.getCapacidadMaxima()- caf.getCapacidadActual()));
              caf.setCapacidadActual(100.00);
              System.out.println("La capacidad Actual es " + caf.getCapacidadActual());
              
          } else {
              
              caf.setCapacidadActual(caf.getCapacidadActual()+agregar);
              
              System.out.println("La capacidad Actual: " + caf.getCapacidadActual());
              
          }
          
          
    }
    
    
    
}
