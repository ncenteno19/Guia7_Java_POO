/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class CadenaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private final String contenidoCadena;

    
    //para poder recibir la frase se debe generar el constructor con la variable que recibe
    public CadenaServicio(String contenidoCadena) {
        this.contenidoCadena = contenidoCadena;
    }
         
    
    public int mostrarVocales(){
        
        int cuentaVocales=0;
        
        for (int i = 0; i < contenidoCadena.length(); i++) {
            if(("A").equalsIgnoreCase(contenidoCadena.substring(i, i+1)) || ("E").equalsIgnoreCase(contenidoCadena.substring(i, i+1))
               || ("I").equalsIgnoreCase(contenidoCadena.substring(i, i+1)) || ("O").equalsIgnoreCase(contenidoCadena.substring(i, i+1))
               || ("u").equalsIgnoreCase(contenidoCadena.substring(i, i+1))){
            
            cuentaVocales++;
            }
                     
        }
        
        return cuentaVocales;
    }
    
    
    public String invertirFrase(){
    
        String invierte = "";
        
        for (int i = contenidoCadena.length() ; i > 0 ; i--) {
            
            invierte+= contenidoCadena.substring(i-1, i);
          
        }
        
        return invierte;
        
        
    }
    
    
    
    public void compararLongitud(String nuevaFrase){
  
        System.out.println("Longitud Primer Frase " + contenidoCadena.length());
        System.out.println("Longitud Nueva Frase " + nuevaFrase.length());

    }
    
    public void unirFrases(String nuevaFrase){
        String concatena = contenidoCadena + nuevaFrase;
        System.out.println(concatena);
        
  
    }
    
      public void reemplazar(String caracter){
      
          System.out.println(contenidoCadena.replace("a", caracter)); 
          
          
//          for (int i = 0; i < contenidoCadena.length(); i++) {
//              if(("a").equalsIgnoreCase(contenidoCadena.substring(i, i+1))){
//                  System.out.print(caracter);
//              } else {
//              System.out.print(contenidoCadena.substring(i, i+1));
//              }
//          }
  
    }
      
      public boolean contiene (String letra){
      boolean busca = false;
      
      if(contenidoCadena.contains(letra)){
      busca=true;
      }
      
      
//          for (int i = 0; i < contenidoCadena.length(); i++) {
//              
//              if ((letra).equals(contenidoCadena.substring(i,i+1))){
//              busca = true;
//              }
//              
//          }
       
      return busca;
      
      }
    
    
    





}
