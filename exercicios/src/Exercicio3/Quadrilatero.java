/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

/**
 *
 * @author jfrne
 */
public abstract class Quadrilatero implements FiguraGeometrica {
 
    protected int[] lados = new int[4]; 

    public int[] getLado() {
        return lados;
    }

    public void setLado(int[] lado) {
        this.lados = lado;
    }

    


    @Override
    public int getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPerimetro() {
        int perimetro = 0 ; 
        for(int item : lados)
        {
            perimetro += item; 
        }
        return perimetro; 
    }
 
        
}
