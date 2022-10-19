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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MetodoFabrica fab = new MetodoFabrica();
        DaCasa daCasa = new DaCasa(1);
        
        fab.fabricar(1, 2);
        fab.fabricar(2, 3);
        daCasa.servir(8);
      
    }
    
}
