// leia a ordem de uma matriz e encontre o maior número 

import java.io.*;

class MaiorMatriz
{  public static void main(String args [ ])
                 throws java.io.IOException
   { int [][] mat;
     int i,j,linha,coluna, maior=-32000;
     String s_n; 
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
     System.out.println("Entre com a ordem da matriz (linha, coluna) : ");
     s_n = in.readLine();
     linha = Integer.valueOf(s_n).intValue();
     s_n = in.readLine(); 
     coluna = Integer.valueOf(s_n).intValue();
     System.out.println("Entre com os numeros da matriz");
     mat=new int[linha][coluna];
     for (i=0; i < linha; i++)
        for (j=0; j < coluna; j++)
        { s_n = in.readLine();
          mat[i][j] = Integer.valueOf(s_n).intValue();
          if (mat[i][j] > maior)
             maior=mat[i][j];  
        }
     System.out.println("O maior numero da matriz e : "+ maior);
  }
}
