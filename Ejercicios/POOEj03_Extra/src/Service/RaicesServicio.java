/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class RaicesServicio {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Raices crearRaiz() {

        Raices root = new Raices();
        
        System.out.println("Ingrese los valores de a,b y c");
        
        root.setA(leer.nextInt());
        root.setB(leer.nextInt());
        root.setC(leer.nextInt());
        
//        System.out.println("Soluciones");
//         System.out.println("POSITIVO");
//         
//         double positivo = (-root.getB() + (Math.sqrt(Math.pow(root.getB(),2) - 4*root.getA()*root.getC()))) / (2 * root.getA());
//         double negativo = (-root.getB() - (Math.sqrt(Math.pow(root.getB(),2) - 4*root.getA()*root.getC()))) / (2 * root.getA());
//         
//         System.out.println(positivo);
//        
//         System.out.println("NEGATIVO");
//         System.out.println(negativo);
        
        return root;
    }
    
    //DISCRIMINANTE
    public double getDiscriminante(Raices root){
        double discriminante = 0;
        
        discriminante = Math.pow(root.getB(),2) - 4*root.getA()*root.getC();
                    
    return discriminante;
    }
    
    //TIENE RAICES
    public boolean tieneRaices(double discri) {

        boolean dosSoluciones = false;
        if (discri > 0) {
            dosSoluciones = true;
        }
        return dosSoluciones;
    }

    //TIENE RAIZ
    public boolean tieneRaiz(double discri) {

        boolean unaSolucion = false;
        if (discri == 0) {
            unaSolucion = true;
        }
        return unaSolucion;
    }
        
     //OBTENER RAICES
        public void obtenerRaices(Raices root, double discri) {

        if (tieneRaices(discri) == true) {

            double positivo = (-root.getB() + Math.sqrt(getDiscriminante(root))) / (2 * root.getA());
            double negativo = (-root.getB() - Math.sqrt(getDiscriminante(root))) / (2 * root.getA());

            System.out.println("Las raices son :");
            System.out.println(positivo);
            System.out.println(negativo);

        }
    }
            
            
    public void obtenerRaiz(Raices root, double discri) {

        double positivo = (-root.getB() + Math.sqrt(getDiscriminante(root))) / (2 * root.getA());
       
        if (tieneRaiz(discri) == true) {

             System.out.println("La raiz es :");
            System.out.println(positivo);
          
        }

       }
        
    public void calcular(Raices root,double discri){
    
        if(discri<0){
        
            System.out.println("El Discriminante es menor a CERO.");
            System.out.println("La función no tiene raices");
        }
        else{
        tieneRaices(discri);
        tieneRaiz(discri);
        obtenerRaices(root, discri);
        obtenerRaiz(root, discri);
        }
               
    
    }
    
    
    
    
}
