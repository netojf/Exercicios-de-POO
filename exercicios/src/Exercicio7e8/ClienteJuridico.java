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
public class ClienteJuridico extends Cliente{
    int CNPJ; 
    String NomeFantasia; 

    public ClienteJuridico(int CNPJ, String NomeFantasia) {
        this.CNPJ = CNPJ;
        this.NomeFantasia = NomeFantasia;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void setNomeFantasia(String NomeFantasia) {
        this.NomeFantasia = NomeFantasia;
    }

    @Override
    protected void ExibirDados() {
        System.out.println("CNPJ: " + CNPJ);
        System.out.println("NomeFantasia : " + NomeFantasia);
    }
    
}
