package src.secao12;
// classe base/ classe mae/ classe pai/ super classe/ classe generica
public  abstract class Pessoa{
    private String nome,email;
    private int ano_nascimento;

    // construtor vazio
    public Pessoa(){}

    // construtor com parametros
    public Pessoa(String nome,String email, int ano){
        this.nome = nome;
        this.email = email;
        this.ano_nascimento = ano;
    }

    // setter and getters
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public int getAnoNascimento(){
        return this.ano_nascimento;
    }
    public void setAnoNascimento(int ano){
        this.ano_nascimento = ano;
    }

    // overriding
    public String toString(){
        return "Nome: " + this.nome + " \nAno Nascimento: " + this.ano_nascimento;
    }
    // overloading 
    public void mensagem(){
        System.out.println("Esta é a minha mensagem...");
    }

    public void mensagem(String msg){
        System.out.println(msg);
    }
    public void mensagem(String msg, int n){
        System.out.println(msg + n);
    }

    // declaração de um metodo abstrato
    public abstract void outra_mensagem(String text);
}