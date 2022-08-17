public class LivroLivraria extends Livro{
    private int quantidade;
    private float preco;
    
    public LivroLivraria(int is, String t, String a, String edic, String edit,int pag, int qtd, float p){
        // initialise instance variables
        super(is,t,a,edic,edit,pag);
        this.quantidade = qtd;
        this.preco = p;
    }
    public void setIsbn(int is){
        // put your code here
        this.setIsbn(is);
    }
    public void setTitulo(String t){
        this.setTitulo(t);
    }
    public void setAutor(String a){
        this.setAutor(a);
    }
    public void setEditora(String edit){
        this.setEditora(edit);
    }
    public void setEdicao(String edic){
        this.setEdicao(edic);
    }
    public void setPaginas(int pag){
        this.setPaginas(pag);
    }
    public void setQuantidade(int qtd){
        this.setQuantidade(qtd);
    }
    public void setPreco(float p){
        this.setPreco(p);
    }
    public int getIsbn(){
        return getIsbn();
    }
    public String getTitulo(){
        return getTitulo();
    }
    public String getAutor(){
        return getAutor();
    }
    public String getEditora(){
        return getEditora();
    }
    public String getEdicao(){
        return getEdicao();
    }
    public int getPaginas(){
        return getPaginas();
    }
    public int getQuantidade(){
        return getQuantidade();
    }
    public float getPreco(){
        return getPreco();
    }
    public void showData(){
        System.out.println("ISBN = " + this.getIsbn());
        System.out.println("Titulo = " + this.getTitulo());
        System.out.println("Autor = " + this.getAutor());
        System.out.println("Editora = " + this.getEditora());
        System.out.println("Edicao = " + this.getEdicao());
        System.out.println("Preço = " + this.getPreco());
        System.out.println("Quantidade = " + getQuantidade());
    }
    public void vender(int qtd){
        float value;
        
        if(qtd <= quantidade){
            quantidade = quantidade - qtd;
            value = qtd * preco;
            System.out.println("O valor de " + quantidade + " livros é = " + value);
        }else{
            System.out.println("Não tenho esta quantidade em estoque!");
        }
    }
    public void comprar(int qtd){
        quantidade = quantidade + qtd;
    }
    public void reajuste(float perct){
        preco = preco + ((preco * perct)/100);
    }
}
