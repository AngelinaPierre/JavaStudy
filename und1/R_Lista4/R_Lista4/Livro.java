public class Livro
{
    protected String titulo, autor, editora;
    protected int edicao;
    
    public Livro(String titulo, String autor, String editora, int edicao)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
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
    
    public void setEdicao(int edicao)
    {
        this.edicao = edicao;
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
    
    public void mostraLivro(){
        System.out.println ("Titulo: "+titulo+"\nAutor: "+autor+"\nEditora: "+editora+"\nEdicao: "+edicao);
    }
    
    public boolean eIgual(String titulo2)
    {
        if (titulo.equals(titulo2)==true) //if (titulo2==titulo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}