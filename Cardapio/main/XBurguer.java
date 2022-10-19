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
public class XBurguer implements Sandwiche{

   
    @Override
    public void servir(int qtd) {
       System.out.println("Servindo "+qtd+" XBurguer(s)");
    }
    
     public XBurguer(int vlr){
        System.out.println("Criando XBurguer!");
        
    }
    
}
