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

    // metodo sobrescrito/ overriding
    public String getNome(){
        return "Aluno: " + super.getNome();
    }

    public String getRA(){
        return this.ra;
    }
    public void setRA(String number){
        this.ra = number;
    }

    public String toString(){
        return super.toString() + "\nR.A: " + this.ra;
    }


    // IMPLEMENTAÇÃO DE METODOS OBRIGATORIOS.
    @Override
    public void outra_mensagem(String text) {
        System.out.println(text);
        
    }

}