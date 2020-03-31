package com.mycompany.aula0603;

import com.mycompany.aulanova.Cliente;

public class ContaPremium extends Conta{
    private double limite;
    
    
    @Override
    public void criarConta(Cliente c){
        super.criarConta(c);
        
        System.out.println("Informe o limite: ");
        this.limite = sc.nextDouble();
        
        this.setTotal(this.getSaldo() + this.limite);
        
    }
    @Override
    public void mostrarConta(){
        super.mostrarConta();
        System.out.println("Saldo Total: " + this.getTotal());
    }
}
