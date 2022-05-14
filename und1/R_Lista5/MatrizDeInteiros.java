class MatrizDeInteiros
{
    int mat[][];
        
    public MatrizDeInteiros(int linha, int coluna)
    {
       mat = new int[linha][coluna];
       for (int i=0; i < linha; i++)
       {   
           for (int j=0; j < coluna; j++)
           {
               mat[i][j] = 0;
           }
       }
    }
    
    public void insere(int linha, int coluna, int n)
    {
       if ((linha >= 0) && (linha < mat.length)&& 
           (coluna >= 0)  && (coluna < mat[0].length))
       {
          mat[linha][coluna] = n;
       }
       else
       {
           System.out.println("Não foi possível inserir o número porque os índices estão fora da ordem");
       }
    }
    
    public boolean eQuadrada()
    {
        if (mat.length == mat[0].length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public int pesquisa(int n)
    {
        int i, j, linha=-1;
        for (i=0; i < mat.length;i++)
        {
            for (j=0; j < mat[0].length;j++)
            {
                if (mat[i][j] == n)
                {
                    linha=i;
                }
            }
        }
        return linha;
    }  
    
    public void mostra()
    {  
        int i, j;
        for (i=0; i < mat.length;i++)
        {
            for (j=0; j < mat[0].length;j++)
            {
                System.out.print(mat[i][j]+"  ");
            }    
            System.out.println();
        }
    }    
   
}    
        