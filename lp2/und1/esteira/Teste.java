import produtoIF.ComputadorIF;
import computador.Computador;
import fabricaDeComputadorConcreta.FabricaDeComputadorIntel;
import fabricaDeComputadorIF.FabricaDeComputadorIF;

/**
 * 
 * @author Hilton
 */
public class Teste {
  
  /** Método principal da classe Teste, ele chama os métodos getInstancia() de cada
   * fábrica de computadores, chama o método criaComputador() de cada uma e depois
   * testa cada computador.
   * @see #executa()
   * @param s Conjunto de parametros recebidos pela linha de comando.
   */  
  public static void main(String[] s){
    FabricaDeComputadorIF fab =	new FabricaDeComputadorIntel() ; 		
    ComputadorIF c1 = new Computador(fab);
    c1.ligar();
  }
}
