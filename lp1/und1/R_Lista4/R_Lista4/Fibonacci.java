class Fibonacci
{
    public void calculaFibonacci(int termos)
    {    
         int ant = 0;
         int atu = 1;
         int soma;
         int cont = 1;
         System.out.println(atu);
         do{ 
             soma = ant + atu;
             System.out.println(soma);
             ant = atu;
             atu = soma;
             cont++;
         } while (cont < termos);
    }
    
    public boolean achaNumero(int n)
    {
        int ant = 0;
        int atu = 1;
        int soma;
        do
        { 
           soma = ant + atu;
       ant = atu;
        atu = soma;
        } while (soma < n);
        
        if (soma == n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }    
}
