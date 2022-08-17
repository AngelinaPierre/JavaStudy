package src.secao11;

public class Programa25{

    public static void main(String args[]) {
        // instanciando objeto da classe cliente
        Cliente c1 = new Cliente("Joao da silva", "Rua da paz, 45");
        Cliente c2 = new Cliente("Maria da Silva", "Rua da paz, 45");

        // instanciando objetos da classe conta
        Conta conta1 = new Conta(1,100.0f,200.0f, c1);
        Conta conta2 = new Conta(2,300.0f,500.0f, c2);

        System.out.println("\n\tInicio da consulta!\n");
        System.out.println("Saldo conta 1: " + conta1.getSaldoConta());
        System.out.println("Saldo conta 2: " + conta2.getSaldoConta());
        System.out.println("\n\tFim da consulta!\n");

        System.out.println("(antes saque)Saldo atual: " + conta1.getSaldoConta());
        conta1.sacar(150);
        System.out.println("(depois saque)Saldo atual: " + conta1.getSaldoConta());
 
        // conta1.getSaldoConta() = -9000; // encapsulamento não permite essa alteração direta.
        // System.out.println("\nSaldo atual: " + conta1.getSaldoConta());

        // conta1.limite_conta = 1000000.00f;
        System.out.println("\nLimite forçado!\n");
        // System.out.println("Saldo de " + c1.nome + ":" + conta1.limite_conta);
        System.out.println("Saldo atual: " + conta1.getSaldoConta());

        System.out.println("\nFim do Programa!\n");
    }
}