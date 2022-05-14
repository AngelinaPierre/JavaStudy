public class pais {
    private String nome;
    private String capital;
    private float dimensao;
    private pais fronteira[];
    private int total;
    
    public pais(String nome, String capital, float dimensao)    
    {
      this.nome = nome;
      this.capital = capital;
      this.dimensao = dimensao;
      fronteira = new pais[40];
      total = 0;
    }
    
    public void addVizinho(pais objPais)
    {
        fronteira[total]=objPais;
        total++;
    }    
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setCapital(String capital)
    {
        this.capital = capital;
    }   
    
    public void setDimensao(float dimensao)
    {
        this.dimensao = dimensao;
    }
    
    public int getTotal()
    {
        return total;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public String getCapital()
    {
        return capital;
    }    
    
    public float getDimensao()
    {
        return dimensao;
    }    
    
    public boolean equals(pais outro)
    {
        if ((this.getNome().equals(outro.getNome()) && (this.getCapital().equals(outro.getCapital()))))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean limitrofe(pais objPais)
    {
        int i=0;
        boolean achou=false;
        while ((achou != true) && (i < total))
        {
            if ((objPais.getNome().equals(this.fronteira[i].getNome())))
            {
                achou = true;
            }
            i++;
        }
        return achou;
    }    
    
    public void vizinhosComuns(pais objPais)
    {
       int i, j;
       System.out.println("**** Vizinhos em Comum ****"); 
       for (i=0; i < getTotal(); i++)
       {
           for (j=0; j < objPais.getTotal(); j++)
           {
               if (this.fronteira[i].getNome().equals(objPais.fronteira[j].getNome()))
               {
                   System.out.println(this.fronteira[i].getNome());
               }
           }
       }   
    }    
}
