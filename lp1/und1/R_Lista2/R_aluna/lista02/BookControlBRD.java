import java.io.*;
public class BookControlBRD
{
    public static void main(String args[]) throws java.io.IOException {
        int isbn, da, ma, aa, dd, md, ad, paginas, quantidade, qtdVenda, edicao;
        float multa, preco;
        String aux, titulo, autor, editora, usuario;
        
        //objeto teclado
        BufferedReader teclado = new BufferedReader( new InputStreamReader(System.in));
        // entrada de dados com conversões de numeros
        System.out.println("Informe o ISBN: ");
        aux = teclado.readLine();
        isbn = Integer.valueOf(aux).intValue();
        System.out.println("Digite o titulo do livro: ");
        titulo = teclado.readLine();
        System.out.println("Digite o autor do livro: ");
        autor = teclado.readLine();
        System.out.println("Digite o editora do livro: ");
        editora = teclado.readLine();
        System.out.println("Digite o edicao do livro: ");
        aux = teclado.readLine();
        edicao = Integer.valueOf(aux).intValue();
        System.out.println("Digite o numero de paginas do livro: ");
        aux = teclado.readLine();
        paginas = Integer.valueOf(aux).intValue();
        System.out.println("Digite o preço do livro: ");
        aux = teclado.readLine();
        preco = Float.valueOf(aux).floatValue();
        System.out.println("Digite a quantidade do livro: ");
        aux = teclado.readLine();
        quantidade = Integer.valueOf(aux).intValue();
        
        System.out.println("**** Utilização da classe Livro ***");
        // criando objeto/instancia
        Book objBook = new Book(isbn,titulo,autor,editora,edicao);
        objBook.showData();
        System.out.println(objBook.getEdicao());
        
        System.out.println("**** Utilização da classe Livro Livraria ***");
        BookStore objBookStore = new BookStore(isbn, titulo, autor, editora, edicao, paginas, quantidade ,preco);
        System.out.println("Informe a quantidade de livros que quer vender: ");
        aux = teclado.readLine();
        qtdVenda = Integer.valueOf(aux).intValue();
        objBookStore.vender(qtdVenda);
        objBookStore.showData();
        
        System.out.println("**** Utilização da classe Livro Biblioteca ***");
        BookLibrary objBookLibrary = new BookLibrary(isbn, titulo, autor, editora, edicao, paginas, quantidade);
        System.out.println("Informe o usuário : ");
        usuario = teclado.readLine();
        System.out.println("Informe o dia de empréstimo : ");
        aux = teclado.readLine();
        da = Integer.valueOf(aux).intValue();
        System.out.println("Informe o mes de empréstimo : ");
        aux = teclado.readLine();
        ma = Integer.valueOf(aux).intValue();
        System.out.println("Informe o ano de empréstimo : ");
        aux = teclado.readLine();
        aa = Integer.valueOf(aux).intValue();
        // chamando funççao de emprestimo
        objBookLibrary.emprestimo(usuario,da,ma,aa);
        
        System.out.println("Informe o dia de devolução : ");
        aux = teclado.readLine();
        dd = Integer.valueOf(aux).intValue();
        System.out.println("Informe o mês de devolução : ");
        aux = teclado.readLine();
        md = Integer.valueOf(aux).intValue();
        System.out.println("Informe o ano de devolução : ");
        aux = teclado.readLine();
        ad = Integer.valueOf(aux).intValue();
        
        objBookLibrary.devolucao(dd,md,ad);
        objBookLibrary.showData();
    
    }
}
