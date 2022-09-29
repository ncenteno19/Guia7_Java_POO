/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class OperacionServicio {
    
    public Operacion crearOperacion(){
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //instaciar objeto de tipo Operacion
        Operacion op = new Operacion();
        
        System.out.println("Ingrese dos números");
        
        op.setNum1(leer.nextInt());
        op.setNum2(leer.nextInt());
        
        return op;
  
    }
    
    public int Sumar(Operacion op){
    
        int suma;
        
        suma= op.getNum1() + op.getNum2();
        
        return suma;
    
    }
    
    public int Restar(Operacion op) {
        int resta;

        resta = op.getNum1() - op.getNum2();

        return resta;

    }
    
     public int Multiplicar (Operacion op) {
        int mult=0;
        
         if (op.getNum1() == 0 || op.getNum2() == 0){
            System.out.println("ERROR. Los numeros deben ser distintos de 0 (CERO)");
        } 
        else {
        
        mult = op.getNum1() * op.getNum2();
        
         }

        return mult;

    }
    
       public int Dividir (Operacion op) {
        int div = 0;
        
        if (op.getNum2() == 0){
            System.out.println("ERROR. El divisor debe ser distinto de 0 (CERO)");
        } 
        else {
        
        div = op.getNum1() / op.getNum2();
        }
        
        return div;
        

    }
    
    
    
    
}
