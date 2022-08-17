package computador;

/**
 * 
 * @author Hilton
 */
import produtoIF.ComputadorIF;
import produtoIF.DiscoIF;
import fabricaDeComputadorIF.FabricaDeComputadorIF;
import fabricaDeComputadorConcreta.FabricaDeComputadorIntel;
import produtoIF.MemoriaIF;
import produtoIF.CPUIF;


/** Classe computador. Todo computador possui pelo menos um disco, uma memoria e uma
 * CPU, devendo todos eles serem compativeis com a arquitetura utilizada pelo
 * computador. Utiliza a arquitetura Intel.
 */
public class Computador implements ComputadorIF{
  
  /** Variavel que contem o nome da classe atual.
   * @see #ligar()
   * @see #desligar()
   */
  
  protected String nomeDaClasse = "Computador";
  
  private CPUIF cpu;
  private MemoriaIF memoria;
  private DiscoIF disco;
  private FabricaDeComputadorIF fabrica;
  /** Construtor padrao da Classe Computador. 
   * Cria um Disco, uma CPU e uma Memoria
   * para este computador.
   */  
   
  public Computador(FabricaDeComputadorIF fabrica){   
    this.fabrica = fabrica;
    cpu = fabrica.criarCPU();
    memoria = fabrica.criarMemoria();
    disco = fabrica.criarDisco();
  }
  
  public Computador(){
    this.fabrica = criaFabricaDeComputador();
    cpu = fabrica.criarCPU();
    memoria = fabrica.criarMemoria();
    disco = fabrica.criarDisco();
  }
  
  protected FabricaDeComputadorIF criaFabricaDeComputador() {
  	return new FabricaDeComputadorIntel();
  }
  	
  /** M�todo que liga o Computador. */  
  public void ligar(){
    System.out.println("\nClass: " + nomeDaClasse + " / Metodo: ligar()");
    System.out.println("\nSoma: " + cpu.somar(5,6) );
    System.out.println("\nSubtracao: " + cpu.subtrair(11,8) );
    System.out.println("\nMultiplicacao: " + cpu.multiplicar(4,9) );
    System.out.println("\nDivisao: " + cpu.dividir(20,5) );
    System.out.println("\ngetByte: " +  memoria.getByte(118) );
    memoria.setByte(245,'A');
    System.out.println("\ngetBloco: " + disco.getBloco(574) );
    disco.setBloco(587,'F');
  }

  /** M�todo que ldesiga o Computador. */  
  public void desligar(){
    System.out.println("Class: " + nomeDaClasse + " / Metodo: desligar()");
  }
  
}
