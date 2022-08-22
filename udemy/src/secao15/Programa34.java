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