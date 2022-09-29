/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class AhorcadoServicio {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Ahorcado crearJuego(){
    
        String [] vecPalabra;
        String palabra;
        int encontradas = 0;
        int turnos = 0; 
        int jugadasMaximas;
        
        System.out.println("*************");
        System.out.println("*  AHORCADO *");
        System.out.println("*************");
        
        System.out.println("Para iniciar el juego ingrese la palabra");
        palabra = leer.next();
        
        vecPalabra = palabra.split(""); // se ingresa la palabra al vector
       
        System.out.println("Ingrese la cantidad de jugadas Máximas");
        jugadasMaximas = leer.nextInt();
            
        Ahorcado juego = new Ahorcado(vecPalabra, encontradas, turnos, jugadasMaximas); 
         
        limpiarPantalla();
        
        return juego;
    
    }
    
    
    public void juego (Ahorcado juego){
    
        String[] adivinadas = new String[juego.getVecPalabra().length];

        Arrays.fill(adivinadas, "_");
        
        System.out.println("*************");
        System.out.println("*  AHORCADO *");
        System.out.println("*************");
        
        
        for (int i = 0; i < adivinadas.length; i++) {
            System.out.print(adivinadas[i] + " ");
            
        }
        
        System.out.println("");
        System.out.println("");
        
        String letra = "";
        
        boolean acierto;
        
         do {
             
            dibujar(juego);
            
            System.out.println("Ingrese una letra:");
            letra = leer.next();
            buscar(juego, letra, adivinadas);
             
             System.out.println("----------------------------");
             System.out.println("    DATOS DE LA PALABRA");
                        
             System.out.println("Cantidad de letras: " + longitud(juego));
             
             acierto = encontradas(juego,letra);
             
             System.out.println("Entontradas: " + juego.getEncontradas());
             System.out.println("Letras Faltantes: " + (juego.getVecPalabra().length - juego.getEncontradas()));
             
             intentos(juego, acierto);      
             System.out.println("Oportunidades restantes: " +  (juego.getJugadasMax()-juego.getTurnos()));
             
             System.out.println("----------------------------");
             

             } while ( juego.getJugadasMax()-juego.getTurnos() > 0 && !(juego.getVecPalabra().length - juego.getEncontradas() == 0) );
                
         if (juego.getVecPalabra().length - juego.getEncontradas() == 0){
         
             System.out.println("☻☻☻ FELICIDADES. GANASTE!!!!!!!!!!!!");
         } else {
             
             System.out.println("(´･_･`) PERDISTE. INTENTALO NUEVAMENTE");
             
         
         }
        
    }
    
    
    public int longitud(Ahorcado juego){
    
        int longPalabra = juego.getVecPalabra().length;
        
        return longPalabra;
    }
    
    
    public void buscar(Ahorcado juego, String letra, String[] adivinadas) {

        
        boolean acierto = false;

        for (int i = 0; i < longitud(juego); i++) {

            if (juego.getVecPalabra()[i].equalsIgnoreCase(letra)) {
                adivinadas[i] = letra;
                acierto = true;
            }

            System.out.print(adivinadas[i] + " ");
        }

        System.out.println("");
        if (acierto == true) {
            System.out.println("Haz Acertado!. Presiona ENTER para continuar");
           // leer.next();
        } else {
            System.out.println("La letra no se encuentra. Presiona ENTER para continuar");
           // leer.next();
        }

    }
    
    public boolean encontradas(Ahorcado juego, String letra) {
        
        boolean acierto = false;
        
        for (int i = 0; i < longitud(juego); i++) {

            if (juego.getVecPalabra()[i].equalsIgnoreCase(letra)) {
                juego.setEncontradas(juego.getEncontradas() + 1);
                acierto = true;
            }

        }
        
        return acierto;
        
    }
    
    
    public void intentos (Ahorcado juego, boolean acierto){
    
        if (acierto == false) {
            juego.setTurnos(juego.getTurnos() + 1);
        }

    }
    

    public void limpiarPantalla(){
        for (int i = 0; i < 20; i++) {
            System.out.println("");
        }
    }

   private void dibujar(Ahorcado juego){
        int dibujoActual = juego.getJugadasMax()-juego.getTurnos();
        double porcentaje = (dibujoActual*100) / juego.getJugadasMax(); // represeta el porcentaje total del dibujo segun la cantidad de jugadas maximas que tiene.
        
        
        
        if (porcentaje > 90){
            System.out.println("     ===========|   ");
            System.out.println("     ||         |     ");
            System.out.println("     ||               ");
            System.out.println("     ||           ");
            System.out.println("    (())            ");
            System.out.println("   ((()))           ");
            System.out.println("__(((())))____________");
        } else if (porcentaje > 80) {
            System.out.println("     ===========|   ");
            System.out.println("     ||         |     ");
            System.out.println("     ||        (@)      ");
            System.out.println("     ||        ");
            System.out.println("    (())            ");
            System.out.println("   ((()))           ");
            System.out.println("__(((())))____________");
        } else if (porcentaje > 70) {
            System.out.println("     ===========|   ");
            System.out.println("     ||         |     ");
            System.out.println("     ||        (@)      ");
            System.out.println("     ||         |      ");
            System.out.println("    (())            ");
            System.out.println("   ((()))           ");
            System.out.println("__(((())))____________");
        } else if (porcentaje > 60){
            System.out.println("     ===========|   ");
            System.out.println("     ||         |     ");
            System.out.println("     ||        (@)      ");
            System.out.println("     ||        /|     ");
            System.out.println("    (())            ");
            System.out.println("   ((()))           ");
            System.out.println("__(((())))____________");

        } else if (porcentaje > 50) {
            System.out.println("     ===========|   ");
            System.out.println("     ||         |     ");
            System.out.println("     ||        (@)      ");
            System.out.println("     ||       _/|     ");
            System.out.println("    (())            ");
            System.out.println("   ((()))           ");
            System.out.println("__(((())))____________");
        } else if (porcentaje > 40) {
            System.out.println("     ===========|   ");
            System.out.println("     ||         |     ");
            System.out.println("     ||        (@)      ");
            System.out.println("     ||       _/|"+Character.toString(92)+"      ");
            System.out.println("    (())            ");
            System.out.println("   ((()))           ");
            System.out.println("__(((())))____________");

        } else if (porcentaje > 30) {
            System.out.println("     ===========|   ");
            System.out.println("     ||         |     ");
            System.out.println("     ||        (@)      ");
            System.out.println("     ||       _/|"+Character.toString(92)+"_      ");
            System.out.println("    (())            ");
            System.out.println("   ((()))           ");
            System.out.println("__(((())))____________");
        } else if (porcentaje > 20) {
            System.out.println("     ===========|   ");
            System.out.println("     ||         |     ");
            System.out.println("     ||        (@)      ");
            System.out.println("     ||       _/|"+Character.toString(92)+"_      ");
            System.out.println("    (())        |    ");
            System.out.println("   ((()))           ");
            System.out.println("__(((())))____________");
        } else if (porcentaje > 10) {
            System.out.println("     ===========|   ");
            System.out.println("     ||         |     ");
            System.out.println("     ||        (@)      ");
            System.out.println("     ||       _/|"+Character.toString(92)+"_      ");
            System.out.println("    (())        |   ");
            System.out.println("   ((()))      /    ");
            System.out.println("__(((())))____________");
        } else {
            System.out.println("     ===========|   ");
            System.out.println("     ||         |     ");
            System.out.println("     ||        (@)      ");
            System.out.println("     ||       _/|"+Character.toString(92)+"_      ");
            System.out.println("    (())        |   ");
            System.out.println("   ((()))      / "+Character.toString(92)+"      ");
            System.out.println("__(((())))____________");
        }

        
    }

}
