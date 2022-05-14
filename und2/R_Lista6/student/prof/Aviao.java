public class Aviao
{   private int prefixo, qtdAssentos, qtdOcupados;
    private String modelo, fabricante;
    
    public Aviao(int prefixo, String modelo, String fabricante, int qtdAssentos, int qtdOcupados)
    {  this.prefixo = prefixo;
       this.qtdAssentos = qtdAssentos;
       this.qtdOcupados = qtdOcupados;
       this.modelo = modelo;
       this.fabricante = fabricante;    
    }
    
    public int getPrefixo()
    {  return prefixo;
    }    
    
    public void imprimePrefixo()
    {  System.out.println("O prefixo do aviao = "+prefixo);
    }    
}
