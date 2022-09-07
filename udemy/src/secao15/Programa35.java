package src.secao15;

public class Programa35{
    public static void main(String[] args) {

        Conta c1 = new Conta("Angelina Pierre");
        System.out.println("Número da conta: " + c1.getNumero());
        System.out.println("Cliente: " + c1.getCliente());

        // System.out.println("A próxima conta será: " + Conta.proximaConta());

        System.out.println(c1.proximaConta());
    }
}