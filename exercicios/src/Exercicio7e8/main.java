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
public class main {
    public static void main(String[] args)
    {
        Cliente c1 = new ClienteFisico("Nome", "Endereco", 1312312);
        Cliente c2 = new ClienteJuridico(1312312, "nomefantasia");
        
        c1.ExibirDados();
        c2.ExibirDados();
    }
    
}
