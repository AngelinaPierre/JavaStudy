public class Funcionario{
    // atributos
    private int matricula, departamento;
    private String nome, funcao;
    private float salario;
    
    // construtor
    public Funcionario(int mat, int dep, String n, String func, float sal){
        // utilização do this para referencia ao objeto
        this.matricula = mat;
        this.departamento = dep;
        this.nome = n;
        this.funcao = func;
        this.salario = sal;
    }
    
    // getters and setters
    public int getMatricula(){
        return matricula;
    }
    public int getDepartamento(){
        return departamento;
    }
    public String getNome(){
        return nome;
    }
    public String getFuncao(){
        return funcao;
    }
    public float getSalario(){
        return salario;
    }
    public void setMatricula(int mat){
        // uso do this para referenciar ao objeto
        this.matricula = mat;
    }
    public void setDepartamento(int dep){
        // uso do this para referecniar ao objeto
        this.departamento = dep;
    }
    public void setNome(String n){
        // use do this para referenciar ao objeto
        this.nome = n;
    }
    public void setFuncao(String func){
        // uso do this para refrenciar ao objeto
        this.funcao = func;
    }
    public void setSalario(float sal){
        // uso do this para referenciar ao objeto
        this.salario = sal;
    }   
}