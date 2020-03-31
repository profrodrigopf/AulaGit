package com.mycompany.contas;

import com.mycompany.aulanova.Cliente;

public class ContaPremium extends Conta {

    private double limite;

    public void exibirConta(){
        System.out.println("Titular: " + this.getTitular().getNomePessoa());
    }
    
    @Override
    public void criarConta(Cliente titular) {

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
        
        System.out.println("Estou no método transferir!");
        System.out.println("Meu saldo atual é: " + this.getSaldo());

        if (this.getSaldo() >= valor) {

            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Meu novo saldo é: " + this.getSaldo());

            System.out.println("Meu saldo atual da poupanca: " + destino.getSaldo());
            destino.setSaldo(destino.getSaldo() + valor);

        }else{
            System.out.println("Saldo insuficiente!");
        }
        
        

        System.out.println("Meu novo saldo da poupança é: " + destino.getSaldo());

    }

    @Override
    public void teste1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
