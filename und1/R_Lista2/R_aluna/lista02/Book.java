public class Book
{
    // instance variables - replace the example below with your own
    private int isbn, edicao;
    private String titulo, autor, editora;

    /**
     * Constructor for objects of class Book
     */
    public Book(int is, String t,String a, String edit, int edic)
    {
        // initialise instance variables
        this.isbn = is;
        this.titulo = t;
        this.edicao = edic;
        this.editora = edit;
        this.autor = a;
    }
    
    /**
     * An example of a method - replace this comment with your own
     */
    // setters
    public void setIsbn(int is){
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
    // getters
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
    //show data
    public void showData(){
        System.out.println("Isbn = " + isbn);
        System.out.println("Titulo = " + titulo);
        System.out.println("Autor = " + autor);
        System.out.println("Editora = " + editora);
        System.out.println("Edicao = " + edicao);
    }
    
}
