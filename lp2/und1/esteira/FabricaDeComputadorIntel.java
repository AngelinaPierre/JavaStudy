package fabricaDeComputadorConcreta;

/**
 * 
 * @author Hilton
 */
import fabricaDeComputadorAbstrata.FabricaDeComputadorAB;
import produtoIF.MemoriaIF;
import produtoConcreto.memoria.Memoria;
import produtoConcreto.disco.Disco;
import produtoIF.DiscoIF;
import produtoIF.CPUIF;
import produtoConcreto.cpu.CPU;


/** Classe FabricaDeComputadorIntel. Cria um computador para a arquitetura Intel. */
public class FabricaDeComputadorIntel extends FabricaDeComputadorAB {
  
  
  public FabricaDeComputadorIntel() {
  }
  
  
  /** Método que retorna uma CPUIF, que pode referenciar qualquer classe que
   * implemente esta interface.
   * @return Retorna uma CPUIF, que pode referenciar qualquer classe que implemente esta
   * interface.
   */  
  public CPUIF criarCPU() {
    return new CPU();
  }  
  
  /** Método que retorna um DiscoIF, que pode referenciar qualquer classe que
   * implemente esta interface.
   * @return Retorna uma DiscoIF, que pode referenciar qualquer classe que implemente esta
   * interface.
   */  
  public DiscoIF criarDisco() {
    return new Disco();
  }
  
  /** Método que retorna uma MemoriaIF, que pode referenciar qualquer classe que
   * implemente esta interface.
   * @return Retorna uma MemoriaIF, que pode referenciar qualquer classe que implemente esta
   * interface.
   */  
  public MemoriaIF criarMemoria() {
    return new Memoria();
  }
  
}
