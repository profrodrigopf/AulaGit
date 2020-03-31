package com.mycompany.aulanova;


public class Cliente extends Pessoa{
    
    private double renda;
    private Gerente gerente;
    
    public void criarPessoa(Gerente g){
        super.criarPessoa();
        
        this.gerente = g;
        
        System.out.println("Renda: ");
        this.renda = sc.nextDouble();
        
        
    }
    
    @Override
    public void mostrarPessoa(){
        System.out.println("Informações cliente");
        super.mostrarPessoa();
        System.out.println("");
        System.out.println("Renda: " + this.renda);
        System.out.println("Informações Gerente");
        System.out.println(" ");
        System.out.println("Gerente: " + this.gerente.getNomePessoa());
        System.out.println("Email gerente: " + this.gerente.getEmail());
    }
    
}
