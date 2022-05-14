public class LivroBiblioteca extends livro{
    private float multa;
    private String usuario;
    private int diaE, mesE, anoE, diaD, mesD, anoD;
    
    public LivroBiblioteca(int isbn, String t, String a, String edit,String edic){
        super(isbn,t,a,edit,edic);
        multa = 0;
    }
    
    public void emprestimo(String usr, int d, int m, int a){
        // uso do this para referenciar o objeto
        this.usuario = usr;
        diaE = d;
        mesE = m;
        anoE = a;
        diaD = d + 8;
        mesD = m;
        anoD = a;
    }
    
    public void devolucao(int d, int m, int a){
        int difDia = 0, difMes = 0, difAno = 0;
        difAno = a - anoD;
        difMes = m - mesD;
        difDia = d - diaD;
        
        if(difDia > 8){
            multa = difDia * 2;
        }else if(difMes > 0){
            multa = multa + (difMes * 31 * 2);
        }else if( difAno > 0){
            multa = multa + (difAno * 360 * 2);
        }else if( (difAno > 0) || (difMes > 0) || (difDia > 8)){
            System.out.println("Sua multa e de R$: " + multa);
            usuario = "";
        }else{
            System.out.println("Livro Devolvido");
        }
        
    }
}