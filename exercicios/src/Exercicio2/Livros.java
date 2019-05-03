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
public class Livros extends Produto
{
    private String autor; 

    public Livros(String autor, String nome, double preco) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livros " + "autor: " + autor + " Nome: " + nome + " Preço: " + preco ;
    }

    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
    
    
}
