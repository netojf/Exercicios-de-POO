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
public class Retangulo extends Quadrilatero
{

     Retangulo(int base, int altura) 
    {
        for(int i = 0; i < 2 ; i++)
        {
            lados[i] = base;
        }
        for(int i = 2; i < 4; i++)
        {
            lados[i] = altura; 
        }
    }

    @Override
    public int getArea() {
        return lados[0]*lados[2]; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
