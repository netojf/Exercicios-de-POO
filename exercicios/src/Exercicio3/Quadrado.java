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
public class Quadrado extends Quadrilatero
{

     Quadrado(int lado) {
        for (int i = 0; i < 4; i++){
           lados[i] = lado;
        }
    }

   

    @Override
    public int getArea() {
        return lados[1]*lados[0]; //To change body of generated methods, choose Tools | Templates.
    }
    
}
    

    
    
 
