/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_guia7_poo;

import Entidades.Libro;
import Service.LibrosServicio;

/**
 *
 * @author cynth
 */
public class Ejercicio1_guia7_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibrosServicio book = new LibrosServicio();
        
        Libro libro1 = book.cargaLibro();
        
        //Libro libro2 = book.cargaLibro();
        
        System.out.println(libro1);
       
        
       // System.out.println(libro2);
        
       // System.out.println(libro2.getTitulo());
    }
    
}
