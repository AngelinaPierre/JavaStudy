public class Banco
{   ContaCorrente contas[];
    int total;
     
    public Banco()
    {  contas = new ContaCorrente[10];   
       total=0;
    }
   
    public void criaConta(int Numero, int Especial, float saldo, float limite)
    {   ContaCorrente obj = new ContaCorrente(Numero, Especial, saldo, limite);
        contas[total] = obj;
        total++;
    }
    
    public int pesquisa(int conta)
    {  int i=0, indice=-1;
       while ((i < total) && (indice == -1))
       {  if (contas[i].numero == conta)
          {  indice = i;
          }   
          i++;
       }
       return indice;
    }
    
    public String excluiConta(int conta)
    {  int indice = pesquisa(conta);
       if (indice == -1)
       { return "Conta inexistente";
       } 
       else
       {  while (indice < total)
          { contas[indice] = contas[indice + 1];
            indice++;
          }
          total--;
          return "Conta removida com sucesso";
       }   
    }    
    
    public String deposito(float valor, int conta)
    {  int indice = pesquisa(conta);
       if (indice == -1)
       {  return "Conta inexistente";
       } 
       else
       {  contas[indice].saldo = contas[indice].saldo + valor;
          contas[indice].movimento("Deposito",valor,"Credito"); 
          return "Deposito com sucesso"; 
       }
    }   
       
    public String saque(float valor, int conta)
    {  int indice = pesquisa(conta);
       float saldoTotal=0; 
       if (indice == -1)
       {  return "Conta inexistente";
       } 
       else
       {  saldoTotal = contas[indice].limite + contas[indice].saldo; 
           if (valor < saldoTotal)
           {  contas[indice].saldo = contas[indice].saldo - valor;
              contas[indice].movimento("Saque",valor,"Debito"); 
              return "Saque com sucesso"; 
           }
           else
           {  return "Limite indisponível";
           }    
       }    
    }      
    
    public void extrato(int conta)
    {  int indice = pesquisa(conta);
       if (indice == -1)
       {  System.out.println("Conta inexistente");
       }  
       else
       {  System.out.println("********** EXTRATO **********");
          System.out.println("Numero da conta = "+contas[indice].numero); 
          System.out.println("Saldo total = "+contas[indice].saldo); 
          contas[indice].emiteExtrato(contas[indice]); 
       }
    }
    
    public String transferencia(int origem, int destino, float valor)
    {  int indiceOrigem = pesquisa(origem);
       int indiceDestino = pesquisa(destino);  
       float saldoTotal=0; 
       if ((indiceOrigem == -1) || (indiceDestino == -1))
       {  return "Conta Origem ou Destino inexistente";
       } 
       else
       {   saldoTotal = contas[indiceOrigem].limite + contas[indiceOrigem].saldo; 
           if (valor < saldoTotal)
           {  contas[indiceOrigem].saldo = contas[indiceOrigem].saldo - valor;
              contas[indiceOrigem].movimento("Transferência",valor,"Debito"); 
              contas[indiceDestino].saldo = contas[indiceDestino].saldo + valor;
              contas[indiceDestino].movimento("Transferência",valor,"Credito"); 
              return "Transferência com sucesso"; 
           }
           else
           {  return "Limite indisponível";
           }    
       }    
    }
}
