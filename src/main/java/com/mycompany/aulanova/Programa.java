package com.mycompany.aulanova;

import com.mycompany.contas.ContaPremium;
import com.mycompany.contas.ContaPoupanca;

public class Programa {

    public static void main(String[] args) {

        //Teste de alteração
        //Alterado no Netbeans 8.2
        //Mais uma
        
        Gerente g = new Gerente();
        g.criarPessoa();
//        g.mostrarPessoa();
        System.out.println("Cheguei na main");
        System.out.println("Estou encerrando a execução");

        Cliente c = new Cliente();
        c.criarPessoa(g);
//        c.mostrarPessoa();

        ContaPoupanca poupanca = new ContaPoupanca();
        poupanca.criarConta(c);
        
        
        ContaPremium cp = new ContaPremium();
        cp.setAgencia(123);
        cp.criarConta(c);
        cp.depositar(200.0);
        cp.transferir(poupanca, 150.0);
        
        System.out.println("Saldo Conta: " + cp.getSaldo());
        System.out.println("Saldo Poupança: " + poupanca.getSaldo());
        
        
        

    }

}
