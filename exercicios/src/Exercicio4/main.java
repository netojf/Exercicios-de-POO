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
public class main {
    
    public static void main(String[] args )
    {
        AssistenteAdministrativo assistente1 = new AssistenteAdministrativo(123123,true);
        AssistenteTecnico assistente2 = new AssistenteTecnico(123123, 123.23); 
        assistente1.ExibeDados();
        assistente2.ExibeDados();
    }
    
}
