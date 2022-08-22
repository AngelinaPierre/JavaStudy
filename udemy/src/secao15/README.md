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

<br>
<hr>
<br>

