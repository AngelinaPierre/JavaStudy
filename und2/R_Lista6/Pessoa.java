class Pessoa
{  protected String nome, telefone, endereco, cpf;
   protected int identidade, idade;
  
   public Pessoa(String nome, String telefone, String endereco, String cpf, int identidade, int idade)
   {   this.nome = nome;
       this.telefone = telefone;
       this.endereco = endereco;
       this.cpf = cpf;
       this.identidade = identidade;
       this.idade = idade;
   }
	
   public Pessoa(String nome, int idade)
   {    this.nome = nome;
        this.idade = idade;
   }
	
   public String getNome()
   {    return nome;
   }
	
   public String getTelefone()
   {    return telefone;
   }
	
   public String getEndereco()
   {    return endereco;
   }
	
   public String getCpf()
   {   return cpf;
   }
	
   
   public int getIdentidade()
   {    return identidade;
   }
	
   public int getIdade()
   {    return idade;
   }
	
   public int getIdade(int ano_atual, int ano_futuro)
   {    int ano_nascimento, idade_futura;
        ano_nascimento = ano_atual - idade;
        idade_futura = ano_futuro - ano_nascimento;
        return idade_futura;
   }
   
   public void setNome(String nome)
   {    this.nome=nome;
   }
	
   public void setTelefone(String telefone)
   {    this.telefone=telefone;
   }
	
   public void setEndereco(String endereço)
   {    this.endereco=endereço;
   }
	
   public void setCpf(String cpf)
   {   this.cpf=cpf;
   }
	
   public void setIdentidade(int identidade)
   {    this.identidade=identidade;
   }
	
   public void setIdade(int idade)
   {    this.idade=idade;
   }
   
   public void imprime(Pessoa obj)
   {
       System.out.println("Nome : "+ obj.getNome());
       System.out.println("Telefone : "+ obj.getTelefone());
       System.out.println("Endereco : "+ obj.getEndereco());
       System.out.println("CPF : "+ obj.getCpf());
       System.out.println("Carteira de Identidade :"+ obj.identidade);
       System.out.println("Idade : "+ obj.getIdade());
       System.out.println("Idade no ano de 2025 :"+ obj.getIdade(2009,2025));
   }    
}
