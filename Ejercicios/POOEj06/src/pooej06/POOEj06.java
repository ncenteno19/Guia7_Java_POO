/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej06;

import Entidades.Cafetera;
import Service.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class POOEj06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        CafeteraServicio llamar = new CafeteraServicio();
        
        Cafetera caf1 = llamar.crearCafetera();
        
        int opcion;
        
        do {
        
            System.out.println("====================");
            System.out.println("=      MENU        =");
            System.out.println("====================");
            System.out.println("1. LLENAR CAFETERA");
            System.out.println("2. SERVIR TAZA");
            System.out.println("3. VACIAR CAFETERA");
            System.out.println("4. AGREGAR CAFE");
            System.out.println("5. CONSULTAR TOSTRING");
            System.out.println("6. SALIR");
            System.out.println("====================");
            System.out.println("Ingrese una opcion");
            
            opcion = leer.nextInt();
            
        switch (opcion){
            case 1: 
                llamar.llenarCafetera(caf1);
                break;
            case 2:
                llamar.servirTaza(caf1);
                break;
            case 3:
                llamar.vaciarCafetera(caf1);
                break;
            case 4:
                llamar.agregarCafe(caf1);
                break;
            case 5:
                System.out.println(caf1.toString());
                break;
            case 6:
                System.out.println("Hasta luego!");
                break;
            default:
                System.out.println("La opcion no es correcta. Ingresela nuevamente");
                

        
        }
            
            
        } while (opcion != 6);
        
        
        
   
                
    }
    
}
