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
public class FuncionarioBasico extends Funcionario
{
    String escola; 
    public FuncionarioBasico(String Nome, int codigo, String escola) {
        super(Nome, codigo);
        this.escola = escola; 
        super.renda *=1.10; 
    }

    @Override
    public void ExibirDados() {
        super.ExibirDados(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Escola " + escola);
    }
}
