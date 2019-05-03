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
public class CDS extends Produto{
    int nFaixas; 

    public CDS(int nFaixas, String nome, double preco) {
        super(nome, preco);
        this.nFaixas = nFaixas;
    }

    @Override
    public String toString() {
        return "CDS > Nome: " + nome + "Preço: " + preco + "Faixas: " + nFaixas;
    }

    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
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
