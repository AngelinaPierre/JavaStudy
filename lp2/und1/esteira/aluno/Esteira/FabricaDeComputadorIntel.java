
/** Classe FabricaDeComputadorIntel. Cria um computador para a arquitetura Intel. */
public class FabricaDeComputadorIntel extends FabricaAB
{
    public FabricaDeComputadorIntel(){}
    
    
    /** Método que retorna uma CPUIF, que pode referenciar qualquer classe que
   * implemente esta interface.
   * @return Retorna uma CPUIF, que pode referenciar qualquer classe que implemente esta
   * interface.
   */ 
    public CPUIF criarCPU(){
        return new CPU(); // instanciando a classe CPU
    }
    
    /** Método que retorna um DiscoIF, que pode referenciar qualquer classe que
   * implemente esta interface.
   * @return Retorna uma DiscoIF, que pode referenciar qualquer classe que implemente esta
   * interface.
   */
    public DiscoIF criarDisco(){
        return new Disco();
    }
    
    /** Método que retorna uma MemoriaIF, que pode referenciar qualquer classe que
   * implemente esta interface.
   * @return Retorna uma MemoriaIF, que pode referenciar qualquer classe que implemente esta
   * interface.
   */  
    public MemoriaIF criarMemoria(){
        return new Memoria();
    }
    
    public CPUIF selectCPU(){
        return new CPU();
    }
    public MemoriaIF selectMemory(){
        return new Memoria();
    }
    public DiscoIF selectDisco(){
        return new Disco();
    }

}
