public class Book
{
    // instance variables - replace the example below with your own
    private int isbn;
    private String titulo, autor, edicao, editora;
    
    // Constructor for objects of class Book
    public Book(int is, String t, String a, String edic, String edit)
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
    public void showData(){
        System.out.println("ISBN = " + this.isbn);
        System.out.println("Titulo = " + this.titulo);
        System.out.println("Autor = " + this.autor);
        System.out.println("Editora = " + this.editora);
        System.out.println("Edicao = " + this.edicao);
    }
}
