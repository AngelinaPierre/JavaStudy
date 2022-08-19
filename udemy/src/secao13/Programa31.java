package src.secao13;

import src.secao12.Aluno;

public class Programa31{
    public static void main(String[] args) {
        // Pessoa maria = new Pessoa("Maria da Silva", "maria@gmail.com", 1999);
        // System.out.println(maria);

        Aluno maria = new Aluno("Maria da Silva", "maria@gmail.com","ra123", 1999);
        System.out.println(maria);

        maria.outra_mensagem("\n Meu nome é " + maria.getNome());

        System.out.println("Fim do programa!");
    }
}