/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio7e8;

/**
 *
 * @author jfrne
 */
public class ClienteFisico extends Cliente{

    String Nome, Endereco; 
    int Telefone; 

    public ClienteFisico(String Nome, String Endereco, int Telefone) {
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }
    @Override
    protected void ExibirDados() {
        System.out.println("Nome: " + Nome);
        System.out.println("Endereco: " + Endereco);
        System.out.println("Telefone: " + Telefone);
    }
    
}
