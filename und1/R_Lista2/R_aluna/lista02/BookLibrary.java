public class BookLibrary
{
    // instance variables - replace the example below with your own
    private int isbn, paginas, quantidade,da,ma,aa,dd,md,ad, edicao;
    private float multa, valorMulta;
    private String titulo, autor, editora,usuario;

    //Constructor for objects of class BookStore
    public BookLibrary(int is, String t, String a, String edit, int edic, int pag, int qtd)
    {
        // initialise instance variables
        this.isbn = is;
        this.titulo = t;
        this.autor = a;
        this.editora = edit;
        this.edicao = edic;
        this.paginas = pag;
        this.quantidade = qtd;
        multa = 0;
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
    
    
    // show data
    public void showData(){
        System.out.println("Isbn = " + isbn);
        System.out.println("Titulo = " + titulo);
        System.out.println("Autor = " + autor);
        System.out.println("Editora = " + editora);
        System.out.println("Edicao = " + edicao);
        System.out.println("Paginas = " + paginas);
        System.out.println("Quantidade = " + quantidade);
        
        
    }
    
    //emprestimo
    public void emprestimo(String usr, int d, int m , int a){
        this.usuario = usr;
        da = d;
        ma = m;
        aa = a;
        dd = d + 8;
        md = m;
        ad = a;
    }
    public void devolucao(int d, int m, int a){
        int difd = 0, difm = 0, difa = 0;
        difa = a - ad;
        difm = m - md;
        difd = d - dd;
        
        if(difd > 0){
            multa = difd * 2;
        }
        if(difm > 0){
            multa = multa + (difm * 31 * 2);
        }
        if(difa > 0){
            multa = multa + (difa * 360 * 2);
        }
        if((difa > 0) || (difm > 0) || (difd > 0)){
            System.out.println("Sua multa é de R& " + multa);
        }
        System.out.println("Livro devolvido");
        usuario = "";
        
        
    }
}








































