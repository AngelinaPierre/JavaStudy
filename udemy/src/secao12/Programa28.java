package src.secao12;
// classe especifica/ sub-classe/ classe filha
public class Programa28{
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro da Silva","pedro@gmail.com", 1987);
        System.out.println(p1.getNome());
        System.out.println(p1.getAnoNascimento());
        System.out.println(p1.getEmail());
        System.out.println(p1.toString());
        System.out.println("\n");


        Aluno a1 = new Aluno("Vanessa da Silva","vanessa@hotmail.com","12345", 2001);

        System.out.println(a1.getNome());
        System.out.println(a1.getAnoNascimento());
        System.out.println(a1.getRA());
        System.out.println(a1.getEmail());
        System.out.println(a1);
        System.out.println(a1.toString());
        System.out.println("\n");

        
        Professor prof1 = new Professor("Andre da silva","Andre@outlook.com", 1976, "1353453");

        System.out.println(prof1.getNome());
        System.out.println(prof1.getAnoNascimento());
        System.out.println(prof1.getMatricula());
        System.out.println(prof1.getEmail());
        System.out.println(prof1.toString());



        System.out.println("\n Fim do Programa!\n");
    }
}

/* Beneficios da Herança
 - Evita a repetição de codigo
 - Facilita na manutenção do programa.

*/

/* Aluno é uma Pessoa

    Quando uma classe herda de outra classe ela ganha:
        - TODOS os atributos e métodos da classe herdada.
 */