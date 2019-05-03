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
public class AssistenteAdministrativo extends Assistente
{
    private boolean turno; 
    boolean bonus; 

    public String isBonus() {
        if(bonus)
        {
            return "Contém Bonus"; 
        }
        else
        {
            return "Sem Bonus";
        }
    }

   

    public String getTurno() {
        if(turno)
        {
            return "dia";
        }
        else
        {
            return "Noite";
        }
        
    }

    public void setTurno(boolean turno) {
        if(turno==false)
        {
            bonus = true; 
        }
        this.turno = turno;
    }
    
    
    
    public AssistenteAdministrativo(int matricula, boolean turno) {
        super(matricula);
        this.turno = turno; 
    }

    @Override
    protected void ExibeDados() {
        super.ExibeDados(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(getTurno());
        System.out.println(isBonus());
    }
    
    
}
