# Interfaces
<br>

## O que é uma INTERFACE e quando usar?
<br>

`Interfaces` são conhecidas como contratos. Imagine que uma empresa criou um contrato 'com regras' para definir a criação de um produto/serviço. 

Quem implementar este contato, eh OBRIGADO a seguir as regras.

O `programador1` decidiu criar um produto/serviço baseado neste contrato. O `programador2`, tambem decidiu criar um produto/serviço baseado no mesmo contrato.

Contrato para a confecção  de um bolo:
- O bolo precisa ser de chocolate;
- O bolo deve ter cobertura;
- O bolo deve ser recheado;

Vamos ver isso na pratica, vamos criar uma `interface` chamada `IEletronico`, uma interface que representa um contrato para um produto eletronico.

> Existe uma convenção onde ao criar interfaces, colocamos o `i` na frente, para ja sabermos que aquela classe é uma `interface`.

~~~
[INTERFACE]
package src.secao14;

public interface IEletronico{
    public String MARCA = "Geek";

    public void ligar();

    public void desligar();
}
~~~

Uma `interface` pode conter:
- `Constantes`
  - Valores que não podem ser alterados. Estamos informando que todo eletronico implementdo a partir deste interface, a marca será `Geek`, e ninguem pode alterar isso.
  - Constantes no java são definidas com o nome todo em MAIUSCULO.
- `Métodos Abstratos`


Vamos criar uma classe para fazer a implementação desta interface chamada `Ventilador`.

~~~
[CLASSE VENTILADOR IMPLEMENTANDO INTERFACE IELETRONICO]

package src.secao14;

public class Ventilador implements IEletronico{

    private boolean ligado = false;

    @Override
    public void desligar() {
        if(this.ligado){
            this.ligado = false;
            System.out.println("Desliguei o aparelho!");
        }        
    }

    @Override
    public void ligar() {
        if(!this.ligado){
            this.ligado = true;
            System.out.println("Liguei o aparelho!");
        }        
    }
    
}
~~~

A diferença entre `classes abstratas` e `interfaces` é que nas `classes abstratas` podemos ter `constantes, atributos, metodos abstratos, e metodos implementados`. Ja na `interface` so podemos ter `constantes e metodos abstratos`.

<br>
<hr>
<br>

