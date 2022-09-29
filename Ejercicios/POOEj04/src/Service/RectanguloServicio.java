/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class RectanguloServicio {
    
    public Rectangulo creaRectangulo(){
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //instanciar objeto
    
    Rectangulo rec = new Rectangulo();
    
        System.out.println("Ingrese la Base y la Altura del rectángulo");
        
        rec.setBase(leer.nextInt());
        rec.setAltura(leer.nextInt());
        
        return rec;
    
    }
    
    public void Superficie(Rectangulo rec){
        
        System.out.println("La Superficie es " + rec.getBase()*rec.getAltura());
        
        
    }
    
      public void Perimetro(Rectangulo rec){
        
        System.out.println("El Perímetro es " + (rec.getBase()+rec.getAltura())/2);
        
        
    }
      
    public void Dibuja(Rectangulo rec) {

        for (int i = 0; i < rec.getBase(); i++) {

            System.out.print("*" + " ");

        }
        System.out.println("");

        for (int i = 0; i < rec.getAltura() - 2; i++) {

            System.out.print("*" + " ");
            for (int j = 0; j < rec.getBase() - 2; j++) {
                System.out.print(" " + " ");

            }
            System.out.println("*" + " ");

        }

        for (int i = 0; i < rec.getBase(); i++) {

            System.out.print("*" + " ");

        }

    }
       
}
