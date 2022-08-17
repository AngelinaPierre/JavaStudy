package src.secao12;

public class Professor extends Pessoa{
    private String matricula;

    // construtor 
    public Professor(String nome,String email, int ano, String mat){
        super(nome, email,ano);
        this.matricula = mat;
    }
    // setter and getters

    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String number){
        this.matricula = number;
    }
}