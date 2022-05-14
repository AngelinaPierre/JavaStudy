// Escreva um programa para ler a ordem de uma matriz quadrada, os elementos da matriz e some a diagonal secundária. 
import java.io.*;

class SomaDiagonalSecundaria
{  public static void main(String args [ ])
                 throws java.io.IOException
   { int [][] mat;
     int i,j,linha,coluna,soma=0;
     String s_n; 
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
     System.out.println("Entre com a ordem da matriz (linha, coluna) : ");
     s_n = in.readLine();
     linha = Integer.valueOf(s_n).intValue();
     do 
     { s_n = in.readLine(); 
       coluna = Integer.valueOf(s_n).intValue();
     } while (coluna != linha);
     System.out.println("Entre com os numeros da matriz");
     mat=new int[linha][coluna];
     for (i=0; i < linha; i++)
        for (j=0; j < coluna; j++)
        { s_n = in.readLine();
          mat[i][j] = Integer.valueOf(s_n).intValue();
        }
     for (i=0; i < linha; i++)
        for (j=0; j < coluna; j++) 
           if (i == j)
              soma=soma+mat[i][j];
     System.out.println("A soma da diagonal secundaria e :"+ soma);
  }
}
