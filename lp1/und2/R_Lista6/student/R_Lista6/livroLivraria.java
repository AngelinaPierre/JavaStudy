public class livroLivraria extends livro{
    private int paginas, quantidade;
    private float preco;
    
    public livroLivraria(int isbn, String t, String a, String edit, String edic, int pag, float p, int qtd){
        // chamando super para pegar a classe onde esta herdando
        super(isbn,t,a,edit,edic);
        this.paginas = pag;
        this.preco = p;
        this.quantidade = qtd;
    }
    // vender livro base quantidade
    public void vender(int qtd){
        float value;
        if(qtd <= quantidade){
            quantidade = quantidade - qtd;
            value = qtd * preco;
            System.out.println("O Valor é = " + value);
        }
    }
    // comprar livro na quantidade
    public void comprar(int qtd){
        quantidade = quantidade + qtd;
    }
    // ajustar preco
    public void reajustePreco(float percent){
        preco = preco + ((preco * percent)/100);
    }
    
    // show dados
    public void mostraDados(){
        // chamando metodo herdado da classe usando o super
        super.mostraDados();
        System.out.println("Preço = " + preco);
        System.out.println("Quantidade = " + quantidade);
    }
    
    // setters and getters
    public void setPaginas(int p){
        this.paginas = p;
    }
    
    public void setQuantidade(int qtd){
        this.quantidade = qtd;
    }
    public void setPreco(float p){
        this.preco = p;
    }
    public int getPaginas(){
        return paginas;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public float getPreco(){
        return preco;
    }
}