/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio5e6;

/**
 *
 * @author jfrne
 */
public class Funcionario {
    String Nome; 
    int codigo; 
    protected double renda = 1000; 

    public Funcionario(String Nome, int codigo) {
        this.Nome = Nome;
        this.codigo = codigo;
    }
    
    public void ExibirDados()
    {
        System.out.println("Nome " + Nome);
        System.out.println("Código "+codigo);
        System.out.println("Renda " +renda );
    }
    
}
