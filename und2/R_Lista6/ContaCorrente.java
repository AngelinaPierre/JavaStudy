public class ContaCorrente
{
    int numero, especial;
    float saldo;
    float limite;
    Movimentacao objMovimento[];
    int movimentos = 0;

    public ContaCorrente(int Numero, int Especial, float Saldo, float Limite)
    { numero = Numero;
      especial = Especial;
      saldo = Saldo;
      limite = Limite;
      objMovimento= new Movimentacao[100];
      movimentos = 0;
    }
    
    public void movimento(String Descricao, float Valor, String Tipo)
    {  objMovimento[movimentos] = new Movimentacao(Descricao, Valor, Tipo);
       movimentos++; 
    }    
    
    public void emiteExtrato(ContaCorrente obj)
    {   int i=0;
        for (i=0; i < obj.movimentos; i++)
        {  System.out.println("Descricao = "+obj.objMovimento[i].descricao);
           System.out.println(" Valor = "+obj.objMovimento[i].valor);
           System.out.println(" Tipo = "+obj.objMovimento[i].tipo);
           System.out.println("*************************************");
        }   
    }    
}
