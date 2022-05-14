class UFBA extends Professor
{    private int horasAtendimento;
     
     public UFBA(String nome, String telefone, String endereco, String cpf, int identidade, int idade, int horas, int horasAtendimento)
     {    
         super(nome,telefone,endereco,cpf,identidade,idade,horas);
         this.horasAtendimento = horasAtendimento;
     }
	
     public void calculoSalario()
     {  
        salario = (horasAtendimento * 400) + (horas * 600);
	System.out.print(getSalario());
     }
     
     public int getHorasAtendimento()
     {  
         return horasAtendimento;
     }  
     
     public void setHorasAtendimento(int horas)
     {
         horasAtendimento = horas;
     }    
}
