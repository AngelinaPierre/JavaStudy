public class BookStore
{
    // instance variables - replace the example below with your own
    private int isbn, paginas, quantidade, edicao;
    private float preco;
    private String titulo, autor, editora;

    //Constructor for objects of class BookStore
    public BookStore(int is, String t, String a, String edit, int edic, int pag, int qtd, float p)
    {
        // initialise instance variables
        this.isbn = is;
        this.titulo = t;
        this.autor = a;
        this.editora = edit;
        this.edicao = edic;
        this.paginas = pag;
        this.quantidade = qtd;
        this.preco = p;
    }

    // An example of a method - replace this comment with your own
    
    //SETTERS
    
    public void setIsbt(int is){
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
    public void setEdicao(int edic){
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
    
    //GETTERS
    
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
    public int getEdicao(){
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
    
    // show data
    public void showData(){
        System.out.println("Isbn = " + isbn);
        System.out.println("Titulo = " + titulo);
        System.out.println("Autor = " + autor);
        System.out.println("Editora = " + editora);
        System.out.println("Edicao = " + edicao);
        System.out.println("Paginas = " + paginas);
        System.out.println("Quantidade = " + quantidade);
        System.out.println("Preco = " + preco);
    }
    
    public void vender(int qtd){
        float value;
        if(qtd <= quantidade){
            quantidade = quantidade - qtd;
            value = qtd * preco;
            System.out.println("O valor é = " + value);
        }else{
        System.out.println("Não tenho esta quantidade no estoque");
        }
    }
    
    public void comprar(int qtd){
        quantidade = quantidade + qtd;
    }
    public void reajustePreco(float perc){
        preco = preco + ((preco * perc)/100);
    }
}








































