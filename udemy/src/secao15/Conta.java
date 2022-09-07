package src.secao15;

public class Conta{
    private int numero;
    private String cliente;

    public static int contador = 1;

    // construtor
    public Conta(String cli){
        this.numero = contador;
        this.cliente = cli;
        Conta.contador = Conta.contador + 1;
    }

    // getters and setters
    public int getNumero(){
        return this.numero;
    }
    public String getCliente(){
        return this.cliente;
    }

    // public static int proximaConta(){
    //     return Conta.contador;
    // }
    public int proximaConta(){
        return Conta.contador;
    }
}