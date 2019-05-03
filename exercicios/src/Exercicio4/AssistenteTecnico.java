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
public class AssistenteTecnico extends Assistente
{
    double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public AssistenteTecnico(int matricula, double bonus) {
        super(matricula);
        this.bonus = bonus;
    }

    @Override
    protected void ExibeDados() {
        super.ExibeDados(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Bonus " + bonus);
    }
    
    
}
