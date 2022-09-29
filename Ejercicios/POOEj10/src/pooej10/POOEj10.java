/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej10;

import static java.lang.System.arraycopy;
import java.util.Arrays;

/**
 *
 * @author cynth
 */
public class POOEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double vectorA[] = new double[50];
        double vectorB[] = new double[20];
        
        for (int i = 0; i < vectorA.length; i++) {
            
            vectorA[i] = Math.round((Math.random()*10));
            
        }
        
        //Muestra Vector A
        System.out.println("VECTOR A");
        System.out.println(Arrays.toString(vectorA));
        
        //Ordena Vector A y lo muestra
        
        System.out.println("ORDENA VECTOR A");
        Arrays.sort(vectorA);
        
        System.out.println(Arrays.toString(vectorA));
        
        //Vector2: copia los 10 num de vector A y rellena los restantes con 0.5
        
       // arraycopy(vectorA,0,vectorB,0,10);
       
       System.out.println("VECTOR B");
        vectorB = Arrays.copyOfRange(vectorA, 0, 20);
        
        Arrays.fill(vectorB, 10,20, 0.5);
        
        System.out.println(Arrays.toString(vectorB));
        
    

//        double var = Math.round((Math.random()*10));
//
//           Arrays.fill(vectorA,Math.round((Math.random()*10)));
//        
//          System.out.println(Arrays.toString(vectorA));
//        


    }  
    
}
