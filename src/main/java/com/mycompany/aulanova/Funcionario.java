package com.mycompany.aulanova;

public abstract class Funcionario extends Pessoa{
    
    double salario;
    int jornadaTrabalho;
    
    @Override
    public void criarPessoa(){
        super.criarPessoa();
        
        System.out.println("Jornada de trabalho: ");
        this.jornadaTrabalho = sc.nextInt();
        
        System.out.println("Salário: ");
        this.salario = sc.nextDouble();
        
    }
    
    public abstract void criarPessoa(String s);
    
    
    @Override
    public void mostrarPessoa(){
        System.out.println("Cheguei no mostrar pessoa de funcionário");
        super.mostrarPessoa();
        System.out.println("Voltei para o mostrar pessoa de funcionário");
        
        System.out.println("Salário: " + this.salario);
        System.out.println("Jornada de trabalho: " + this.jornadaTrabalho);
        
        System.out.println("Estou voltando para o mostrar pessoa de gerente");
        
    }
    
    
}
