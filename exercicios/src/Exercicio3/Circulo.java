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
public class Circulo implements FiguraGeometrica{
    double raio; 

    Circulo(int raio) {
        this.raio = raio; 
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public int getArea() {
        return (int)Math.round(Math.PI*2*raio); 
    }

    @Override
    public int getPerimetro() {
        return (int)Math.round(2*Math.PI*raio); 
    }
    
}
