class Professor_3         
{   String nome;             
    String departamento; 
    int nregistro;             
    byte dia,mes;             
    short ano;                  
      
    public Professor_3(String nome, String departamento, int nregistro, byte dia, byte mes, short ano)
    {
       this.nome = nome;             
       this.departamento = departamento; 
       this.nregistro = nregistro;             
       this.dia = dia;
       this.mes = mes;             
       this.ano = ano;
    }  
    
    public void imprime()
    {
       System.out.println("Nome = "+nome);
       System.out.println("Departamento = "+departamento);
       System.out.println("Registro = "+nregistro);
       System.out.println("Dia da admissão = "+dia);
       System.out.println("Mês da admissão = "+mes);
       System.out.println("Ano da admissão = "+ano);
    }
}
