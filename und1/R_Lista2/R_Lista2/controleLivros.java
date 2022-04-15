import java.io.*;
class controleLivros
{
    public static void main(String arg[]) throws java.io.IOException
    {  String aux;
       int isbn, diaE, mesE, anoE, diaD, mesD, anoD, paginas, qtd, qtdVenda;
       String titulo, autor, editora, edicao;
       float multa, preco;
       String usuario;
       
       BufferedReader obj = new BufferedReader(new InputStreamReader(System.in)); 
       System.out.println("Informe o ISBN: ");
       aux = obj.readLine();
       isbn = Integer.valueOf(aux).intValue();
       System.out.println("Digite o t�tulo do livro: ");
       titulo = obj.readLine();
       System.out.println("Digite o autor do livro: ");
       autor = obj.readLine();
       System.out.println("Digite a editora do livro: ");
       editora = obj.readLine();
       System.out.println("Digite a edi��o do livro: ");
       edicao = obj.readLine();
       System.out.println("Informe o n�mero de p�ginas: ");
       aux = obj.readLine();
       paginas = Integer.valueOf(aux).intValue();
       System.out.println("Informe o pre�o do livro: ");
       aux = obj.readLine();
       preco = Float.valueOf(aux).floatValue();
       System.out.println("Informe a quantidade: ");
       aux = obj.readLine();
       qtd = Integer.valueOf(aux).intValue();
       
       System.out.println("**** Utiliza��o da classe Livro ***");
       livro objLivro = new livro(isbn, titulo, autor, editora, edicao);
       objLivro.mostraDados();
       System.out.println(objLivro.getEdicao());
       
       System.out.println("**** Utiliza��o da classe Livro Livraria ***");
       livroLivraria objLivroLivraria = new livroLivraria(isbn, titulo, autor, editora, edicao, paginas, preco, qtd);
       System.out.println("Informe a quantidade de livros que quer vender: ");
       aux = obj.readLine();
       qtdVenda = Integer.valueOf(aux).intValue();
       objLivroLivraria.vender(qtdVenda);
       objLivroLivraria.mostraDados();
       
       System.out.println("**** Utiliza��o da classe Livro Biblioteca ***");
       livroBiblioteca objLivroBiblioteca = new livroBiblioteca(isbn,titulo, autor, editora, edicao);
       System.out.println("Informe o usu�rio : ");
       usuario = obj.readLine();
       System.out.println("Informe o dia de empr�stimo : ");
       aux = obj.readLine();
       diaE = Integer.valueOf(aux).intValue();
       System.out.println("Informe o m�s de empr�stimo : ");
       aux = obj.readLine();
       mesE = Integer.valueOf(aux).intValue();
       System.out.println("Informe o ano de empr�stimo : ");
       aux = obj.readLine();
       anoE = Integer.valueOf(aux).intValue();
       objLivroBiblioteca.emprestimo(usuario,diaE,mesE,anoE);
       System.out.println("Informe o dia de devolu��o : ");
       aux = obj.readLine();
       diaD = Integer.valueOf(aux).intValue();
       System.out.println("Informe o m�s de devolu��o : ");
       aux = obj.readLine();
       mesD = Integer.valueOf(aux).intValue();
       System.out.println("Informe o ano de devolu��o : ");
       aux = obj.readLine();
       anoD = Integer.valueOf(aux).intValue();
       objLivroBiblioteca.devolucao(diaD,mesD,anoD);
       objLivroBiblioteca.mostraDados();
       
       
    }
}   

    