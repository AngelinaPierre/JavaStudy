class Aluno extends Pessoa
{    int matricula;
     Notas notaAluno;
	
     public Aluno(String nome, String telefone, String endereco, String cpf, int identidade, int idade, int matricula, float nota1, float nota2, float nota3)
     {     super(nome,telefone,endereco,cpf,identidade,idade);
           this.matricula=matricula;
           notaAluno = new Notas(nota1,nota2,nota3);
     }
     
     public void setMatricula(int matricula)
     {
         this.matricula = matricula;
     }
     
     public int getMatricula()
     {
         return matricula;
     }    
}
