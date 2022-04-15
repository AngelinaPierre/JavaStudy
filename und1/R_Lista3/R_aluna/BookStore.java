public class BookStore
{
    // instance variables - replace the example below with your own
    private int isbn,paginas, quantidade;
    private float preco;
    private String titulo, autor, edicao, editora;
    
    // Constructor for objects of class Book
    public BookStore(int is, String t, String a, String edic, String edit, int pag, int qtd, float p){
        this(is,t,a,edic,edit);
        this.paginas = pag;
        this.quantidade = qtd;
        this.preco = p;
        
        
    }
    public BookStore(int is, String t, String a, String edic, String edit)
    {
        // initialise instance variables
        this.isbn = is;
        this.titulo = t;
        this.autor = a;
        this.edicao = edic;
        this.editora = edit;
    }

    // An example of a method - replace this comment with your own
    
    public void setIsbn(int is)
    {
        // put your code here
        this.isbn = is;
    }
    public void setTitulo(String t){
        this.titulo = t;
    }
    public void setAutor(String a){
        this.autor = a;
    }
    public void setEditora(String edit){
        this.editora = edit;
    }
    public void setEdicao(String edic){
        this.edicao = edic;
    }
    public void setPaginas(int pag){
        this.paginas = pag;
    }
    public void setQuantidade(int qtd){
        this.quantidade = qtd;
    }
    public void setPreco(float p){
        this.preco = p;
    }
    public int getIsbn(){
        return isbn;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public String getEditora(){
        return editora;
    }
    public String getEdicao(){
        return edicao;
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
    public void showData(){
        System.out.println("ISBN = " + this.isbn);
        System.out.println("Titulo = " + this.titulo);
        System.out.println("Autor = " + this.autor);
        System.out.println("Editora = " + this.editora);
        System.out.println("Edicao = " + this.edicao);
        System.out.println("Preço = " + this.preco);
        System.out.println("Quantidade = " + quantidade);
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
