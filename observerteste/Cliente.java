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
public class Cliente implements ICliente{
    String nome;

    public Cliente(String nome, double precoDeInteresse) {
        this.nome = nome;
        this.precoDeInteresse = precoDeInteresse;
    }
    double precoDeInteresse;
    int porcentagemDeInteresse;
    
    @Override
    public void notificado(double preco){
        if(preco <= precoDeInteresse)
        System.out.println("O preço esta no valor desejado: "+nome);
    }

    @Override
    public void notificado(int porcentagem) {
        System.out.println("A moeda variou a porcentagem desejada: "+nome);
    }

    
}
