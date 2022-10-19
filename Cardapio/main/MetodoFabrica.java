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
public class MetodoFabrica {
   public Sandwiche fabricar(int i, int j){
       
    if(i==1){
    return new  XEgg(j);
}
    if(i==2){
        return new DaCasa(j);
        
    }
    
    if(i==3){
        return new XBurguer(j);
    }
       return null;
       
      
}
   
}