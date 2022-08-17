public class Pessoa {
    protected String nome, telefone, endereco, cpf;
    protected int identidade, idade;

    // constructor
    public Pessoa(String n, String t, String e, String c, int id, int i){
        this.nome = n;
        this.telefone = t;
        this.endereco = e;
        this.cpf = c;
        this.identidade = id;
        this.idade = i;
    }
    public Pessoa(String n, int i){
        this.nome = n;
        this.idade = i;
    }
    
    public String getNome(){
        return nome;
    }
    public String getTelefone(){
        return telefone;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getCpf(){
        return cpf;
    }
    public int getIdentidade(){
        return identidade;
    }
    public int getIdade(){
        return idade;
    }
    public int getIdade(int anoAtual, int anoFuturo){
        int anoNascimento, idadeFutura;
        anoNascimento = anoAtual - idade;
        idadeFutura = anoFuturo - anoNascimento;
        return idadeFutura;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTelefone(String tel){
        this.telefone = tel;
    }
    public void setEndereco(String end){
        this.endereco = end;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setIdentidade(int ident){
        this.identidade = ident;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

}
