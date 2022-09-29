/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class CircunferenciaServicio {
    
    public Circunferencia cargaCircunferencia(){
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
        //instancia un objeto de tipo Circunferencia
        Circunferencia c = new Circunferencia();
        
        //lleno atributos
        System.out.println("Ingrese el radio");
        c.setRadio(leer.nextDouble());
        
        return c;
        
}
    
    public void Area(Circunferencia c){
    
        
        System.out.println("El área es " + Math.PI*Math.pow(c.getRadio(),2));
        
    }

    public void Perimetro(Circunferencia c) {
        System.out.println("El perímetro es " + 2 * Math.PI * c.getRadio());
    }
   
    
}
