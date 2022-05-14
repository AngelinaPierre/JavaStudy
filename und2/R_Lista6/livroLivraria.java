public class livroLivraria extends livro
{
    private int paginas, qtd;
    private float preco;

    public livroLivraria(int isbn, String titulo, String autor, String editora, String edicao, int paginas, float preco, int qtd)
    {
        super(isbn, titulo, autor, editora, edicao);
        this.paginas = paginas;
        this.preco = preco;
        this.qtd = qtd;     
    }

    public void vender(int Quantidade)
    {   float valor;
        if (Quantidade <= qtd)
        {  qtd = qtd - Quantidade;
           valor = Quantidade * preco; 
           System.out.println("O valor é = "+ valor);
        }
        else
        {  System.out.println("Não tenho esta qtd no estoque");
        }  
    }

    public void comprar(int Quantidade)
    {   qtd = qtd + Quantidade; 
    }
         
    public void reajustePreco(float percentual) 
    {   preco = preco + ((preco * percentual)/100);  
    }   
    
    public void mostraDados()
    {  super.mostraDados();
       System.out.println("Preço = "+ preco);
       System.out.println("Quantidade = "+ qtd);
    }
} 