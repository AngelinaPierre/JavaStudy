public class ContaBancaria
{
   Cliente vetrCliente[];
   int ttl;
 
   public ContaBancaria(int qtdcliente) 
   {
       vetrCliente = new Cliente[qtdcliente];   
       ttl = 0;
   }
    
   public void Adcliente(Cliente caluro)
   {
       if(ttl < vetrCliente.length) 
       {
          vetrCliente[ttl] = caluro;
          ttl++;
       }
   }
    
   public boolean Deposito(int nConta, float depositado) 
   {
        int x=0;
        float saldocaluro;
        boolean achou=false;
        while ((achou == false) && (x < ttl)) 
        {
             if(vetrCliente[x].getnConta() == nConta) 
             {
                 saldocaluro = vetrCliente[x].getsaldo() + depositado; 
                 vetrCliente[x].setsaldo(saldocaluro);
                 achou=true;
             }
             x++;
        }
        return achou;
    }
    
    public boolean Saque(int nConta, float saque) 
    {
        int x=0;
        float saldocaluro;
        boolean achou=false;
        while ((achou == false) && (x < ttl)) 
        {
              if(vetrCliente[x].getnConta() == nConta) 
              {
                  saldocaluro = vetrCliente[x].getsaldo() - saque;
                  vetrCliente[x].setsaldo(saldocaluro);
                  achou=true;
              }
              x++;
        }
        return achou;
    }
    
    public void ExtratoBancario(int nConta) 
    {
        int x=0;
        boolean achou=false;
        while ((achou == false) && (x < ttl)) 
        {
            if(vetrCliente[x].getnConta() == nConta) 
            {
                System.out.println(vetrCliente[x].getnomeCliente());
                System.out.println(vetrCliente[x].getnConta());
                System.out.println(vetrCliente[x].getsaldo());
                System.out.println(vetrCliente[x].gettipo());
            }
            x++;
        }    
    }
}