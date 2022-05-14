public class livroBiblioteca extends livro
{  private float multa;
   private String usuario;
   private int diaE, mesE, anoE, diaD, mesD, anoD;

  public livroBiblioteca(int isbn, String titulo, String autor, String editora, String edicao)
  {   super(isbn, titulo, autor, editora, edicao);
      multa=0;
  }

  public void emprestimo(String usuario, int dia, int mes, int ano)
  { this.usuario = usuario;
    diaE = dia;
    mesE = mes;
    anoE = ano;
    diaD = dia + 8;
    mesD = mes;
    anoD = ano;
  }
    

  public void devolucao(int dia, int mes, int ano)
  {  int difDia=0, difMes=0, difAno=0; 
     difAno = ano - anoD;
     difMes = mes - mesD;
     difDia = dia - diaD;
     
     if (difDia > 8)
     {   multa = difDia * 2;
     }
     if (difMes > 0)
     {   multa = multa + (difMes * 31 * 2);
     }
     if (difAno > 0)
     {   multa = multa + (difAno * 360 * 2);
     }    
     if ((difAno > 0) || (difMes > 0) || (difDia > 8))
     {  System.out.println("Sua multa e de R$ "+multa);
         usuario ="";
     }
     else
     {  System.out.println("Livro devolvido");
     }
  }
}
     