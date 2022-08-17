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

Nas nossas aulas anteriores podemos observar que a classe `Pessoa` não `"herda"` de ninguem, isso seria verdadeiro? `não`.

Toda classe no `java` herda por padrão de uma classe chamada `Object`. No processo de criação da classe no `eclipse` podemos observar no campo de `Superclass` o seguinte trecho `java.lang.Object` o que indica que a classe que estamos criando irá `herda` dessa classe default do java.

- Quando criamos uma classe, por padrão essa classe é herdada da `classe Object`.

Vimos tambem que quando uma classe herda de outra, ela tambem `herda` todos os `atributos e metodos` da classe Base.

- Por examplo, um dos metodos que a nossa classe `Pessoa` herda da classe `Object` é o método `toString()`.
- A função do `toString()` é imprimir o endereço de memoria do objeto.

~~~
System.out.println(p1);
// é igual a
System.out.println(p1.toString());

~~~

`Polimorfismo` = Objetos do mesmo tipo podem agir de formas diferentes.
- Vamos ter o mesmo nome para o metodo, porem imprimindo coisas diferentes para cada classe.
~~~ 
[CLASSE PESSOA]

public String toString(){
    return "Nome: " + this.nome + " \nAno Nascimento: " + this.ano_nascimento;
}

[CLASSE PROFESSOR]

public String toString(){
    return super.toString() + "\n Matricula: " + this.matricula;
}

[CLASSE ALUNO]

public String toString(){
    return super.toString() + "\nR.A: " + this.ra;
}
~~~

- Fizemos o polimorfismo com a classe `Object`, mãe de todas as classes.
- Podemos tambem fazer com metodos que nos criamos dentro das classes.
- Temos o `getNome()` dentro somente da classe `Pessoa` vamos criar um `getNome` dentro da classe `Aluno` concatenando com alguma informação extra que queremos mostrar.
- Vamos fazer o mesmo para a classe de `Professor` tambem.

~~~ 
[CLASSE PESSOA]
public String getNome(){
    return this.nome;
}
[CLASSE PROFESSOR]
public String getNome(){
    return "Professor: " + super.getNome();
}
[CLASSE ALUNO]
public String getNome(){
        return "Aluno: " + super.getNome();
}

~~~

<br>
<hr>
<br>

## Sobrecarga de método
<br>

A `Sobrecarga de método` tambem é conhecida como `overloading`. Ocorre quando, sobrescrevemos um metodo na mesma classe de declaração.

- Como exemplo, temos o `construtor vazio` e o `construtor com parametros`.
~~~
public Pessoa(){}

public Pessoa(String nome,String email, int ano_nascimento){}
~~~

- Outro exemplo...

~~~
public void mensagem(){
    System.out.println("Esta é a minha mensagem...");
}
public void mensagem(String msg){
    System.out.println(msg);
}
~~~ 

`Metodos sobrecarregados` so podem existir caso os `parametros` sejam diferentes.

<br>
<hr>
<br>

## Sobrescrita de método
<br>

A `Sobrescrita de método` tbm é conhecida como `overriding`. 
- Ocorre quando sobrescrevermos metodos da `classe pai` na `classe filha`.
- Ja utilizamos a sobrescrita quando usamos o método `toString()` de maneiras diferentes nas classes `Pessoas, Alunos`.


~~~
[CLASSE PROFESSOR]

public String getNome(){
    return "Professor: " + super.getNome(); 
}

[CLASSE ALUNO]
public String getNome(){
    return "Aluno: " + super.getNome();
}
~~~ 

<br>
<hr>
<br>

## Exercicios