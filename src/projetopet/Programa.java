package projetopet;

public class Programa {

    public static void main(String[] args) {
        
        Dono dono = new Dono();
        dono.nomeDono = "Rodrigo";
        dono.telefone = "419999-9999";
        
        Dono dono2 = new Dono();
        dono2.nomeDono = "Maria";
        dono2.telefone = "419999-9999";
        
        Cachorro cachorro = new Cachorro(dono);
//        cachorro.nomeCachorro = "Java";
//        cachorro.idade = 3;
//        cachorro.peso = 23.8f;
        cachorro.exibirCachorro();
       
        
    }
    
}
