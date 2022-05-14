import java.io.*;

class SomaDoisVet
{
    public static void main(String args [])
                 throws java.io.IOException
   { int [] vetA, vetB, vetC;
     int i;
     String aux;
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     vetA = new int[8];
     vetB = new int[8];
     vetC = new int[8];
     System.out.println("Informe 8 números para o vetor A");
     for (i=0; i < 8; i++)
     {
         aux = in.readLine();
         vetA[i] = Integer.valueOf(aux).intValue();
     }
     
     System.out.println("Informe 8 números para o vetor B");
     i=0;
     while (i < 8)
     {
         aux = in.readLine();
         vetB[i] = Integer.valueOf(aux).intValue();
         i++;
     }
     i=0;
     do
     {
         vetC[i] = vetA[i] + vetB[i];
         i++;
     } while(i<8);
     
     System.out.println("O resultado da soma dos vetores é: ");
     for (i=0; i < 8; i++)
     {
         System.out.println(vetC[i]);
     }
   }
}    
    