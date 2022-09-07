# Atributos e Métodos Estáticos

<br>


## Atributos Estáticos
<br>

- São atributos, onde os valores são compartilhados entre as instâncias das classe.
- Vamos criar uma classe chamada `Conta` para exemplificarmos melhor.

~~~
package src.secao15;

public class Conta{
    private int numero;
    private String cliente;

    // construtor
    public Conta(int num, String cli){
        this.numero = num;
        this.cliente = cli;
    }

    // getters and setters
    public int getNumero(){
        return this.numero;
    }
    public String getCliente(){
        return this.cliente;
    }
} 
~~~

- No nosso programa, colocamos o `numero da conta` um por um, porem se tivessemos em um projeto maior, poderiamos ter dificuldade em saber qual seria o numero da proxima conta.
- O ideial seria ter um mecanismo onde pudessemos fazer isso de forma automatica. Ou seja, fazer o compartilhamento desses valores entre as instancias, para sabermos qual será o proximo.
- Essa é a ideia dos atributos estaticos.


~~~
package src.secao15;

public class Conta{
    private int numero;
    private String cliente;

    public static int contador = 1;

    // construtor
    public Conta(int num, String cli){
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
}
~~~
- Agora esses valores serão incrementados automaticamente.
- Tanto o `C1, C2 e o C3` são instancias da classe Conta.

~~~ 
package src.secao15;

/*
    Atributos estaticos
*/

public class Programa34 {
    public static void main(String[] args) {
        Conta c1 = new Conta("Angelina Jolie");
        
        System.out.println(c1.getNumero());
        System.out.println(c1.getCliente());

        Conta c2 = new Conta("Felicity Jones");
        System.out.println(c2.getNumero());
        System.out.println(c2.getCliente());

        Conta c3 = new Conta("Maria das graças");
        System.out.println(c3.getNumero());
        System.out.println(c3.getCliente());

        System.out.println(c1.contador);
        System.out.println(c2.contador);
        System.out.println(c3.contador);
        System.out.println(Conta.contador);
    }
}
~~~ 

- Para utilizar um atributo estático, colocamos o nome da classe junto ao atributo.

~~~
nomeDaClasse.atributo;   
~~~

- Podemos tambem mudar o valor do contador

~~~
package src.secao15;

/*
    Atributos estaticos
*/

public class Programa34 {
    public static void main(String[] args) {
        Conta c1 = new Conta("Angelina Jolie");
        
        System.out.println(c1.getNumero());
        System.out.println(c1.getCliente());

        Conta c2 = new Conta("Felicity Jones");
        System.out.println(c2.getNumero());
        System.out.println(c2.getCliente());

        Conta c3 = new Conta("Maria das graças");
        System.out.println(c3.getNumero());
        System.out.println(c3.getCliente());

        System.out.println(c1.contador);
        System.out.println(c2.contador);
        System.out.println(c3.contador);
        System.out.println(Conta.contador);

        Conta.contador = 42;

        Conta c4 = new Conta("Maria jose");
        System.out.println(c4.getNumero());
        System.out.println(c4.getCliente());
        System.out.println(Conta.contador);
    }
}
~~~


<br>
<hr>
<br>

## Métodos Estáticos
<br>

Vamos criar o `Programa35` para entendermos melhor como funciona os `Métodos Estáticos`.

- Um `Método Estático` não depende de uma instância da classe para ser utilizado.
- Pode-se utilizar conforme:
  - `NomeDaClasse.metodo()`

No `Programa34` tivemos que criar uma instancia de uma classe para podermos utilizar seus metodos, como por exemplo `c1.getNome()`. Porem, na classe `Conta` criamos um `Atributo Estático` onde não foi preciso criar uma instancia para acessa-lo bastou fazermos `Conta.contador`. O mesmo vale para `Métodos Estáticos`.

- Vamos criar uma `Método Estático` na nossa classe conta para exemplificar isso.

~~~
public static int proximaConta(){
    return Conta.contador; 
}
~~~ 

- No nosso `Programa35` não vamos nem precisar instanciar um objeto...

~~~
package src.secao15;

public class Programa35{
    public static void main(String[] args) {
        System.out.println("A próxima conta será: " + Conta.proximaConta());
    }
} 
// output: A próxima conta será: 1
~~~

- Percebam que nem precisamos instanciar um objeto da classe para utilizar esse `Método Estático`.
- A diferença para os `Atributos Estáticos` é que não à compartilhamento de valores, os `Métodos Estáticos` executam uma ação.
- Se tirarmos a palavra `static` do nosso método, nosso programa irá dar erro, pois iremos passar a precisar de uma instancia da classe para executa-lo.

~~~
[CLASSE CONTA]
public int proximaConta(){
    return Conta.contador;
} 

[PROGRAMA35]

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
~~~

<br>
<hr>
<br>

