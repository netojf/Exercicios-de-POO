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
public class FuncionarioGraduado extends Funcionario
{
    String universidade; 
    public FuncionarioGraduado(String Nome, int codigo, String escola) {
        super(Nome, codigo);
        this.universidade = escola; 
        super.renda *=2; 
    }

    @Override
    public void ExibirDados() {
        super.ExibirDados(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Escola " + universidade);
    }
    
}
