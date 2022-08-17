/** Método principal da classe Teste, ele chama os métodos getInstancia() de cada
   * fábrica de computadores, chama o método criaComputador() de cada uma e depois
   * testa cada computador.
   * @see #executa()
   * @param s Conjunto de parametros recebidos pela linha de comando.
   */  
import java.util.Scanner;
public class Main
{
    public static void main(String args[]){
        int choice;
        Scanner kb = new Scanner(System.in);
        System.out.println("Bem vindo a Fabrica de computadores!");
        System.out.println("Gostaria de montar seu computador? (1 - sim | 0 - nao)");
        choice = kb.nextInt();
        if(choice == 0){
            System.out.println("Nossos Produtos...");
        }else if(choice == 1){
            System.out.println(choice);    
        }
        //FabricaAB fab = new FabricaDeComputadorIntel();
        //ComputadorIF c1 = new Computador(fab);
        //c1.ligar();
    }
}
