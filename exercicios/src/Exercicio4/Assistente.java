/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4;

/**
 *
 * @author jfrne
 */
public abstract class Assistente extends Funcionario
{
    protected int matricula;
    public Assistente(int matricula) {
        super(matricula);
    }

    @Override
    protected void ExibeDados() {
        System.out.println(matricula); 
    }
    
}
