public class Funcionario
{
    private int matricula, departamento;
    private String nome, funcao;
    private float salario;
    
    public Funcionario (int matricula, int departamento, String nome, String funcao, float salario)
    { 
      this.matricula=matricula;
      this.departamento=departamento;
      this.nome=nome;
      this.funcao=funcao;
      this.salario=salario;
    }
    
    public int getMatricula()
    {  return matricula;
    }
    
    public int getDepartamento()
    {  return departamento;
    }
    
    public String getNome()
    {  return nome;
    }
    
    public String getFuncao()
    {   return funcao;
    }
    
    public float getSalario()
    {   return salario;
    }
    
    public void setMatricula(int matricula)
    {  this.matricula=matricula;
    }
    
    public void setDepartamento(int departamento)
    {  this.departamento=departamento;
    }
    
    public void setNome(String nome)
    {  this.nome=nome;
    }
    
    public void setFuncao(String funcao)
    {   this.funcao=funcao;
    }
    
    public void setSalario(float salario)
    {   this.salario=salario;
    }
}