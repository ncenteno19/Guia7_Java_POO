/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class CuentaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cuenta crearCuenta(){
    
    
    
     //instanciar objeto
     
     Cuenta account = new Cuenta();
        System.out.println("============================");
        System.out.println("       CREAR CUENTA");
        System.out.println("============================");
        System.out.println("Ingrese su DNI");
        account.setDNI(leer.nextLong());
        System.out.println("Ingrese el Número de Cuenta");
        account.setNumCuenta(leer.nextInt());
        System.out.println("Ingrese su Saldo Inicial");
        account.setSaldoActual(leer.nextInt());
        System.out.println("============================");
    
      return account;  
    }
    
    
    public void IngresarDinero (Cuenta account){
    
        
        System.out.println("Indique la cantidad de Dinero a Ingresar:");
        double ingreso = leer.nextDouble();
               
        account.setSaldoActual((int) (account.getSaldoActual()+ingreso));
        
        System.out.println("Saldo Actual: $ " + account.getSaldoActual() );
        
    }
    
    public void RetirarDinero(Cuenta account){
    
        
        System.out.println("Indique la cantidad a Retirar");
        
        double retiro = leer.nextDouble();

        do {
            if (account.getSaldoActual() - retiro < 0) {

                System.out.println("SALDO INSUFICIENTE. Solo puede retirar $" + account.getSaldoActual());
                System.out.println("Indique la cantidad a Retirar");
                retiro = leer.nextDouble();
            }
        } while (account.getSaldoActual() - retiro < 0);

        account.setSaldoActual((int) (account.getSaldoActual() - retiro));
        System.out.println("Saldo Actual: $ " + account.getSaldoActual());

    }
    
    
    public void extraccionRapida(Cuenta account){
    
     int extraccion;
     
     do{
       System.out.println("Indique la cantidad de la Extracción Rápida");
        
       extraccion = leer.nextInt();
       
       if(extraccion > 0.2*account.getSaldoActual()){
           System.out.println("La Extraccion Rápida no debe superar $ " +0.2*account.getSaldoActual());
       }
        
     } while (extraccion > 0.2*account.getSaldoActual()); 
     
     account.setSaldoActual(account.getSaldoActual() - extraccion);
       
       System.out.println("Saldo Actual: $ " + account.getSaldoActual() ); 
    }
    
    public void consultarSaldo(Cuenta account){
        
        System.out.println("Su Saldo Actual es: $ " + account.getSaldoActual());
    
    }
    
    public void consultarDatos(Cuenta account){
    
        System.out.println(account.toString());
        
    }
    
    
    
}
