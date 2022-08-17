# Modificadores de Acesso

<br>
<hr>
<br>

## O que é Encapsulamento?
<br>

Vamos começando criando uma classe chamada `Cliente` para entendermos melhor o Encapsulamento.

~~~
public class Cliente{
     // atributos
     String nome;
     String endereco;

     // construtor com parametros
     public CLiente(String nome, String end){
        // o uso do this referencia ao objeto chamado no programa java
        this.nome = nome;
        this.endereco = end;
     }
}
~~~

Vamos criar outra classe chamada `Conta`, pense numa conta bancária.

~~~
public class Conta{

    // atributo
    int numero_conta;
    float saldo_conta, limite_conta;
    Cliente cliente_conta; // atributo do tipo cliente 

    // construtor com parametros
    public Conta(int numero, float saldo, float limite, Cliente cliente){
        this.numero_conta = numero;
        this.saldo_conta = saldo + limite;
        this.limite_conta = limite;
        this.cliente_conta = cliente;
    }
}
~~~

- Temos aqui um atributo do `tipo cliente`, onde a programação orientada a objetos nos permite criar os nossos proprios tipos de dados.
- Logo esse atributo (`cliente_conta`), na classe `Conta` terá todas as propriedades da classe `Cliente`.

A parte do momento que criamos uma classe, ela se torna um `modelo de dados`, e podemos utiliza-la como um `tipo de dado` em outra classe.

Geralmente em contas bancarias podemos sacar dinheiro e efetuar depositos, vamos criar comportamentos/metodos para isso.

~~~
// saque
    void sacar (float value){
        this.saldo_conta = this.saldo_conta - value;
    }

    // deposito
    void depositar(float value){
        this.saldo_conta = this.saldo_conta + value;
    }
~~~ 

- Vamos agora criar um programa para rodar nossas classes.

~~~
public class Programa25{

    public static void main(String args[]) {
        // instanciando objeto da classe cliente
        Cliente c1 = new Cliente("Joao da silva", "Rua da paz, 45");
        Cliente c2 = new Cliente("Maria da Silva", "Rua da paz, 45");

        // instanciando objetos da classe conta
        Conta conta1 = new Conta(1,100.0f,200.0f, c1);
        Conta conta2 = new Conta(2,300.0f,500.0f, c2);

        System.out.println("Inicio da consulta!");
        System.out.println("Saldo conta 1:" + conta1.saldo_conta);
        System.out.println("Saldo conta 1:" + conta2.saldo_conta);
        System.out.println("Fim da consulta!");

        conta1.sacar(400);
        System.out.println("Saldo atual: " + conta1.saldo_conta);

        conta1.saldo_conta = -9000; // encapsulamento não permite essa alteração direta.
        System.out.println("Saldo atual: " + conta1.saldo_conta);

    }
}
~~~

- Encapsulamento existe para que os usuarios do programa não acessem os atributos diretamente, podendo fazer alterações que saiam das regras de negocio ou que façam o programa bugar.
- Para isso não acontecer, em nossas classes, podemos colocar os atributos como `PRIVATE`. Adicionando assim ao nosso codigo, uma `camada de segurança`.

~~~
public class Conta{

    // atributo
    int numero_conta;
    private float saldo_conta, limite_conta;
    Cliente cliente_conta; // atributo do tipo cliente 

    // construtor com parametros
    public Conta(int numero, float saldo, float limite, Cliente cliente){
        this.numero_conta = numero;
        this.saldo_conta = saldo + limite;
        this.limite_conta = limite;
        this.cliente_conta = cliente;
    }

    // metodos 

    // saque
    void sacar (float value){
        if(value <= this.saldo_conta){
            System.out.println("Saldo Atual: " + this.saldo_conta);
            this.saldo_conta = this.saldo_conta - value;
            System.out.println("Saque: " + value);
        }else{
            System.out.println("Saldo Insuficiente");
        }

    }

    // deposito
    void depositar(float value){
        System.out.println("Saldo Atual: " + this.saldo_conta);

        this.saldo_conta = this.saldo_conta + value;
        System.out.println("Deposito:" + value);
    }
    
  
} 
~~~

- Percebam que ao colocar o atributo como `PRIVATE` o nosso programa ja não permite mais o acesso nem para modificação nem para a leitura deste atributo.
- Porem queremos acessar essa informação, para isso, temos que criar dentro das classes `METODOS DE ACESSO` chamados de `getters` e `setters`.

### `Getters`
<br>

- É um método público, que serve para consultar dados;
- A nomenclatura desses métodos é :

~~~
get_nome_do_atributo()
~~~ 

- Criando `getter` para retorno do `saldo_conta`
~~~ 
// getter para o atributo saldo_conta
    public float getSaldoConta(){
        return this.saldo_conta;
    }
~~~ 

- No nosso programa, basta agora chamar o metodo que irá retornar o valor deste atributo.

~~~ 
public class Programa25{

    public static void main(String args[]) {
        // instanciando objeto da classe cliente
        Cliente c1 = new Cliente("Joao da silva", "Rua da paz, 45");
        Cliente c2 = new Cliente("Maria da Silva", "Rua da paz, 45");

        // instanciando objetos da classe conta
        Conta conta1 = new Conta(1,100.0f,200.0f, c1);
        Conta conta2 = new Conta(2,300.0f,500.0f, c2);

        System.out.println("Inicio da consulta!");
        System.out.println("Saldo conta 1:" + conta1.getSaldoConta());
        System.out.println("Saldo conta 1:" + conta2.getSaldoConta());
        System.out.println("Fim da consulta!");

        conta1.sacar(400);
        System.out.println("Saldo atual: " + conta1.getSaldoConta());

        conta1.saldo_conta = -9000; // encapsulamento não permite essa alteração direta.
        System.out.println("Saldo atual: " + conta1.getSaldoConta());

    }
}
~~~
- Perceba agora tbm que caso voce não comente a linha `conta1.getSaldoConta()`não irá funcionar pois so podemos alterar esse atributo atravez de um metodo.
- Ainda conseguimos alterar o atributo de `limite` da nossa classe, vamos `proteger` esse atributo tbm..

~~~ 
private float limite_conta;
~~~

- O ideia é que todos os atributos de uma classe sejam privados.

~~~
public class Conta{

    // atributo
    private int numero_conta;
    private float saldo_conta;
    private float limite_conta; // como o limite não pode mexer, não precisamos criar um metodo para ele.
    private Cliente cliente_conta; // atributo do tipo cliente 

    // construtor com parametros
    public Conta(int numero, float saldo, float limite, Cliente cliente){
        this.numero_conta = numero;
        // como ja criamos um metodo que retorne o saldo + limite, não precisamos desta linha mais.
        // this.saldo_conta = saldo + limite;
        this.saldo_conta = saldo;
        this.limite_conta = limite;
        this.cliente_conta = cliente;
    }

    // metodos 

    // saque
    // forma 3
    public void sacar(float value){
        if(value <=this.saldo_conta){
            this.saldo_conta = this.saldo_conta - value;
        }else if(value <= (this.saldo_conta + this.limite_conta)){
            // calculo do valor excedente do saque
            float temp = this.saldo_conta - value; // 100 - 200 = -100
            if(temp < 0){
                this.saldo_conta = 0;
            }
            temp = this.limite_conta + temp;
            this.limite_conta = temp;
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    // forma p2
    // void sacar (float value){
    //     if(value <= this.saldo_conta + this.limite_conta){
    //         System.out.println("Saldo Atual: " + this.saldo_conta);
    //         this.saldo_conta = (this.saldo_conta + this.limite_conta) - value;
    //         System.out.println("Saque: " + value);
    //     }else{
    //         System.out.println("Saldo Insuficiente");
    //     }

    // }
    // forma inicial p1
    // void sacar(float value){
    //     System.out.println("Saldo Atual: " + this.saldo_conta);
    //     this.saldo_conta = (this.saldo_conta + this.limite_conta) - value;
    //     System.out.println("Saque: " + value);
    // }

    // deposito
    void depositar(float value){
        System.out.println("Saldo Atual: " + this.saldo_conta);

        this.saldo_conta = this.saldo_conta + value;
        System.out.println("Deposito:" + value);
    }
  
    // getter para o atributo saldo_conta
    public float getSaldoConta(){
        return this.saldo_conta + this.limite_conta; 
    }
  
} 
~~~



<br>
<hr>
<br>

## Public
<br>

- O `PUBLIC` é um modificador de acesso que torna `públic` um determinado objeto. 
- As classes são sempre `public`.
- Normalmente todos os atributos da classe são `private` e são acessados pelos metodos `setters e getters`.
- Já os `contrutores`, precisam ser `public`, pois no programa usamos eles para instancia um objeto de determinada classe.
- Os métodos a maioria são `publics` pois precisamos ter metodos que acessem as propriedades da nossa instancia/objeto.

Ou seja, elementos `public` podem ser acessados em todo o projeto, independente da pasta/package que esteja. Basta fazer o `import` da classe no programa que queremos utiliza-la. 

<br>
<hr>
<br>

## Private

<br>
<hr>
<br>

## Protected

<br>
<hr>
<br>
