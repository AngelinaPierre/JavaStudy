import java.util.Scanner;
class controleLivrosComScanner
{
    public static void main(String arg[])
    {  int isbn, diaE, mesE, anoE, diaD, mesD, anoD, paginas, qtd, qtdVenda;
       String titulo, autor, editora, edicao;
       float multa, preco;
       String usuario;
       
       Scanner obj = new Scanner(System.in); 
       System.out.println("Informe o ISBN: ");
       isbn = obj.nextInt();
       System.out.println("Digite o t�tulo do livro: ");
       titulo = obj.nextLine();
       titulo = obj.nextLine();
       System.out.println("Digite o autor do livro: ");
       autor = obj.nextLine();
       System.out.println("Digite a editora do livro: ");
       editora = obj.nextLine();
       System.out.println("Digite a edi��o do livro: ");
       edicao = obj.nextLine();
       System.out.println("Informe o n�mero de p�ginas: ");
       paginas = obj.nextInt();
       System.out.println("Informe o pre�o do livro: ");
       preco = obj.nextFloat();
       System.out.println("Informe a quantidade: ");
       qtd = obj.nextInt();
       
       System.out.println("**** Utiliza��o da classe Livro ***");
       livro objLivro = new livro(isbn, titulo, autor, editora, edicao);
       objLivro.mostraDados();
       System.out.println(objLivro.getEdicao());
       
       System.out.println("**** Utiliza��o da classe Livro Livraria ***");
       livroLivraria objLivroLivraria = new livroLivraria(isbn, titulo, autor, editora, edicao, paginas, preco, qtd);
       System.out.println("Informe a quantidade de livros que quer vender: ");
       qtdVenda = obj.nextInt();
       objLivroLivraria.vender(qtdVenda);
       objLivroLivraria.mostraDados();
       
       System.out.println("**** Utiliza��o da classe Livro Biblioteca ***");
       livroBiblioteca objLivroBiblioteca = new livroBiblioteca(isbn,titulo, autor, editora, edicao);
       System.out.println("Informe o usu�rio : ");
       usuario = obj.nextLine();
       usuario = obj.nextLine();
       System.out.println("Informe o dia de empr�stimo : ");
       diaE = obj.nextInt();
       System.out.println("Informe o m�s de empr�stimo : ");
       mesE = obj.nextInt();
       System.out.println("Informe o ano de empr�stimo : ");
       anoE = obj.nextInt();
       objLivroBiblioteca.emprestimo(usuario,diaE,mesE,anoE);
       System.out.println("Informe o dia de devolu��o : ");
       diaD = obj.nextInt();
       System.out.println("Informe o m�s de devolu��o : ");
       mesD = obj.nextInt();
       System.out.println("Informe o ano de devolu��o : ");
       anoD = obj.nextInt();
       objLivroBiblioteca.devolucao(diaD,mesD,anoD);
       objLivroBiblioteca.mostraDados();
    }
}   
