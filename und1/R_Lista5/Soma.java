import java.io.*;

class Soma
{
    public static void main(String args [])
                 throws java.io.IOException
   { int [] vet;
     int i, soma=0;
     String aux;
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     vet = new int[8];
     System.out.println("Informe 8 números para o vetor");
     for (i=0; i < 8; i++)
     {
         aux = in.readLine();
         vet[i] = Integer.valueOf(aux).intValue();
     }
     
     for (i=0; i < 8; i++)
     {
         soma = soma + vet[i];
     }
     System.out.println("A soma é = "+soma);
   }
}  