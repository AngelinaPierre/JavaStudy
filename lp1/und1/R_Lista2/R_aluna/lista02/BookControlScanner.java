import java.util.Scanner;

public class BookControlScanner{
    public static void main(String args[]){
        int isbn, da, ma, aa, dd, md, ad, paginas, quantidade, qtdVenda;
        float multa, preco;
        String aux, titulo, autor, editora, edicao, usuario;
        
        // objeto teclado nextInt() nextLine() nextFloat()
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o ISBN: ");
        isbn = teclado.nextInt();
        System.out.println("Digite o título do livro: ");
        titulo = teclado.nextLine();
       // titulo = teclado.nextLine();
        System.out.println("Digite o autor do livro: ");
        autor = teclado.nextLine();
        System.out.println("Digite a editora do livro: ");
        editora = teclado.nextLine();
        System.out.println("Digite a edição do livro: ");
        edicao = teclado.nextLine();
        System.out.println("Informe o número de páginas: ");
        paginas = teclado.nextInt();
        System.out.println("Informe o preço do livro: ");
        preco = teclado.nextFloat();
        System.out.println("Informe a quantidade: ");
        quantidade = teclado.nextInt();
        
        System.out.println("**** Utilização da classe Livro ***");
        // criando objeto/instancia
        Book objBook = new Book(isbn,titulo,autor,editora,edicao);
        objBook.showData();
        System.out.println(objBook.getEdicao());
        
        System.out.println("**** Utilização da classe Livro Livraria ***");
        BookStore objBookStore = new BookStore(isbn, titulo, autor, editora, edicao, paginas, quantidade,preco);
        System.out.println("Informe a quantidade de livros que quer vender: ");
        qtdVenda = teclado.nextInt();
        objBookStore.vender(qtdVenda);
        objBookStore.showData();
        
        System.out.println("**** Utilização da classe Livro Biblioteca ***");
        BookLibrary objBookLibrary = new BookLibrary(isbn, titulo, autor, editora, edicao, paginas, quantidade);
        System.out.println("Informe o usuário : ");
        usuario = teclado.nextLine();
        System.out.println("Informe o dia de empréstimo : ");
        da = teclado.nextInt();
        System.out.println("Informe o mes de empréstimo : ");
        ma = teclado.nextInt();
        System.out.println("Informe o ano de empréstimo : ");
        aa = teclado.nextInt();
        // chamando funççao de emprestimo
        objBookLibrary.emprestimo(usuario,da,ma,aa);
        
        System.out.println("Informe o dia de devolução : ");
        dd = teclado.nextInt();
        System.out.println("Informe o mês de devolução : ");
        md = teclado.nextInt();
        System.out.println("Informe o ano de devolução : ");
        ad = teclado.nextInt();
        objBookLibrary.devolucao(dd,md,ad);
        objBookLibrary.showData();
    
        
    }
}