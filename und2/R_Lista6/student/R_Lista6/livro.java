public class livro{
    int isbn;
    String titulo, autor, editora, edicao;
    
    public livro(int isbn, String t, String a, String edit, String edic){
        // utilização do this referente ao objeto
        this.isbn = isbn;
        this.titulo = t;
        this.autor = a;
        this.editora = edit;
        this.edicao = edic;
    }
    
    // mostrar dados livro
    public void mostraDados(){
        System.out.println("Isbn = " + isbn);
        System.out.println("Titulo = " + titulo);
        System.out.println("Autor = " + autor);
        System.out.println("Editora = " + editora);
        System.out.println("Edicao = " + edicao);
    }
    
    // mostra dados livro - superposicao? sobrecarga? com parametro
    public void mostraDados(livro obj){
        System.out.println("Isbn = " + isbn);
        System.out.println("Titulo = " + titulo);
        System.out.println("Autor = " + autor);
        System.out.println("Editora = " + editora);
        System.out.println("Edicao = " + edicao);
    }
    
    // setters and getters
    public void setIsbn(int i){
        // this = objeto
        this.isbn = i;
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
    public String setTitulo(){
        return titulo;
    }
    public String setAutor(){
        return autor;
    }
    public String setEditora(){
        return editora;
    }
    public String setEdicao(){
        return edicao;
    }
    
}