/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej03;

import Entidades.Operacion;
import Service.OperacionServicio;

/**
 *
 * @author cynth
 */
public class POOEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //se declara variable para llamar al Servicio
        OperacionServicio calculo = new OperacionServicio();
        
        //se declara variable del tipo Operacion que vaya al servicio para darle datos a los atributos
        Operacion op1 = calculo.crearOperacion();
        
               
        System.out.println("SUMA: " + calculo.Sumar(op1));
        System.out.println("RESTA: " + calculo.Restar(op1));
        System.out.println("MULTIPLICACION: " + calculo.Multiplicar(op1));
        System.out.println("DIVISION: " + calculo.Dividir(op1));
        
        
    }
    
}
