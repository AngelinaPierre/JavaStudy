class SetorPessoal
 {  Funcionario[] vet;
    int total;
    
    public SetorPessoal(int numeroFuncionarios)
    { vet = new Funcionario[numeroFuncionarios];
      total=0;
    }
    
    public void adicionaFuncinario(Funcionario obj)
    { if (total < vet.length)
      {  vet[total] = obj;
         total++;
      }   
    }    
    
    public void imprimeFolha()
    { int i;
      System.out.println("************* Folha de Pagamentos *******");
      for (i=0; i < total; i++)
      {  System.out.println("Nome = "+vet[i].getNome()+" Salario = "+vet[i].getSalario());
      }
    }
    
    public float totalizaFolha()
    { int i;
      float valor = 0;
      for (i=0; i < total; i++)
      {  valor = valor + vet[i].getSalario();
      }
      return valor;
    }
    
    public String maiorSalario()
    { int i;
      String maiorNome="";
      float maiorSalario=0;
      for (i=0; i < total; i++)
      {  if (maiorSalario < vet[i].getSalario())
         {  maiorSalario = vet[i].getSalario();
            maiorNome = vet[i].getNome();
         }   
      }
      return maiorNome;
    }    
    
    public void mostraFuncionarios(int departamentoF)
    {  int i;
       System.out.println("*** Funcionarios do departamento "+departamentoF+" ***"); 
       for (i=0; i < total; i++)
       {  if (vet[i].getDepartamento() == departamentoF)
          {  System.out.println(vet[i].getNome());
          }
       }
    } 
      
    public void mostraFuncao(String funcaoF)
    {  int i;
       System.out.println("*** Funcionarios que Exercem a Função "+funcaoF+" ***"); 
       for (i=0; i < total; i++)
       {  if (vet[i].getFuncao().equals(funcaoF))
          {  System.out.println(vet[i].getNome());
          }
       }
    } 
    
    public void imprimeFolhaPorSalario()
    { Funcionario[] vetAux = vet;
      Funcionario aux;
      int i, k;
      for (i=0; i < total; i++)
        for (k=i+1; k < total; k++)
          if (vetAux[i].getSalario() > vetAux[k].getSalario())
          { aux = vetAux[i];
            vetAux[i] = vetAux[k];
            vetAux[k] = aux;
          } 
      System.out.println("******** Folha de Pagamentos Ordenada Por Salario *******");
      for (i=0; i < total; i++)
      {  System.out.println("Nome = "+vetAux[i].getNome()+" Salario = "+vetAux[i].getSalario());
      }   
     }
}   
  