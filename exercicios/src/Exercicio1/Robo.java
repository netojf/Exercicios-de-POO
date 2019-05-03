/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

/**
 *
 * @author jfrne
 */
public class Robo extends Controle
{

    @Override
    public void Andar() {
        System.out.println("Andando");
    }

    @Override
    public void Falar() {
        System.out.println("falando"); 
    }

    @Override
    public void Virar() {
        System.out.println("Virando"); 
    }
    
}
