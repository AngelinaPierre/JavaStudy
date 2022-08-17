package src.secao11;

public class Cliente{
     // atributos
     private String nome;
     private String endereco;

     // construtor com parametros
     public Cliente(String nome, String end){
        // o uso do this referencia ao objeto chamado no programa java
        this.nome = nome;
        this.endereco = end;

        this.dizer_oi();
     }

     // metodo para ser chamado dentro da classe
     private void dizer_oi(){
      System.out.println(this.nome + " esta dizendo Oi...");
     }

     // metodo que pode ser chamado fora da classe.
   //   public void dizer_oi(){
   //    System.out.println("oi...");
   //   }

   // metodos para acesso de atributos privados

   public String getNome(){
      return this.nome;
   }

   public String getEnd(){
      return this.endereco;
   }
}