package com.mycompany.aula0603;

import com.mycompany.aulanova.Cliente;

public class ContaPoupanca extends Conta{
    private double rendimento;
    
    
    @Override
    public void criarConta (Cliente c){
        super.criarConta(c);
        
        System.out.println("Rendimento: ");
        this.rendimento = sc.nextDouble();
        
        this.setTotal(this.getSaldo() * this.rendimento);
        
    }
    
    @Override
    public void mostrarConta(){
        super.mostrarConta();
        System.out.println("Total: " + this.getTotal());
        
    }
    
    public void setRendimento(double rendimento){
        this.rendimento = rendimento;
        
    }
    
    public double getRendimento(){
        return this.rendimento;
    }
}
