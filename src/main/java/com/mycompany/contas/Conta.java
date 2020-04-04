package com.mycompany.contas;

import com.mycompany.aulanova.Cliente;
import com.mycompany.interfaces.ServicosBancarios;
import java.util.Scanner;

public abstract class Conta implements ServicosBancarios{
    
    private int agencia;
    private int contaCorrente;
    private double saldo;
    private Cliente titular;
    
    private Scanner sc = new Scanner(System.in);
    
    public abstract void criarConta(Cliente titular);
    
    public void testeAula(){
        this.agencia = 123;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(int contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
}
