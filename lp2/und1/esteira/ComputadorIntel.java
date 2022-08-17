package computador;

/**
 * 
 * @author Hilton
 */
import produtoIF.ComputadorIF;
import produtoConcreto.disco.Disco;
import produtoIF.DiscoIF;
import produtoConcreto.memoria.Memoria;
import produtoIF.MemoriaIF;
import produtoIF.CPUIF;
import produtoConcreto.cpu.CPU;

public class ComputadorIntel 
	implements ComputadorIF {
    protected String nomeDaClasse = "Computador Intel";
    
    private CPUIF cpu;
    private MemoriaIF memoria;
    private DiscoIF disco;

    /** Construtor padrao da Classe Computador. 
     * Cria um Disco, uma CPU e uma Memoria
     * para este computador.
     */  
     
    public ComputadorIntel(){   
        cpu = new CPU();
        memoria = new Memoria();
        disco = new Disco();
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
