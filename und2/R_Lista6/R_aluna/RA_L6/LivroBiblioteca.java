public class LivroBiblioteca extends Livro{
    private float multa, quantidade;
    private String usuario;
    private Data dataAluguel, dataDevolucao;
    
    public LivroBiblioteca(int is, String t, String a, String edic, String edit,int pag, int qtd){
        // initialise instance variables
        super(is,t,a,edic,edit,pag);
        this.quantidade = qtd;
        this.multa = 0;
    }
    
    public void mostraDados(){ 
        System.out.println("Isbn = " + getIsbn());
        System.out.println("Titulo = " + getTitulo());
        System.out.println("Autor = " + getAutor());
        System.out.println("Editora = "+ getEditora());
        System.out.println("Edição = "+ getEdicao());
    }
    
    public void emprestimo(String usuario, Data date){ 
        this.usuario = usuario;
        dataAluguel.setDia(date.getDia());
        dataAluguel.setMes(date.getMes());
        dataAluguel.setAno(date.getAno());
        dataDevolucao.setDia(date.getDia() + 8);
        dataDevolucao.setMes(date.getMes());
        dataDevolucao.setAno(date.getAno());
    }
    
    public void devolucao(int dia, int mes, int ano){
        int difDia=0, difMes=0, difAno=0; 
        difAno = ano - dataDevolucao.getAno();
        difMes = mes - dataDevolucao.getMes();
        difDia = dia - dataDevolucao.getDia();
        
        if (difDia > 0){
            multa = difDia * 2;
        }
        
        if (difMes > 0){
            multa = multa + (difMes * 31 * 2);
        }
        
        if (difAno > 0){
            multa = multa + (difAno * 360 * 2);
        }    
        if ((difAno > 0) || (difMes > 0) || (difDia > 0)){
            System.out.println("Sua multa e de R$ "+multa);
        }
        System.out.println("Livro devolvido");
        usuario =""; 
    }
  
    public void setIsbn(int isbn){  
        this.setIsbn(isbn);
    }    
  
    public void setTitulo(String titulo){   
        this.setTitulo(titulo);
    } 
  
    public void setAutor(String autor){   
        this.setAutor(autor);
    }
  
    public void setEditora(String editora){   
        this.setEditora(editora);
    }    
  
    public void setEdicao(String edicao){   
        this.setEdicao(edicao);
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
  
    
}
