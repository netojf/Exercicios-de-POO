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
public abstract class Funcionario {
    protected int matricula;
    
    protected abstract void ExibeDados();

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Funcionario(int matricula) {
        this.matricula = matricula;
    }
    
    
}
