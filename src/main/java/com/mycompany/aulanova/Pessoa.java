package com.mycompany.aulanova;

import java.util.Scanner;

public abstract class Pessoa {
    private String nomePessoa;
    private String email;
    
    Scanner sc = new Scanner(System.in);
    
    public void criarPessoa(){
        
        System.out.println("Nome: ");
        this.nomePessoa = sc.next();
        
        System.out.println("Email: ");
        this.email = sc.next();
        
    }
    
    public void mostrarPessoa(){
        
        System.out.println("Cheguei no mostrar pessoa de pessoa");
        
        System.out.println("Nome: " + this.nomePessoa);
        System.out.println("Email: " + this.email);
    }
    
    public String getNomePessoa(){
        return this.nomePessoa;
    }
    
    public void setNomePessoa(String nomePessoa){
        this.nomePessoa = nomePessoa;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
}
