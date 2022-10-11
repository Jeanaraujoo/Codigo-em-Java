/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerteste;

/**
 *
 * @author Aluno
 */
public class Moeda {
    private String nome;
    private double valor;

    
    public PrecoObs listaPreco;
    public PorcentagemObs listaPorcentagem;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setValor(double valor) {
        this.valor = valor;
        if(listaPreco != null ){
            listaPreco.notificar(this);
        }
        
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getValor() {
        return valor;
    }
    
    
    public Moeda(String nome, double valor ) {
        this.nome = nome;
        this.valor = valor;
       
    }
    
}
