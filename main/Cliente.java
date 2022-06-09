/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 *
 * @author Aluno
 */
public class Cliente {
    
    ContaCorrente conta = new ContaCorrente();
    
    public void sacar(int valor){
        if(conta.GetAtiva() == true){
            if(valor >= conta.getSaldo()){
                conta.setSaldo(conta.getSaldo() - valor);
                System.out.println("Saque efetuado");
            }
            else{
                System.out.println("Valor indisponivel");
            }     
            
        }
        
    }
    
    public void depositar(){
        
    }
}
