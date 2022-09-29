/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author cynth
 */


//     private String ISBN;
//     private String titulo;
//     private String autor;
//     private Integer numPaginas ;


public class LibrosServicio {
    public Libro cargaLibro (){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //instancian un objeto de tipo Libro
        Libro libro1 = new Libro();

        //lleno los atributos
        System.out.println("Ingrese el ISBD");
        libro1.setISBN(leer.next());
        System.out.println("Ingrese el título");
        libro1.setTitulo(leer.next());
        System.out.println("Ingrese el Autor");
        libro1.setAutor(leer.next());
        System.out.println("Ingrese la Número de páginas");
        libro1.setNumPaginas(leer.nextInt());

        return libro1;
               
    } 
}
