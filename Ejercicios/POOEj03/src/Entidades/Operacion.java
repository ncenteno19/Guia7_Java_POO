/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author cynth
 */
public class Operacion {
    
    private int num1;
    private int num2;
    
    //contructor por defecto

    public Operacion() {
    }
    
    //Constructor por parámetros
    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //getter end setter
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
// toString
    
    @Override
    public String toString() {
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    
    
    
    
    
}
