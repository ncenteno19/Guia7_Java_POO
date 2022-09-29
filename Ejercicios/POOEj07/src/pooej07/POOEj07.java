/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej07;

import Entidades.Persona;
import Service.PersonaServicio;

/**
 *
 * @author cynth
 */
public class POOEj07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonaServicio llamar = new PersonaServicio();
        
        int [] vectorIMC = new int [4];        
        boolean [] vectorMayor = new boolean [4];
               
        
        Persona person1 = llamar.crearPersona();
        
        vectorIMC [0] = llamar.calcularIMC(person1);
        vectorMayor[0] = llamar.esMayordeEdad(person1);
        
        Persona person2 = llamar.crearPersona();
        
        vectorIMC [1] = llamar.calcularIMC(person2);
        vectorMayor[1] = llamar.esMayordeEdad(person2);
        
        Persona person3 = llamar.crearPersona();
        
        vectorIMC [2] = llamar.calcularIMC(person3);
        vectorMayor[2] = llamar.esMayordeEdad(person3);
        
        Persona person4 = llamar.crearPersona();
        
        vectorIMC [3] = llamar.calcularIMC(person4);
        vectorMayor[3] = llamar.esMayordeEdad(person4);
        
        int cuentaDebajo = 0;
        int cuentaIdeal = 0;
        int cuentaSobre = 0;
        int cuentaMayor = 0;
        int cuentaMenor = 0;
        
        for (int i = 0; i < vectorIMC.length; i++) {
           
            switch (vectorIMC[i]) {
                case -1:
                    System.out.println("Persona " + (i + 1) + " está por DEBAJO de su peso ideal");
                    cuentaDebajo++;

                    if (vectorMayor[i] == true) {
                        System.out.println("Es MAYOR de edad");
                        cuentaMayor++;
                    } else {
                        System.out.println("Es MENOR de edad");
                        cuentaMenor++;
                    }
                    break;
                case 0:
                    System.out.println("Persona " + (i + 1) + " peso IDEAL");
                    cuentaIdeal++;
                    if (vectorMayor[i] == true) {
                        System.out.println("Es MAYOR de edad");
                        cuentaMayor++;
                    } else {
                        System.out.println("Es MENOR de edad");
                        cuentaMenor++;
                    }
                    break;
                case 1:
                    System.out.println("Persona " + (i + 1) + " está por ENCIMA de su peso ideal");
                    cuentaSobre++;

                    if (vectorMayor[i] == true) {
                        System.out.println("Es MAYOR de edad");
                        cuentaMayor++;
                    } else {
                        System.out.println("Es MENOR de edad");
                        cuentaMenor++;
                    }
                    break;
                default:
                    break;
            }

        }
        
        int totalPersonas = cuentaMenor + cuentaMayor; 
        // calculo de porcentajes
        System.out.println("===============");
        System.out.println("  PORCENTAJES");
        System.out.println("===============");
        System.out.println("******IMC******");
        System.out.println("Debajo: %" + (double)cuentaDebajo/totalPersonas*100); //vectorIMC.length no toma esto para la cuenta
        System.out.println("Ideal: %" + (double) cuentaIdeal/totalPersonas*100);
        System.out.println("Sobrepeso: %" + (double) cuentaSobre/totalPersonas*100);
        
        System.out.println("******EDAD******");
        System.out.println("Mayores: %" + (double) cuentaMayor/totalPersonas*100);
        System.out.println("Menores: %" + (double) cuentaMenor/totalPersonas*100);
 
        
        
        
        
        
        
        
        
        
        
    }
    
}
