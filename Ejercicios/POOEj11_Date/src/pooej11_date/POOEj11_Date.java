/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej11_date;

import java.util.Date;
import java.util.Scanner;



/**
 *
 * @author cynth
 */
public class POOEj11_Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        System.out.println("Ingrese día:");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes:");
        int mes = leer.nextInt();
        System.out.println("Ingrese año:");
        int anio = leer.nextInt();
    
        Date fecha = new Date (anio-1900, mes-1, dia);
        
        Date fechaActual = new Date();
        
        //calcula años de diferencia
        //int dif = fechaActual.getYear() - fecha.getYear();
        
    
        System.out.println(fecha.toString());
        System.out.println(fechaActual.toString());
        System.out.println(fechaActual.getYear() - fecha.getYear());
    }
    
}
