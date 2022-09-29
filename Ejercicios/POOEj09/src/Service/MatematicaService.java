/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import static java.lang.Math.max;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author cynth
 */
public class MatematicaService {
    
    private final int num1;
    private final int num2;

    public MatematicaService(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int devolverMayor(){
    
    int mayor = max(num1, num2); 
    
    return mayor;
    
    }
  
    public long calcularPotencia(){
    
        int pot = 0;

        if (num1 > num2) {

            pot = (int) pow(num1, num2);
        } else {
            pot = (int) pow(num2, num1);
        }

        return pot;     
        
    }
    
    public double raizCuadrada(){
    
        double raiz = 0;
        
        if (num1>num2){
        raiz= sqrt(num2);
            
        } else{
        raiz= sqrt(num1);
        }
        
        return raiz;
    
    }
    
    
    
    
}
