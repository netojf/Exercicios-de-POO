/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

/**
 *
 * @author jfrne
 */
public class DVD extends Produto {
    double duracao; 

    @Override
    public String toString() {
        return "DVD-> Nome: " + nome  + "Duração: " + duracao + " Preço: " + preco;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public DVD(double duracao, String nome, double preco) {
        super(nome, preco);
        this.duracao = duracao;
    }
}
