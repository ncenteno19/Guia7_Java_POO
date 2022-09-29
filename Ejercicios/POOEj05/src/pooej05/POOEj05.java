/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej05;

import Entidades.Cuenta;
import Service.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class POOEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        
        CuentaServicio cajero = new CuentaServicio();
        
        Cuenta cuen = cajero.crearCuenta();
        int opcion;
        
        do{
            System.out.println("====================");
            System.out.println("        MENU");
            System.out.println("====================");
            System.out.println("1. Depósito");
            System.out.println("2. Retirar Efectivo");
            System.out.println("3. Extracción Rápida");
            System.out.println("4. Consultar Saldo ");
            System.out.println("5. Consultar Datos");
            System.out.println("6. Salir");
            System.out.println("====================");
            System.out.println("Ingrese una opción:");
            
            opcion = leer.nextInt();
          
          switch (opcion){
 
              case 1:
                  cajero.IngresarDinero(cuen);
                  break;
              case 2:
                  cajero.RetirarDinero(cuen);
                  break;
              case 3:
                  cajero.extraccionRapida(cuen);
                  break;
              case 4:
                  cajero.consultarSaldo(cuen);
                  break;
              case 5:
                  cajero.consultarDatos(cuen);
                  break;
              case 6:
                  System.out.println("HASTA LUEGO.......");
                  break;
              default:
                  System.out.println("La opcion no es correcta.");
                  
          
          }
            
                        
        } while(opcion != 6);
        
    
    
    }
    
}
