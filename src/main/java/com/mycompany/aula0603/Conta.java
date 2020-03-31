package com.mycompany.aula0603;

import com.mycompany.aulanova.Cliente;
import java.util.Scanner;

public abstract class Conta {
    private int agencia;
    private int numeroConta;
    private Cliente titular;
    
    private double saldo = 0;
    private double total = 0;
    
    Scanner sc = new Scanner(System.in);
    
    public void criarConta(Cliente c){
        
        System.out.println("Numero Conta: ");
        this.numeroConta = sc.nextInt();
        
        System.out.println("Agencia: ");
        this.agencia = sc.nextInt();
        
        this.titular = c;
        
    }
    
    public void mostrarConta(){
        System.out.println("Titular: " + this.titular.getNomePessoa());
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Numero: " + this.numeroConta);
        System.out.println("Saldo: " + this.getSaldo());
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
