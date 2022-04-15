class Professor_5         
{   String nome;             
    String departamento; 
    int nregistro;             
    Data admissao;                  
      
    public Professor_5(String nome, String departamento, int nregistro, Data admissao)
    {
       this.nome = nome;             
       this.departamento = departamento; 
       this.nregistro = nregistro;             
       this.admissao = admissao;
    }  
    
    public void imprimeProfessor()
    {
       System.out.println("Nome = "+nome);
       System.out.println("Departamento = "+departamento);
       System.out.println("Registro = "+nregistro);
       System.out.println("Dia da admissão = ");
       admissao.imprimirData();
    }
}