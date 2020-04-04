package com.mycompany.interfaces;

import com.mycompany.contas.Conta;

public interface ServicosBancarios {
            
    public void depositar(double valor);
    public void sacar(double valor);
    public void pagarBoleto(double valor);
    public void transferir(Conta destino, double valor);
    
    public void teste1();
    
    public default void teste(){
        System.out.println("Teste de método default!");
    }
    
}
