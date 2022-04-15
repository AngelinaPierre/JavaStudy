public class Primos
{
	public boolean primo(int n)
	{  int i;
	   boolean ok = true;
	   for (i = 2; i < n; i++)
	   {  if( (n % i) == 0)
	      {  ok = false;
	      }
	   }
	   return ok;
	}
	
	public void primoIntervalo(int inicio, int fim)
	{
	    if (fim <= inicio)
	    {
	        System.out.println("Intervalo Errado");
	    }
	    else
	    {
	        System.out.println("**** Lista de Primos no Intervalo "+inicio+" - "+fim+" ****");
	        while (inicio <= fim)
	        {
	            if (primo(inicio) == true)
	            {
	                System.out.println(inicio);
	            }
	            inicio++;
	        }
	    }
	}   
}