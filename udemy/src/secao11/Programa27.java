package src.secao11;

public class Programa27{
    public static void main(String args[]){
        Cliente cli1 = new Cliente("nome1", "end1");
        Cliente cli2 = new Cliente("nome2", "end2");

        System.out.println("Nome: " + cli1.getNome());
        System.out.println("Endereço: " + cli1.getEnd());

        System.out.println("Nome: " + cli2.getNome());
        System.out.println("Endereço: " + cli2.getEnd());

        // cli1.dizer_oi(); // não temos mais acesso a esse metodo.
    }
}