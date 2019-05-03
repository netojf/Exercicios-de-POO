/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

import java.util.ArrayList;

/**
 *
 * @author jfrne
 */
public class Loja {
    ArrayList<Produto> produtos = new ArrayList(); 

    public void AddProduto(Produto produto)
    {
        produtos.add(produto);        
    }
    
    public void ImprimeProdutos()
    {
        for(Produto item : produtos){
            System.out.println(item.toString());
        }
    }
    
    
}
