/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner s = new Scanner(System.in);
        System.out.println("Quantas Formas deseja criar?");
        int nFormas = s.nextInt(); 
        s.nextLine();
        ArrayList<FiguraGeometrica> formas = new ArrayList(); 
        
        for(int i = nFormas; i != 0; i--)
        {
            System.out.println("Qual Forma deseja criar?");
            System.out.println("(1)Quadrado");
            System.out.println("(2)Retangulo");
            System.out.println("(3)Círculo");
            
            int opt = s.nextInt();
            
            switch(opt)
            {
                case 1:
                    System.out.println("Digite o valor do lado");
                    int lado = s.nextInt();
                    Quadrado quadrado = new Quadrado(lado);
                    formas.add(quadrado); 
                    s.nextLine();
                    break;
                case 2:
                    System.out.println("Digite o valor da base");
                    int base = s.nextInt();
                    System.out.println("Digite o valor da altura");
                    int altura = s.nextInt();
                    Retangulo retangulo = new Retangulo(base,altura);
                    formas.add(retangulo); 
                    s.nextLine();
                    break;
                case 3: 
                    System.out.println("Digite o valor do raio");
                    int raio = s.nextInt();
                    Circulo circulo = new Circulo(raio);
                    formas.add(circulo);
                    s.nextLine();
                    break;
                default:
                    System.out.println("Opcao invalida");
                    i++; 
                    s.nextLine();
                    break;
            }
        }
        
        for(FiguraGeometrica item : formas)
        {
            System.out.println(item.getClass().getCanonicalName());
            System.out.println("Area: "+ item.getArea());
            System.out.println("Perimetro "+ item.getPerimetro());
            
            
        }
    }
}
