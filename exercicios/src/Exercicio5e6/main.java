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
public class main {
    public static void main (String[] args)
    {
        Funcionario func1 = new Funcionario("nome", 131231); 
        FuncionarioBasico func2 = new FuncionarioBasico("nome", 131231, "Escola"); 
        FuncionarioMedio func3 = new FuncionarioMedio("nome", 131231, "Colegio"); 
        FuncionarioGraduado func4 = new FuncionarioGraduado("nome", 131231, "Faculdade"); 
        
        func1.ExibirDados();
        func2.ExibirDados();
        func3.ExibirDados();
        func4.ExibirDados();
    }
}
