public class Livro{
    private int isbn, paginas;
    private String titulo, autor, edicao, editora;
    
    public Livro(int is, String t, String a, String edic, String edit,int pag){
        // initialise instance variables
        this.isbn = is;
        this.titulo = t;
        this.autor = a;
        this.edicao = edic;
        this.editora = edit;
        this.paginas = pag;
    }
    
    public void mostraLivro(){
        System.out.println ("Titulo: "+titulo+"\nAutor: "+autor+"\nEditora: "+editora+"\nEdicao: "+edicao);
    }
    
    public Boolean eIgual(String title){
        if(titulo.equals(title) == true){
            return true;
        }else{
            return false;
        }
    }
    
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    
    public void setAutor(String autor)
    {
        this.autor = autor;
    }
    
    public void setEditora(String editora)
    {
        this.editora = editora;
    }
    
    public void setEdicao(String edicao)
    {
        this.edicao = edicao;
    }
    public void setPaginas(int pag){
        this.paginas = pag;
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
    
    
}