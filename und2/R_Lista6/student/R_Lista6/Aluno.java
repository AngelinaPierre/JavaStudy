public class Aluno extends Pessoa {
    int matricula;
    Notas notaAluno;

    // constructor
    public Aluno(String nome, String tel, String end, String cpf, int ident, int idade, int mat, float n1, float n2, float n3){
        super(nome,tel,end,cpf,ident,idade);
        this.matricula = mat;
        notaAluno = new Notas(n1,n2,n3);
    }

    public void setMatricula(int mat){
        this.matricula = mat;
    }

    public int getMatricula(){
        return matricula;
    };
}
