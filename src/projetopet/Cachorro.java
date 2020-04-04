package projetopet;

import java.util.Scanner;

public class Cachorro {
    
    String nomeCachorro;
    float peso;
    int idade;
    
    Dono dono;
    Scanner sc = new Scanner(System.in);
    
    public Cachorro(Dono dono){
        this.dono = dono;
        
        System.out.println("Nome Cachorro: ");
        this.nomeCachorro = sc.next();
        
        System.out.println("Peso: ");
        this.peso = sc.nextFloat();
        
        System.out.println("Idade: ");
        this.idade = sc.nextInt();
    }
    
    public void exibirCachorro(){
        System.out.println("Cachorro: " + this.nomeCachorro);
        System.out.println("Dono: " + this.dono.nomeDono);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
    }
    

    
    
    
}