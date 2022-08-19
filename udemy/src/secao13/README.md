# Classes Abstratas
<br>

## O que é e quando usar?
<br>

Vamos criar um programa para entendermos melhor como trabalhar com `classes abstratas`. Na seção passada criamos a classe `Pessoa` para servir como base para nossa programa de uma escola. Onde `Aluno` e `Professor` eram classes que `extendiam` da classe Pessoa.

Dado que no contexto do problema, não existe o tipo especifico de `pessoa`, e sim `Aluno` e `Professor` , não faz sentido podermos `intanciar` um objeto do tipo `Pessoa` no nosso programa.

~~~
[Programa31.java]

package src.secao13;

import src.secao12.Pessoa;

public class Programa31{
    public static void main(String[] args) {
        Pessoa maria = new Pessoa("Maria da Silva", "maria@gmail.com", 1999);
        System.out.println(maria);
    }
}
~~~

É nesse contexto que utilizamos a `Classe Abstrata`: Recurso que proprorciona um bloqueio na criação de objetos;

- Para tonar a classe pessoa, uma class abstrata, basta colocarmos a palavra-chave `abstract`

~~~
public abstract class Pessoa{}
~~~

- Veja agora, que todos os programas que instanciaram a classe `Pessoa` agora possuem um erro, pois não podemos `instanciar objetos de classes abstratas`.

Logo usamos a `Classe Abstrata` quando queremos representar uma classe muito generica que não representa nenhum tipo de objeto no nosso programa. Impossibilitando a criação de objetos desta classe.

- Geramente as classes abstratas são classes bases/genericas/ super classes, de outras classes.
- Uma `Classe Abstrata` pode ter:
  - `Atributos`
  - `Métodos`
  - `Métodos abstratos;`

`Métodos Abstratos` são métodos, que não possuem implementação, possuem apenas declaração, e, obrigatoriamente, as classes que herdam desta classe com método abstrato, precisam implementar estes métodos.

- Vamos criar um metodo abstrato da classe pessoa para exemplificar melhor.
~~~
// declaração de um metodo abstrato.
public abstract void outra_mensagem(String text);

~~~
- Logo no `Método Abstrato` nos não colocamos as chaves, simplesmente fazemos a declaração e depois colocamos o ponto e virgula `;`.
- Vejam que as classes que `implementam` a classe abstrata como, `Aluno e Professor` estão com problemas agora.
- É obrigatorio fazer a implementação de `Métodos Abstratos`.

~~~
[CLASSE PROFESSOR]
@Override
    public void outra_mensagem(String text) {
        System.out.println("override metodo abstrato no professor" + text);   
    }
[CLASSE ALUNO] 
// IMPLEMENTAÇÃO DE METODOS OBRIGATORIOS.
    @Override
    public void outra_mensagem(String text) {
        System.out.println("override metodo abstrato no aluno" + text);
        
    }
~~~

~~~
[PROGRAMA31.java]
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
~~~

<br>
<hr>
<br>

## Padrão de projeto: Template Method
<br>

`Padrões de Projeto` são padrões utilizados em desenvolvimentos de projetos. Esse padrão `Template Method` tem muito haver com `Classes Abstratas`, sendo um ponto excencial no desenvolvimento.

`Template Method` define o esqueleto de um algoritmo dentro de um método, transferindo alguns de seus passos para as subclasses. O `Template Method` permite que as subclasses redefinam certos passos de um algortimo sem alterar a estrutura do próprio algoritmo.

Sabemos que `Algoritmos` são "receitas" passo-a-passo para resolver algum problema.

~~~
[Exemplo de algoritimo]

- Algoritmo que recebe um numero e retorna o quadrado deste numero.
  1) Receber numero
  2) retornar numero * numero
~~~

- Como estamos falando de `Template Method` teriamos um metodo principal `metodo_principal()`, onde dentro dele teriamos pequenos passos, onde cada passo iria receber uma parte do seu algoritmo.

~~~
metodo_principal(){
    passo1();
    passo2();
    passo3();
} 
~~~

- Isso é chamado de `Template Method`, seu algoritmo é divido em pequenos `passos()` e esses passos são executados em funções/metodos especificos.

O `Template Method` faz com que esses `passos()` não sejam `implementados` pela classe principal, fazendo com que eles sejam `Métodos Abstratos` que serão implementados pelas classes filhas.

- Para exemplificar vamos criar uma classe chamada `Treinamento`.
- Queremos criar um software para que o time possa gerenciar seu treinamento.
- Porem não existe o treinamento em si, e sim um treinamento de `inicio da temporada` e um treinamentode `final de temporada`.
- Ambos os treinamentos aplicam a `Herança` extendendo assim da nossa classe `Treinamento`.
- Como vimos que não existe `Treinamento` em si, é uma classe muito generica, ela será uma `Classe Abstrata`.

~~~
[CLASSE ABSTRATA TREINAMENTO]
package src.secao13;

// Template method
public abstract class Treinamento{


    final void TreinoDiario(){
        preparoFisico();
        jogoTreino();
        treinoTatico();
    }

    public abstract void preparoFisico();
    public abstract void jogoTreino();
    public final void treinoTatico(){
        System.out.println("Treino Tatico");
    }
} 
~~~

- Criamos nossa classe abstrata e dentro dela, colocamos o `Algoritmo` que será executado `TreinoDiario()`.
- Vejam que possuimos dois métodos abstratos, `preparoFisico() e jogoTreino()`. Logo as classes filhas que "herdam" da classe abstrata precisam obrigatoriamente implementar esses metodos. 
- O que significa que o `preparoFisico()` e `jogoTreino()` será de formas diferentes tanto para `TreinamentoInicioTemporada` quanto para `TreinamentoFimTemporada`.
- Ja o `TreinoTatico` ja implementado na nossa `Classe Abstrata` será o mesmo para todos.

A palavra `final` faz parte de um `Modificador de Acesso` que faz com que o elemento que o esteja utilizando não possa ser `extendido` ou `reescrito`.

Vimos por exemplo que podemos escrever uma classe e `extender` ela, porem se essa classe estiver marcada como `final`, não poderemos extender essa classe.

Se colocarmos o `final` em um `método` não podemos reescrever esse método nas classes filhas.



<br>
<hr>
<br>