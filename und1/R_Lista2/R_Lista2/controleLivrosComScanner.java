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
       System.out.println("Digite o título do livro: ");
       titulo = obj.nextLine();
       titulo = obj.nextLine();
       System.out.println("Digite o autor do livro: ");
       autor = obj.nextLine();
       System.out.println("Digite a editora do livro: ");
       editora = obj.nextLine();
       System.out.println("Digite a edição do livro: ");
       edicao = obj.nextLine();
       System.out.println("Informe o número de páginas: ");
       paginas = obj.nextInt();
       System.out.println("Informe o preço do livro: ");
       preco = obj.nextFloat();
       System.out.println("Informe a quantidade: ");
       qtd = obj.nextInt();
       
       System.out.println("**** Utilização da classe Livro ***");
       livro objLivro = new livro(isbn, titulo, autor, editora, edicao);
       objLivro.mostraDados();
       System.out.println(objLivro.getEdicao());
       
       System.out.println("**** Utilização da classe Livro Livraria ***");
       livroLivraria objLivroLivraria = new livroLivraria(isbn, titulo, autor, editora, edicao, paginas, preco, qtd);
       System.out.println("Informe a quantidade de livros que quer vender: ");
       qtdVenda = obj.nextInt();
       objLivroLivraria.vender(qtdVenda);
       objLivroLivraria.mostraDados();
       
       System.out.println("**** Utilização da classe Livro Biblioteca ***");
       livroBiblioteca objLivroBiblioteca = new livroBiblioteca(isbn,titulo, autor, editora, edicao);
       System.out.println("Informe o usuário : ");
       usuario = obj.nextLine();
       usuario = obj.nextLine();
       System.out.println("Informe o dia de empréstimo : ");
       diaE = obj.nextInt();
       System.out.println("Informe o mês de empréstimo : ");
       mesE = obj.nextInt();
       System.out.println("Informe o ano de empréstimo : ");
       anoE = obj.nextInt();
       objLivroBiblioteca.emprestimo(usuario,diaE,mesE,anoE);
       System.out.println("Informe o dia de devolução : ");
       diaD = obj.nextInt();
       System.out.println("Informe o mês de devolução : ");
       mesD = obj.nextInt();
       System.out.println("Informe o ano de devolução : ");
       anoD = obj.nextInt();
       objLivroBiblioteca.devolucao(diaD,mesD,anoD);
       objLivroBiblioteca.mostraDados();
    }
}   
