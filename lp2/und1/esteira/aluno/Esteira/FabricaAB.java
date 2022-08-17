
/**
 * Abstract class FabricaAB - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class FabricaAB
{
    public abstract CPUIF criarCPU();
    
    public abstract MemoriaIF criarMemoria();
    
    public abstract DiscoIF criarDisco();
    
    public abstract CPUIF selectCPU();
    public abstract MemoriaIF selectMemory();
    public abstract DiscoIF selectDisco();
   
}
