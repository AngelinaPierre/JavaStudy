package fabricaDeComputadorAbstrata;

/**
 * 
 * @author Hilton
 */
import fabricaDeComputadorIF.FabricaDeComputadorIF;
import produtoIF.MemoriaIF;
import produtoIF.DiscoIF;
import produtoIF.CPUIF;

public abstract class FabricaDeComputadorAB implements FabricaDeComputadorIF {
                
        public abstract CPUIF criarCPU();
        
        public abstract MemoriaIF criarMemoria();
        
        public abstract DiscoIF criarDisco();
        
      }
