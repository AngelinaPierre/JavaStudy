import java.io.*;

public class IntercalaVetores
{
  public static void main(String args [])
                 throws java.io.IOException
  {  int [] vetA, vetB, vetC;
     int i=1, j=1, x=0;
     String aux;
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     vetA = new int[5];
     vetB = new int[5];
     vetC = new int[10];
     System.out.println("Informe 5 números para o vetor A em ordem crescente");
     aux = in.readLine();
     vetA[0] = Integer.valueOf(aux).intValue();
     while (i < 5)
     {
         aux = in.readLine();
         vetA[i] = Integer.valueOf(aux).intValue();
         if (vetA[i] > vetA[i-1])
         {
             i++;
         }
         else
         {
             System.out.println("O número precisa ser maior que o anterior, digite novamente");
         }    
     }
     
     System.out.println("Informe 5 números para o vetor B em ordem crescente");
     aux = in.readLine();
     vetB[0] = Integer.valueOf(aux).intValue();
     while (j < 5)
     {
         aux = in.readLine();
         vetB[j] = Integer.valueOf(aux).intValue();
         if (vetB[j] > vetB[j-1])
         {
             j++;
         }
         else
         {
             System.out.println("O número precisa ser maior que o anterior, digite novamente");
         }    
     }
     
     for (i=0; i < 5; i++)
     {
         vetC[x]=vetA[i];
         x++;
         vetC[x]=vetB[i];
         x++;
     }
     
     System.out.println("*** Vetor Intercalado ****");
     for (x=0;x < 10; x++)
     {
         System.out.println(vetC[x]);
     }    
 
  }
}  