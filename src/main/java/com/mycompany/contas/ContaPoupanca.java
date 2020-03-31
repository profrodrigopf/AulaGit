package com.mycompany.contas;

import com.mycompany.aulanova.Cliente;

public class ContaPoupanca extends Conta{
    
    @Override
    public void criarConta(Cliente titular){
        
        this.setTitular(titular);
        
        System.out.println("Agencia: ");
        this.setAgencia(getSc().nextInt());
        
        System.out.println("Conta: ");
        this.setContaCorrente(getSc().nextInt());
        
        this.setSaldo(0.0);
        
    }
    
    @Override
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    @Override
    public void sacar(double valor) {
        this.setSaldo(this.getSaldo() - valor);
    }

    @Override
    public void pagarBoleto(double valorBoleto) {
        this.setSaldo(this.getSaldo() - valorBoleto);
    }
    
    @Override
    public void transferir(Conta destino, double valor) {
        this.setSaldo(this.getSaldo() - valor);
        destino.setSaldo(this.getSaldo() + valor);
        
    }

    @Override
    public void teste1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
