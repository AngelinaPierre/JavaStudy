# Herança e Polimorfismo

<br>
<br>

## Herança
<br>
- Considerada como um dos `pilares` da OOP.
- Vamos criar um programa para entender melhor.

~~~
[CLASSE ALUNO]
package src.secao12;

public class Aluno{
    private String nome, ra;
    private int ano_nascimento;

    // construtor vazio
    public Aluno(){}
    //construtor com propriedades
    public Aluno(String nome, String registro_aluno, int ano){
        this.nome = nome;
        this.ra = registro_aluno;
        this.ano_nascimento = ano;
    }

    // GES

    public String getNome(){
        return this.nome;
    }
    public String getRA(){
        return this.ra;
    }
    public int getAnoNascimento(){
        return this.ano_nascimento;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public void setRA(String number){
        this.ra = number;
    }
    public void setAnoNascimento(int ano){
        this.ano_nascimento = ano;
    }
} 
~~~

~~~
[CLASSE PESSOA]

package src.secao12;

public class Pessoa{
    private String nome;
    private int ano_nascimento;

    // construtor vazio
    public Pessoa(){}

    // construtor com parametros
    public Pessoa(String nome, int ano){
        this.nome = nome;
        this.ano_nascimento = ano;
    }

    // setter and getters
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAnoNascimento(){
        return this.ano_nascimento;
    }
    public void setAnoNascimento(int ano){
        this.ano_nascimento = ano;
    }
}
~~~

~~~
[PROGRAMA28.JAVA]

package src.secao12;

public class Programa28{
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro da Silva", 1987);
        System.out.println(p1.getNome());
        System.out.println(p1.getAnoNascimento());

        Aluno a1 = new Aluno("Vanessa da Silva","12345", 2001);

        System.out.println(a1.getNome());
        System.out.println(a1.getAnoNascimento());
        System.out.println(a1.getRA());

        System.out.println("\n Fim do Programa!\n");
    }
}
~~~

- Vejam que tanto na classe pessoa, quanto na classe aluno temos propriedades semelhantes (`nome`, `ano_nascimento`) assim como metodos de acesso para esses atributos em ambas as classes.

Logo temos uma grande repetição de codigo, alguns dos beneficios de utilizar a herança é:
- Evita a repetição de codigo.
- Facilita a manutenção do programa;


~~~
[APLICANDO HERANÇA]
package src.secao12;

public class Aluno extends Pessoa{
    private String ra;

    // construtor vazio
    public Aluno(){}
    //construtor com propriedades
    public Aluno(String nome, String registro_aluno, int ano){
        super(nome, ano); 
        this.ra = registro_aluno;
    }

    // GES

    public String getRA(){
        return this.ra;
    }
    public void setRA(String number){
        this.ra = number;
    }
} 
~~~

- Com a palavra `extends` estamos indicando para o compilador que a classe `Aluno herda de Pessoa`. 
- Quando uma classe herda de outra classe ela ganha, todos os atributos e metodos da classe herdada.
- Vamos criar mais um `tipo de pessoa` para exemplificar melhor o significado de herança.

~~~
[CLASSE PROFESSOR]

package src.secao12;

public class Professor extends Pessoa{
    private String matricula;

    // construtor 
    public Professor(String nome, int ano, String mat){
        super(nome, ano);
        this.matricula = mat;
    }
    // setter and getters

    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String number){
        this.matricula = number;
    }
}
~~~

- Veja que não possui repetição de codigo, e tanto o `nome` quanto o `ano de nascimento` estão sendo herdados da classe pessoa.

<br>
<hr>
<br>

## Polimorfismo
<br>

<br>
<hr>
<br>

## Sobrecarga de método
<br>

<br>
<hr>
<br>

## Sobrescrita de método
<br>

<br>
<hr>
<br>

## Exercicios