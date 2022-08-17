package src.secao01;

import src.secao11.Cliente;

public class Programa26{
    public static void main(String[] args){
        Cliente cli = new Cliente("Angelina Jolie", "Rua da barar, 256");

        // não conseguimos mais ter acesso pois modificamos para ser privado a propria classe.
        // System.out.println("Nome:" + cli.nome);
        // System.out.println("Endereço: " + cli.endereco); 

        // cli.dizer_oi(); // protected.
    }
}