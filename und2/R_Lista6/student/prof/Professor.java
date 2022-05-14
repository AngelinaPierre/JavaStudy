abstract class Professor extends Pessoa
{    protected float salario;
     protected int horas;
    
     public Professor(String nome, String telefone, String endereco, String cpf, int identidade, int idade, int horas)
     {   
          super(nome,telefone,endereco,cpf,identidade,idade);
          this.horas = horas;
     }
	
     abstract void calculoSalario();
		
     public float getSalario()
     {   
         return salario;
     }
     
     public int getHoras()
     {  
         return horas;
     }    
     
     public void setSalario(float salario)
     {  
         this.salario=salario;
     }
     
     public void getHoras(int horas)
     {  
         this.horas=horas;
     }  
     
     public void mostraSalario()
     {
        System.out.println(salario);
     }   
}
