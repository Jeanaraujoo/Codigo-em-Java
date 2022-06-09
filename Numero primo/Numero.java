/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matematica;

/**
 *
 * @author Aluno
 */
public class Numero {
  private int primo;
    private int getPrimo;

  // Gets e sets
    public int getPrimo() {
        return primo;
    }

    public void setPrimo(int primo) {
        this.primo = primo;
    }

    // Construtor
    
    public Numero(){
        System.out.println("banc");   
    }
    
 public Numero(int p){
       calcular(p); 
    }
    
// metodos
    
   public void calcular(int primo){
      
        for(int j = 2; j < primo; j++){
            if(primo % j == 0){
                System.out.println("Não é primo");
                break;
            }
            if(j == primo - 1){
                System.out.println("Primo");
            }
            
        }
        
   }
    
}
