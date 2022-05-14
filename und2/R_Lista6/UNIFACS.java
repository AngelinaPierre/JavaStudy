class UNIFACS extends Professor
{    private int horasPesquisa;
	
     public UNIFACS(String nome, String telefone, String endereco, String cpf, int identidade, int idade, int horas, int horasPesquisa)
     {    
         super(nome,telefone,endereco,cpf,identidade,idade,horas);
         this.horasPesquisa = horasPesquisa;
     }
	
     public void calculoSalario()
     {   
         salario = (horasPesquisa * 500) + (horas * 600);
         System.out.println(getSalario());
     }
     
     public int getHorasPesquisa()
     {   
         return horasPesquisa;
     }    
     
     public void setHorasPesquisa(int horas)
     {
         horasPesquisa=horas;
     }    
}

