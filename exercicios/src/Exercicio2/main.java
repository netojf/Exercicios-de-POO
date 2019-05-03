/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author jfrne
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Livros livro1 = new Livros("autor","nome", 12.3); 
        DVD dvd1 = new DVD(12.23,"nome", 123.2);
        CDS cd1 = new CDS(2, "nome", 13.2);
        DVD dvd2 = new DVD(123.23,"nome1", 1232.2);
        CDS cd2 = new CDS(23, "nome1", 133.2);
        
        Loja loja = new Loja(); 
        loja.AddProduto(cd2);
        loja.AddProduto(cd1);
        loja.AddProduto(dvd1);
        loja.AddProduto(livro1);
        loja.AddProduto(dvd2);
        
        loja.ImprimeProdutos();
    }
}