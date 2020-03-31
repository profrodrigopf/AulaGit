package com.mycompany.aulanova;


public class Gerente extends Funcionario{
    double bonus = 0.05;
    double venda;
    
    @Override
    public void criarPessoa(){
        super.criarPessoa();
        
        System.out.println("Total vendido: ");
        this.venda = sc.nextDouble();
        
        this.salario = this.salario + (this.venda * this.bonus);
        
    }
    
    @Override
    public void mostrarPessoa(){
        super.mostrarPessoa();
        System.out.println("Voltei para o mostrar pessoa de gerente");
        
        System.out.println("Vendas: " + this.venda);
        System.out.println("Total salário: " + this.salario);
        
        System.out.println("Estou voltantdo para main");
        
    }

    @Override
    public void criarPessoa(String s) {
        
    }
    
    
}
