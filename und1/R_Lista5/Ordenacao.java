// Escreva um programa que leia o tamanho de um vetor, seus elementos e proceda a ordenação, apresentando o vetor ordenado no final. 

import java.io.*;
class Ordenação
{  public static void main(String args [ ])
                 throws java.io.IOException
   { int [] veta;
     int i, j, tamanho, aux;
     String s_n;
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Entre com o tamanho do vetor : ");
     s_n = in.readLine();
     tamanho = Integer.valueOf(s_n).intValue();
     veta=new int[tamanho];
     System.out.println("Entre com os numeros do vetor");
     for (i=0; i < tamanho; i++)
     {  s_n = in.readLine();
        veta[i] = Integer.valueOf(s_n).intValue();
     }
     for (i=0; i < tamanho; i++)
       for (j=i+1; j < tamanho; j++)
          if (veta[i] < veta[j])
          {  aux=veta[i];
             veta[i]=veta[j]; 
             veta[j]=aux;
          }
    for (i=0; i < tamanho; i++)
      System.out.println(veta[i]);
   }   
}
