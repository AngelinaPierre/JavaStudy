package src.secao12;
// classe base/ classe mae/ classe pai/ super classe/ classe generica
public class Pessoa{
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

    public String toString(){
        return "Nome: " + this.nome + " \nAno Nascimento: " + this.ano_nascimento;
    }
}