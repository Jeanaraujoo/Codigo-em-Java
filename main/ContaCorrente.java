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
public class ContaCorrente {
    private int numero;
    private double saldo;
    private double limiteTotal;
    private double limiteUltilizado;
    private char tipo;
    private boolean ativa;
    private String gerente;

                    // Gets e Sets
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteTotal() {
        return limiteTotal;
    }

    public void setLimiteTotal(double limiteTotal) {
        this.limiteTotal = limiteTotal;
    }

    public double getLimiteUltilizado() {
        return limiteUltilizado;
    }

    public void setLimiteUltilizado(double limiteUltilizado) {
        this.limiteUltilizado = limiteUltilizado;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo , String gerente) {
        this.tipo = tipo;
    }

    public boolean GetAtiva() {
        return ativa;
    }

   
    
    public void setAtiva(boolean ativa , String gerente) {
        this.ativa = ativa;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    
    
    
    
  
}
