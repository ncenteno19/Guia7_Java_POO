/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej09;

import Entidades.Matematica;
import Service.MatematicaService;
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class POOEj09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        Matematica mat = new Matematica();
        
//        mat.setNum1(5);
//        mat.setNum2(4);
        
        mat.setNum1((int) (Math.random () *10 ));
        mat.setNum2((int) (Math.random () *10 ));
        
        System.out.println("NUMERO 1: " + mat.getNum1());
        System.out.println("NUMERO 2: " + mat.getNum2());
        
        MatematicaService ms = new MatematicaService(mat.getNum1(), mat.getNum2());
    
        System.out.println("El mayor número es: " + ms.devolverMayor());
       
        System.out.println("La potencia del mayor número es " + ms.calcularPotencia());
        
        System.out.println("La raiz cuadrada del menor número es: " + ms.raizCuadrada());
       
        
        
    }
    
}
