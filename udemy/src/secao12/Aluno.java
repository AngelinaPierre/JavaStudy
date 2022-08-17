package src.secao12;

public class Aluno extends Pessoa{
    private String ra;

    // construtor vazio
    public Aluno(){}
    //construtor com propriedades
    public Aluno(String nome,String email, String registro_aluno, int ano){
        super(nome,email, ano); 
        this.ra = registro_aluno;
    }

    // GES

    public String getRA(){
        return this.ra;
    }
    public void setRA(String number){
        this.ra = number;
    }
}